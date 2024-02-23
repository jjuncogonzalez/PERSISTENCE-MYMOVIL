package com.grupomovil.cosumeservices;

import com.google.gson.Gson;
import com.grupomovil.entity.ws.EBWs_Stops;
import java.util.ArrayList;
import java.util.List;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import kong.unirest.UnirestException;
import org.apache.log4j.Logger;

/**
 *
 * @author jeisson.junco
 */
public class MBWs_Stops {

    private static Logger logger = Logger.getLogger(MBWs_Stops.class);

    public List<EBWs_Stops.ListObject> getStops() {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBWs_Stops dataObj = new EBWs_Stops();
        List<EBWs_Stops.ListObject> data = new ArrayList<>();
        try {

            HttpResponse<String> response = Unirest.get(MBWs_Token.getUrl() + "stops")
                    .header("Authorization", "bearer " + MBWs_Token.getToken("jjunco", "junco2020", false))
                    .asString();
            Unirest.shutDown();
            switch (response.getStatus()) {
                case 200:
                    logger.info(name + "- 200");
                    dataObj = new Gson().fromJson(response.getBody(), EBWs_Stops.class);
                    data = dataObj.getListObject();
                    break;
                case 401:
                    logger.warn(name + "- 401");
                    MBWs_Token.getToken("jjunco", "junco2020", true);
                    getStops();
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
