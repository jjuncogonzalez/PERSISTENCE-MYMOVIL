package com.grupomovil.persistence;

import com.google.gson.Gson;
import com.grupomovil.entity.geo.alarms.EBAnyCameraCCTVEmpty;
import com.grupomovil.entity.geo.alarms.EBBrakePadWear;
import com.grupomovil.entity.geo.alarms.EBCameraDriverEmpty;
import com.grupomovil.entity.geo.alarms.EBSeatBeltStatus;
import com.grupomovil.entity.geo.alarms.EBSpeeding;
import com.grupomovil.entity.geo.alarms.EBStrongAceleration;
import com.grupomovil.entity.geo.alarms.EBStrongBreak;
import com.grupomovil.entity.geo.alarms.EBStrongTurn;
import com.grupomovil.entity.geo.events.EBBaterias;
import com.grupomovil.entity.geo.events.EBPeriodic;
import com.grupomovil.entity.geo.events.EBColision;
import com.grupomovil.entity.geo.events.EBDoors;
import com.grupomovil.entity.geo.events.EBDriverAbnormalSituation;
import com.grupomovil.entity.geo.events.EBDriverChairEmpty;
import com.grupomovil.entity.geo.events.EBDriverChange;
import com.grupomovil.entity.geo.events.EBEndOperation;
import com.grupomovil.entity.geo.events.EBEnergySTSReconnect;
import com.grupomovil.entity.geo.events.EBOffVehicle;
import com.grupomovil.entity.geo.events.EBOnVehicle;
import com.grupomovil.entity.geo.events.EBPanicButton;
import com.grupomovil.entity.geo.events.EBPeriodic20;
import com.grupomovil.entity.geo.events.EBSTSEnergyOff;
import com.grupomovil.entity.geo.events.EBSTSOff;
import com.grupomovil.entity.geo.events.EBSTSOn;
import com.grupomovil.entity.geo.events.EBStartOperation;
import com.grupomovil.entity.geo.events.EBStopStation;
import com.grupomovil.tools.MBTools;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.MongoException;
import com.mongodb.ServerAddress;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.UpdateOptions;
import com.mongodb.client.result.UpdateResult;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import org.bson.types.ObjectId;
import java.awt.geom.Path2D;
import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.gt;
import static com.mongodb.client.model.Filters.lt;
import static com.mongodb.client.model.Filters.regex;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Objects;
import org.bson.conversions.Bson;

/**
 * @author jjunco
 */
public class AccesDaoMongo implements Serializable {

    private MBTools Tools;

    public AccesDaoMongo() {
        getSingletonInstance();
        Tools = new MBTools();
        objAccesDao = AccesDao.getSingletonInstance();
    }

    private static MongoClient client = null;

    public static MongoClient getSingletonInstance() {
        if (client == null) {
            client = establishConnections();
        }
        return client;
    }

    private static MongoClient establishConnections() {
        MongoClient mongo = null;
        try {

            List<ServerAddress> seeds = new ArrayList<ServerAddress>();
            seeds.add(new ServerAddress("10.0.3.147", 27017));
            List<MongoCredential> credentials = new ArrayList<MongoCredential>();
            credentials.add(
                    MongoCredential.createScramSha1Credential(
                            "mqtt_broker",
                            "telemetry_green",
                            "I0T-Br0k3r".toCharArray()
                    )
            );
            return mongo = new MongoClient(seeds, credentials);

        } catch (Exception e) {
            System.out.println(
                    "Connection establishment failed");
            System.out.println(e);
        }
        return mongo;
    }

    public static void createCollection(String collectionName, String db) {

        try {
            MongoDatabase database = client.getDatabase(db);
            database.createCollection(collectionName);
            System.out.println("Collection created Successfully");
        } catch (Exception e) {
            System.out.println(
                    "Collection creation failed");
            System.out.println(e);
        }
    }

    public MongoCollection<Document> getCollection(String collectionName, String db) {
        MongoCollection<Document> collection = null;
        try {
            MongoDatabase database = client.getDatabase(db);
            // Retrieve the collection
            collection = database.getCollection(collectionName);

        } catch (Exception e) {
            System.out.println("Collection retrieval failed");
            System.out.println(e);
        }
        return collection;
    }

    public static List<EBPeriodic> filterRoute(MongoCollection<Document> collection, String startDate, String startEnd, String vehicle) {
        List<EBPeriodic> result = new ArrayList<>();
        Gson gson = new Gson();
        Document timespan = new Document();
        timespan.append("$gt", startDate);
        timespan.append("$lt", startEnd);
        //timespan.append("idVehiculo", vehicle);
        Document condition = new Document("fechaHoraLecturaDato", timespan);
        condition.append("idVehiculo", vehicle);
        //Document test = new Document(condition, condition2);
        try {
            FindIterable<Document> docs = collection.find(condition);
            if (docs == null || docs.first() == null) {
                return null;
            } else {
                for (Document d : docs) {
                    result.add(gson.fromJson(d.toJson(), EBPeriodic.class));
                }
            }
        } catch (Exception e) {
            System.out.println(
                    "Could not find the documents "
                    + "or No document exists");
            System.out.println(e);
        }
        return result;
    }

    public List<EBPeriodic20> filterP20(MongoCollection<Document> collection, String vehicle, String date) {

        List<EBPeriodic20> result = new ArrayList<>();
        Gson gson = new Gson();

        Bson filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"),
                eq("idVehiculo", vehicle));

        try {
            FindIterable<Document> docs = collection.find(filter);
            if (docs == null || docs.first() == null) {
                return null;
            } else {
                for (Document d : docs) {
                    result.add(gson.fromJson(d.toJson(), EBPeriodic20.class));
                }
            }
        } catch (Exception e) {
            System.out.println(
                    "Could not find the documents "
                    + "or No document exists");
            System.out.println(e);
        }
        return result;
    }

    public List<EBPeriodic20> filterP20flota(MongoCollection<Document> collection, String date) {

        List<EBPeriodic20> result = new ArrayList<>();
        Gson gson = new Gson();

        Bson filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"),
                regex("idVehiculo", "Z67[0-9]{3,5}"), eq("tipoBus", "P"));
        try {
            FindIterable<Document> docs = collection.find(filter);
            if (docs == null || docs.first() == null) {
                return null;
            } else {
                for (Document d : docs) {
                    result.add(gson.fromJson(d.toJson(), EBPeriodic20.class));
                }
            }

            for (EBPeriodic20 a : result) {
                create(a);
            }
        } catch (Exception e) {
            System.out.println(
                    "Could not find the documents "
                    + "or No document exists");
            System.out.println(e);
        }
        return result;
    }

    private final AccesDao objAccesDao;

    private void create(EBPeriodic20 obj) {

        try {

            objAccesDao.create("insertp20", obj, 1);

        } catch (ParseException | SQLException ex) {
            System.out.println("Error en createTemplate :  " + ex.getMessage());

        }

    }

    public List<EBPeriodic> filterpSesenta(MongoCollection<Document> collection, String vehicle, String date) {

        List<EBPeriodic> result = new ArrayList<>();
        Gson gson = new Gson();

        Bson filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"),
                eq("idVehiculo", vehicle));

        try {
            FindIterable<Document> docs = collection.find(filter);
            if (docs == null || docs.first() == null) {
                return null;
            } else {
                for (Document d : docs) {
                    result.add(gson.fromJson(d.toJson(), EBPeriodic.class));
                }
            }
        } catch (Exception e) {
            System.out.println(
                    "Could not find the documents "
                    + "or No document exists");
            System.out.println(e);
        }
        return result;
    }

    public List<EBPeriodic> filterpSesentaTotal(MongoCollection<Document> collection, String date) {

        List<EBPeriodic> result = new ArrayList<>();
        Gson gson = new Gson();

        Bson filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"));

        try {
            FindIterable<Document> docs = collection.find(filter);
            if (docs == null || docs.first() == null) {
                return null;
            } else {
                for (Document d : docs) {
                    result.add(gson.fromJson(d.toJson(), EBPeriodic.class));
                }
            }
        } catch (Exception e) {
            System.out.println(
                    "Could not find the documents "
                    + "or No document exists");
            System.out.println(e);
        }
        return result;
    }

    public List<EBPeriodic.Alarma> filterAlarm(MongoCollection<Document> collection, String date) {

        List<EBPeriodic.Alarma> result = new ArrayList<>();
        Gson gson = new Gson();
        Bson filter = and(gt("fechaHoraLecturaDato", date + " 00:00:00.111"),
                lt("fechaHoraLecturaDato", date + " 23:59:59.111"));

        try {
            FindIterable<Document> docs = collection.find(filter);
            if (docs == null || docs.first() == null) {
                return null;
            } else {
                for (Document d : docs) {
                    result.add(gson.fromJson(d.toJson(), EBPeriodic.Alarma.class));
                }
            }
        } catch (Exception e) {
            System.out.println(
                    "Could not find the documents "
                    + "or No document exists");
            System.out.println(e);
        }
        return result;
    }

    public static List<EBPeriodic> displayDocuments(MongoCollection<Document> collection) {
        List<EBPeriodic> result = new ArrayList<>();
        try {
            FindIterable<Document> docs = collection.find();
            Gson gson = new Gson();
            if (docs == null || docs.first() == null) {
                return null;
            } else {
                for (Document d : docs) {
                    result.add(gson.fromJson(d.toJson(), EBPeriodic.class));
                }
            }
        } catch (Exception e) {
            System.out.println(
                    "Could not find the documents "
                    + "or No document exists");
            System.out.println(e);
        }
        return result;
    }

    public static List<EBBaterias> displayBaterias(MongoCollection<Document> collection) {
        List<EBBaterias> result = new ArrayList<>();
        try {
            FindIterable<Document> docs = collection.find();
            Gson gson = new Gson();
            if (docs == null || docs.first() == null) {
                return null;
            } else {
                for (Document d : docs) {
                    result.add(gson.fromJson(d.toJson(), EBBaterias.class));
                }
            }

            for (EBBaterias d : result) {
                d.setConsumoEnergia((Objects.isNull(d.getConsumoEnergia())) ? 0.0 : d.getConsumoEnergia());
                d.setRegeneracionEnergia((Objects.isNull(d.getRegeneracionEnergia())) ? 0.0 : d.getRegeneracionEnergia());
                d.setNivelRestanteEnergia((Objects.isNull(d.getNivelRestanteEnergia())) ? 0.0 : d.getNivelRestanteEnergia());
                d.setPatio((Objects.isNull(d.getPatio())) ? true : d.getPatio());
                d.setCargando((Objects.isNull(d.getCargando())) ? false : d.getCargando());
                if (d.getIdVehiculo() != null) {
                    d.setIdVehiculo(d.getIdVehiculo().substring(0, 3) + "-" + d.getIdVehiculo().substring(3, 7));
                }
            }

        } catch (Exception e) {
            System.out.println(
                    "Could not find the documents "
                    + "or No document exists");
            System.out.println(e);
        }
        return result;
    }

    public List<EBBaterias> displayBateriasVehicle(MongoCollection<Document> collection, String vehicle, String date) {

        List<EBBaterias> result = new ArrayList<>();
        Gson gson = new Gson();

        Bson filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"),
                eq("idVehiculo", vehicle));

        try {
            FindIterable<Document> docs = collection.find(filter);
            if (docs == null || docs.first() == null) {
                return null;
            } else {
                for (Document d : docs) {
                    result.add(gson.fromJson(d.toJson(), EBBaterias.class));
                }
            }
        } catch (Exception e) {
            System.out.println(
                    "Could not find the documents "
                    + "or No document exists");
            System.out.println(e);
        }
        return result;
    }

    public List<EBBaterias> displayBateriasVehicles(MongoCollection<Document> collection, String date) {

        List<EBBaterias> result = new ArrayList<>();
        Gson gson = new Gson();

        Bson filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"));

        try {
            FindIterable<Document> docs = collection.find(filter);
            if (docs == null || docs.first() == null) {
                return null;
            } else {
                for (Document d : docs) {
                    result.add(gson.fromJson(d.toJson(), EBBaterias.class));
                }
            }
        } catch (Exception e) {
            System.out.println(
                    "Could not find the documents "
                    + "or No document exists");
            System.out.println(e);
        }
        return result;
    }

    public List<EBColision> displayEventVehicle(MongoCollection<Document> collection, String vehicle, String date) {

        List<EBColision> result = new ArrayList<>();
        Gson gson = new Gson();

        Bson filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"),
                eq("idVehiculo", vehicle));

        try {
            FindIterable<Document> docs = collection.find(filter);
            if (docs == null || docs.first() == null) {
                return null;
            } else {
                for (Document d : docs) {
                    result.add(gson.fromJson(d.toJson(), EBColision.class));
                }
            }
        } catch (Exception e) {
            System.out.println(
                    "Could not find the documents "
                    + "or No document exists");
            System.out.println(e);
        }
        return result;
    }

    public List<EBColision> displayEventVehicles(MongoCollection<Document> collection, String date) {

        List<EBColision> result = new ArrayList<>();
        Gson gson = new Gson();

        Bson filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"));

        try {
            FindIterable<Document> docs = collection.find(filter);
            if (docs == null || docs.first() == null) {
                return null;
            } else {
                for (Document d : docs) {
                    result.add(gson.fromJson(d.toJson(), EBColision.class));
                }
            }
        } catch (Exception e) {
            System.out.println(
                    "Could not find the documents "
                    + "or No document exists");
            System.out.println(e);
        }
        return result;
    }

    public static List<EBPeriodic> selectUniqueVehicle(MongoCollection<Document> collection, String idVehiculo) {
        List<EBPeriodic> result = new ArrayList<>();
        Gson gson = new Gson();
        try {
            FindIterable<Document> docs = collection.find(eq("idVehiculo", idVehiculo));

            if (docs == null) {
                return null;
            } else {
                for (Document d : docs) {
                    result.add(gson.fromJson(d.toJson(), EBPeriodic.class));
                }
            }
        } catch (Exception e) {
            System.out.println(
                    "Could not find the documents "
                    + "or No document exists");
            System.out.println(e);
        }
        return result;
    }

    public static List<EBPeriodic> selectDataForUnit(MongoCollection<Document> collection, int unit) {
        List<EBPeriodic> result = new ArrayList<>();
        Gson gson = new Gson();
        Document condition = new Document("unidadFuncional", unit);
        try {
            FindIterable<Document> docs = collection.find(condition);

            if (docs == null) {
                return null;
            } else {
                for (Document d : docs) {
                    result.add(gson.fromJson(d.toJson(), EBPeriodic.class));
                }
            }
        } catch (Exception e) {
            System.out.println(
                    "Could not find the documents "
                    + "or No document exists");
            System.out.println(e);
        }
        return result;
    }

    public List<EBStopStation> displayEventStopStation(MongoCollection<Document> collection, String vehicle, String date) {

        List<EBStopStation> result = new ArrayList<>();
        Gson gson = new Gson();

        Bson filter = null;

        if (vehicle != null) {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"),
                    eq("idVehiculo", vehicle));
        } else {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"));
        }

        try {
            FindIterable<Document> docs = collection.find(filter);
            if (docs == null || docs.first() == null) {
                return null;
            } else {
                for (Document d : docs) {
                    result.add(gson.fromJson(d.toJson(), EBStopStation.class));
                }
            }
        } catch (Exception e) {
            System.out.println(
                    "Could not find the documents "
                    + "or No document exists");
            System.out.println(e);
        }
        return result;
    }

    public List<EBDoors> displayEventDoors(MongoCollection<Document> collection, String vehicle, String date) {

        List<EBDoors> result = new ArrayList<>();
        Gson gson = new Gson();

        Bson filter = null;

        if (vehicle != null) {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"),
                    eq("idVehiculo", vehicle));
        } else {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"));
        }

        try {
            FindIterable<Document> docs = collection.find(filter);
            if (docs == null || docs.first() == null) {
                return null;
            } else {
                for (Document d : docs) {
                    result.add(gson.fromJson(d.toJson(), EBDoors.class));
                }
            }
        } catch (Exception e) {
            System.out.println(
                    "Could not find the documents "
                    + "or No document exists");
            System.out.println(e);
        }
        return result;
    }

    public List<EBOnVehicle> displayEventVehicleOn(MongoCollection<Document> collection, String vehicle, String date) {

        List<EBOnVehicle> result = new ArrayList<>();
        Gson gson = new Gson();

        Bson filter = null;

        if (vehicle != null) {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"),
                    eq("idVehiculo", vehicle));
        } else {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"));
        }

        try {
            FindIterable<Document> docs = collection.find(filter);
            if (docs == null || docs.first() == null) {
                return null;
            } else {
                for (Document d : docs) {
                    result.add(gson.fromJson(d.toJson(), EBOnVehicle.class));
                }
            }
        } catch (Exception e) {
            System.out.println(
                    "Could not find the documents "
                    + "or No document exists");
            System.out.println(e);
        }
        return result;
    }

    public List<EBOffVehicle> displayEventVehicleOff(MongoCollection<Document> collection, String vehicle, String date) {

        List<EBOffVehicle> result = new ArrayList<>();
        Gson gson = new Gson();

        Bson filter = null;

        if (vehicle != null) {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"),
                    eq("idVehiculo", vehicle));
        } else {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"));
        }

        try {
            FindIterable<Document> docs = collection.find(filter);
            if (docs == null || docs.first() == null) {
                return null;
            } else {
                for (Document d : docs) {
                    result.add(gson.fromJson(d.toJson(), EBOffVehicle.class));
                }
            }
        } catch (Exception e) {
            System.out.println(
                    "Could not find the documents "
                    + "or No document exists");
            System.out.println(e);
        }
        return result;
    }

    public List<EBDriverChange> displayDriverChange(MongoCollection<Document> collection, String vehicle, String date) {

        List<EBDriverChange> result = new ArrayList<>();
        Gson gson = new Gson();

        Bson filter = null;

        if (vehicle != null) {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"),
                    eq("idVehiculo", vehicle));
        } else {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"));
        }

        try {
            FindIterable<Document> docs = collection.find(filter);
            if (docs == null || docs.first() == null) {
                return null;
            } else {
                for (Document d : docs) {
                    result.add(gson.fromJson(d.toJson(), EBDriverChange.class));
                }
            }
        } catch (Exception e) {
            System.out.println(
                    "Could not find the documents "
                    + "or No document exists");
            System.out.println(e);
        }
        return result;
    }

    public List<EBPanicButton> displayPanicButtonOn(MongoCollection<Document> collection, String vehicle, String date) {

        List<EBPanicButton> result = new ArrayList<>();
        Gson gson = new Gson();

        Bson filter = null;

        if (vehicle != null) {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"),
                    eq("idVehiculo", vehicle));
        } else {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"));
        }

        try {
            FindIterable<Document> docs = collection.find(filter);
            if (docs == null || docs.first() == null) {
                return null;
            } else {
                for (Document d : docs) {
                    result.add(gson.fromJson(d.toJson(), EBPanicButton.class));
                }
            }
        } catch (Exception e) {
            System.out.println(
                    "Could not find the documents "
                    + "or No document exists");
            System.out.println(e);
        }
        return result;
    }

    public List<EBSTSEnergyOff> displaySTSEnergyOff(MongoCollection<Document> collection, String vehicle, String date) {

        List<EBSTSEnergyOff> result = new ArrayList<>();
        Gson gson = new Gson();

        Bson filter = null;

        if (vehicle != null) {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"),
                    eq("idVehiculo", vehicle));
        } else {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"));
        }

        try {
            FindIterable<Document> docs = collection.find(filter);
            if (docs == null || docs.first() == null) {
                return null;
            } else {
                for (Document d : docs) {
                    result.add(gson.fromJson(d.toJson(), EBSTSEnergyOff.class));
                }
            }
        } catch (Exception e) {
            System.out.println(
                    "Could not find the documents "
                    + "or No document exists");
            System.out.println(e);
        }
        return result;
    }

    public List<EBEndOperation> displayEndOperation(MongoCollection<Document> collection, String vehicle, String date) {

        List<EBEndOperation> result = new ArrayList<>();
        Gson gson = new Gson();

        Bson filter = null;

        if (vehicle != null) {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"),
                    eq("idVehiculo", vehicle));
        } else {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"));
        }

        try {
            FindIterable<Document> docs = collection.find(filter);
            if (docs == null || docs.first() == null) {
                return null;
            } else {
                for (Document d : docs) {
                    result.add(gson.fromJson(d.toJson(), EBEndOperation.class));
                }
            }
        } catch (Exception e) {
            System.out.println(
                    "Could not find the documents "
                    + "or No document exists");
            System.out.println(e);
        }
        return result;
    }

    public List<EBSTSOn> displaySTSOn(MongoCollection<Document> collection, String vehicle, String date) {

        List<EBSTSOn> result = new ArrayList<>();
        Gson gson = new Gson();

        Bson filter = null;

        if (vehicle != null) {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"),
                    eq("idVehiculo", vehicle));
        } else {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"));
        }

        try {
            FindIterable<Document> docs = collection.find(filter);
            if (docs == null || docs.first() == null) {
                return null;
            } else {
                for (Document d : docs) {
                    result.add(gson.fromJson(d.toJson(), EBSTSOn.class));
                }
            }
        } catch (Exception e) {
            System.out.println(
                    "Could not find the documents "
                    + "or No document exists");
            System.out.println(e);
        }
        return result;
    }

    public List<EBSTSOff> displaySTSOff(MongoCollection<Document> collection, String vehicle, String date) {

        List<EBSTSOff> result = new ArrayList<>();
        Gson gson = new Gson();

        Bson filter = null;

        if (vehicle != null) {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"),
                    eq("idVehiculo", vehicle));
        } else {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"));
        }

        try {
            FindIterable<Document> docs = collection.find(filter);
            if (docs == null || docs.first() == null) {
                return null;
            } else {
                for (Document d : docs) {
                    result.add(gson.fromJson(d.toJson(), EBSTSOff.class));
                }
            }
        } catch (Exception e) {
            System.out.println(
                    "Could not find the documents "
                    + "or No document exists");
            System.out.println(e);
        }
        return result;
    }

    public List<EBStartOperation> displayStartOperation(MongoCollection<Document> collection, String vehicle, String date) {

        List<EBStartOperation> result = new ArrayList<>();
        Gson gson = new Gson();

        Bson filter = null;

        if (vehicle != null) {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"),
                    eq("idVehiculo", vehicle));
        } else {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"));
        }

        try {
            FindIterable<Document> docs = collection.find(filter);
            if (docs == null || docs.first() == null) {
                return null;
            } else {
                for (Document d : docs) {
                    result.add(gson.fromJson(d.toJson(), EBStartOperation.class));
                }
            }
        } catch (Exception e) {
            System.out.println(
                    "Could not find the documents "
                    + "or No document exists");
            System.out.println(e);
        }
        return result;
    }

    public List<EBDriverChairEmpty> displayDriverEmptyChair(MongoCollection<Document> collection, String vehicle, String date) {

        List<EBDriverChairEmpty> result = new ArrayList<>();
        Gson gson = new Gson();

        Bson filter = null;

        if (vehicle != null) {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"),
                    eq("idVehiculo", vehicle));
        } else {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"));
        }

        try {
            FindIterable<Document> docs = collection.find(filter);
            if (docs == null || docs.first() == null) {
                return null;
            } else {
                for (Document d : docs) {
                    result.add(gson.fromJson(d.toJson(), EBDriverChairEmpty.class));
                }
            }
        } catch (Exception e) {
            System.out.println(
                    "Could not find the documents "
                    + "or No document exists");
            System.out.println(e);
        }
        return result;
    }

    public List<EBEnergySTSReconnect> displayEnergySTSReconnect(MongoCollection<Document> collection, String vehicle, String date) {

        List<EBEnergySTSReconnect> result = new ArrayList<>();
        Gson gson = new Gson();

        Bson filter = null;

        if (vehicle != null) {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"),
                    eq("idVehiculo", vehicle));
        } else {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"));
        }

        try {
            FindIterable<Document> docs = collection.find(filter);
            if (docs == null || docs.first() == null) {
                return null;
            } else {
                for (Document d : docs) {
                    result.add(gson.fromJson(d.toJson(), EBEnergySTSReconnect.class));
                }
            }
        } catch (Exception e) {
            System.out.println(
                    "Could not find the documents "
                    + "or No document exists");
            System.out.println(e);
        }
        return result;
    }

    public List<EBDriverAbnormalSituation> displayDriverAbnormalSituation(MongoCollection<Document> collection, String vehicle, String date) {

        List<EBDriverAbnormalSituation> result = new ArrayList<>();
        Gson gson = new Gson();

        Bson filter = null;

        if (vehicle != null) {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"),
                    eq("idVehiculo", vehicle));
        } else {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"));
        }

        try {
            FindIterable<Document> docs = collection.find(filter);
            if (docs == null || docs.first() == null) {
                return null;
            } else {
                for (Document d : docs) {
                    result.add(gson.fromJson(d.toJson(), EBDriverAbnormalSituation.class));
                }
            }
        } catch (Exception e) {
            System.out.println(
                    "Could not find the documents "
                    + "or No document exists");
            System.out.println(e);
        }
        return result;
    }

    public List<EBStrongAceleration> displayStrongAceleration(MongoCollection<Document> collection, String vehicle, String date) {
        List<EBStrongAceleration> result = new ArrayList<>();
        Gson gson = new Gson();

        Bson filter = null;

        if (vehicle != null) {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"),
                    eq("idVehiculo", vehicle));
        } else {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"));
        }

        try {
            FindIterable<Document> docs = collection.find(filter);
            if (docs == null || docs.first() == null) {
                return null;
            } else {
                for (Document d : docs) {
                    result.add(gson.fromJson(d.toJson(), EBStrongAceleration.class));
                }
            }
        } catch (Exception e) {
            System.out.println(
                    "Could not find the documents "
                    + "or No document exists");
            System.out.println(e);
        }
        return result;
    }

    public List<EBStrongBreak> displayStrongBreak(MongoCollection<Document> collection, String vehicle, String date) {
        List<EBStrongBreak> result = new ArrayList<>();
        Gson gson = new Gson();

        Bson filter = null;

        if (vehicle != null) {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"),
                    eq("idVehiculo", vehicle));
        } else {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"));
        }

        try {
            FindIterable<Document> docs = collection.find(filter);
            if (docs == null || docs.first() == null) {
                return null;
            } else {
                for (Document d : docs) {
                    result.add(gson.fromJson(d.toJson(), EBStrongBreak.class));
                }
            }
        } catch (Exception e) {
            System.out.println(
                    "Could not find the documents "
                    + "or No document exists");
            System.out.println(e);
        }
        return result;
    }

    public List<EBSpeeding> displaySpeeding(MongoCollection<Document> collection, String vehicle, String date) {
        List<EBSpeeding> result = new ArrayList<>();
        Gson gson = new Gson();

        Bson filter = null;

        if (vehicle != null) {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"),
                    eq("idVehiculo", vehicle));
        } else {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"));
        }

        try {
            FindIterable<Document> docs = collection.find(filter);
            if (docs == null || docs.first() == null) {
                return null;
            } else {
                for (Document d : docs) {
                    result.add(gson.fromJson(d.toJson(), EBSpeeding.class));
                }
            }
        } catch (Exception e) {
            System.out.println(
                    "Could not find the documents "
                    + "or No document exists");
            System.out.println(e);
        }
        return result;
    }

    public List<EBCameraDriverEmpty> displayCameraDriverEmpty(MongoCollection<Document> collection, String vehicle, String date) {
        List<EBCameraDriverEmpty> result = new ArrayList<>();
        Gson gson = new Gson();

        Bson filter = null;

        if (vehicle != null) {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"),
                    eq("idVehiculo", vehicle));
        } else {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"));
        }

        try {
            FindIterable<Document> docs = collection.find(filter);
            if (docs == null || docs.first() == null) {
                return null;
            } else {
                for (Document d : docs) {
                    result.add(gson.fromJson(d.toJson(), EBCameraDriverEmpty.class));
                }
            }
        } catch (Exception e) {
            System.out.println(
                    "Could not find the documents "
                    + "or No document exists");
            System.out.println(e);
        }
        return result;
    }

    public List<EBAnyCameraCCTVEmpty> displayAnyCameraCCTVEmpty(MongoCollection<Document> collection, String vehicle, String date) {
        List<EBAnyCameraCCTVEmpty> result = new ArrayList<>();
        Gson gson = new Gson();

        Bson filter = null;

        if (vehicle != null) {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"),
                    eq("idVehiculo", vehicle));
        } else {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"));
        }

        try {
            FindIterable<Document> docs = collection.find(filter);
            if (docs == null || docs.first() == null) {
                return null;
            } else {
                for (Document d : docs) {
                    result.add(gson.fromJson(d.toJson(), EBAnyCameraCCTVEmpty.class));
                }
            }
        } catch (Exception e) {
            System.out.println(
                    "Could not find the documents "
                    + "or No document exists");
            System.out.println(e);
        }
        return result;
    }

    public List<EBStrongTurn> displayStrongTurn(MongoCollection<Document> collection, String vehicle, String date) {
        List<EBStrongTurn> result = new ArrayList<>();
        Gson gson = new Gson();

        Bson filter = null;

        if (vehicle != null) {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"),
                    eq("idVehiculo", vehicle));
        } else {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"));
        }

        try {
            FindIterable<Document> docs = collection.find(filter);
            if (docs == null || docs.first() == null) {
                return null;
            } else {
                for (Document d : docs) {
                    result.add(gson.fromJson(d.toJson(), EBStrongTurn.class));
                }
            }
        } catch (Exception e) {
            System.out.println(
                    "Could not find the documents "
                    + "or No document exists");
            System.out.println(e);
        }
        return result;
    }

    public List<EBSeatBeltStatus> displaySeatBeltStatus(MongoCollection<Document> collection, String vehicle, String date) {
        List<EBSeatBeltStatus> result = new ArrayList<>();
        Gson gson = new Gson();

        Bson filter = null;

        if (vehicle != null) {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"),
                    eq("idVehiculo", vehicle));
        } else {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"));
        }

        try {
            FindIterable<Document> docs = collection.find(filter);
            if (docs == null || docs.first() == null) {
                return null;
            } else {
                for (Document d : docs) {
                    result.add(gson.fromJson(d.toJson(), EBSeatBeltStatus.class));
                }
            }
        } catch (Exception e) {
            System.out.println(
                    "Could not find the documents "
                    + "or No document exists");
            System.out.println(e);
        }
        return result;
    }

    public List<EBBrakePadWear> displayBrakePadWear(MongoCollection<Document> collection, String vehicle, String date) {
        List<EBBrakePadWear> result = new ArrayList<>();
        Gson gson = new Gson();

        Bson filter = null;

        if (vehicle != null) {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"),
                    eq("idVehiculo", vehicle));
        } else {
            filter = and(gt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 00:00:00.111"),
                    lt("fechaHoraLecturaDato", date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " 23:59:59.111"));
        }

        try {
            FindIterable<Document> docs = collection.find(filter);
            if (docs == null || docs.first() == null) {
                return null;
            } else {
                for (Document d : docs) {
                    result.add(gson.fromJson(d.toJson(), EBBrakePadWear.class));
                }
            }
        } catch (Exception e) {
            System.out.println(
                    "Could not find the documents "
                    + "or No document exists");
            System.out.println(e);
        }
        return result;
    }

    public static void insertADocIntoDb(MongoCollection<Document> collection, EBPeriodic obj) {
        try {

            //Preparing a document
            Document document = new Document();
            document.append("_id", new ObjectId());
            document.append("tipoFreno", obj.getTipoFreno());
            document.append("fechaHoraEnvioDato", obj.getFechaHoraEnvioDato());
            document.append("kilometrosOdometro", obj.getKilometrosOdometro());
            document.append("nivelTanqueCombustible", obj.getNivelTanqueCombustible());
            document.append("revolucionesMotor", obj.getRevolucionesMotor());
            document.append("velocidadVehiculo", obj.getVelocidadVehiculo());
            document.append("idRuta", obj.getIdRuta());
            document.append("tramaRetransmitida", obj.isTramaRetransmitida());
            document.append("idConductor", obj.getIdConductor());
            document.append("estadoDesgasteFrenos", obj.getEstadoDesgasteFrenos());
            document.append("versionTrama", obj.getVersionTrama());
            document.append("memDiscoSts", obj.getMemRamSts());
            document.append("presionAceiteMotor", obj.getPresionAceiteMotor());
            document.append("temperaturaSts", obj.getTemperaturaSts());
            document.append("fechaHoraLecturaDato", obj.getFechaHoraLecturaDato());
            document.append("porcentajeEnergiaGenerada", obj.getPorcentajeEnergiaGenerada());
            document.append("sentidoMarcha", obj.getSentidoMarcha());
            document.append("tipoTrama", obj.getTipoTrama());
            document.append("temperaturaBaterias", obj.getTemperaturaBaterias());
            document.append("consumoCombustible", obj.getConsumoCombustible());
            document.append("usoCpuSts", obj.getUsoCpuSts());
            document.append("nivelRestanteEnergia", obj.getNivelRestanteEnergia());
            document.append("idVehiculo", obj.getIdVehiculo());
            document.append("idOperador", obj.getIdOperador());
            document.append("tecnologiaMotor", obj.getTecnologiaMotor());
            document.append("idRegistro", obj.getIdRegistro());
            document.append("tipoBus", obj.getTipoBus());
            document.append("codigoPeriodica", obj.getCodigoPeriodica());
            document.append("consumoEnergia", obj.getConsumoEnergia());
            document.append("memRamSts", obj.getMemRamSts());
            document.append("localizacionVehiculo", obj.getLocalizacionVehiculo());
            document.append("aceleracionVehiculo", obj.getAceleracionVehiculo());
            document.append("regeneracionEnergia", obj.getRegeneracionEnergia());

            //Inserting the document into the collection
            collection.insertOne(document);
            System.out.println("Success! Inserted document id: ");
        } catch (MongoException me) {
            System.err.println("Unable to insert due to an error: " + me);
        }
    }

    public String updateDocuments(MongoCollection<Document> collection, EBPeriodic obj, boolean option) {
        String message = "";
        try {
            Document document = new Document();
            Document query = new Document();
            if (option) {

                document.append("placa", Tools.getProperties(obj.getIdVehiculo()));
                document.append("unidadFuncional", obj.getIdVehiculo().substring(0, 3).equals("Z63") ? 1 : 2);
                document.append("tipoFreno", obj.getTipoFreno());
                document.append("tramaRetransmitida", obj.isTramaRetransmitida());
                document.append("memDiscoSts", obj.getMemRamSts());
                document.append("sentidoMarcha", obj.getSentidoMarcha());
                document.append("tipoTrama", obj.getTipoTrama());
                document.append("usoCpuSts", obj.getUsoCpuSts());
                document.append("tecnologiaMotor", obj.getTecnologiaMotor());
                document.append("memRamSts", obj.getMemRamSts());
                document.append("patio", patio(Double.parseDouble(obj.getLocalizacionVehiculo().getLatitud()), Double.parseDouble(obj.getLocalizacionVehiculo().getLongitud())));
                document.append("poligono", poligono(Double.parseDouble(obj.getLocalizacionVehiculo().getLatitud()), Double.parseDouble(obj.getLocalizacionVehiculo().getLongitud())));
                Document localizacionVehiculo = new Document();
                localizacionVehiculo.append("latitud", obj.getLocalizacionVehiculo().getLatitud());
                localizacionVehiculo.append("longitud", obj.getLocalizacionVehiculo().getLongitud());
                document.append("localizacionVehiculo", localizacionVehiculo);
                document.append("alarma", null);
                if (obj.getCodigoEvento() != null) {
                    switch (obj.getCodigoEvento()) {
                        case "EV20":
                            document.append("cargando", true);
                            break;
                        case "EV21":
                            document.append("cargando", false);
                            break;
                        case "EV2":
                            document.append("estadoAperturaCierrePuertas", obj.getEstadoAperturaCierrePuertas());
                            break;
                        case "EV6":
                            // Declaraciones
                            document.append("encendido", true);
                            break;
                        case "EV7":
                            // Declaraciones
                            document.append("encendido", false);
                            break;
                    }

                }

                if (obj.getFechaHoraEnvioDato() != null) {
                    document.append("fechaHoraEnvioDato", obj.getFechaHoraEnvioDato());
                }
                if (obj.getKilometrosOdometro() != null) {
                    document.append("kilometrosOdometro", obj.getKilometrosOdometro());
                }
                if (obj.getNivelTanqueCombustible() != null) {
                    document.append("nivelTanqueCombustible", obj.getNivelTanqueCombustible());
                }
                if (obj.getRevolucionesMotor() != null) {
                    document.append("revolucionesMotor", obj.getRevolucionesMotor());
                }
                if (obj.getVelocidadVehiculo() != null) {
                    document.append("velocidadVehiculo", obj.getVelocidadVehiculo());
                }
                if (obj.getIdRuta() != null) {
                    document.append("idRuta", obj.getIdRuta());
                }
                if (obj.getIdConductor() != null) {
                    document.append("idConductor", obj.getIdConductor());
                }
                if (obj.getEstadoDesgasteFrenos() != null) {
                    document.append("estadoDesgasteFrenos", obj.getEstadoDesgasteFrenos());
                }
                if (obj.getVersionTrama() != null) {
                    document.append("versionTrama", obj.getVersionTrama());
                }
                if (obj.getPresionAceiteMotor() != null) {
                    document.append("presionAceiteMotor", obj.getPresionAceiteMotor());
                }
                if (obj.getTemperaturaSts() != null) {
                    document.append("temperaturaSts", obj.getTemperaturaSts());
                }
                if (obj.getFechaHoraLecturaDato() != null) {
                    document.append("fechaHoraLecturaDato", obj.getFechaHoraLecturaDato());
                }
                if (obj.getPorcentajeEnergiaGenerada() != null) {
                    document.append("porcentajeEnergiaGenerada", obj.getPorcentajeEnergiaGenerada());
                }
                if (obj.getTemperaturaBaterias() != null) {
                    document.append("temperaturaBaterias", obj.getTemperaturaBaterias());
                }
                if (obj.getConsumoCombustible() != null) {
                    document.append("consumoCombustible", obj.getConsumoCombustible());
                }
                if (obj.getIdVehiculo() != null) {
                    document.append("idVehiculo", obj.getIdVehiculo());
                }
                if (obj.getIdOperador() != null) {
                    document.append("idOperador", obj.getIdOperador());
                }
                if (obj.getIdRegistro() != null) {
                    document.append("idRegistro", obj.getIdRegistro());
                }
                if (obj.getTipoBus() != null) {
                    document.append("tipoBus", obj.getTipoBus());
                }
                if (obj.getCodigoPeriodica() != null) {
                    document.append("codigoPeriodica", obj.getCodigoPeriodica());
                }
                if (obj.getConsumoEnergia() != null) {
                    document.append("consumoEnergia", obj.getConsumoEnergia());
                }
                if (obj.getTemperaturaMotor() != null) {
                    document.append("temperaturaMotor", obj.getTemperaturaMotor());
                }
                if (obj.getAceleracionVehiculo() != null) {
                    document.append("aceleracionVehiculo", obj.getAceleracionVehiculo());
                }
                if (obj.getRegeneracionEnergia() != null) {
                    document.append("regeneracionEnergia", obj.getRegeneracionEnergia());
                }
                query.append("idVehiculo", obj.getIdVehiculo().trim());
            } else {
                Document alarma = new Document();
                alarma.append("placa", Tools.getProperties(obj.getAlarma().getIdVehiculo()));
                alarma.append("unidadFuncional", obj.getAlarma().getIdVehiculo().substring(0, 3).equals("Z63") ? 1 : 2);
                alarma.append("velocidadVehiculo", obj.getAlarma().getVelocidadVehiculo());
                alarma.append("aceleracionVehiculo", obj.getAlarma().getAceleracionVehiculo());
                alarma.append("kilometrosOdometro", obj.getAlarma().getKilometrosOdometro());
                alarma.append("peso", obj.getAlarma().getPeso());
                alarma.append("level", obj.getAlarma().getLevel());
                alarma.append("idVehicle", obj.getAlarma().getIdVehiculo());
                alarma.append("fechaHoraLecturaDato", obj.getAlarma().getFechaHoraLecturaDato());
                alarma.append("emails", obj.getAlarma().getEmails());
                alarma.append("code", obj.getAlarma().getCode());
                alarma.append("clasification", obj.getAlarma().getClasification());
                alarma.append("temperaturaMotor", obj.getAlarma().getTemperaturaMotor());
                alarma.append("presionAceiteMotor", obj.getAlarma().getPresionAceiteMotor());
                alarma.append("revolucionesMotor", obj.getAlarma().getRevolucionesMotor());
                alarma.append("estadoDesgasteFrenos", obj.getAlarma().getEstadoDesgasteFrenos());
                alarma.append("consumoCombustible", obj.getAlarma().getConsumoCombustible());
                alarma.append("nivelTanqueCombustible", obj.getAlarma().getNivelTanqueCombustible());
                alarma.append("consumoEnergia", obj.getAlarma().getConsumoEnergia());
                alarma.append("regeneracionEnergia", obj.getAlarma().getRegeneracionEnergia());
                alarma.append("nivelRestanteEnergia", obj.getAlarma().getNivelRestanteEnergia());
                alarma.append("porcentajeEnergiaGenerada", obj.getAlarma().getPorcentajeEnergiaGenerada());
                alarma.append("temperaturaSts", obj.getAlarma().getTemperaturaSts());
                alarma.append("usoCpuSts", obj.getAlarma().getUsoCpuSts());
                alarma.append("memRamSts", obj.getAlarma().getMemRamSts());
                alarma.append("memDiscoSts", obj.getAlarma().getMemDiscoSts());
                alarma.append("temperaturaBaterias", obj.getAlarma().getTemperaturaBaterias());
                alarma.append("sentidoMarcha", obj.getAlarma().getSentidoMarcha());
                alarma.append("temperaturaCabina", obj.getAlarma().getTemperaturaCabina());
                alarma.append("estimacionOcupacionSuben", obj.getAlarma().getEstimacionOcupacionSuben());
                alarma.append("estimacionOcupacionBajan", obj.getAlarma().getEstimacionOcupacionBajan());
                alarma.append("estimacionOcupacionAbordo", obj.getAlarma().getEstimacionOcupacionAbordo());
                alarma.append("estadoAperturaCierrePuertas", obj.getAlarma().getEstadoAperturaCierrePuertas());
                alarma.append("fotoConductor", obj.getAlarma().getFotoConductor());
                alarma.append("codigoComportamientoAnomalo", obj.getAlarma().getCodigoComportamientoAnomalo());
                alarma.append("porcentajeCargaBaterias", obj.getAlarma().getPorcentajeCargaBaterias());
                alarma.append("estadoCinturonSeguridad", obj.getAlarma().getEstadoCinturonSeguridad());
                alarma.append("codigoCamara", obj.getAlarma().getCodigoCamara());
                alarma.append("description", obj.getAlarma().getDescription());
                document.append("alarma", alarma);
                query.append("idVehiculo", obj.getAlarma().getIdVehiculo());
            }

            Document update = new Document();
            update.append("$set", document);
            UpdateOptions options = new UpdateOptions().upsert(true);

            try {
                UpdateResult result = collection.updateOne(query, update, options);
                message = "Modified document count: " + result.getModifiedCount();
            } catch (MongoException me) {
                message = "Unable to update due to an error: " + me;
            }

        } catch (Exception e) {

            message = "Updation failed" + e;
        }
        return message;
    }

    private Boolean patio(double lg, double lt) {
        Path2D path = new Path2D.Double();
        path.moveTo(4.699738258550552, -74.16250050334891);
        path.lineTo(4.70071308968479, -74.16172021631117);
        path.lineTo(4.702329065546141, -74.16375342646097);
        path.lineTo(4.700217416757468, -74.1659474935565);
        path.lineTo(4.699738258550552, -74.16250050334891);
        path.closePath();
        return path.contains(lg, lt);
    }

    private Boolean recodo(double lg, double lt) {
        Path2D path = new Path2D.Double();
        path.moveTo(4.677066798329514, -74.17183666764799);
        path.lineTo(4.680564812405916, -74.16680442495675);
        path.lineTo(4.682015853659783, -74.16796062990873);
        path.lineTo(4.678465736727212, -74.17283736632882);
        path.lineTo(4.677066798329514, -74.17183666764799);
        path.closePath();
        return path.contains(lg, lt);
    }

    private Boolean puentegrande(double lg, double lt) {
        Path2D path = new Path2D.Double();
        path.moveTo(4.696622633225062, -74.16900083508725);
        path.lineTo(4.696870264845041, -74.16875463426032);
        path.lineTo(4.697422084616133, -74.16932566896128);
        path.lineTo(4.697179093295655, -74.16957299394568);
        path.lineTo(4.696622633225062, -74.16900083508725);
        path.closePath();
        return path.contains(lg, lt);
    }

    private Boolean refujio(double lg, double lt) {
        Path2D path = new Path2D.Double();
        path.moveTo(4.694717871379276, -74.15524065185826);
        path.lineTo(4.69519442471854, -74.15461270426134);
        path.lineTo(4.694718618881032, -74.1542368152498);
        path.lineTo(4.695086539608937, -74.15375607006018);
        path.lineTo(4.695993378675794, -74.15448433693676);
        path.lineTo(4.695139059655964, -74.15558199297273);
        path.lineTo(4.694717871379276, -74.15524065185826);
        path.closePath();
        return path.contains(lg, lt);
    }

    private Boolean pradogrande(double lg, double lt) {
        Path2D path = new Path2D.Double();
        path.moveTo(4.664418057332561, -74.13734506785126);
        path.lineTo(4.665501411159569, -74.13593795675754);
        path.lineTo(4.665876075327076, -74.13624183371707);
        path.lineTo(4.664798090353051, -74.13762414554303);
        path.lineTo(4.664418057332561, -74.13734506785126);
        path.closePath();
        return path.contains(lg, lt);
    }

    private Boolean puertateja(double lg, double lt) {
        Path2D path = new Path2D.Double();
        path.moveTo(4.681188470364614, -74.12745487068759);
        path.lineTo(4.680376234186786, -74.12825327880142);
        path.lineTo(4.680060729121128, -74.12794009207208);
        path.lineTo(4.680813817181933, -74.12714367135978);
        path.lineTo(4.681188470364614, -74.12745487068759);
        path.closePath();
        return path.contains(lg, lt);
    }

    private int poligono(double lg, double lt) {
        if (patio(lg, lt)) {
            return 1;
        } else if (recodo(lg, lt)) {
            return 2;
        } else if (puentegrande(lg, lt)) {
            return 3;
        } else if (refujio(lg, lt)) {
            return 4;
        } else if (pradogrande(lg, lt)) {
            return 5;
        } else if (puertateja(lg, lt)) {
            return 6;
        } else {
            return 0;
        }
    }

}
