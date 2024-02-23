package com.grupomovil.cosumeservices;

import com.google.gson.Gson;
import com.grupomovil.entity.ws.EBWs_Token;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import kong.unirest.UnirestException;
import org.apache.log4j.Logger;

/**
 *
 * @author jeisson.junco
 */
public class MBWs_TokenTp {

    private static Logger logger = Logger.getLogger(MBWs_TokenTp.class);

    private static final String url = "http://service.grupomovil.com.co:4444/ws/"; // http://10.0.3.138:8080/rigelWS/

     public String getToken(String username, String password) {
        String token = "";
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        try {

            HttpResponse<String> response = Unirest.post(url + "oauth/token")
                    .header("Authorization", "Basic cmlnZWxXUzpyaWdlbFdTMjAyMQ==")
                    .header("Content-Type", "application/x-www-form-urlencoded")
                    .field("username", username)
                    .field("password", password)
                    .field("grant_type", "password")
                    .asString();
            Unirest.shutDown();
            if (response.getStatus() == 200) {
                logger.info(name + "- 200");
                EBWs_Token data = new Gson().fromJson(response.getBody(), EBWs_Token.class);
                token = data.getAccess_token();
            }

        } catch (UnirestException e) {
            logger.error(name + "- " + e.getMessage());
        }
        logger.info(name + "- Finaliza");
        return token;
    }

}
