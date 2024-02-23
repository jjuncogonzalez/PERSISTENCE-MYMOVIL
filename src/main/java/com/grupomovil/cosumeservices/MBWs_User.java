package com.grupomovil.cosumeservices;

import com.google.gson.Gson;
import com.grupomovil.entity.ws.EBWs_User;
import com.grupomovil.entity.ws.EBWs_Validator;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import kong.unirest.UnirestException;
import java.util.Objects;
import org.apache.log4j.Logger;

/**
 *
 * @author jeisson.junco
 */
public class MBWs_User {

    private static Logger logger = Logger.getLogger(MBWs_User.class);

    public EBWs_User.Data getFindUser(String user) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBWs_User dataObj = new EBWs_User();
        EBWs_User.Data data = dataObj.new Data();

        try {
            HttpResponse<String> response = Unirest.get(MBWs_Token.getUrl() + "user/find?username=" + user)
                    .header("Authorization", "bearer " + MBWs_Token.getToken("jjunco", "junco2020", false))
                    .asString();
            Unirest.shutDown();
            switch (response.getStatus()) {
                case 200:
                    logger.info(name + "- 200");
                    dataObj = new Gson().fromJson(response.getBody(), EBWs_User.class);
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
                    getFindUser(user);
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
