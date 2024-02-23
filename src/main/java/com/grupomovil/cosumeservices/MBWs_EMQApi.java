package com.grupomovil.cosumeservices;

import com.google.gson.Gson;
import com.grupomovil.entity.ws.EBWs_Resources;
import com.grupomovil.entity.ws.EBWs_Rules;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import kong.unirest.UnirestException;
import org.apache.log4j.Logger;

/**
 *
 * @author jeisson.junco
 */
public class MBWs_EMQApi {

    private static Logger logger = Logger.getLogger(MBWs_EMQApi.class);

    public EBWs_Resources getResources() {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBWs_Resources dataObj = new EBWs_Resources();
        try {
            HttpResponse<String> response = Unirest.get("http://186.31.18.149:8081/api/v4/resources")
                    .header("Authorization", "Basic YWRtaW46cHVibGlj")
                    .asString();
            Unirest.shutDown();
            switch (response.getStatus()) {
                case 200:
                    logger.info(name + "- 200");
                    dataObj = new Gson().fromJson(response.getBody(), EBWs_Resources.class);
                    break;
                case 401:
                    logger.warn(name + "- 401");
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

    public EBWs_Rules getRules() {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBWs_Rules dataObj = new EBWs_Rules();
        try {
            HttpResponse<String> response = Unirest.get("http://186.31.18.149:8081/api/v4/rules")
                    .header("Authorization", "Basic YWRtaW46cHVibGlj")
                    .asString();
            Unirest.shutDown();
            switch (response.getStatus()) {
                case 200:
                    logger.info(name + "- 200");
                    dataObj = new Gson().fromJson(response.getBody(), EBWs_Rules.class);
                    break;
                case 401:
                    logger.warn(name + "- 401");
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

    public String createRule(String query) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");

        String identificador = null;
        try {
            HttpResponse<String> response = Unirest.post("http://10.0.3.146:8081/api/v4/rules")
                    .header("Authorization", "Basic YWRtaW46cHVibGlj")
                    .header("Content-Type", "application/json")
                    .body(query)
                    .asString();
            Unirest.shutDown();
            switch (response.getStatus()) {
                case 200:
                    logger.info(name + "- 200");

                    String[] cadena = response.getBody().split("rule:");
                    String[] idRule = cadena[1].split("\"");
                    identificador = idRule[0].replace("|#]", "");
                    break;
                case 401:
                    logger.warn(name + "- 401");
                    break;
                default:
                    break;
            }

        } catch (UnirestException e) {
            logger.error(name + "- " + e.getMessage());
        }
        logger.info(name + "- Finaliza");
        return identificador;
    }

    public EBWs_Rules deleteRule(String id_rule) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBWs_Rules dataObj = new EBWs_Rules();

        try {
            HttpResponse<String> response = Unirest.delete("http://10.0.3.146:8081/api/v4/rules/rule:" + id_rule)
                    .header("Authorization", "Basic YWRtaW46cHVibGlj")
                    .asString();
            Unirest.shutDown();
            switch (response.getStatus()) {
                case 200:
                    logger.info(name + "- 200");
                    break;
                case 401:
                    logger.warn(name + "- 401");
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
