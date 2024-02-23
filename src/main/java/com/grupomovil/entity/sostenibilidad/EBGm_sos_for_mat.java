package com.grupomovil.entity.sostenibilidad;

import java.io.Serializable;
import java.util.Date;

/**
 * Clase que corresponde a la entidad de la tabla fórmula matemática de sostenibilidad
 * @author Omar.beltran
 */
public class EBGm_sos_for_mat implements Serializable {
    private int id_for_mat;
    private String formula;
    private Date dat_cre;
    private int use_cre;
    private Date dat_mod;
    private int use_mod;   

    public int getId_for_mat() {
        return id_for_mat;
    }

    public void setId_for_mat(int id_for_mat) {
        this.id_for_mat = id_for_mat;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
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
