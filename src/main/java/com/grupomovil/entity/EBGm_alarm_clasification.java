package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Omar.beltran
 */
public class EBGm_alarm_clasification implements Serializable {
    
    private int gm_ala_cla_id;
    private String gm_ala_cla_nam;
    private String gm_ala_cla_des;
    private Date gm_ala_cla_dat;
    private Date dat_cre;
    private int usu_cre;
    private Date dat_mod;
    private int usu_mod;

    public int getGm_ala_cla_id() {
        return gm_ala_cla_id;
    }

    public void setGm_ala_cla_id(int gm_ala_cla_id) {
        this.gm_ala_cla_id = gm_ala_cla_id;
    }

    public String getGm_ala_cla_nam() {
        return gm_ala_cla_nam;
    }

    public void setGm_ala_cla_nam(String gm_ala_cla_nam) {
        this.gm_ala_cla_nam = gm_ala_cla_nam;
    }

    public String getGm_ala_cla_des() {
        return gm_ala_cla_des;
    }

    public void setGm_ala_cla_des(String gm_ala_cla_des) {
        this.gm_ala_cla_des = gm_ala_cla_des;
    }

    public Date getGm_ala_cla_dat() {
        return gm_ala_cla_dat;
    }

    public void setGm_ala_cla_dat(Date gm_ala_cla_dat) {
        this.gm_ala_cla_dat = gm_ala_cla_dat;
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
