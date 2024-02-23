package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jjunco
 */
public class EBGm_req_sta implements Serializable {

    private static final long serialVersionUID = 1L;

    private int req_sta_id;
    private String req_sta_nam;
    private Date dat_cre;
    private int usu_cre;
    private Date dat_mod;
    private int usu_mod;

    public int getReq_sta_id() {
        return req_sta_id;
    }

    public void setReq_sta_id(int req_sta_id) {
        this.req_sta_id = req_sta_id;
    }

    public String getReq_sta_nam() {
        return req_sta_nam;
    }

    public void setReq_sta_nam(String req_sta_nam) {
        this.req_sta_nam = req_sta_nam;
    }

    public Date getDat_cre() {
        return dat_cre;
    }

    public void setDat_cre(Date dat_cre) {
        this.dat_cre = dat_cre;
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
