package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jjunco
 */
public class EBGm_vac implements Serializable {

    private static final long serialVersionUID = 1L;

    private int vac_id;
    private String vac_ide;
    private int vac_per_id;
    private Date vac_per_ini_dat;
    private Date vac_per_fin_dat;
    private Date dat_cre;
    private int usu_cre;
    private Date dat_mod;
    private int usu_mod;

    public int getVac_id() {
        return vac_id;
    }

    public void setVac_id(int vac_id) {
        this.vac_id = vac_id;
    }

    public String getVac_ide() {
        return vac_ide;
    }

    public void setVac_ide(String vac_ide) {
        this.vac_ide = vac_ide;
    }

    public int getVac_per_id() {
        return vac_per_id;
    }

    public void setVac_per_id(int vac_per_id) {
        this.vac_per_id = vac_per_id;
    }

    public Date getVac_per_ini_dat() {
        return vac_per_ini_dat;
    }

    public void setVac_per_ini_dat(Date vac_per_ini_dat) {
        this.vac_per_ini_dat = vac_per_ini_dat;
    }

    public Date getVac_per_fin_dat() {
        return vac_per_fin_dat;
    }

    public void setVac_per_fin_dat(Date vac_per_fin_dat) {
        this.vac_per_fin_dat = vac_per_fin_dat;
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
