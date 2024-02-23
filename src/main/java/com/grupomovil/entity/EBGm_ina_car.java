package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jjunco
 */
public class EBGm_ina_car implements Serializable {

    private static final long serialVersionUID = 1L;

    private int ina_car_id;
    private Date ina_car_dat_sta;
    private Date ina_car_dat_end;
    private int col_id;
    private Long ina_car_sta_id;
    private Date dat_cre;
    private int usu_cre;
    private Date dat_mod;
    private int usu_mod;

    public int getIna_car_id() {
        return ina_car_id;
    }

    public void setIna_car_id(int ina_car_id) {
        this.ina_car_id = ina_car_id;
    }

    public Date getIna_car_dat_sta() {
        return ina_car_dat_sta;
    }

    public void setIna_car_dat_sta(Date ina_car_dat_sta) {
        this.ina_car_dat_sta = ina_car_dat_sta;
    }

    public Date getIna_car_dat_end() {
        return ina_car_dat_end;
    }

    public void setIna_car_dat_end(Date ina_car_dat_end) {
        this.ina_car_dat_end = ina_car_dat_end;
    }

    public int getCol_id() {
        return col_id;
    }

    public void setCol_id(int col_id) {
        this.col_id = col_id;
    }

    public Long getIna_car_sta_id() {
        return ina_car_sta_id;
    }

    public void setIna_car_sta_id(Long ina_car_sta_id) {
        this.ina_car_sta_id = ina_car_sta_id;
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
