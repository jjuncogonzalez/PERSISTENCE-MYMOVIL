package com.grupomovil.entity;

import java.util.Date;

/**
 * @author Omar.beltran
 * Se debe manejar llave compuesta gm_ala_id - gm_var_id
 */
public class EBGm_alarm_parametrization {
    private String gm_ala_par_val;
    private int gm_ala_id;
    private int gm_var_id;
    private int gm_var_ran_id;
    private Date dat_cre;
    private int usu_cre;
    private Date dat_mod;
    private int usu_mod;

    public String getGm_ala_par_val() {
        return gm_ala_par_val;
    }

    public void setGm_ala_par_val(String gm_ala_par_val) {
        this.gm_ala_par_val = gm_ala_par_val;
    }

    public int getGm_ala_id() {
        return gm_ala_id;
    }

    public void setGm_ala_id(int gm_ala_id) {
        this.gm_ala_id = gm_ala_id;
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
