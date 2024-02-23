/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupomovil.entity;

import java.util.Date;

/**
 *
 * @author Omar.beltran
 */
public class EBGm_pol {

    private int gm_pol_id;             //Id Polígono
    private Date gm_pol_dat;           //Fecha del polígono
    private String gm_pol_lat;         //Latitud
    private String gm_pol_lon;         //Longitud
    private Boolean gm_pol_alt;        //Altitud
    private int gm_pol_rad;            //Radio
    private int gm_zon_id;             //Zona

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

    public int getGm_pol_rad() {
        return gm_pol_rad;
    }

    public void setGm_pol_rad(int gm_pol_rad) {
        this.gm_pol_rad = gm_pol_rad;
    }

    public int getGm_zon_id() {
        return gm_zon_id;
    }

    public void setGm_zon_id(int gm_zon_id) {
        this.gm_zon_id = gm_zon_id;
    }
    
    

}
