package com.grupomovil.cosumeservices;

import com.google.gson.Gson;
import com.grupomovil.entity.ws.EBWs_CurrentServiceVehicle;
import com.grupomovil.entity.ws.EBWs_ServicesStates;
import java.util.Objects;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import kong.unirest.UnirestException;
import org.apache.log4j.Logger;

/**
 *
 * @author jeisson.junco
 */
public class MBWs_Parilla {

    private static Logger logger = Logger.getLogger(MBWs_Parilla.class);

    public EBWs_CurrentServiceVehicle.Data getCurrentServiceVehicle(String vehicle) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBWs_CurrentServiceVehicle dataObj = new EBWs_CurrentServiceVehicle();
        EBWs_CurrentServiceVehicle.Data data = dataObj.new Data();

        try {

            HttpResponse<String> response = Unirest.get(MBWs_Token.getUrl() + "parrilla/currentServiceVehicle?vehicle=" + vehicle)
                    .header("Authorization", "bearer " + MBWs_Token.getToken("jjunco", "junco2020", false))
                    .asString();
            Unirest.shutDown();
            switch (response.getStatus()) {
                case 200:

                    logger.info(name + "- 200");
                    dataObj = new Gson().fromJson(response.getBody(), EBWs_CurrentServiceVehicle.class);
                    if (Objects.nonNull(dataObj.getData())) {
                        data = dataObj.getData();
                    }

                    break;
                case 401:
                    logger.warn(name + "- 401");
                    MBWs_Token.getToken("jjunco", "junco2020", true);
                    getCurrentServiceVehicle(vehicle);
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

    public EBWs_ServicesStates.Data getServicesStates(int idUF) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBWs_ServicesStates dataObj = new EBWs_ServicesStates();
        EBWs_ServicesStates.Data data = dataObj.new Data();

        try {
            HttpResponse<String> response = Unirest.get(MBWs_Token.getUrl() + "parrilla/servicesStates?idUF=" + idUF)
                    .header("Authorization", "bearer " + MBWs_Token.getToken("jjunco", "junco2020", false))
                    .asString();
            Unirest.shutDown();
            switch (response.getStatus()) {
                case 200:
                    logger.info(name + "- 200");
                    dataObj = new Gson().fromJson(response.getBody(), EBWs_ServicesStates.class);
                    if (Objects.nonNull(dataObj.getData())) {
                        data = dataObj.getData();
                    }
                    break;
                case 401:
                    logger.warn(name + "- 401");
                    MBWs_Token.getToken("jjunco", "junco2020", true);
                    getServicesStates(idUF);
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
