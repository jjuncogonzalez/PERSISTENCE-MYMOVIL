package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Omar.beltran
 */
public class EBGm_alarm implements Serializable {
    
    private int gm_ala_id;
    private Date gm_ala_dat;
    private String gm_ala_des;
    private String gm_ala_cod;
    private String gm_ala_val;
    private String gm_ala_val2;
    private String gm_ala_ema;
    private boolean gm_ala_sta;
    private int gm_ala_lev_id;
    private int gm_ala_cla_id;
    private int gm_var_id;
    private int gm_var_ran_id;
    private String emq_rul_id;
    private Date dat_cre;
    private int usu_cre;
    private Date dat_mod;
    private int usu_mod;

    public int getGm_ala_id() {
        return gm_ala_id;
    }

    public void setGm_ala_id(int gm_ala_id) {
        this.gm_ala_id = gm_ala_id;
    }

    public Date getGm_ala_dat() {
        return gm_ala_dat;
    }

    public void setGm_ala_dat(Date gm_ala_dat) {
        this.gm_ala_dat = gm_ala_dat;
    }

    public String getGm_ala_cod() {
        return gm_ala_cod;
    }

    public void setGm_ala_cod(String gm_ala_cod) {
        this.gm_ala_cod = gm_ala_cod;
    }

    public boolean isGm_ala_sta() {
        return gm_ala_sta;
    }

    public void setGm_ala_sta(boolean gm_ala_sta) {
        this.gm_ala_sta = gm_ala_sta;
    }

    public int getGm_ala_lev_id() {
        return gm_ala_lev_id;
    }

    public void setGm_ala_lev_id(int gm_ala_lev_id) {
        this.gm_ala_lev_id = gm_ala_lev_id;
    }

    public int getGm_ala_cla_id() {
        return gm_ala_cla_id;
    }

    public void setGm_ala_cla_id(int gm_ala_cla_id) {
        this.gm_ala_cla_id = gm_ala_cla_id;
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

    public String getGm_ala_des() {
        return gm_ala_des;
    }

    public void setGm_ala_des(String gm_ala_des) {
        this.gm_ala_des = gm_ala_des;
    }

    public String getGm_ala_val() {
        return gm_ala_val;
    }

    public void setGm_ala_val(String gm_ala_val) {
        this.gm_ala_val = gm_ala_val;
    }

    public String getGm_ala_val2() {
        return gm_ala_val2;
    }

    public void setGm_ala_val2(String gm_ala_val2) {
        this.gm_ala_val2 = gm_ala_val2;
    }

    public String getGm_ala_ema() {
        return gm_ala_ema;
    }

    public void setGm_ala_ema(String gm_ala_ema) {
        this.gm_ala_ema = gm_ala_ema;
    }

    public int getGm_var_id() {
        return gm_var_id;
    }

    public void setGm_var_id(int gm_var_id) {
        this.gm_var_id = gm_var_id;
    }

    public int getGm_var_ran_id() {
        return gm_var_ran_id;
    }

    public void setGm_var_ran_id(int gm_var_ran_id) {
        this.gm_var_ran_id = gm_var_ran_id;
    }

    public String getEmq_rul_id() {
        return emq_rul_id;
    }

    public void setEmq_rul_id(String emq_rul_id) {
        this.emq_rul_id = emq_rul_id;
    }
    
}
