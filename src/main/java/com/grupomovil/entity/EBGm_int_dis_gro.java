package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Omar.beltran
 */
public class EBGm_int_dis_gro implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private int dis_gro_id;
    private String dis_gro_nam;
    private int usu_cre;
    private Date dat_cre;
    private Date dat_mod;
    private int usu_mod;
    private boolean dis_gro_del;//Eliminado S/N 
    
    public int getDis_gro_id() {
        return dis_gro_id;
    }

    public void setDis_gro_id(int dis_gro_id) {
        this.dis_gro_id = dis_gro_id;
    }

    public String getDis_gro_nam() {
        return dis_gro_nam;
    }

    public void setDis_gro_nam(String dis_gro_nam) {
        this.dis_gro_nam = dis_gro_nam;
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

    public boolean isDis_gro_del() {
        return dis_gro_del;
    }

    public void setDis_gro_del(boolean dis_gro_del) {
        this.dis_gro_del = dis_gro_del;
    }
}
