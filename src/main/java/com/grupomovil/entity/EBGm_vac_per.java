package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Entidad de peridos de vacaciones
 *
 * @author jeisson.junco
 */
public class EBGm_vac_per implements Serializable {

    private static final long serialVersionUID = 1L;

    private int vac_per_id;
    private Date vac_per_ini_dat;
    private Date vac_per_fin_dat;
    private int vac_per_qua;
    private String vac_per_des;
    private Date dat_cre;
    private int usu_cre;
    private Date dat_mod;
    private int usu_mod;

    private String vac_per_ini_str;
    private String vac_per_fin_str;

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

    public int getVac_per_qua() {
        return vac_per_qua;
    }

    public void setVac_per_qua(int vac_per_qua) {
        this.vac_per_qua = vac_per_qua;
    }

    public String getVac_per_des() {
        return vac_per_des;
    }

    public void setVac_per_des(String vac_per_des) {
        this.vac_per_des = vac_per_des;
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

    public String getVac_per_ini_str() {
        return vac_per_ini_str;
    }

    public void setVac_per_ini_str(String vac_per_ini_str) {
        this.vac_per_ini_str = vac_per_ini_str;
    }

    public String getVac_per_fin_str() {
        return vac_per_fin_str;
    }

    public void setVac_per_fin_str(String vac_per_fin_str) {
        this.vac_per_fin_str = vac_per_fin_str;
    }

}
