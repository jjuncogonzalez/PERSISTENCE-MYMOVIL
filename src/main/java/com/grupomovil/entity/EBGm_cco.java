package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jjunco
 */
public class EBGm_cco implements Serializable {

    private static final long serialVersionUID = 1L;

    private int cco_id;
    private String cco_des;
    private int cco_cod_kac;
    private Boolean cco_sta;
    private int com_id;
    private Date dat_cre;
    private int usu_cre;
    private Date dat_mod;
    private int usu_mod;

    public int getCco_id() {
        return cco_id;
    }

    public void setCco_id(int cco_id) {
        this.cco_id = cco_id;
    }

    public String getCco_des() {
        return cco_des;
    }

    public void setCco_des(String cco_des) {
        this.cco_des = cco_des;
    }

    public int getCco_cod_kac() {
        return cco_cod_kac;
    }

    public void setCco_cod_kac(int cco_cod_kac) {
        this.cco_cod_kac = cco_cod_kac;
    }

    public Boolean getCco_sta() {
        return cco_sta;
    }

    public void setCco_sta(Boolean cco_sta) {
        this.cco_sta = cco_sta;
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
