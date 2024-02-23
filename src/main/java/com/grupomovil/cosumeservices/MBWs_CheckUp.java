package com.grupomovil.cosumeservices;

import com.google.gson.Gson;
import com.grupomovil.entity.ws.EBWS_CheckListDamageByEmployee;
import com.grupomovil.entity.ws.EBWS_FindOpenDamageIssue;
import com.grupomovil.entity.ws.response.EBWs_General;
import com.grupomovil.entity.ws.EBWs_Validator;
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
public class MBWs_CheckUp {

    private static Logger logger = Logger.getLogger(MBWs_CheckUp.class);

    public EBWs_General postCheckListSave(String json) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBWs_General dataObj = null;
        try {
            HttpResponse<String> response = Unirest.post(MBWs_Token.getUrl() + "checkUp/save")
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
                    postCheckListSave(json);
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

    public EBWs_General postCheckListsaveCheckDamage(String json) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBWs_General dataObj = null;
        try {
            HttpResponse<String> response = Unirest.post(MBWs_Token.getUrl() + "checkUp/saveCheckDamage")
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
                    postCheckListsaveCheckDamage(json);
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

    public EBWS_CheckListDamageByEmployee.Data getCheckListDamageByEmployee(String vehicle, String employee, Long fecha) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa / " + employee);
        EBWS_CheckListDamageByEmployee dataObj = new EBWS_CheckListDamageByEmployee();
        EBWS_CheckListDamageByEmployee.Data data = dataObj.new Data();

        try {
            HttpResponse<String> response = Unirest.get(MBWs_Token.getUrl() + "checkUp/findCheckListDamageByEmployee?vehicle=" + vehicle + "&employee=" + employee + "&fecha=" + fecha)
                    .header("Authorization", "bearer " + MBWs_Token.getToken("jjunco", "junco2020", false))
                    .asString();
            Unirest.shutDown();
            switch (response.getStatus()) {
                case 200:
                    logger.info(name + "- 200");
                    dataObj = new Gson().fromJson(response.getBody(), EBWS_CheckListDamageByEmployee.class);
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
                    getCheckListDamageByEmployee(vehicle, employee, fecha);
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

    public List<EBWS_FindOpenDamageIssue.ListData> getfindOpenDamageIssue(Long fecha) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBWS_FindOpenDamageIssue dataObj = new EBWS_FindOpenDamageIssue();
        List<EBWS_FindOpenDamageIssue.ListData> data = new ArrayList<>();

        try {
            HttpResponse<String> response = Unirest.get(MBWs_Token.getUrl() + "checkUp/findOpenDamageIssue?fecha=" + fecha)
                    .header("Authorization", "bearer " + MBWs_Token.getToken("jjunco", "junco2020", false))
                    .asString();
            Unirest.shutDown();
            switch (response.getStatus()) {
                case 200:
                    logger.info(name + "- 200");
                    dataObj = new Gson().fromJson(response.getBody(), EBWS_FindOpenDamageIssue.class);
                    if (Objects.nonNull(dataObj.getList_data())) {
                        data = dataObj.getList_data();
                    }

                    break;
                case 401:
                    logger.warn(name + "- 401");
                    MBWs_Token.getToken("jjunco", "junco2020", true);
                    getfindOpenDamageIssue(fecha);
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

}
