package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jjunco
 */
public class EBGm_req implements Serializable {

    private static final long serialVersionUID = 1L;

    private int req_id;
    private String req_cod;
    private int req_sta_id;
    private Date req_hou_sta;
    private Date req_hou_end;
    private Date req_dat;
    private Date req_dat_end;
    private int col_id;
    private int com_id;
    private int req_rea_id;
    private int req_typ_id;
    private String req_obs;
    private Boolean req_att;
    private Boolean req_req;
    private Boolean req_bre_zon;
    private Boolean req_vie;
    private Boolean req_sen;
    private Date dat_cre;
    private int usu_cre;
    private Date dat_mod;
    private int usu_mod;
    private Date dat_del;
    private int usu_del;
    private String req_sta_nam;
    private String col_cod;
    private String col_ide;
    private String col_nam;
    private String col_sur;
    private String col_tel;
    private String col_ema;
    private int col_sta;
    private String req_rea_nam;
    private String req_typ_nam;
    private String use_cre_nam;
    private String use_mod_nam;
    private String use_del_nam;
    private String col_uf;
    
    //validadores
    private Boolean initialRequests;
    private Boolean initialHistory;
    private String dateRequest;
    private Date dateStartRequest;
    private Date dateEndRequest;

    private int month;
    private int year;

    public String getCol_uf() {
        return col_uf;
    }

    public void setCol_uf(String col_uf) {
        this.col_uf = col_uf;
    }

    public Boolean getReq_sen() {
        return req_sen;
    }

    public void setReq_sen(Boolean req_sen) {
        this.req_sen = req_sen;
    }

    public int getReq_id() {
        return req_id;
    }

    public void setReq_id(int req_id) {
        this.req_id = req_id;
    }

    public String getReq_cod() {
        return req_cod;
    }

    public void setReq_cod(String req_cod) {
        this.req_cod = req_cod;
    }

    public int getReq_sta_id() {
        return req_sta_id;
    }

    public void setReq_sta_id(int req_sta_id) {
        this.req_sta_id = req_sta_id;
    }

    public Date getReq_hou_sta() {
        return req_hou_sta;
    }

    public void setReq_hou_sta(Date req_hou_sta) {
        this.req_hou_sta = req_hou_sta;
    }

    public Date getReq_hou_end() {
        return req_hou_end;
    }

    public void setReq_hou_end(Date req_hou_end) {
        this.req_hou_end = req_hou_end;
    }

    public Date getReq_dat() {
        return req_dat;
    }

    public void setReq_dat(Date req_dat) {
        this.req_dat = req_dat;
    }

    public Date getReq_dat_end() {
        return req_dat_end;
    }

    public void setReq_dat_end(Date req_dat_end) {
        this.req_dat_end = req_dat_end;
    }

    public int getCol_id() {
        return col_id;
    }

    public void setCol_id(int col_id) {
        this.col_id = col_id;
    }

    public int getCom_id() {
        return com_id;
    }

    public void setCom_id(int com_id) {
        this.com_id = com_id;
    }

    public int getReq_rea_id() {
        return req_rea_id;
    }

    public void setReq_rea_id(int req_rea_id) {
        this.req_rea_id = req_rea_id;
    }

    public int getReq_typ_id() {
        return req_typ_id;
    }

    public void setReq_typ_id(int req_typ_id) {
        this.req_typ_id = req_typ_id;
    }

    public String getReq_obs() {
        return req_obs;
    }

    public void setReq_obs(String req_obs) {
        this.req_obs = req_obs;
    }

    public Boolean getReq_att() {
        return req_att;
    }

    public void setReq_att(Boolean req_att) {
        this.req_att = req_att;
    }

    public Boolean getReq_req() {
        return req_req;
    }

    public void setReq_req(Boolean req_req) {
        this.req_req = req_req;
    }

    public Boolean getReq_bre_zon() {
        return req_bre_zon;
    }

    public void setReq_bre_zon(Boolean req_bre_zon) {
        this.req_bre_zon = req_bre_zon;
    }

    public Boolean getReq_vie() {
        return req_vie;
    }

    public void setReq_vie(Boolean req_vie) {
        this.req_vie = req_vie;
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

    public Date getDat_del() {
        return dat_del;
    }

    public void setDat_del(Date dat_del) {
        this.dat_del = dat_del;
    }

    public int getUsu_del() {
        return usu_del;
    }

    public void setUsu_del(int usu_del) {
        this.usu_del = usu_del;
    }

    public String getReq_sta_nam() {
        return req_sta_nam;
    }

    public void setReq_sta_nam(String req_sta_nam) {
        this.req_sta_nam = req_sta_nam;
    }

    public String getCol_cod() {
        return col_cod;
    }

    public void setCol_cod(String col_cod) {
        this.col_cod = col_cod;
    }

    public String getCol_ide() {
        return col_ide;
    }

    public void setCol_ide(String col_ide) {
        this.col_ide = col_ide;
    }

    public String getCol_nam() {
        return col_nam;
    }

    public void setCol_nam(String col_nam) {
        this.col_nam = col_nam;
    }

    public String getCol_sur() {
        return col_sur;
    }

    public void setCol_sur(String col_sur) {
        this.col_sur = col_sur;
    }

    public String getCol_tel() {
        return col_tel;
    }

    public void setCol_tel(String col_tel) {
        this.col_tel = col_tel;
    }

    public String getCol_ema() {
        return col_ema;
    }

    public void setCol_ema(String col_ema) {
        this.col_ema = col_ema;
    }

    public int getCol_sta() {
        return col_sta;
    }

    public void setCol_sta(int col_sta) {
        this.col_sta = col_sta;
    }

    public String getReq_rea_nam() {
        return req_rea_nam;
    }

    public void setReq_rea_nam(String req_rea_nam) {
        this.req_rea_nam = req_rea_nam;
    }

    public String getReq_typ_nam() {
        return req_typ_nam;
    }

    public void setReq_typ_nam(String req_typ_nam) {
        this.req_typ_nam = req_typ_nam;
    }

    public String getUse_cre_nam() {
        return use_cre_nam;
    }

    public void setUse_cre_nam(String use_cre_nam) {
        this.use_cre_nam = use_cre_nam;
    }

    public String getUse_mod_nam() {
        return use_mod_nam;
    }

    public void setUse_mod_nam(String use_mod_nam) {
        this.use_mod_nam = use_mod_nam;
    }

    public String getUse_del_nam() {
        return use_del_nam;
    }

    public void setUse_del_nam(String use_del_nam) {
        this.use_del_nam = use_del_nam;
    }

    public Boolean getInitialRequests() {
        return initialRequests;
    }

    public void setInitialRequests(Boolean initialRequests) {
        this.initialRequests = initialRequests;
    }

    public Boolean getInitialHistory() {
        return initialHistory;
    }

    public void setInitialHistory(Boolean initialHistory) {
        this.initialHistory = initialHistory;
    }

    public String getDateRequest() {
        return dateRequest;
    }

    public void setDateRequest(String dateRequest) {
        this.dateRequest = dateRequest;
    }

    public Date getDateStartRequest() {
        return dateStartRequest;
    }

    public void setDateStartRequest(Date dateStartRequest) {
        this.dateStartRequest = dateStartRequest;
    }

    public Date getDateEndRequest() {
        return dateEndRequest;
    }

    public void setDateEndRequest(Date dateEndRequest) {
        this.dateEndRequest = dateEndRequest;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
