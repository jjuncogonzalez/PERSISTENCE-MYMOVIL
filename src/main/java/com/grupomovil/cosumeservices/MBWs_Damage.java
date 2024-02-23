package com.grupomovil.cosumeservices;

import com.google.gson.Gson;
import com.grupomovil.entity.ws.EBWs_DamageComponent;
import com.grupomovil.entity.ws.EBWs_DamageGroup;
import com.grupomovil.entity.ws.EBWs_DamageIssueComponent;
import com.grupomovil.entity.ws.EBWs_DamageSeverity;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import kong.unirest.UnirestException;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author TIC-JOSE
 */
public class MBWs_Damage {

    private static Logger logger = Logger.getLogger(MBWs_Damage.class);

    public List<EBWs_DamageGroup.ListData> getDamageGroup() {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBWs_DamageGroup dataObj = new EBWs_DamageGroup();
        List<EBWs_DamageGroup.ListData> data = new ArrayList<>();

        try {
            HttpResponse<String> response = Unirest.get(MBWs_Token.getUrl() + "damageIssue/group")
                    .header("Authorization", "bearer " + MBWs_Token.getToken("jjunco", "junco2020", false))
                    .asString();
            Unirest.shutDown();
            switch (response.getStatus()) {
                case 200:
                    logger.info(name + "- 200");
                    dataObj = new Gson().fromJson(response.getBody(), EBWs_DamageGroup.class);
                    if (Objects.nonNull(dataObj.getList_data())) {
                        data = dataObj.getList_data();
                    }
                    break;
                case 401:
                    logger.warn(name + "- 401");
                    MBWs_Token.getToken("jjunco", "junco2020", true);
                    getDamageGroup();
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

    public List<EBWs_DamageSeverity.ListData> getDamageSeverity() {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBWs_DamageSeverity dataObj = new EBWs_DamageSeverity();
        List<EBWs_DamageSeverity.ListData> data = new ArrayList<>();

        try {
            HttpResponse<String> response = Unirest.get(MBWs_Token.getUrl() + "damageIssue/severity")
                    .header("Authorization", "bearer " + MBWs_Token.getToken("jjunco", "junco2020", false))
                    .asString();
            Unirest.shutDown();
            switch (response.getStatus()) {
                case 200:
                    logger.info(name + "- 200");
                    dataObj = new Gson().fromJson(response.getBody(), EBWs_DamageSeverity.class);
                    if (Objects.nonNull(dataObj.getList_data())) {
                        data = dataObj.getList_data();
                    }
                    break;
                case 401:
                    logger.warn(name + "- 401");

                    MBWs_Token.getToken("jjunco", "junco2020", true);
                    getDamageSeverity();
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

    public List<EBWs_DamageComponent.ListData> getDamageComponent(int idGroup) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBWs_DamageComponent dataObj = new EBWs_DamageComponent();
        List<EBWs_DamageComponent.ListData> data = new ArrayList<>();

        try {
            HttpResponse<String> response = Unirest.get(MBWs_Token.getUrl() + "damageIssue/component?idGroup=" + idGroup)
                    .header("Authorization", "bearer " + MBWs_Token.getToken("jjunco", "junco2020", false))
                    .asString();
            Unirest.shutDown();
            switch (response.getStatus()) {
                case 200:
                    logger.info(name + "- 200");
                    dataObj = new Gson().fromJson(response.getBody(), EBWs_DamageComponent.class);
                    if (Objects.nonNull(dataObj.getList_data())) {
                        data = dataObj.getList_data();
                    }
                    break;
                case 401:
                    logger.warn(name + "- 401");
                    MBWs_Token.getToken("jjunco", "junco2020", true);
                    getDamageComponent(idGroup);
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

    public List<EBWs_DamageIssueComponent.ListData> getDamageIssueComponent(int idGroup) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBWs_DamageIssueComponent dataObj = new EBWs_DamageIssueComponent();
        List<EBWs_DamageIssueComponent.ListData> data = new ArrayList<>();

        try {
            HttpResponse<String> response = Unirest.get(MBWs_Token.getUrl() + "damageIssue/damageComponent?idGroup=" + idGroup)
                    .header("Authorization", "bearer " + MBWs_Token.getToken("jjunco", "junco2020", false))
                    .asString();
            Unirest.shutDown();
            switch (response.getStatus()) {
                case 200:
                    logger.info(name + "- 200");
                    dataObj = new Gson().fromJson(response.getBody(), EBWs_DamageIssueComponent.class);
                    if (Objects.nonNull(dataObj.getList_data())) {
                        data = dataObj.getList_data();
                    }
                    break;
                case 401:
                    logger.warn(name + "- 401");
                    MBWs_Token.getToken("jjunco", "junco2020", true);
                    getDamageIssueComponent(idGroup);
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
