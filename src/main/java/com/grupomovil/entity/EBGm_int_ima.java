package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Omar.beltran
 */
public class EBGm_int_ima implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private int ima_id;     //identificador de la imágen
    private String ima_nam; //nombre imagen 
    private String ima_pat; //path absoluto
    private long ima_siz;   //size de la imagen
    private String ima_fto; //formato o extension de la imagen
    private String ima_des; //descripcion u observación de la imagen
    private int usu_cre;        
    private Date dat_cre;
    private Date dat_mod;
    private int usu_mod;

    public int getIma_id() {
        return ima_id;
    }

    public void setIma_id(int ima_id) {
        this.ima_id = ima_id;
    }

    public String getIma_nam() {
        return ima_nam;
    }

    public void setIma_nam(String ima_nam) {
        this.ima_nam = ima_nam;
    }

    public String getIma_pat() {
        return ima_pat;
    }

    public void setIma_pat(String ima_pat) {
        this.ima_pat = ima_pat;
    }

    public long getIma_siz() {
        return ima_siz;
    }

    public void setIma_siz(long ima_siz) {
        this.ima_siz = ima_siz;
    }

    public String getIma_fto() {
        return ima_fto;
    }

    public void setIma_fto(String ima_fto) {
        this.ima_fto = ima_fto;
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

    public String getIma_des() {
        return ima_des;
    }

    public void setIma_des(String ima_des) {
        this.ima_des = ima_des;
    }

    public EBGm_int_ima() {
        this.ima_nam = null;
        this.ima_pat = null;
        this.ima_siz = 0;
        this.ima_fto = null;
        this.usu_cre = 0;
    }
    
    public EBGm_int_ima(String ima_nam, String ima_pat, long ima_siz, String ima_fto, int usu_cre) {
        this.ima_nam = ima_nam;
        this.ima_pat = ima_pat;
        this.ima_siz = ima_siz;
        this.ima_fto = ima_fto;
        this.usu_cre = usu_cre;
    }
}
