package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Omar.beltran
 */
public class EBGm_req_con implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private int req_con_day;    //representa un día de la semana (lunes, martes.....)
    private Date req_con_hou;   //hora en formato militar
    private int req_con_num_day;//número de días
    private int req_con_req_mou;//solicitudes por mes
    private int req_con_req_col;//solicitudes aceptadas por mes por colaborador
    private int com_id;
    private Date dat_cre;
    private int usu_cre;
    private Date dat_mod;
    private int usu_mod;

    public int getReq_con_day() {
        return req_con_day;
    }

    public void setReq_con_day(int req_con_day) {
        this.req_con_day = req_con_day;
    }

    public Date getReq_con_hou() {
        return req_con_hou;
    }

    public void setReq_con_hou(Date req_con_hou) {
        this.req_con_hou = req_con_hou;
    }

    public int getReq_con_num_day() {
        return req_con_num_day;
    }

    public void setReq_con_num_day(int req_con_num_day) {
        this.req_con_num_day = req_con_num_day;
    }

    public int getReq_con_req_mou() {
        return req_con_req_mou;
    }

    public void setReq_con_req_mou(int req_con_req_mou) {
        this.req_con_req_mou = req_con_req_mou;
    }

    public int getReq_con_req_col() {
        return req_con_req_col;
    }

    public void setReq_con_req_col(int req_con_req_col) {
        this.req_con_req_col = req_con_req_col;
    }

    public int getCom_id() {
        return com_id;
    }

    public void setCom_id(int com_id) {
        this.com_id = com_id;
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
