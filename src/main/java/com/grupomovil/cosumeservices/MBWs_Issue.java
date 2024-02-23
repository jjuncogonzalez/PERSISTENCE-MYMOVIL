package com.grupomovil.cosumeservices;

import com.google.gson.Gson;
import com.grupomovil.entity.ws.response.EBWs_General;
import com.grupomovil.entity.ws.EBWs_IssueDetailsType;
import com.grupomovil.entity.ws.EBWs_IssueType;
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
public class MBWs_Issue {

    private static Logger logger = Logger.getLogger(MBWs_Issue.class);

    public List<EBWs_IssueType.Type> getTypeIssue() {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBWs_IssueType dataObj = new EBWs_IssueType();
        List<EBWs_IssueType.Type> data = new ArrayList<>();
        try {
            HttpResponse<String> response = Unirest.get(MBWs_Token.getUrl() + "issue/type")
                    .header("Authorization", "bearer " + MBWs_Token.getToken("jjunco", "junco2020", false))
                    .asString();
            Unirest.shutDown();
            switch (response.getStatus()) {
                case 200:
                    logger.info(name + "- 200");
                    dataObj = new Gson().fromJson(response.getBody(), EBWs_IssueType.class);
                    if (Objects.nonNull(dataObj.getData())) {
                        data = dataObj.getData().getTypes();
                    }
                    break;
                case 401:
                    logger.warn(name + "- 401");
                    MBWs_Token.getToken("jjunco", "junco2020", true);
                    getTypeIssue();
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

    public List<EBWs_IssueDetailsType.ListData> getDetailsTypeIssue(int id) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBWs_IssueDetailsType dataObj = new EBWs_IssueDetailsType();
        List<EBWs_IssueDetailsType.ListData> data = new ArrayList<>();
        try {
            HttpResponse<String> response = Unirest.get(MBWs_Token.getUrl() + "issue/typeDetails?id=" + id)
                    .header("Authorization", "bearer " + MBWs_Token.getToken("jjunco", "junco2020", false))
                    .asString();
            Unirest.shutDown();
            switch (response.getStatus()) {
                case 200:
                    logger.info(name + "- 200");
                    dataObj = new Gson().fromJson(response.getBody(), EBWs_IssueDetailsType.class);
                    if (Objects.nonNull(dataObj.getList_data())) {
                        data = dataObj.getList_data();
                    }
                    break;
                case 401:
                    logger.warn(name + "- 401");
                    MBWs_Token.getToken("jjunco", "junco2020", true);
                    getDetailsTypeIssue(id);
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

    public EBWs_General postSaveIssue(String json) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBWs_General dataObj = null;
        try {
            HttpResponse<String> response = Unirest.post(MBWs_Token.getUrl() + "issue/saveIssue")
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
                    postSaveIssue(json);
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
