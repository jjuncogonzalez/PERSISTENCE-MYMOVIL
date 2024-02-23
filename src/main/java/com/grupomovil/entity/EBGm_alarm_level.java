package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Omar.beltran
 */
public class EBGm_alarm_level implements Serializable {
    
    private int gm_ala_lev_id;
    private Date gm_ala_lev_dat;
    private String gm_ala_lev_nam;
    private String gm_ala_lev_des;
    private Date dat_cre;
    private int usu_cre;
    private Date dat_mod;
    private int usu_mod;

    public int getGm_ala_lev_id() {
        return gm_ala_lev_id;
    }

    public void setGm_ala_lev_id(int gm_ala_lev_id) {
        this.gm_ala_lev_id = gm_ala_lev_id;
    }

    public Date getGm_ala_lev_dat() {
        return gm_ala_lev_dat;
    }

    public void setGm_ala_lev_dat(Date gm_ala_lev_dat) {
        this.gm_ala_lev_dat = gm_ala_lev_dat;
    }

    public String getGm_ala_lev_nam() {
        return gm_ala_lev_nam;
    }

    public void setGm_ala_lev_nam(String gm_ala_lev_nam) {
        this.gm_ala_lev_nam = gm_ala_lev_nam;
    }

    public String getGm_ala_lev_des() {
        return gm_ala_lev_des;
    }

    public void setGm_ala_lev_des(String gm_ala_lev_des) {
        this.gm_ala_lev_des = gm_ala_lev_des;
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
