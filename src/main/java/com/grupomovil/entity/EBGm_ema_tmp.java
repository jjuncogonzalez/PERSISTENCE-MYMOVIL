package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Omar.beltran
 */
public class EBGm_ema_tmp implements Serializable{
    
    private static final long serialVersionUID = 1L;

    private int ema_tmp_id;
    private String ema_tmp_nam;
    private String ema_tmp_fto;
    private Date dat_cre;
    private int usu_cre;
    private int usu_mod;
    private Date dat_mod;
    
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
     * @return the usu_cre
     */
    public int getUsu_cre() {
        return usu_cre;
    }

    /**
     * @param usu_cre the usu_cre to set
     */
    public void setUsu_cre(int usu_cre) {
        this.usu_cre = usu_cre;
    }

    /**
     * @return the usu_mod
     */
    public int getUsu_mod() {
        return usu_mod;
    }

    /**
     * @param usu_mod the usu_mod to set
     */
    public void setUsu_mod(int usu_mod) {
        this.usu_mod = usu_mod;
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
     * @return the ema_tmp_id
     */
    public int getEma_tmp_id() {
        return ema_tmp_id;
    }

    /**
     * @param ema_tmp_id the ema_tmp_id to set
     */
    public void setEma_tmp_id(int ema_tmp_id) {
        this.ema_tmp_id = ema_tmp_id;
    }

    /**
     * @return the ema_tmp_nam
     */
    public String getEma_tmp_nam() {
        return ema_tmp_nam;
    }

    /**
     * @param ema_tmp_nam the ema_tmp_nam to set
     */
    public void setEma_tmp_nam(String ema_tmp_nam) {
        this.ema_tmp_nam = ema_tmp_nam;
    }

    /**
     * @return the ema_tmp_fto
     */
    public String getEma_tmp_fto() {
        return ema_tmp_fto;
    }

    /**
     * @param ema_tmp_fto the ema_tmp_fto to set
     */
    public void setEma_tmp_fto(String ema_tmp_fto) {
        this.ema_tmp_fto = ema_tmp_fto;
    } 
}
