package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jjunco
 */
public class EBGm_ina_car_sta implements Serializable {

    private static final long serialVersionUID = 1L;

    private int ina_car_sta_id;
    private String ina_car_sta_des;
    private Boolean ina_car_sta_act;
    private Date dat_cre;
    private int usu_cre;
    private Date dat_mod;
    private int usu_mod;

    public int getIna_car_sta_id() {
        return ina_car_sta_id;
    }

    public void setIna_car_sta_id(int ina_car_sta_id) {
        this.ina_car_sta_id = ina_car_sta_id;
    }

    public String getIna_car_sta_des() {
        return ina_car_sta_des;
    }

    public void setIna_car_sta_des(String ina_car_sta_des) {
        this.ina_car_sta_des = ina_car_sta_des;
    }

    public Boolean getIna_car_sta_act() {
        return ina_car_sta_act;
    }

    public void setIna_car_sta_act(Boolean ina_car_sta_act) {
        this.ina_car_sta_act = ina_car_sta_act;
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
