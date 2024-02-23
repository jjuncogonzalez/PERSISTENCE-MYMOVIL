package com.grupomovil.persistence;

import com.grupomovil.tools.MBTools;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import java.text.ParseException;
import java.util.Objects;
import org.apache.log4j.Logger;

/**
 * @author jjunco
 */
public class AccesDao implements Serializable {

    private static ConexionBean objConnection;
    private static final long serialVersionUID = 1L;
    private String message;
    private List<Object> list;

    private static Logger logger = Logger.getLogger(AccesDao.class);

    private static AccesDao instance;

    private AccesDao() {
        try {
            objConnection = new ConexionBean();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static AccesDao getSingletonInstance() {
        if (instance == null) {
            instance = new AccesDao();
        }
        return instance;
    }

    public static ConexionBean getObjConnection() {
        return objConnection;
    }

    public static void setObjConnection(ConexionBean objConnection) {
        AccesDao.objConnection = objConnection;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public List<?> select(String function, Object obj, int db) throws SQLException,
            ParseException {
        list = null;
        SqlSession s1 = null;
        try {
            switch (db) {
                case 1:
                    s1 = objConnection.getSsf1().openSession();
                    break;
                case 2:
                    s1 = objConnection.getSsf2().openSession();
                    break;
                case 3:
                    s1 = objConnection.getSsf3().openSession();
                    break;
                case 4:
                    s1 = objConnection.getSsf4().openSession();
                    break;
                case 5:
                    s1 = objConnection.getSsf5().openSession();
                    break;
                case 6:
                    s1 = objConnection.getSsf6().openSession();
                    break;
                case 7:
                    s1 = objConnection.getSsf7().openSession();
                    break;
                case 8:
                    s1 = objConnection.getSsf8().openSession();
                    break;
                case 9:
                    s1 = objConnection.getSsf9().openSession();
                    break;
                case 10:
                    s1 = objConnection.getSsf10().openSession();
                    break;
                case 11:
                    s1 = objConnection.getSsf11().openSession();
                    break;
                case 12:
                    s1 = objConnection.getSsf12().openSession();
                    break;
                case 13:
                    s1 = objConnection.getSsf13().openSession();
                    break;
                default:
                    break;
            }
            list = s1.selectList(function, obj);
        } catch (Exception e) {
            logger.error("Metodo: " + MBTools.getMethodName() + ", Error: " + e.getMessage());
        } finally {
            if (Objects.nonNull(s1)) {
                s1.close();
            }
        }
        return list;
    }

    public Object selectObject(String function, Object obj, int db)
            throws SQLException, ParseException {
        SqlSession s2 = null;
        try {
            switch (db) {
                case 1:
                    s2 = objConnection.getSsf1().openSession();
                    break;
                case 2:
                    s2 = objConnection.getSsf2().openSession();
                    break;
                case 3:
                    s2 = objConnection.getSsf3().openSession();
                    break;
                case 4:
                    s2 = objConnection.getSsf4().openSession();
                    break;
                case 5:
                    s2 = objConnection.getSsf5().openSession();
                    break;
                case 6:
                    s2 = objConnection.getSsf6().openSession();
                    break;
                case 7:
                    s2 = objConnection.getSsf7().openSession();
                    break;
                case 8:
                    s2 = objConnection.getSsf8().openSession();
                    break;
                case 9:
                    s2 = objConnection.getSsf9().openSession();
                    break;
                case 10:
                    s2 = objConnection.getSsf10().openSession();
                    break;
                case 11:
                    s2 = objConnection.getSsf11().openSession();
                    break;
                case 12:
                    s2 = objConnection.getSsf12().openSession();
                    break;
                case 13:
                    s2 = objConnection.getSsf13().openSession();
                    break;
                default:
                    break;
            }
            obj = s2.selectOne(function, obj);
        } catch (Exception e) {
            logger.error("Metodo: " + MBTools.getMethodName() + ", Error: " + e.getMessage());
        } finally {
            if (Objects.nonNull(s2)) {
                s2.close();
            }
        }
        return obj;
    }

    public String create(String function, Object obj, int db) throws SQLException,
            ParseException {
        int resp = 0;
        SqlSession s3 = null;
        message = "OK";
        try {
            switch (db) {
                case 1:
                    s3 = objConnection.getSsf1().openSession();
                    break;
                case 2:
                    s3 = objConnection.getSsf2().openSession();
                    break;
                case 3:
                    s3 = objConnection.getSsf3().openSession();
                    break;
                case 4:
                    s3 = objConnection.getSsf4().openSession();
                    break;
                case 5:
                    s3 = objConnection.getSsf5().openSession();
                    break;
                case 6:
                    s3 = objConnection.getSsf6().openSession();
                    break;
                case 7:
                    s3 = objConnection.getSsf7().openSession();
                    break;
                case 8:
                    s3 = objConnection.getSsf8().openSession();
                    break;
                case 9:
                    s3 = objConnection.getSsf9().openSession();
                    break;
                case 10:
                    s3 = objConnection.getSsf10().openSession();
                    break;
                case 11:
                    s3 = objConnection.getSsf11().openSession();
                    break;
                case 12:
                    s3 = objConnection.getSsf12().openSession();
                    break;
                case 13:
                    s3 = objConnection.getSsf13().openSession();
                    break;
                default:
                    break;
            }
            if (s3 != null) {
                resp = s3.insert(function, obj);
                s3.commit();
            }
        } catch (Exception e) {
            logger.error("Metodo: " + MBTools.getMethodName() + ", Error: " + e.getMessage());
            System.out.println("Error: " + function + " : " + e);
            message = e.toString();
            resp = 0;
            if (s3 != null) {
                s3.rollback();
            }
        } finally {
            if (s3 != null) {
                s3.close();
            }

            if (resp == 0) {
                message = "Error: " + function;
            }
        }
        return message;
    }

    public String update(String function, Object obj, int db) throws SQLException,
            ParseException {
        int resp = 0;
        message = "OK";
        SqlSession s4 = null;
        try {
            switch (db) {
                case 1:
                    s4 = objConnection.getSsf1().openSession();
                    break;
                case 2:
                    s4 = objConnection.getSsf2().openSession();
                    break;
                case 3:
                    s4 = objConnection.getSsf3().openSession();
                    break;
                case 4:
                    s4 = objConnection.getSsf4().openSession();
                    break;
                case 5:
                    s4 = objConnection.getSsf5().openSession();
                    break;
                case 6:
                    s4 = objConnection.getSsf6().openSession();
                    break;
                case 7:
                    s4 = objConnection.getSsf7().openSession();
                    break;
                case 8:
                    s4 = objConnection.getSsf8().openSession();
                    break;
                case 9:
                    s4 = objConnection.getSsf9().openSession();
                    break;
                case 10:
                    s4 = objConnection.getSsf10().openSession();
                    break;
                case 11:
                    s4 = objConnection.getSsf11().openSession();
                    break;
                case 12:
                    s4 = objConnection.getSsf12().openSession();
                    break;
                case 13:
                    s4 = objConnection.getSsf13().openSession();
                    break;
                default:
                    break;
            }
            if (s4 != null) {
                resp = s4.update(function, obj);
                s4.commit();
            }
        } catch (Exception e) {
            message = "Error: " + function + " : " + e.toString();
            logger.error("Metodo: " + MBTools.getMethodName() + ", Error: " + e.getMessage());
            resp = 0;
        } finally {
            if (s4 != null) {
                s4.close();
            }
            if (resp == 0) {
                message = "Error: " + function;
            }
        }
        return message;
    }

    public String delete(String function, Object obj, int db) throws SQLException,
            ParseException {
        int resp = 0;
        message = "OK";
        SqlSession s5 = null;
        try {
            switch (db) {
                case 1:
                    s5 = objConnection.getSsf1().openSession();
                    break;
                case 2:
                    s5 = objConnection.getSsf2().openSession();
                    break;
                case 3:
                    s5 = objConnection.getSsf3().openSession();
                    break;
                case 4:
                    s5 = objConnection.getSsf4().openSession();
                    break;
                case 5:
                    s5 = objConnection.getSsf5().openSession();
                    break;
                case 6:
                    s5 = objConnection.getSsf6().openSession();
                    break;
                case 7:
                    s5 = objConnection.getSsf7().openSession();
                    break;
                case 8:
                    s5 = objConnection.getSsf8().openSession();
                    break;
                case 9:
                    s5 = objConnection.getSsf9().openSession();
                    break;
                case 10:
                    s5 = objConnection.getSsf10().openSession();
                    break;
                case 11:
                    s5 = objConnection.getSsf11().openSession();
                    break;
                case 12:
                    s5 = objConnection.getSsf12().openSession();
                    break;
                    case 13:
                    s5 = objConnection.getSsf13().openSession();
                    break;
                default:
                    break;
            }
            if (s5 != null) {
                resp = s5.update(function, obj);
                s5.commit();
            }
        } catch (Exception e) {
            logger.error("Metodo: " + MBTools.getMethodName() + ", Error: " + e.getMessage());
            message = "Error: " + function + " : " + e.toString();
            resp = 0;

            if (s5 != null) {
                s5.rollback();
            }
        } finally {
            if (s5 != null) {
                s5.close();
            }
            if (resp == 0) {
                message = "Error: " + function;
            }
        }
        return message;
    }

    public String findUniqueValueString(String function, String id, int db)
            throws SQLException, ParseException {
        String resp = "";

        SqlSession s6 = null;
        try {

            switch (db) {
                case 1:
                    s6 = objConnection.getSsf1().openSession();
                    break;
                case 2:
                    s6 = objConnection.getSsf2().openSession();
                    break;
                case 3:
                    s6 = objConnection.getSsf3().openSession();
                    break;
                case 4:
                    s6 = objConnection.getSsf4().openSession();
                    break;
                case 5:
                    s6 = objConnection.getSsf5().openSession();
                    break;
                case 6:
                    s6 = objConnection.getSsf6().openSession();
                    break;
                case 7:
                    s6 = objConnection.getSsf7().openSession();
                    break;
                case 8:
                    s6 = objConnection.getSsf8().openSession();
                    break;
                case 9:
                    s6 = objConnection.getSsf9().openSession();
                    break;
                case 10:
                    s6 = objConnection.getSsf10().openSession();
                    break;
                case 11:
                    s6 = objConnection.getSsf11().openSession();
                    break;
                case 12:
                    s6 = objConnection.getSsf12().openSession();
                    break;
                    case 13:
                    s6 = objConnection.getSsf13().openSession();
                    break;
                default:
                    break;
            }

            resp = s6.selectOne(function, id);

        } catch (Exception e) {
            logger.error("Metodo: " + MBTools.getMethodName() + ", Error: " + e.getMessage());
        } finally {
            if (Objects.nonNull(s6)) {
                s6.close();
            }
        }
        return resp;
    }

    public Object selectObjectByValue(String function, Object value, int db)
            throws SQLException, ParseException {
        Object obj = null;
        SqlSession s7 = null;
        try {
            switch (db) {
                case 1:
                    s7 = objConnection.getSsf1().openSession();
                    break;
                case 2:
                    s7 = objConnection.getSsf2().openSession();
                    break;
                case 3:
                    s7 = objConnection.getSsf3().openSession();
                    break;
                case 4:
                    s7 = objConnection.getSsf4().openSession();
                    break;
                case 5:
                    s7 = objConnection.getSsf5().openSession();
                    break;
                case 6:
                    s7 = objConnection.getSsf6().openSession();
                    break;
                case 7:
                    s7 = objConnection.getSsf7().openSession();
                    break;
                case 8:
                    s7 = objConnection.getSsf8().openSession();
                    break;
                case 9:
                    s7 = objConnection.getSsf9().openSession();
                    break;
                case 10:
                    s7 = objConnection.getSsf10().openSession();
                    break;
                case 11:
                    s7 = objConnection.getSsf11().openSession();
                    break;
                case 12:
                    s7 = objConnection.getSsf12().openSession();
                    break;
                    case 13:
                    s7 = objConnection.getSsf13().openSession();
                    break;
                default:
                    break;
            }
            obj = s7.selectOne(function, value);
        } catch (Exception e) {
            logger.error("Metodo: " + MBTools.getMethodName() + ", Error: " + e.getMessage());
        } finally {
            if (Objects.nonNull(s7)) {
                s7.close();
            }
        }
        return obj;
    }

    public int findUniqueValueInt(String function, int obj, int db) throws SQLException,
            ParseException {
        int resp = 0;

        SqlSession s8 = null;
        try {

            switch (db) {
                case 1:
                    s8 = objConnection.getSsf1().openSession();
                    break;
                case 2:
                    s8 = objConnection.getSsf2().openSession();
                    break;
                case 3:
                    s8 = objConnection.getSsf3().openSession();
                    break;
                case 4:
                    s8 = objConnection.getSsf4().openSession();
                    break;
                case 5:
                    s8 = objConnection.getSsf5().openSession();
                    break;
                case 6:
                    s8 = objConnection.getSsf6().openSession();
                    break;
                case 7:
                    s8 = objConnection.getSsf7().openSession();
                    break;
                case 8:
                    s8 = objConnection.getSsf8().openSession();
                    break;
                case 9:
                    s8 = objConnection.getSsf9().openSession();
                    break;
                case 10:
                    s8 = objConnection.getSsf10().openSession();
                    break;
                case 11:
                    s8 = objConnection.getSsf11().openSession();
                    break;
                case 12:
                    s8 = objConnection.getSsf12().openSession();
                    break;
                    case 13:
                    s8 = objConnection.getSsf13().openSession();
                    break;
                default:
                    break;
            }

            resp = s8.selectOne(function, obj);

        } catch (Exception e) {
            logger.error("Metodo: " + MBTools.getMethodName() + ", Error: " + e.getMessage());
        } finally {
            if (Objects.nonNull(s8)) {
                s8.close();
            }
        }
        return resp;
    }

    public int findUniqueValueIntObject(String function, Object obj, int db) throws SQLException,
            ParseException {
        int resp = 0;

        SqlSession s9 = null;
        try {

            switch (db) {
                case 1:
                    s9 = objConnection.getSsf1().openSession();
                    break;
                case 2:
                    s9 = objConnection.getSsf2().openSession();
                    break;
                case 3:
                    s9 = objConnection.getSsf3().openSession();
                    break;
                case 4:
                    s9 = objConnection.getSsf4().openSession();
                    break;
                case 5:
                    s9 = objConnection.getSsf5().openSession();
                    break;
                case 6:
                    s9 = objConnection.getSsf6().openSession();
                    break;
                case 7:
                    s9 = objConnection.getSsf7().openSession();
                    break;
                case 8:
                    s9 = objConnection.getSsf8().openSession();
                    break;
                case 9:
                    s9 = objConnection.getSsf9().openSession();
                    break;
                case 10:
                    s9 = objConnection.getSsf10().openSession();
                    break;
                case 11:
                    s9 = objConnection.getSsf11().openSession();
                    break;
                case 12:
                    s9 = objConnection.getSsf12().openSession();
                    break;
                    case 13:
                    s9 = objConnection.getSsf13().openSession();
                    break;
                default:
                    break;
            }

            resp = s9.selectOne(function, obj);

        } catch (Exception e) {
            logger.error("Metodo: " + MBTools.getMethodName() + ", Error: " + e.getMessage());
        } finally {
            if (Objects.nonNull(s9)) {
                s9.close();
            }
        }
        return resp;
    }

    public void insertCommit(SqlSession session) {
        if (session != null) {
            session.commit();
            session.close();
        }

    }

    public void insertRollback(SqlSession session) {
        if (session != null) {
            session.rollback();
            session.close();
        }

    }

}
