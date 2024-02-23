package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * BANNER
 * @author Omar.beltran
 */
public class EBGm_int_ban implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private int ban_id;      //identificador de la notificación
    private int ban_min_ima; //# minimo de imagenes
    private boolean ban_tmp; //banner temporal
    private Date ban_fec_ini;//fecha de inicio
    private Date ban_fec_fin;//fecha de fin
    private boolean ban_vis; //visible S/N
    private boolean ban_hip; //hipervinculo
    private int cat_id;      //identificador de la categoría
    private int ima_id;      //identificador de la imagen
    private byte[] ban_ima;
    private int usu_cre;        
    private Date dat_cre;
    private Date dat_mod;
    private int usu_mod;
    private int nRegistries;

    public int getnRegistries() {
        return nRegistries;
    }

    public void setnRegistries(int nRegistries) {
        this.nRegistries = nRegistries;
    }
    
    public int getBan_id() {
        return ban_id;
    }

    public void setBan_id(int ban_id) {
        this.ban_id = ban_id;
    }
    
    public int getIma_id() {
        return ima_id;
    }

    public void setIma_id(int ima_id) {
        this.ima_id = ima_id;
    }

    public int getBan_min_ima() {
        return ban_min_ima;
    }

    public void setBan_min_ima(int ban_min_ima) {
        this.ban_min_ima = ban_min_ima;
    }

    public boolean isBan_tmp() {
        return ban_tmp;
    }

    public void setBan_tmp(boolean ban_tmp) {
        this.ban_tmp = ban_tmp;
    }

    public Date getBan_fec_ini() {
        return ban_fec_ini;
    }

    public void setBan_fec_ini(Date ban_fec_ini) {
        this.ban_fec_ini = ban_fec_ini;
    }

    public Date getBan_fec_fin() {
        return ban_fec_fin;
    }

    public void setBan_fec_fin(Date ban_fec_fin) {
        this.ban_fec_fin = ban_fec_fin;
    }

    public boolean isBan_vis() {
        return ban_vis;
    }

    public void setBan_vis(boolean ban_vis) {
        this.ban_vis = ban_vis;
    }

    public boolean isBan_hip() {
        return ban_hip;
    }

    public void setBan_hip(boolean ban_hip) {
        this.ban_hip = ban_hip;
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

    /**
     * @return the cat_id
     */
    public int getCat_id() {
        return cat_id;
    }

    /**
     * @param cat_id the cat_id to set
     */
    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }
    
    /**
     * @return the ban_ima
     */
    public byte[] getBan_ima() {
        return ban_ima;
    }

    /**
     * @param ban_ima the ban_ima to set
     */
    public void setBan_ima(byte[] ban_ima) {
        this.ban_ima = ban_ima;
    }
}
