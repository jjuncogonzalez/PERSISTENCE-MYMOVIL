package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Omar.beltran
 */
public class EBGm_req_are_rel_typ_rea implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private int rel_are_typ_rea_id;
    private int req_are_typ_id;
    private int req_are_rea_id;
    private int com_id;
    private int cco_id;
    private boolean req_col;
    private Date dat_cre;
    private int usu_cre;
    private Date dat_mod;
    private int usu_mod;
    private String rel_are_typ_rea_nam;

    public int getRel_are_typ_rea_id() {
        return rel_are_typ_rea_id;
    }

    public void setRel_are_typ_rea_id(int rel_are_typ_rea_id) {
        this.rel_are_typ_rea_id = rel_are_typ_rea_id;
    }

    public int getReq_are_typ_id() {
        return req_are_typ_id;
    }

    public void setReq_are_typ_id(int req_are_typ_id) {
        this.req_are_typ_id = req_are_typ_id;
    }

    public int getReq_are_rea_id() {
        return req_are_rea_id;
    }

    public void setReq_are_rea_id(int req_are_rea_id) {
        this.req_are_rea_id = req_are_rea_id;
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

    public String getRel_are_typ_rea_nam() {
        return rel_are_typ_rea_nam;
    }

    public void setRel_are_typ_rea_nam(String rel_are_typ_rea_nam) {
        this.rel_are_typ_rea_nam = rel_are_typ_rea_nam;
    }

    public int getCco_id() {
        return cco_id;
    }

    public void setCco_id(int cco_id) {
        this.cco_id = cco_id;
    }
    
}
