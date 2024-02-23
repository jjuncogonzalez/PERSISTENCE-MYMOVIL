package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Omar.beltran
 */
public class EBGm_ema_pro implements Serializable{
    private static final long serialVersionUID = 1L;

    private int ema_pro_id;
    private String ema_pro_nam;
    private String ema_pro_sta;
    private int ema_tmp_id;
    private Date dat_cre;
    private int usu_cre;
    private int usu_mod;
    private Date dat_mod; 
    
    public int getEma_pro_id() {
        return ema_pro_id;
    }

    public void setEma_pro_id(int ema_pro_id) {
        this.ema_pro_id = ema_pro_id;
    }

    public String getEma_pro_nam() {
        return ema_pro_nam;
    }

    public void setEma_pro_nam(String ema_pro_nam) {
        this.ema_pro_nam = ema_pro_nam;
    }

    public String getEma_pro_sta() {
        return ema_pro_sta;
    }

    public void setEma_pro_sta(String ema_pro_sta) {
        this.ema_pro_sta = ema_pro_sta;
    }

    public int getEma_tmp_id() {
        return ema_tmp_id;
    }

    public void setEma_tmp_id(int ema_tmp_id) {
        this.ema_tmp_id = ema_tmp_id;
    }

    public Date getDat_cre() {
        return dat_cre;
    }

    public void setDat_cre(Date dat_cre) {
        this.dat_cre = dat_cre;
    }

    public int getUsu_cre() {
        return usu_cre;
    }

    public void setUsu_cre(int usu_cre) {
        this.usu_cre = usu_cre;
    }

    public int getUsu_mod() {
        return usu_mod;
    }

    public void setUsu_mod(int usu_mod) {
        this.usu_mod = usu_mod;
    }

    public Date getDat_mod() {
        return dat_mod;
    }

    public void setDat_mod(Date dat_mod) {
        this.dat_mod = dat_mod;
    }
}
