package com.grupomovil.entity.sostenibilidad;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Omar.beltran
 * Clase entidad que corresponde a la tabla de Estrategia sostenibilidad
 */
public class EBGm_sos_est implements Serializable {
    private int id_est;
    private int id_act;
    private String des_est;
    private Date dat_cre;
    private int use_cre;
    private Date dat_mod;
    private int use_mod;

    /**
     * Obtiene el identificador único de la tabla
     * @return the id_est
     */
    public int getId_est() {
        return id_est;
    }

    /**
     * Permite establecer un valor para el identificador único de la tabla
     * @param id_est the id_est to set
     */
    public void setId_est(int id_est) {
        this.id_est = id_est;
    }

    /**
     * Permite Obtener la llave foranea a la tabla de actividades
     * @return the id_act
     */
    public int getId_act() {
        return id_act;
    }

    /**
     * Permite establer un valor para llave foranea de la tabla actividades
     * @param id_act the id_act to set
     */
    public void setId_act(int id_act) {
        this.id_act = id_act;
    }

    /**
     * @return the des_est
     */
    public String getDes_est() {
        return des_est;
    }

    /**
     * @param des_est the des_est to set
     */
    public void setDes_est(String des_est) {
        this.des_est = des_est;
    }

    /**
     * @return the dat_cre
     */
    public Date getDat_cre() {
        return dat_cre;
    }

    /**
     * @param dat_cre the dat_cre to set
     */
    public void setDat_cre(Date dat_cre) {
        this.dat_cre = dat_cre;
    }

    /**
     * @return the use_cre
     */
    public int getUse_cre() {
        return use_cre;
    }

    /**
     * @param use_cre the use_cre to set
     */
    public void setUse_cre(int use_cre) {
        this.use_cre = use_cre;
    }

    /**
     * @return the dat_mod
     */
    public Date getDat_mod() {
        return dat_mod;
    }

    /**
     * @param dat_mod the dat_mod to set
     */
    public void setDat_mod(Date dat_mod) {
        this.dat_mod = dat_mod;
    }

    /**
     * @return the use_mod
     */
    public int getUse_mod() {
        return use_mod;
    }

    /**
     * @param use_mod the use_mod to set
     */
    public void setUse_mod(int use_mod) {
        this.use_mod = use_mod;
    }
    
}
