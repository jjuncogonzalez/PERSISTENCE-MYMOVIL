package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jjunco
 */
public class EBGm_req_rea implements Serializable {

    private static final long serialVersionUID = 1L;

    private int req_rea_id;
    private String req_rea_nam;
    private int req_rea_pri;
    private Boolean req_rea_sta;
    private int com_id;
    private int usu_cre;
    private Date dat_mod;
    private int usu_mod;

    public int getReq_rea_id() {
        return req_rea_id;
    }

    public void setReq_rea_id(int req_rea_id) {
        this.req_rea_id = req_rea_id;
    }

    public String getReq_rea_nam() {
        return req_rea_nam;
    }

    public void setReq_rea_nam(String req_rea_nam) {
        this.req_rea_nam = req_rea_nam;
    }

    public int getReq_rea_pri() {
        return req_rea_pri;
    }

    public void setReq_rea_pri(int req_rea_pri) {
        this.req_rea_pri = req_rea_pri;
    }

    public Boolean getReq_rea_sta() {
        return req_rea_sta;
    }

    public void setReq_rea_sta(Boolean req_rea_sta) {
        this.req_rea_sta = req_rea_sta;
    }

    public int getCom_id() {
        return com_id;
    }

    public void setCom_id(int com_id) {
        this.com_id = com_id;
    }

    public int getUsu_cre() {
        return usu_cre;
    }

    public void setUsu_cre(int usu_cre) {
        this.usu_cre = usu_cre;
    }

    public Date getDat_mod() {
        return dat_mod;
    }

    public void setDat_mod(Date dat_mod) {
        this.dat_mod = dat_mod;
    }

    public int getUsu_mod() {
        return usu_mod;
    }

    public void setUsu_mod(int usu_mod) {
        this.usu_mod = usu_mod;
    }

}
