package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jjunco
 */
public class EBGm_ina_att implements Serializable {

    private static final long serialVersionUID = 1L;

    private int ina_att_id;
    private String ina_att_pat;
    private String ina_att_nam;
    private String ina_att_des;
    private Long ina_att_siz;
    private String ina_att_ext;
    private int ina_att_sta_id;
    private int ina_car_id;
    private Date dat_cre;
    private int usu_cre;
    private Date dat_mod;
    private int usu_mod;

    public int getIna_att_id() {
        return ina_att_id;
    }

    public void setIna_att_id(int ina_att_id) {
        this.ina_att_id = ina_att_id;
    }

    public String getIna_att_pat() {
        return ina_att_pat;
    }

    public void setIna_att_pat(String ina_att_pat) {
        this.ina_att_pat = ina_att_pat;
    }

    public String getIna_att_nam() {
        return ina_att_nam;
    }

    public void setIna_att_nam(String ina_att_nam) {
        this.ina_att_nam = ina_att_nam;
    }

    public String getIna_att_des() {
        return ina_att_des;
    }

    public void setIna_att_des(String ina_att_des) {
        this.ina_att_des = ina_att_des;
    }

    public Long getIna_att_siz() {
        return ina_att_siz;
    }

    public void setIna_att_siz(Long ina_att_siz) {
        this.ina_att_siz = ina_att_siz;
    }

    public String getIna_att_ext() {
        return ina_att_ext;
    }

    public void setIna_att_ext(String ina_att_ext) {
        this.ina_att_ext = ina_att_ext;
    }

    public int getIna_att_sta_id() {
        return ina_att_sta_id;
    }

    public void setIna_att_sta_id(int ina_att_sta_id) {
        this.ina_att_sta_id = ina_att_sta_id;
    }

    public int getIna_car_id() {
        return ina_car_id;
    }

    public void setIna_car_id(int ina_car_id) {
        this.ina_car_id = ina_car_id;
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
