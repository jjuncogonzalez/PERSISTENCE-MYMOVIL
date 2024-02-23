package com.grupomovil.entity.sostenibilidad;

import java.io.Serializable;
import java.util.Date;

/**
 * Clase que corresponde a la entidad de la tabla actividad de sostenibilidad
 * @author Omar.beltran
 */
public class EBGm_sos_act implements Serializable {
    
    private int id_act; 
    private String nom_act;
    private Date dat_cre;
    private int use_cre;
    private Date dat_mod;
    private int use_mod;  

    public int getId_act() {
        return id_act;
    }

    public void setId_act(int id_act) {
        this.id_act = id_act;
    }

    public String getNom_act() {
        return nom_act;
    }

    public void setNom_act(String nom_act) {
        this.nom_act = nom_act;
    }

    public Date getDat_cre() {
        return dat_cre;
    }

    public void setDat_cre(Date dat_cre) {
        this.dat_cre = dat_cre;
    }

    public int getUse_cre() {
        return use_cre;
    }

    public void setUse_cre(int use_cre) {
        this.use_cre = use_cre;
    }

    public Date getDat_mod() {
        return dat_mod;
    }

    public void setDat_mod(Date dat_mod) {
        this.dat_mod = dat_mod;
    }

    public int getUse_mod() {
        return use_mod;
    }

    public void setUse_mod(int use_mod) {
        this.use_mod = use_mod;
    }
   
}
