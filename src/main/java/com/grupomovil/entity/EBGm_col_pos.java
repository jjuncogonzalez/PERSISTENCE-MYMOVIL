package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jjunco
 */
public class EBGm_col_pos implements Serializable {

    private static final long serialVersionUID = 1L;

    private int col_pos_id;
    private String col_pos_des;
    private int col_pos_sof;
    private int com_id;
    private Boolean col_pos_sta;
    private Date dat_cre;
    private int usu_cre;
    private Date dat_mod;
    private int usu_mod;

    public int getCol_pos_id() {
        return col_pos_id;
    }

    public void setCol_pos_id(int col_pos_id) {
        this.col_pos_id = col_pos_id;
    }

    public String getCol_pos_des() {
        return col_pos_des;
    }

    public void setCol_pos_des(String col_pos_des) {
        this.col_pos_des = col_pos_des;
    }

    public int getCol_pos_sof() {
        return col_pos_sof;
    }

    public void setCol_pos_sof(int col_pos_sof) {
        this.col_pos_sof = col_pos_sof;
    }

    public int getCom_id() {
        return com_id;
    }

    public void setCom_id(int com_id) {
        this.com_id = com_id;
    }

    public Date getDat_cre() {
        return dat_cre;
    }

    public void setDat_cre(Date dat_cre) {
        this.dat_cre = dat_cre;
    }

    public Boolean getCol_pos_sta() {
        return col_pos_sta;
    }

    public void setCol_pos_sta(Boolean col_pos_sta) {
        this.col_pos_sta = col_pos_sta;
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
