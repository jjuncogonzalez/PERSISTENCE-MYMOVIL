package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Omar.beltran
 */
public class EBGm_req_are_con implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private int req_are_con_id;     //identificador de la solicitud
    private int com_id;             //identificador de la compañía
    private int cco_id;             //identificador del área de la compañía
    private String ubi_nam;         //lugar
    private int req_sta_id;         //identificador del estado de la solicitid
    private String req_sta_nam;     //nombre del estado de la solicitid
    private int req_con_day;        //representa un día de la semana (lunes, martes.....)
    private Date req_con_hou_sta;   //hora inicio en formato militar
    private Date req_con_hou_end;   //hora fin en formato militar
    private int req_con_num_day;    //número de días
    private int req_con_req_mou;    //solicitudes por mes
    private int req_con_req_col;    //solicitudes aceptadas por mes por colaborador
    private int rel_are_typ_rea_id; //identificador de la asociación tipo-motivo de solicitud
    private String req_are_con_nam; //nombre de la solicitud "nombre de la relación tipo-motivo + fecha inicio + hora inicio"
    private Date dat_req_sta;       //fecha inicio solicitud
    private Date dat_req_end;       //fecha fin solicitud
    private int n_max_col;          //número máximo de colaboradores
    private int req_jou;            //jornada
    private String req_tur;         //turno              
    private String req_cap;         //capacitación              
    private boolean req_are_mul;     //es solicitud múltiple              
    private Date dat_cre;           
    private int usu_cre;
    private Date dat_mod;
    private int usu_mod;
    

    public String getReq_are_con_nam() {
        return req_are_con_nam;
    }

    public void setReq_are_con_nam(String req_are_con_nam) {
        this.req_are_con_nam = req_are_con_nam;
    }
    
    public int getReq_are_con_id() {
        return req_are_con_id;
    }

    public void setReq_are_con_id(int req_are_con_id) {
        this.req_are_con_id = req_are_con_id;
    }

    public int getReq_con_day() {
        return req_con_day;
    }

    public void setReq_con_day(int req_con_day) {
        this.req_con_day = req_con_day;
    }

    public Date getReq_con_hou_sta() {
        return req_con_hou_sta;
    }

    public void setReq_con_hou_sta(Date req_con_hou_sta) {
        this.req_con_hou_sta = req_con_hou_sta;
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
    
    public int getCco_id() {
        return cco_id;
    }

    public void setCco_id(int cco_id) {
        this.cco_id = cco_id;
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

    public int getRel_are_typ_rea_id() {
        return rel_are_typ_rea_id;
    }

    public void setRel_are_typ_rea_id(int rel_are_typ_rea_id) {
        this.rel_are_typ_rea_id = rel_are_typ_rea_id;
    }

    public Date getDat_req_sta() {
        return dat_req_sta;
    }

    public void setDat_req_sta(Date dat_req_sta) {
        this.dat_req_sta = dat_req_sta;
    }

    public int getN_max_col() {
        return n_max_col;
    }

    public void setN_max_col(int n_max_col) {
        this.n_max_col = n_max_col;
    }

    public Date getReq_con_hou_end() {
        return req_con_hou_end;
    }

    public void setReq_con_hou_end(Date req_con_hou_end) {
        this.req_con_hou_end = req_con_hou_end;
    }

    public Date getDat_req_end() {
        return dat_req_end;
    }

    public void setDat_req_end(Date dat_req_end) {
        this.dat_req_end = dat_req_end;
    }

    public int getReq_sta_id() {
        return req_sta_id;
    }

    public void setReq_sta_id(int req_sta_id) {
        this.req_sta_id = req_sta_id;
    }

    public String getUbi_nam() {
        return ubi_nam;
    }

    public void setUbi_nam(String ubi_nam) {
        this.ubi_nam = ubi_nam;
    }

    public String getReq_sta_nam() {
        return req_sta_nam;
    }

    public void setReq_sta_nam(String req_sta_nam) {
        this.req_sta_nam = req_sta_nam;
    }

    public int getReq_jou() {
        return req_jou;
    }

    public void setReq_jou(int req_jou) {
        this.req_jou = req_jou;
    }

    public String getReq_tur() {
        return req_tur;
    }

    public void setReq_tur(String req_tur) {
        this.req_tur = req_tur;
    }

    public String getReq_cap() {
        return req_cap;
    }

    public void setReq_cap(String req_cap) {
        this.req_cap = req_cap;
    }

    public boolean getReq_are_mul() {
        return req_are_mul;
    }

    public void setReq_are_mul(boolean req_are_mul) {
        this.req_are_mul = req_are_mul;
    }
    
}
