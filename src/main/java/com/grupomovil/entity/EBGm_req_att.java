package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jjunco
 */
public class EBGm_req_att implements Serializable {

    private static final long serialVersionUID = 1L;

    private int req_att_id;
    private String req_att_pat;
    private Long req_att_siz;
    private String req_att_ext;
    private String req_att_nam;
    private String req_att_des;
    private int req_id;
    private Date dat_cre;
    private int usu_cre;
    private Date dat_mod;
    private int usu_mod;

    public int getReq_att_id() {
        return req_att_id;
    }

    public void setReq_att_id(int req_att_id) {
        this.req_att_id = req_att_id;
    }

    public String getReq_att_pat() {
        return req_att_pat;
    }

    public void setReq_att_pat(String req_att_pat) {
        this.req_att_pat = req_att_pat;
    }

    public Long getReq_att_siz() {
        return req_att_siz;
    }

    public void setReq_att_siz(Long req_att_siz) {
        this.req_att_siz = req_att_siz;
    }

    public String getReq_att_ext() {
        return req_att_ext;
    }

    public void setReq_att_ext(String req_att_ext) {
        this.req_att_ext = req_att_ext;
    }

    public String getReq_att_nam() {
        return req_att_nam;
    }

    public void setReq_att_nam(String req_att_nam) {
        this.req_att_nam = req_att_nam;
    }

    public String getReq_att_des() {
        return req_att_des;
    }

    public void setReq_att_des(String req_att_des) {
        this.req_att_des = req_att_des;
    }

    public int getReq_id() {
        return req_id;
    }

    public void setReq_id(int req_id) {
        this.req_id = req_id;
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
