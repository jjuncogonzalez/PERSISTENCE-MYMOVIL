package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Omar.beltran
 */
public class EBGm_req_are_typ implements Serializable{
    
    private static final long serialVersionUID = 1L;
   
    private int req_are_typ_id; //identificador único de la tabla
    private int cco_id;         //identificador del área de la compañía
    private int com_id;         //identificador de la compañía
    private boolean req_col;    //indica si es solicitud de colaborador
    private String req_typ_nam; //nombre del tipo de solicitud
    private boolean req_typ_sta;//estado tipo solicitud
    private boolean req_hou_sta;//requiere hora inicio
    private boolean req_hou_end;//requiere hora fin
    private boolean req_dat_sta;//requiere fecha inicio
    private boolean req_dat_end;//requiere fecha fin
    private boolean req_cap;    //requiere capacitación
    private boolean req_tur;    //requiere turno
    private boolean req_jou;    //requiere jornada   
    private boolean req_sit;    //requiere lugar
    private int n_req_max;      //número máximo de colaboradores
    private Date dat_cre;
    private int usu_cre;
    private Date dat_mod;
    private int usu_mod;

    public int getReq_are_typ_id() {
        return req_are_typ_id;
    }

    public void setReq_are_typ_id(int req_are_typ_id) {
        this.req_are_typ_id = req_are_typ_id;
    }

    public int getCco_id() {
        return cco_id;
    }

    public void setCco_id(int cco_id) {
        this.cco_id = cco_id;
    }

    public int getCom_id() {
        return com_id;
    }

    public void setCom_id(int com_id) {
        this.com_id = com_id;
    }

    public boolean isReq_col() {
        return req_col;
    }

    public void setReq_col(boolean req_col) {
        this.req_col = req_col;
    }

    public String getReq_typ_nam() {
        return req_typ_nam;
    }

    public void setReq_typ_nam(String req_typ_nam) {
        this.req_typ_nam = req_typ_nam;
    }

    public boolean isReq_typ_sta() {
        return req_typ_sta;
    }

    public void setReq_typ_sta(boolean req_typ_sta) {
        this.req_typ_sta = req_typ_sta;
    }

    public boolean isReq_hou_sta() {
        return req_hou_sta;
    }

    public void setReq_hou_sta(boolean req_hou_sta) {
        this.req_hou_sta = req_hou_sta;
    }

    public boolean isReq_hou_end() {
        return req_hou_end;
    }

    public void setReq_hou_end(boolean req_hou_end) {
        this.req_hou_end = req_hou_end;
    }

    public boolean isReq_dat_sta() {
        return req_dat_sta;
    }

    public void setReq_dat_sta(boolean req_dat_sta) {
        this.req_dat_sta = req_dat_sta;
    }

    public boolean isReq_dat_end() {
        return req_dat_end;
    }

    public void setReq_dat_end(boolean req_dat_end) {
        this.req_dat_end = req_dat_end;
    }

    public boolean isReq_cap() {
        return req_cap;
    }

    public void setReq_cap(boolean req_cap) {
        this.req_cap = req_cap;
    }

    public boolean isReq_tur() {
        return req_tur;
    }

    public void setReq_tur(boolean req_tur) {
        this.req_tur = req_tur;
    }

    public boolean isReq_jou() {
        return req_jou;
    }

    public void setReq_jou(boolean req_jou) {
        this.req_jou = req_jou;
    }

    public boolean isReq_sit() {
        return req_sit;
    }

    public void setReq_sit(boolean req_sit) {
        this.req_sit = req_sit;
    }

    public int getN_req_max() {
        return n_req_max;
    }

    public void setN_req_max(int n_req_max) {
        this.n_req_max = n_req_max;
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

   
}
