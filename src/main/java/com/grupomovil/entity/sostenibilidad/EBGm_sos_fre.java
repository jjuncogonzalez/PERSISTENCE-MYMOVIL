package com.grupomovil.entity.sostenibilidad;

import java.io.Serializable;
import java.util.Date;

/**
 * Clase que corresponde a la entidad de la tabla frecuencia de sostenibilidad
 * @author Omar.beltran
 */
public class EBGm_sos_fre implements Serializable {
   private int id_fre; 
   private String nom_fre; 
   private int val_fre; 
   private Date dat_cre;
   private int use_cre;
   private Date dat_mod;
   private int use_mod;

    public int getId_fre() {
        return id_fre;
    }

    public void setId_fre(int id_fre) {
        this.id_fre = id_fre;
    }

    public String getNom_fre() {
        return nom_fre;
    }

    public void setNom_fre(String nom_fre) {
        this.nom_fre = nom_fre;
    }

    public int getVal_fre() {
        return val_fre;
    }

    public void setVal_fre(int val_fre) {
        this.val_fre = val_fre;
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
