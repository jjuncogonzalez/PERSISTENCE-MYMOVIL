package com.grupomovil.entity;

import java.io.Serializable;

/**
 * @author Omar.beltran
 */
public class EBGm_emp_new_park implements Serializable{
    
    private static final long serialVersionUID = 1L;

    private int veh_park_id;
    private String veh_park_ide ;
    private String veh_park_veh_typ ;
    private String veh_park_mar ;
    private String veh_park_mod ;
    private String veh_park_col ;
    private String veh_park_pla ;
private  String dat_cre; 
private String usu_cre;
private  String dat_mod;
private  String usu_mod;
private  boolean veh_status;
   private boolean results;

    public int getVeh_park_id() {
        return veh_park_id;
    }

    public void setVeh_park_id(int veh_park_id) {
        this.veh_park_id = veh_park_id;
    }

    public String getVeh_park_ide() {
        return veh_park_ide;
    }

    public void setVeh_park_ide(String veh_park_ide) {
        this.veh_park_ide = veh_park_ide;
    }

    public String getVeh_park_veh_typ() {
        return veh_park_veh_typ;
    }

    public void setVeh_park_veh_typ(String veh_park_veh_typ) {
        this.veh_park_veh_typ = veh_park_veh_typ;
    }

    public String getVeh_park_mar() {
        return veh_park_mar;
    }

    public void setVeh_park_mar(String veh_park_mar) {
        this.veh_park_mar = veh_park_mar;
    }

    public String getVeh_park_mod() {
        return veh_park_mod;
    }

    public void setVeh_park_mod(String veh_park_mod) {
        this.veh_park_mod = veh_park_mod;
    }

    public String getVeh_park_col() {
        return veh_park_col;
    }

    public void setVeh_park_col(String veh_park_col) {
        this.veh_park_col = veh_park_col;
    }

    public String getVeh_park_pla() {
        return veh_park_pla;
    }

    public void setVeh_park_pla(String veh_park_pla) {
        this.veh_park_pla = veh_park_pla;
    }

    public boolean isVeh_status() {
        return veh_status;
    }

    public void setVeh_status(boolean veh_status) {
        this.veh_status = veh_status;
    }


    public String getDat_cre() {
        return dat_cre;
    }

    public void setDat_cre(String dat_cre) {
        this.dat_cre = dat_cre;
    }

    public String getUsu_cre() {
        return usu_cre;
    }

    public void setUsu_cre(String usu_cre) {
        this.usu_cre = usu_cre;
    }

    public String getDat_mod() {
        return dat_mod;
    }

    public void setDat_mod(String dat_mod) {
        this.dat_mod = dat_mod;
    }

    public String getUsu_mod() {
        return usu_mod;
    }

    public void setUsu_mod(String usu_mod) {
        this.usu_mod = usu_mod;
    }

   

    public boolean isResults() {
        return results;
    }

    public void setResults(boolean results) {
        this.results = results;
    }

}
