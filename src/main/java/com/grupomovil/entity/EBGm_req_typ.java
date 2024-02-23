package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jjunco
 */
public class EBGm_req_typ implements Serializable {

    private static final long serialVersionUID = 1L;

    private int req_typ_id;
    private String req_typ_nam;
    private boolean req_typ_sta;
    private boolean req_hou;
    private Date req_dat_end;
    private int req_max;
    private int com_id;
    private boolean req_col;
    private Date dat_cre;
    private int usu_cre;
    private Date dat_mod;
    private int usu_mod;

    public int getReq_typ_id() {
        return req_typ_id;
    }

    public void setReq_typ_id(int req_typ_id) {
        this.req_typ_id = req_typ_id;
    }

    public String getReq_typ_nam() {
        return req_typ_nam;
    }

    public void setReq_typ_nam(String req_typ_nam) {
        this.req_typ_nam = req_typ_nam;
    }

    public boolean isReq_typ_sta() {
        return req_typ_sta;
    }

    public void setReq_typ_sta(boolean req_typ_sta) {
        this.req_typ_sta = req_typ_sta;
    }

    public boolean isReq_hou() {
        return req_hou;
    }

    public void setReq_hou(boolean req_hou) {
        this.req_hou = req_hou;
    }

    public Date getReq_dat_end() {
        return req_dat_end;
    }

    public void setReq_dat_end(Date req_dat_end) {
        this.req_dat_end = req_dat_end;
    }

    public int getReq_max() {
        return req_max;
    }

    public void setReq_max(int req_max) {
        this.req_max = req_max;
    }

    public int getCom_id() {
        return com_id;
    }

    public void setCom_id(int com_id) {
        this.com_id = com_id;
    }

    public boolean isReq_col() {
        return req_col;
    }

    public void setReq_col(boolean req_col) {
        this.req_col = req_col;
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
