package com.grupomovil.cosumeservices;

import com.google.gson.Gson;
import com.grupomovil.entity.ws.EBWs_Systems;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import kong.unirest.UnirestException;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/**
 *
 * @author jeisson.junco
 */
public class MBWs_Systems {

    private static Logger logger = Logger.getLogger(MBWs_Systems.class);

    public List<EBWs_Systems.ListData> getSystems() {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");

        EBWs_Systems dataObj = new EBWs_Systems();
        List<EBWs_Systems.ListData> data = new ArrayList<>();
        try {

            HttpResponse<String> response = Unirest.get(MBWs_Token.getUrl() + "availability/findSystems")
                    .header("Authorization", "bearer " + MBWs_Token.getToken("jjunco", "junco2020", false))
                    .asString();
            Unirest.shutDown();
            switch (response.getStatus()) {
                case 200:
                    logger.info(name + "- 200");
                    dataObj = new Gson().fromJson(response.getBody(), EBWs_Systems.class);
                    data = dataObj.getList_data();
                    break;
                case 401:
                    logger.warn(name + "- 401");
                    MBWs_Token.getToken("jjunco", "junco2020", true);
                    getSystems();
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
