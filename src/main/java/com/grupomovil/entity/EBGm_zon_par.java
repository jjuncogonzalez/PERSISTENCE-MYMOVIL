/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupomovil.entity;

/**
 *
 * @author Omar.beltran
 */
public class EBGm_zon_par {

    //Tabla de parametrización
    private int gm_zon_id;          //Id Zona
    private int gm_var_id;          //Id Variable
    private int gm_var_ran_id;      //Id Rabgo
    private String gm_zon_nam;      //Nombre zona
    private String gm_zon_des;      //Descripción Zona
    private Boolean gm_zon_sta;     //Estado Zona
    private int gm_zon_typ_id;      //Id tipo de zona 
    private float gm_pol_lat;       //Latitud
    private float gm_pol_lon;       //Longitud
    private float gm_pol_rad;       //Radio
    private String gm_var_nam;      //Nombre variable
    private String gm_var_ran_nam;  //Nombre Rango
    private String gm_var_ran_sim;  //Operador de comparación
    private String gm_zon_par_val;  //Valor parametrización

    public int getGm_zon_id() {
        return gm_zon_id;
    }

    public void setGm_zon_id(int gm_zon_id) {
        this.gm_zon_id = gm_zon_id;
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

    public String getGm_zon_nam() {
        return gm_zon_nam;
    }

    public void setGm_zon_nam(String gm_zon_nam) {
        this.gm_zon_nam = gm_zon_nam;
    }

    public String getGm_zon_des() {
        return gm_zon_des;
    }

    public void setGm_zon_des(String gm_zon_des) {
        this.gm_zon_des = gm_zon_des;
    }

    public Boolean getGm_zon_sta() {
        return gm_zon_sta;
    }

    public void setGm_zon_sta(Boolean gm_zon_sta) {
        this.gm_zon_sta = gm_zon_sta;
    }

    public int getGm_zon_typ_id() {
        return gm_zon_typ_id;
    }

    public void setGm_zon_typ_id(int gm_zon_typ_id) {
        this.gm_zon_typ_id = gm_zon_typ_id;
    }

    public float getGm_pol_lat() {
        return gm_pol_lat;
    }

    public void setGm_pol_lat(float gm_pol_lat) {
        this.gm_pol_lat = gm_pol_lat;
    }

    public float getGm_pol_lon() {
        return gm_pol_lon;
    }

    public void setGm_pol_lon(float gm_pol_lon) {
        this.gm_pol_lon = gm_pol_lon;
    }

    public float getGm_pol_rad() {
        return gm_pol_rad;
    }

    public void setGm_pol_rad(float gm_pol_rad) {
        this.gm_pol_rad = gm_pol_rad;
    }

    public String getGm_var_nam() {
        return gm_var_nam;
    }

    public void setGm_var_nam(String gm_var_nam) {
        this.gm_var_nam = gm_var_nam;
    }

    public String getGm_var_ran_nam() {
        return gm_var_ran_nam;
    }

    public void setGm_var_ran_nam(String gm_var_ran_nam) {
        this.gm_var_ran_nam = gm_var_ran_nam;
    }

    public String getGm_var_ran_sim() {
        return gm_var_ran_sim;
    }

    public void setGm_var_ran_sim(String gm_var_ran_sim) {
        this.gm_var_ran_sim = gm_var_ran_sim;
    }

    public String getGm_zon_par_val() {
        return gm_zon_par_val;
    }

    public void setGm_zon_par_val(String gm_zon_par_val) {
        this.gm_zon_par_val = gm_zon_par_val;
    }
    
    
    
}
