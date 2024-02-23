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
public class EBGm_var_ran {
    
    private int gm_var_ran_id;      //Id Variable
    private Date gm_var_ran_dat;    //Fecha de registro
    private String gm_var_ran_nam;  //Nombre del rango
    private String gm_var_ran_sim;  //Simbolo
    
    public int getGm_var_ran_id() {
        return gm_var_ran_id;
    }

    public void setGm_var_ran_id(int gm_var_ran_id) {
        this.gm_var_ran_id = gm_var_ran_id;
    }

    public Date getGm_var_ran_dat() {
        return gm_var_ran_dat;
    }

    public void setGm_var_ran_dat(Date gm_var_ran_dat) {
        this.gm_var_ran_dat = gm_var_ran_dat;
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

    
   
}
