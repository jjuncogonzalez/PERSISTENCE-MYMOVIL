package com.grupomovil.cosumeservices;

import com.google.gson.Gson;
import com.grupomovil.entity.EBGm_loc_veh;
import com.grupomovil.entity.ws.EBWs_ChangeTaskResponse;
import com.grupomovil.entity.ws.EBWs_CurrentTask;
import com.grupomovil.entity.ws.EBWs_EntryConfirmedServices;
import com.grupomovil.entity.ws.EBWs_ExitConfirmedServices;
import com.grupomovil.entity.ws.response.EBWs_General;
import com.grupomovil.entity.ws.EBWs_NextDepotEntry;
import com.grupomovil.entity.ws.EBWs_NextDepotExit;
import com.grupomovil.entity.ws.EBWs_OperatorTask;
import com.grupomovil.entity.ws.EBWs_ScheduledDepot;
import com.grupomovil.entity.ws.EBWs_ShiftStart;
import com.grupomovil.entity.ws.EBConfirmDepotEntryResponse;
import com.grupomovil.entity.ws.EBWs_EndOfShift;
import com.grupomovil.entity.ws.EBWs_Validator;
import com.grupomovil.persistence.ConexionBean;
import com.grupomovil.tools.MBTools;
import java.sql.SQLException;
import java.text.ParseException;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import kong.unirest.UnirestException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

/**
 *
 * @author jeisson.junco
 */
public class MBWs_Task {

    private static Logger logger = Logger.getLogger(MBWs_Task.class);

    public EBWs_CurrentTask.Data getFindCurrentTask(String codeTM, Long date) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBWs_CurrentTask dataObj = new EBWs_CurrentTask();
        EBWs_CurrentTask.Data data = dataObj.new Data();

        try {
            HttpResponse<String> response = Unirest.get(MBWs_Token.getUrl() + "task/findCurrentTask?codigo=" + codeTM + "&fecha=" + date)
                    .header("Authorization", "bearer " + MBWs_Token.getToken("jjunco", "junco2020", false))
                    .asString();
            Unirest.shutDown();
            switch (response.getStatus()) {
                case 200:
                    logger.info(name + "- 200");
                    dataObj = new Gson().fromJson(response.getBody(), EBWs_CurrentTask.class);
                    if (Objects.nonNull(dataObj.getData())) {
                        data = dataObj.getData();
                    }
                    EBWs_Validator v = new EBWs_Validator();
                    v.setWs_mes(dataObj.getMessage());
                    v.setWs_val(dataObj.isValid());
                    data.setObj_val(v);
                    break;
                case 401:
                    logger.warn(name + "- 401");
                    MBWs_Token.getToken("jjunco", "junco2020", true);
                    getFindCurrentTask(codeTM, date);
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

    public EBWs_NextDepotEntry.Data getFindNextDepotEntry(String codeVeh, String date, int time) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBWs_NextDepotEntry dataObj = new EBWs_NextDepotEntry();
        EBWs_NextDepotEntry.Data data = dataObj.new Data();

        try {
            HttpResponse<String> response = Unirest.get(MBWs_Token.getUrl() + "task/findNextDepotEntry?codigo=" + codeVeh.trim() + "&fecha=" + date + "&time=0")
                    .header("Authorization", "bearer " + MBWs_Token.getToken("jjunco", "junco2020", false))
                    .asString();
            Unirest.shutDown();
            switch (response.getStatus()) {
                case 200:
                    logger.info(name + "- 200");
                    dataObj = new Gson().fromJson(response.getBody(), EBWs_NextDepotEntry.class);
                    if (Objects.nonNull(dataObj.getData())) {
                        data = dataObj.getData();
                    }
                    data.setId_novedad(null);
                    data.setAfecta_disponibilidad(false);
                    EBWs_Validator v = new EBWs_Validator();
                    v.setWs_mes(dataObj.getMessage());
                    v.setWs_val(dataObj.isValid());
                    data.setObj_val(v);

                    break;
                case 401:
                    logger.warn(name + "- 401");
                    MBWs_Token.getToken("jjunco", "junco2020", true);
                    getFindNextDepotEntry(codeVeh, date, time);
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

    public EBWs_NextDepotExit.Data getFindNextDepotExit(String codeVeh, Long date, int time) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBWs_NextDepotExit dataObj = new EBWs_NextDepotExit();
        EBWs_NextDepotExit.Data data = dataObj.new Data();

        try {
            HttpResponse<String> response = Unirest.get(MBWs_Token.getUrl() + "task/findNextDepotExit?codigo=" + codeVeh.trim() + "&fecha=" + date + "&time=0")
                    .header("Authorization", "bearer " + MBWs_Token.getToken("jjunco", "junco2020", false))
                    .asString();
            Unirest.shutDown();
            switch (response.getStatus()) {
                case 200:
                    logger.info(name + "- 200");
                    dataObj = new Gson().fromJson(response.getBody(), EBWs_NextDepotExit.class);
                    if (Objects.nonNull(dataObj.getData())) {
                        data = dataObj.getData();
                    }
                    EBWs_Validator v = new EBWs_Validator();
                    v.setWs_mes(dataObj.getMessage());
                    v.setWs_val(dataObj.isValid());
                    data.setObj_val(v);
                    break;
                case 401:
                    logger.warn(name + "- 401");
                    MBWs_Token.getToken("jjunco", "junco2020", true);
                    getFindNextDepotEntry(codeVeh, date.toString(), time);
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

    public EBWs_ShiftStart.Data getFindShiftStart(String codeOpe, Long date) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa /" + codeOpe);
        EBWs_ShiftStart dataObj = new EBWs_ShiftStart();
        EBWs_ShiftStart.Data data = dataObj.new Data();

        try {
            HttpResponse<String> response = Unirest.get(MBWs_Token.getUrl() + "task/findShiftStart?codigo=" + codeOpe.trim() + "&fecha=" + date)
                    .header("Authorization", "bearer " + MBWs_Token.getToken("jjunco", "junco2020", false))
                    .asString();
            Unirest.shutDown();
            MBTools tools = new MBTools();

            switch (response.getStatus()) {
                case 200:
                    logger.info(name + "- 200");
                    dataObj = new Gson().fromJson(response.getBody(), EBWs_ShiftStart.class);
                    if (Objects.nonNull(dataObj.getData())) {
                        data = dataObj.getData();
                    }
                    EBWs_Validator v = new EBWs_Validator();
                    v.setWs_mes(dataObj.getMessage());
                    v.setWs_val(dataObj.isValid());
                    if (data != null) {
                        data.setObj_val(v);
                    }
                    Date now = new Date();

                    if (data.getPresentation_service() != null) {
                        if (copyTimeToDate(now, tools.formDateString(data.getPresentation_service().getTime_origin(), 7)).before(tools.sumarRestarHorasFecha(now, 120))) {

                            if (copyTimeToDate(now, tools.formDateString(data.getPresentation_service().getTime_origin(), 7)).after(tools.sumarRestarHorasFecha(now, -120))) {
                                data.getPresentation_service().setExp_time(false);

                            } else {
                                data.getPresentation_service().setExp_time(true);
                            }

                        } else {
                            data.getPresentation_service().setExp_time(true);

                        }
                    }

                    if (data.getDriving_service() != null) {

                        if (data.getDriving_service().getVehicle() == null || data.getDriving_service().getVehicle().equals("")) {
                            data.getDriving_service().setPosition("Sin asignación");
                        } else {
                            MBWs_Vehicle vehicle = new MBWs_Vehicle();
                            if (data.getDriving_service().getVehicle().substring(0, 3).equals("Z63")) {
                                if (now.getHours() > 6 && now.getHours() < 18) {
                                    data.getDriving_service().setPosition(vehicle.ubicarBusValleZ63(data.getDriving_service().getVehicle()));
                                } else {
                                    data.getDriving_service().setPosition(vehicle.ubicarBusZ63(data.getDriving_service().getVehicle()));
                                }
                            }
                            if (data.getDriving_service().getVehicle().substring(0, 3).equals("Z67")) {

                                if (now.getHours() > 6 && now.getHours() < 18) {
                                    data.getDriving_service().setPosition(vehicle.ubicarBusValleZ67(data.getDriving_service().getVehicle()));
                                } else {
                                    data.getDriving_service().setPosition(vehicle.ubicarBusZ67(data.getDriving_service().getVehicle()));
                                }

                            }
                        }
                    }

                    break;
                case 401:
                    logger.warn(name + "- 401");
                    MBWs_Token.getToken("jjunco", "junco2020", true);
                    getFindShiftStart(codeOpe, date);
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

    public EBGm_loc_veh getLocationVehiculo(EBGm_loc_veh obj) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        try {

            obj = (EBGm_loc_veh) selectObjectByValue("selectLocation", obj, 1);
            if (Objects.isNull(obj)) {
                EBGm_loc_veh o = new EBGm_loc_veh();
                o.setLoc_pos("Sin asignación");
                obj = o;
            }
        } catch (SQLException | ParseException e) {
            logger.error(name + "- " + e.getMessage());
        }
        logger.info(name + "- Finaliza");
        return obj;
    }

    private static ConexionBean objConnection;

    public Object selectObjectByValue(String function, Object value, int db)
            throws SQLException, ParseException {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        objConnection = new ConexionBean();
        Object obj = null;
        SqlSession s7 = null;
        try {
            s7 = objConnection.getSsf1().openSession();
            obj = s7.selectOne(function, value);
        } catch (Exception e) {
            logger.error(name + "- " + e.getMessage());
        } finally {
            if (Objects.nonNull(s7)) {
                s7.close();
            }
        }
        logger.info(name + "- Finaliza");
        return obj;
    }

    public static Date copyTimeToDate(Date date, Date time) {

        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        Calendar t = Calendar.getInstance();
        t.setTime(time);

        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.HOUR_OF_DAY, t.get(Calendar.HOUR_OF_DAY));
        c.set(Calendar.MINUTE, t.get(Calendar.MINUTE));
        c.set(Calendar.SECOND, t.get(Calendar.SECOND));
        c.set(Calendar.MILLISECOND, t.get(Calendar.MILLISECOND));
        logger.info(name + "- Finaliza");
        return c.getTime();
    }

    public EBWs_EndOfShift.Data getEndOfShift(String codeOpe, String codeVehicle, Long date) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBWs_EndOfShift dataObj = new EBWs_EndOfShift();
        EBWs_EndOfShift.Data data = dataObj.new Data();

        try {

            HttpResponse<String> response = Unirest.get(MBWs_Token.getUrl() + "task/endOfShift?employee=" + codeOpe.trim() + "&vehicle=" + codeVehicle + "&fecha=" + date)
                    .header("Authorization", "bearer " + MBWs_Token.getToken("jjunco", "junco2020", false))
                    .asString();
            Unirest.shutDown();
            switch (response.getStatus()) {
                case 200:
                    logger.info(name + "- 200");

                    dataObj = new Gson().fromJson(response.getBody(), EBWs_EndOfShift.class);
                    if (Objects.nonNull(dataObj.getData())) {
                        data = dataObj.getData();
                    }
                    EBWs_Validator v = new EBWs_Validator();
                    v.setWs_mes(dataObj.getMessage());
                    v.setWs_val(dataObj.isValid());
                    if (data != null) {
                        data.setObj_val(v);
                    }
                    break;
                case 401:
                    logger.warn(name + "- 401");
                    MBWs_Token.getToken("jjunco", "junco2020", true);
                    getEndOfShift(codeOpe, codeVehicle, date);
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

    public List<EBWs_OperatorTask.ListData> getOperatorTasks(String codeOpe, Long date) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBWs_OperatorTask dataObj = new EBWs_OperatorTask();
        List<EBWs_OperatorTask.ListData> data = new ArrayList<>();

        try {

            HttpResponse<String> response = Unirest.get(MBWs_Token.getUrl() + "task/operatorTasks?codigo=" + codeOpe + "&date=" + date)
                    .header("Authorization", "bearer " + MBWs_Token.getToken("jjunco", "junco2020", false))
                    .asString();
            Unirest.shutDown();
            switch (response.getStatus()) {
                case 200:
                    logger.info(name + "- 200");
                    dataObj = new Gson().fromJson(response.getBody(), EBWs_OperatorTask.class);
                    if (Objects.nonNull(dataObj.getList_data())) {
                        data = dataObj.getList_data();
                    }
                    break;
                case 401:
                    logger.warn(name + "- 401");
                    MBWs_Token.getToken("jjunco", "junco2020", true);
                    getOperatorTasks(codeOpe, date);
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

    public EBWs_ScheduledDepot.Data getSheduledDepotExits(int idUF, long date, long time) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBWs_ScheduledDepot dataObj = new EBWs_ScheduledDepot();
        EBWs_ScheduledDepot.Data data = dataObj.new Data();
        List<EBWs_ScheduledDepot.Service> services = new ArrayList<>();
        try {

            HttpResponse<String> response = Unirest.get(MBWs_Token.getUrl() + "task/scheduledDepotExits?idUF=" + idUF + "&date=" + time + "&time=" + date)
                    //HttpResponse<String> response = Unirest.get(MBWs_Token.getUrl() + "task/scheduledDepotExits?idUF=" + idUF + "&time=1642412051000")
                    .header("Authorization", "bearer " + MBWs_Token.getToken("jjunco", "junco2020", false))
                    .asString();
            Unirest.shutDown();
            switch (response.getStatus()) {
                case 200:
                    logger.info(name + "- 200");
                    EBWs_Validator v = new EBWs_Validator();
                    dataObj = new Gson().fromJson(response.getBody(), EBWs_ScheduledDepot.class);
                    if (Objects.nonNull(dataObj.getData())) {
                        data = dataObj.getData();
                        Date now = new Date();
                        for (EBWs_ScheduledDepot.Service obj : data.getServices()) {
                            obj.setValidatorList("S");
                            obj.setDate_official(obj.getTime_origin());
                            MBTools tools = new MBTools();

                            String[] parts = tools.formatDate(now, 7).split(":");
                            Calendar cal1 = Calendar.getInstance();
                            cal1.set(Calendar.HOUR_OF_DAY, Integer.parseInt(parts[0]));
                            cal1.set(Calendar.MINUTE, Integer.parseInt(parts[1]));
                            cal1.set(Calendar.SECOND, Integer.parseInt(parts[2]));

                            parts = obj.getTime_origin().split(":");
                            Calendar cal2 = Calendar.getInstance();
                            cal2.set(Calendar.HOUR_OF_DAY, Integer.parseInt(parts[0]));
                            cal2.set(Calendar.MINUTE, Integer.parseInt(parts[1]));
                            cal2.set(Calendar.SECOND, Integer.parseInt(parts[2]));

                            if (cal2.after(cal1)) {
                                obj.setValidatorHour(Boolean.TRUE);
                            } else {
                                obj.setValidatorHour(Boolean.FALSE);
                            }
                        }

                        v.setWs_mes(dataObj.getMessage());
                        v.setWs_val(dataObj.isValid());
                        data.setObj_val(v);
                    }
                    if (dataObj.getStatus() == 422) {
                        v.setWs_mes(dataObj.getMessage());
                        v.setWs_val(dataObj.isValid());
                        data.setObj_val(v);
                        data.setServices(services);
                    }
                    break;
                case 401:
                    logger.warn(name + "- 401");
                    MBWs_Token.getToken("jjunco", "junco2020", true);
                    getSheduledDepotExits(idUF, date, time);
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

    public EBWs_ScheduledDepot.Data getSheduledDepotEntries(int idUF, int date, long time) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBWs_ScheduledDepot dataObj = new EBWs_ScheduledDepot();
        EBWs_ScheduledDepot.Data data = dataObj.new Data();
        List<EBWs_ScheduledDepot.Service> services = new ArrayList<>();
        try {
            HttpResponse<String> response = Unirest.get(MBWs_Token.getUrl() + "task/scheduledDepotEntries?idUF=" + idUF + "&fecha=" + time + "&time=" + date)
                    //HttpResponse<String> response = Unirest.get(MBWs_Token.getUrl() + "task/scheduledDepotEntries?idUF=" + idUF + "&time=1642412051000")
                    .header("Authorization", "bearer " + MBWs_Token.getToken("jjunco", "junco2020", false))
                    .asString();
            Unirest.shutDown();
            switch (response.getStatus()) {
                case 200:
                    logger.info(name + "- 200");
                    dataObj = new Gson().fromJson(response.getBody(), EBWs_ScheduledDepot.class);
                    EBWs_Validator v = new EBWs_Validator();
                    if (Objects.nonNull(dataObj.getData())) {
                        data = dataObj.getData();
                        Date now = new Date();
                        for (EBWs_ScheduledDepot.Service obj : data.getServices()) {
                            obj.setValidatorList("E");
                            obj.setDate_official(obj.getTime_destiny());
                            MBTools tools = new MBTools();

                            String[] parts = tools.formatDate(now, 7).split(":");
                            Calendar cal1 = Calendar.getInstance();
                            cal1.set(Calendar.HOUR_OF_DAY, Integer.parseInt(parts[0]));
                            cal1.set(Calendar.MINUTE, Integer.parseInt(parts[1]));
                            cal1.set(Calendar.SECOND, Integer.parseInt(parts[2]));

                            parts = obj.getTime_destiny().split(":");
                            Calendar cal2 = Calendar.getInstance();
                            cal2.set(Calendar.HOUR_OF_DAY, Integer.parseInt(parts[0]));
                            cal2.set(Calendar.MINUTE, Integer.parseInt(parts[1]));
                            cal2.set(Calendar.SECOND, Integer.parseInt(parts[2]));

                            if (cal2.after(cal1)) {
                                obj.setValidatorHour(Boolean.TRUE);
                            } else {
                                obj.setValidatorHour(Boolean.FALSE);
                            }
                        }
                        v.setWs_mes(dataObj.getMessage());
                        v.setWs_val(dataObj.isValid());
                        data.setObj_val(v);
                    }
                    if (dataObj.getStatus() == 422) {
                        v.setWs_mes(dataObj.getMessage());
                        v.setWs_val(dataObj.isValid());
                        data.setObj_val(v);
                        data.setServices(services);
                    }
                    break;
                case 401:
                    logger.warn(name + "- 401");
                    MBWs_Token.getToken("jjunco", "junco2020", true);
                    getSheduledDepotEntries(idUF, date, time);
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

    public EBWs_General postConfirmDepotExit(String json) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBWs_General dataObj = null;
        try {

            HttpResponse<String> response = Unirest.post(MBWs_Token.getUrl() + "task/confirmDepotExit")
                    .header("Authorization", "bearer " + MBWs_Token.getToken("jjunco", "junco2020", false)).header("Content-Type", "application/json")
                    .body(json)
                    .asString();
            Unirest.shutDown();
            switch (response.getStatus()) {
                case 200:
                    logger.info(name + "- 200");
                    dataObj = new Gson().fromJson(response.getBody(), EBWs_General.class);
                    break;
                case 401:
                    logger.warn(name + "- 401");
                    MBWs_Token.getToken("jjunco", "junco2020", true);
                    postConfirmDepotExit(json);
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

    public EBConfirmDepotEntryResponse postConfirmDepotEntry(String json) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBConfirmDepotEntryResponse dataObj = null;
        try {
            HttpResponse<String> response = Unirest.post(MBWs_Token.getUrl() + "task/confirmDepotEntry")
                    .header("Authorization", "bearer " + MBWs_Token.getToken("jjunco", "junco2020", false)).header("Content-Type", "application/json")
                    .body(json)
                    .asString();
            Unirest.shutDown();
            switch (response.getStatus()) {
                case 200:
                    logger.info(name + "- 200");

                    dataObj = new Gson().fromJson(response.getBody(), EBConfirmDepotEntryResponse.class);
                    EBConfirmDepotEntryResponse.Data a = dataObj.new Data();
                    if (dataObj.getData() == null) {
                        dataObj.setData(a);
                        List<EBConfirmDepotEntryResponse.ListCheckFail> listFail = new ArrayList<>();
                        a.setList_check_fails(listFail);
                        List<EBConfirmDepotEntryResponse.ListTaskMtto> listMtto = new ArrayList<>();
                        a.setList_task_mtto(listMtto);

                    } else {
                        if (dataObj.getData().getList_check_fails() == null) {
                            List<EBConfirmDepotEntryResponse.ListCheckFail> listFail = new ArrayList<>();
                            a.setList_check_fails(listFail);
                            dataObj.setData(a);
                        }

                        if (dataObj.getData().getList_task_mtto() == null) {
                            List<EBConfirmDepotEntryResponse.ListTaskMtto> listMtto = new ArrayList<>();
                            a.setList_task_mtto(listMtto);
                            dataObj.setData(a);
                        }

                    }
                    break;
                case 401:
                    logger.warn(name + "- 401");

                    MBWs_Token.getToken("jjunco", "junco2020", true);
                    postConfirmDepotEntry(json);
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

    public EBWs_General postNotProgrammedResponse(String json) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBWs_General dataObj = null;
        try {

            HttpResponse<String> response = Unirest.post(MBWs_Token.getUrl() + "task/confirmDepotEntry/notProgrammed")
                    .header("Authorization", "bearer " + MBWs_Token.getToken("jjunco", "junco2020", false)).header("Content-Type", "application/json")
                    .body(json)
                    .asString();
            Unirest.shutDown();
            switch (response.getStatus()) {
                case 200:
                    logger.info(name + "- 200");
                    dataObj = new Gson().fromJson(response.getBody(), EBWs_General.class);
                    break;
                case 401:
                    logger.warn(name + "- 401");
                    MBWs_Token.getToken("jjunco", "junco2020", true);
                    postConfirmDepotEntry(json);
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

    public EBWs_ChangeTaskResponse postChangeTask(String json) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBWs_ChangeTaskResponse dataObj = null;
        try {
            HttpResponse<String> response = Unirest.post(MBWs_Token.getUrl() + "task/changeTask")
                    .header("Authorization", "bearer " + MBWs_Token.getToken("jjunco", "junco2020", false)).header("Content-Type", "application/json")
                    .body(json)
                    .asString();
            Unirest.shutDown();
            switch (response.getStatus()) {
                case 200:
                    logger.info(name + "- 200");
                    dataObj = new Gson().fromJson(response.getBody(), EBWs_ChangeTaskResponse.class);
                    break;
                case 401:
                    logger.warn(name + "- 401");
                    MBWs_Token.getToken("jjunco", "junco2020", true);
                    postChangeTask(json);
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

    public EBWs_ExitConfirmedServices getExitConfirmedServices(int idUF, Long date) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBWs_ExitConfirmedServices dataObj = new EBWs_ExitConfirmedServices();
        try {

            HttpResponse<String> response = Unirest.get(MBWs_Token.getUrl() + "task/exitConfirmedServices?idUF=" + idUF + "&date=" + date)
                    .header("Authorization", "bearer " + MBWs_Token.getToken("jjunco", "junco2020", false))
                    .asString();
            Unirest.shutDown();
            switch (response.getStatus()) {
                case 200:
                    logger.info(name + "- 200");
                    dataObj = new Gson().fromJson(response.getBody(), EBWs_ExitConfirmedServices.class);
                    break;
                case 401:
                    logger.warn(name + "- 401");
                    MBWs_Token.getToken("jjunco", "junco2020", true);
                    getExitConfirmedServices(idUF, date);
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

    public EBWs_EntryConfirmedServices getEntryConfirmedServices(int idUF, Long date) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");

        EBWs_EntryConfirmedServices dataObj = new EBWs_EntryConfirmedServices();

        try {
            HttpResponse<String> response = Unirest.get(MBWs_Token.getUrl() + "task/entryConfirmedServices?idUF=" + idUF + "&date=" + date)
                    .header("Authorization", "bearer " + MBWs_Token.getToken("jjunco", "junco2020", false))
                    .asString();
            Unirest.shutDown();
            switch (response.getStatus()) {
                case 200:
                    logger.info(name + "- 200");
                    dataObj = new Gson().fromJson(response.getBody(), EBWs_EntryConfirmedServices.class);
                    break;
                case 401:
                    logger.warn(name + "- 401");
                    MBWs_Token.getToken("jjunco", "junco2020", true);
                    getEntryConfirmedServices(idUF, date);
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
}
