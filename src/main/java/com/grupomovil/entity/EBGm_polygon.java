package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jjunco
 */
public class EBGm_polygon implements Serializable {

    private static final long serialVersionUID = 1L;

    private int gm_pol_id;      //Id Polígono
    private Date gm_pol_dat;    //Fecha del polígono
    private String gm_pol_lat;  //Latitud
    private String gm_pol_lon;  //Longitud
    private Boolean gm_pol_alt; //Altitud
    private String gm_pol_rad;     //Radio
    private int gm_zon_id;      //Zona
    private String dat_cre;     //Fecha de creación
    private String dat_mod;     //Fecha de modificación
    private int usu_cre;        //Usuario creacion
    private int usu_mod;        //Usuario modificación
    
    public int getGm_pol_id() {
        return gm_pol_id;
    }

    public void setGm_pol_id(int gm_pol_id) {
        this.gm_pol_id = gm_pol_id;
    }

    public Date getGm_pol_dat() {
        return gm_pol_dat;
    }

    public void setGm_pol_dat(Date gm_pol_dat) {
        this.gm_pol_dat = gm_pol_dat;
    }

    public String getGm_pol_lat() {
        return gm_pol_lat;
    }

    public void setGm_pol_lat(String gm_pol_lat) {
        this.gm_pol_lat = gm_pol_lat;
    }

    public String getGm_pol_lon() {
        return gm_pol_lon;
    }

    public void setGm_pol_lon(String gm_pol_lon) {
        this.gm_pol_lon = gm_pol_lon;
    }

    public Boolean getGm_pol_alt() {
        return gm_pol_alt;
    }

    public void setGm_pol_alt(Boolean gm_pol_alt) {
        this.gm_pol_alt = gm_pol_alt;
    }

    public String getGm_pol_rad() {
        return gm_pol_rad;
    }

    public void setGm_pol_rad(String gm_pol_rad) {
        this.gm_pol_rad = gm_pol_rad;
    }

    public int getGm_zon_id() {
        return gm_zon_id;
    }

    public void setGm_zon_id(int gm_zon_id) {
        this.gm_zon_id = gm_zon_id;
    }

    public String getDat_cre() {
        return dat_cre;
    }

    public void setDat_cre(String dat_cre) {
        this.dat_cre = dat_cre;
    }

    public String getDat_mod() {
        return dat_mod;
    }

    public void setDat_mod(String dat_mod) {
        this.dat_mod = dat_mod;
    }

    public int getUsu_cre() {
        return usu_cre;
    }

    public void setUsu_cre(int usu_cre) {
        this.usu_cre = usu_cre;
    }

    public int getUsu_mod() {
        return usu_mod;
    }

    public void setUsu_mod(int usu_mod) {
        this.usu_mod = usu_mod;
    }

}
