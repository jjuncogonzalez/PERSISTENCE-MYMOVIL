package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * LISTA DE DISTRIBUCION
 *
 * @author Omar.beltran
 */
public class EBGm_int_dis_lis implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private int dis_lis_id; //identificador lista de distribución
    private int dis_gro_id; //identificador grupos de distribución
    private int col_pos_id; //identificador del cargo del colaborador
    private int usu_cre;
    private Date dat_cre;
    private Date dat_mod;
    private int usu_mod;
    private String dis_gro_nam;
    private String col_pos_nam;

    public int getDis_lis_id() {
        return dis_lis_id;
    }

    public void setDis_lis_id(int dis_lis_id) {
        this.dis_lis_id = dis_lis_id;
    }

    public int getDis_gro_id() {
        return dis_gro_id;
    }

    public void setDis_gro_id(int dis_gro_id) {
        this.dis_gro_id = dis_gro_id;
    }

    public int getCol_pos_id() {
        return col_pos_id;
    }

    public void setCol_pos_id(int col_pos_id) {
        this.col_pos_id = col_pos_id;
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

    public String getDis_gro_nam() {
        return dis_gro_nam;
    }

    public void setDis_gro_nam(String dis_gro_nam) {
        this.dis_gro_nam = dis_gro_nam;
    }

    public String getCol_pos_nam() {
        return col_pos_nam;
    }

    public void setCol_pos_nam(String col_pos_nam) {
        this.col_pos_nam = col_pos_nam;
    }

}
