package com.grupomovil.cosumeservices;

import com.google.gson.Gson;
import com.grupomovil.entity.ws.response.EBWs_General;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import kong.unirest.UnirestException;
import org.apache.log4j.Logger;

/**
 *
 * @author jeisson.junco
 */
public class MBWs_MyApp {

    private static Logger logger = Logger.getLogger(MBWs_MyApp.class);

    public EBWs_General postSerconConfirm(String json) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBWs_General dataObj = null;
        try {

            HttpResponse<String> response = Unirest.post(MBWs_Token.getUrl() + "myApp/serconConfirm")
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
                    postSerconConfirm(json);
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

    public EBWs_General postSerconLastConfirm(String json) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBWs_General dataObj = null;
        try {
            HttpResponse<String> response = Unirest.post(MBWs_Token.getUrl() + "myApp/serconLastConfirm")
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
                    postSerconLastConfirm(json);
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
