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
public class EBGm_zon {

    private int gm_zon_id;             //Id Zona
    private Date gm_zon_dat;           //Fecha de la zona
    private String gm_zon_nam;         //Nombre de la zona
    private String gm_zon_des;         //Descripción de la zona
    private Boolean gm_zon_sta;        //Estado de la zona
    private int gm_zon_typ_id;            //Tipo de zona

    public int getGm_zon_id() {
        return gm_zon_id;
    }

    public void setGm_zon_id(int gm_zon_id) {
        this.gm_zon_id = gm_zon_id;
    }

    public Date getGm_zon_dat() {
        return gm_zon_dat;
    }

    public void setGm_zon_dat(Date gm_zon_dat) {
        this.gm_zon_dat = gm_zon_dat;
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
    
}
