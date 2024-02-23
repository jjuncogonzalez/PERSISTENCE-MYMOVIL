package com.grupomovil.entity.sostenibilidad;

import java.io.Serializable;
import java.util.Date;

/**
 * Clase que corresponde a la entidad de la tabla estados de sostenibilidad
 * @author Omar.beltran
 */
public class EBGm_sos_estado implements Serializable {
   private int id_esta; 
   private String nom_esta; 
   private Date dat_cre;
   private int use_cre;
   private Date dat_mod;
   private int use_mod;

    public int getId_esta() {
        return id_esta;
    }

    public void setId_esta(int id_esta) {
        this.id_esta = id_esta;
    }

    public String getNom_esta() {
        return nom_esta;
    }

    public void setNom_esta(String nom_esta) {
        this.nom_esta = nom_esta;
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
