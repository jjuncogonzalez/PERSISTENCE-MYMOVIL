package com.grupomovil.entity;

import java.util.Date;

/**
 * @author Omar.beltran
 */
public class EBGm_var {

    private int gm_var_id;             //Id Variable
    private Date gm_var_dat;           //Fecha de registro
    private String gm_var_nam;         //Nombre de la variable
    private String gm_var_sou;         //Fuente
    private Boolean gm_var_zon_sta;    //Estado para las ariables de las zonas
    private Boolean gm_var_ala_sta;    //Estado para las variables de las alarmas
    private Boolean gm_var_map;    //Estado para las variables del mapa
    private int usu_cre;            //Usuario creacion
    private String dat_mod; //Fecha de modificación
    private String dat_cre; //Fecha de modificación
    private int usu_mod;    //Usuario modificación

    public int getGm_var_id() {
        return gm_var_id;
    }

    public void setGm_var_id(int gm_var_id) {
        this.gm_var_id = gm_var_id;
    }

    public Date getGm_var_dat() {
        return gm_var_dat;
    }

    public void setGm_var_dat(Date gm_var_dat) {
        this.gm_var_dat = gm_var_dat;
    }

    public String getGm_var_nam() {
        return gm_var_nam;
    }

    public void setGm_var_nam(String gm_var_nam) {
        this.gm_var_nam = gm_var_nam;
    }

    public String getGm_var_sou() {
        return gm_var_sou;
    }

    public void setGm_var_sou(String gm_var_sou) {
        this.gm_var_sou = gm_var_sou;
    }

    public Boolean getGm_var_zon_sta() {
        return gm_var_zon_sta;
    }

    public void setGm_var_zon_sta(Boolean gm_var_zon_sta) {
        this.gm_var_zon_sta = gm_var_zon_sta;
    }

    public Boolean getGm_var_ala_sta() {
        return gm_var_ala_sta;
    }

    public void setGm_var_ala_sta(Boolean gm_var_ala_sta) {
        this.gm_var_ala_sta = gm_var_ala_sta;
    }

    public Boolean getGm_var_map() {
        return gm_var_map;
    }

    public void setGm_var_map(Boolean gm_var_map) {
        this.gm_var_map = gm_var_map;
    }

    public int getUsu_cre() {
        return usu_cre;
    }

    public void setUsu_cre(int usu_cre) {
        this.usu_cre = usu_cre;
    }

    public String getDat_mod() {
        return dat_mod;
    }

    public void setDat_mod(String dat_mod) {
        this.dat_mod = dat_mod;
    }

    public String getDat_cre() {
        return dat_cre;
    }

    public void setDat_cre(String dat_cre) {
        this.dat_cre = dat_cre;
    }

    public int getUsu_mod() {
        return usu_mod;
    }

    public void setUsu_mod(int usu_mod) {
        this.usu_mod = usu_mod;
    }
    
    

}
