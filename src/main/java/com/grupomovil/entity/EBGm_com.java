package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jjunco
 */
public class EBGm_com implements Serializable {

    private static final long serialVersionUID = 1L;

    private int com_id;
    private String com_des;
    private String com_ini;
    private boolean com_sta;
    private Date dat_cre;
    private int usu_cre;
    private Date dat_mod;
    private int usu_mod;

    public int getCom_id() {
        return com_id;
    }

    public void setCom_id(int com_id) {
        this.com_id = com_id;
    }

    public String getCom_des() {
        return com_des;
    }

    public void setCom_des(String com_des) {
        this.com_des = com_des;
    }

    public String getCom_ini() {
        return com_ini;
    }

    public void setCom_ini(String com_ini) {
        this.com_ini = com_ini;
    }

    public boolean isCom_sta() {
        return com_sta;
    }

    public void setCom_sta(boolean com_sta) {
        this.com_sta = com_sta;
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
