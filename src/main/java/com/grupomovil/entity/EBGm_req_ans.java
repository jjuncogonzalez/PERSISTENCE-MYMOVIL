package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jjunco
 */
public class EBGm_req_ans implements Serializable {

    private static final long serialVersionUID = 1L;

    private int req_ans_id;
    private String req_val;
    private boolean req_is_col;
    private boolean req_vie;
    private int req_id;
    private Date dat_cre;
    private int usu_cre;
    private Date dat_mod;
    private int usu_mod;

    private String use_pla_use;
    private String use_com_nam;

    public int getReq_ans_id() {
        return req_ans_id;
    }

    public void setReq_ans_id(int req_ans_id) {
        this.req_ans_id = req_ans_id;
    }

    public String getReq_val() {
        return req_val;
    }

    public void setReq_val(String req_val) {
        this.req_val = req_val;
    }

    public boolean isReq_is_col() {
        return req_is_col;
    }

    public void setReq_is_col(boolean req_is_col) {
        this.req_is_col = req_is_col;
    }

    public boolean isReq_vie() {
        return req_vie;
    }

    public void setReq_vie(boolean req_vie) {
        this.req_vie = req_vie;
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

    public String getUse_pla_use() {
        return use_pla_use;
    }

    public void setUse_pla_use(String use_pla_use) {
        this.use_pla_use = use_pla_use;
    }

    public String getUse_com_nam() {
        return use_com_nam;
    }

    public void setUse_com_nam(String use_com_nam) {
        this.use_com_nam = use_com_nam;
    }

}
