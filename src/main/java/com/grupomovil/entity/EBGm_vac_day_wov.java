package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Entidad de correo
 *
 * @author jeisson.junco
 */
public class EBGm_vac_day_wov implements Serializable {

    private static final long serialVersionUID = 1L;

    private int day_wov_id;
    private Date day_wov_dat;
    private Boolean day_wov_sta;
    private Date dat_cre;
    private int usu_cre;
    private Date dat_mod;
    private int usu_mod;

    public int getDay_wov_id() {
        return day_wov_id;
    }

    public void setDay_wov_id(int day_wov_id) {
        this.day_wov_id = day_wov_id;
    }

    public Date getDay_wov_dat() {
        return day_wov_dat;
    }

    public void setDay_wov_dat(Date day_wov_dat) {
        this.day_wov_dat = day_wov_dat;
    }

    public Boolean getDay_wov_sta() {
        return day_wov_sta;
    }

    public void setDay_wov_sta(Boolean day_wov_sta) {
        this.day_wov_sta = day_wov_sta;
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
