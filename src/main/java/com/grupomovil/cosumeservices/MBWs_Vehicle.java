package com.grupomovil.cosumeservices;

import com.google.gson.Gson;
import com.grupomovil.entity.EBGoogleSheets;
import com.grupomovil.entity.ws.EBWs_Available;
import com.grupomovil.entity.ws.EBWs_TaskVehicleResponse;
import com.grupomovil.entity.ws.EBWs_Vehicle;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import kong.unirest.UnirestException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.apache.log4j.Logger;

/**
 *
 * @author jeisson.junco
 */
public class MBWs_Vehicle {

    private static Logger logger = Logger.getLogger(MBWs_Vehicle.class);

    public List<EBWs_Vehicle.ListData> getTasksVehicle(String codVeh, Long date) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBWs_Vehicle dataObj = new EBWs_Vehicle();
        List<EBWs_Vehicle.ListData> data = new ArrayList<>();

        try {
            HttpResponse<String> response = Unirest.get(MBWs_Token.getUrl() + "vehicle/tasks?codigo=" + codVeh + "&fecha=" + date)
                    .header("Authorization", "bearer " + MBWs_Token.getToken("jjunco", "junco2020", false))
                    .asString();
            Unirest.shutDown();
            switch (response.getStatus()) {
                case 200:
                    logger.info(name + "- 200");
                    dataObj = new Gson().fromJson(response.getBody(), EBWs_Vehicle.class);
                    if (Objects.nonNull(dataObj.getList_data())) {
                        data = dataObj.getList_data();
                    }
                    break;
                case 401:
                    logger.warn(name + "- 401");
                    MBWs_Token.getToken("jjunco", "junco2020", true);
                    getTasksVehicle(codVeh, date);
                    break;
                default:
                    break;
            }
        } catch (UnirestException e) {
            logger.error(name + "- " + e.getMessage());
        }
        logger.info(name + "- Finaliza");
        return data;
    }

    public List<EBWs_Available.ListData> getAvailable(int idUF) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBWs_Available dataObj = new EBWs_Available();
        List<EBWs_Available.ListData> data = new ArrayList<>();

        try {

            HttpResponse<String> response = Unirest.get(MBWs_Token.getUrl() + "vehicle/available?idUF=" + idUF)
                    .header("Authorization", "bearer " + MBWs_Token.getToken("jjunco", "junco2020", false))
                    .asString();
            Unirest.shutDown();
            switch (response.getStatus()) {
                case 200:
                    logger.info(name + "- 200");
                    dataObj = new Gson().fromJson(response.getBody(), EBWs_Available.class);
                    if (Objects.nonNull(dataObj.getList_data())) {
                        data = dataObj.getList_data();
                    }
                    break;
                case 401:
                    logger.warn(name + "- 401");
                    MBWs_Token.getToken("jjunco", "junco2020", true);
                    getAvailable(idUF);
                    break;
                default:
                    break;
            }
        } catch (UnirestException e) {
            logger.error(name + "- " + e.getMessage());
        }
        logger.info(name + "- Finaliza");
        return data;
    }

    public EBWs_TaskVehicleResponse postTaskVehicleResponse(String json) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBWs_TaskVehicleResponse dataObj = null;
        try {
            HttpResponse<String> response = Unirest.post(MBWs_Token.getUrl() + "vehicle/change")
                    .header("Authorization", "bearer " + MBWs_Token.getToken("jjunco", "junco2020", false)).header("Content-Type", "application/json")
                    .body(json)
                    .asString();
            Unirest.shutDown();
            switch (response.getStatus()) {
                case 200:
                    logger.info(name + "- 200");
                    dataObj = new Gson().fromJson(response.getBody(), EBWs_TaskVehicleResponse.class);
                    break;
                case 401:
                    logger.warn(name + "- 401");
                    MBWs_Token.getToken("jjunco", "junco2020", true);
                    postTaskVehicleResponse(json);
                    break;
                default:
                    break;
            }

        } catch (UnirestException e) {
            logger.error(name + "- " + e.getMessage());
        }
        logger.info(name + "- Finaliza");
        return dataObj;
    }

    public String ubicarBusZ63(String bus) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBGoogleSheets dataObj = null;
        String ubicacion = "";
        try {
            HttpResponse<String> response = Unirest.get("https://docs.google.com/spreadsheets/d/1NmFJiHnSZrbKH7qlNGQdb_ZKatsrzSoposuxd5g0frY/gviz/tq?tqx=out:json&tq&gid=795006694")
                    .asString();
            Unirest.shutDown();
            switch (response.getStatus()) {
                case 200:
                    logger.info(name + "- 200");
                    String[] arrOfStr = response.getBody().split("setResponse\\(");
                    String str = arrOfStr[1];
                    String[] arrOfStr1 = str.split("\\);");
                    String str1 = arrOfStr1[0];
                    dataObj = new Gson().fromJson(str1, EBGoogleSheets.class);
                    for (EBGoogleSheets.Row a : dataObj.getTable().getRows()) {
                        for (EBGoogleSheets.C c : a.getC()) {
                            if (Objects.nonNull(c)) {
                                if (Objects.nonNull(c.getV())) {
                                    if (c.getV().equals(bus)) {
                                        if (a.getC().get(2) == null) {
                                            ubicacion = "Sin asignación";
                                        } else {
                                            ubicacion = a.getC().get(2).getV().toString();
                                        }
                                    }
                                }
                            }
                        }
                    }

                    break;
                case 401:
                    ubicacion = "Sin asignación";
                    break;
                default:
                    break;
            }

        } catch (UnirestException e) {
            logger.error(name + "- " + e.getMessage());
        }
        logger.info(name + "- Finaliza");
        return ubicacion;
    }

    public String ubicarBusValleZ63(String bus) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBGoogleSheets dataObj = null;
        String ubicacion = "";
        try {
            HttpResponse<String> response = Unirest.get("https://docs.google.com/spreadsheets/d/1NmFJiHnSZrbKH7qlNGQdb_ZKatsrzSoposuxd5g0frY/gviz/tq?tqx=out:json&tq&gid=1497605648")
                    .asString();
            Unirest.shutDown();
            switch (response.getStatus()) {
                case 200:
                    logger.info(name + "- 200");
                    String[] arrOfStr = response.getBody().split("setResponse\\(");
                    String str = arrOfStr[1];
                    String[] arrOfStr1 = str.split("\\);");
                    String str1 = arrOfStr1[0];
                    dataObj = new Gson().fromJson(str1, EBGoogleSheets.class);
                    for (EBGoogleSheets.Row a : dataObj.getTable().getRows()) {
                        for (EBGoogleSheets.C c : a.getC()) {
                            if (Objects.nonNull(c)) {
                                if (Objects.nonNull(c.getV())) {
                                    if (c.getV().equals(bus)) {
                                        if (a.getC().get(2) == null) {
                                            ubicacion = "Sin asignación";
                                        } else {
                                            ubicacion = a.getC().get(2).getV().toString();
                                        }
                                    }
                                }
                            }
                        }
                    }

                    break;
                case 401:
                    ubicacion = "Sin asignación";
                    break;
                default:
                    break;
            }

        } catch (UnirestException e) {
            logger.error(name + "- " + e.getMessage());
        }
        logger.info(name + "- Finaliza");
        return ubicacion;
    }

    public String ubicarBusZ67(String bus) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBGoogleSheets dataObj = null;
        String ubicacion = "";
        try {
            HttpResponse<String> response = Unirest.get("https://docs.google.com/spreadsheets/d/1NmFJiHnSZrbKH7qlNGQdb_ZKatsrzSoposuxd5g0frY/gviz/tq?tqx=out:json&tq&gid=0")
                    .asString();
            Unirest.shutDown();

            switch (response.getStatus()) {
                case 200:
                    logger.info(name + "- 200");
                    String[] arrOfStr = response.getBody().split("setResponse\\(");
                    String str = arrOfStr[1];
                    String[] arrOfStr1 = str.split("\\);");
                    String str1 = arrOfStr1[0];
                    dataObj = new Gson().fromJson(str1, EBGoogleSheets.class);
                    for (EBGoogleSheets.Row a : dataObj.getTable().getRows()) {
                        for (EBGoogleSheets.C c : a.getC()) {
                            if (Objects.nonNull(c)) {
                                if (Objects.nonNull(c.getV())) {
                                    if (c.getV().equals(bus)) {
                                        if (a.getC().get(2) == null) {
                                            ubicacion = "Sin asignación";
                                        } else {
                                            ubicacion = a.getC().get(2).getV().toString();
                                        }

                                    }
                                }
                            }
                        }
                    }

                    break;
                case 401:
                    ubicacion = "Sin asignación";
                    break;
                default:
                    break;
            }

        } catch (UnirestException e) {
            logger.error(name + "- " + e.getMessage());
        }
        logger.info(name + "- Finaliza");
        return ubicacion;
    }

    public String ubicarBusValleZ67(String bus) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBGoogleSheets dataObj = null;
        String ubicacion = "";
        try {
            HttpResponse<String> response = Unirest.get("https://docs.google.com/spreadsheets/d/1NmFJiHnSZrbKH7qlNGQdb_ZKatsrzSoposuxd5g0frY/gviz/tq?tqx=out:json&tq&gid=376862364")
                    .asString();
            Unirest.shutDown();

            switch (response.getStatus()) {
                case 200:
                    logger.info(name + "- 200");
                    String[] arrOfStr = response.getBody().split("setResponse\\(");
                    String str = arrOfStr[1];
                    String[] arrOfStr1 = str.split("\\);");
                    String str1 = arrOfStr1[0];
                    dataObj = new Gson().fromJson(str1, EBGoogleSheets.class);
                    for (EBGoogleSheets.Row a : dataObj.getTable().getRows()) {
                        for (EBGoogleSheets.C c : a.getC()) {
                            if (Objects.nonNull(c)) {
                                if (Objects.nonNull(c.getV())) {
                                    if (c.getV().equals(bus)) {
                                        if (a.getC().get(2) == null) {
                                            ubicacion = "Sin asignación";
                                        } else {
                                            ubicacion = a.getC().get(2).getV().toString();
                                        }

                                    }
                                }
                            }
                        }
                    }

                    break;
                case 401:
                    ubicacion = "Sin asignación";
                    break;
                default:
                    break;
            }

        } catch (UnirestException e) {
            logger.error(name + "- " + e.getMessage());
        }
        logger.info(name + "- Finaliza");
        return ubicacion;
    }
}
