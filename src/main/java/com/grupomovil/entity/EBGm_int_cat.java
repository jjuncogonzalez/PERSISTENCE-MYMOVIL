package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * CATEGORIA
 * @author Omar.beltran
 */
public class EBGm_int_cat implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private int cat_id;     //identicador de la categoría
    private String cat_nam; //nombre de la categoría
    private int usu_cre;
    private Date dat_cre;
    private Date dat_mod;
    private int usu_mod;
    private boolean cat_del;//Eliminado S/N 
            
    public int getCat_id() {
        return cat_id;
    }

    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }

    public String getCat_nam() {
        return cat_nam;
    }

    public void setCat_nam(String cat_nam) {
        this.cat_nam = cat_nam;
    }

    public int getUsu_cre() {
        return usu_cre;
    }

    public void setUsu_cre(int usu_cre) {
        this.usu_cre = usu_cre;
    }

    public Date getDat_cre() {
        return dat_cre;
    }

    public void setDat_cre(Date dat_cre) {
        this.dat_cre = dat_cre;
    }

    public Date getDat_mod() {
        return dat_mod;
    }

    public void setDat_mod(Date dat_mod) {
        this.dat_mod = dat_mod;
    }

    public int getUsu_mod() {
        return usu_mod;
    }

    public void setUsu_mod(int usu_mod) {
        this.usu_mod = usu_mod;
    }

    public boolean isCat_del() {
        return cat_del;
    }

    public void setCat_del(boolean cat_del) {
        this.cat_del = cat_del;
    }
    
}
