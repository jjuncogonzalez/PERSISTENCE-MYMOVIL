package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Omar.beltran
 */
public class EBGm_req_are implements Serializable {

    private static final long serialVersionUID = 1L;

    private int req_are_id;
    private String req_are_cod;
    private int req_are_sta_id;
    private int req_are_con_id;
    private Date req_are_hou_sta;
    private Date req_are_hou_end;
    private Date req_are_dat;
    private Date req_are_dat_end;
    private int col_id;
    private int cco_id;
    private int com_id;
    private Boolean req_sen;
    private int req_rel_are_typ_rea_id;
    private int req_are_rea_id;
    private int req_are_typ_id;
    private String req_are_obs;
    private Boolean req_are_att;
    private Boolean req_are_req;
    private Boolean req_are_bre_zon;
    private Boolean req_are_vie;
    private Date dat_cre;
    private int usu_cre;
    private Date dat_mod;
    private int usu_mod;
    private Date dat_del;
    private int usu_del;
    private String req_are_sta_nam;
    private String col_cod;
    private String col_ide;
    private String col_nam;
    private String col_sur;
    private String col_tel;
    private String col_ema;
    private int col_sta;
    private String req_are_rea_nam;
    private String req_are_typ_nam;
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

    public int getReq_are_con_id() {
        return req_are_con_id;
    }

    public void setReq_are_con_id(int req_are_con_id) {
        this.req_are_con_id = req_are_con_id;
    }

    public Boolean getReq_sen() {
        return req_sen;
    }

    public void setReq_sen(Boolean req_sen) {
        this.req_sen = req_sen;
    }

    public int getReq_rel_are_typ_rea_id() {
        return req_rel_are_typ_rea_id;
    }

    public void setReq_rel_are_typ_rea_id(int req_rel_are_typ_rea_id) {
        this.req_rel_are_typ_rea_id = req_rel_are_typ_rea_id;
    }

    public int getReq_are_id() {
        return req_are_id;
    }

    public void setReq_are_id(int req_are_id) {
        this.req_are_id = req_are_id;
    }

    public String getReq_are_cod() {
        return req_are_cod;
    }

    public void setReq_are_cod(String req_are_cod) {
        this.req_are_cod = req_are_cod;
    }

    public int getReq_are_sta_id() {
        return req_are_sta_id;
    }

    public void setReq_are_sta_id(int req_are_sta_id) {
        this.req_are_sta_id = req_are_sta_id;
    }

    public Date getReq_are_hou_sta() {
        return req_are_hou_sta;
    }

    public void setReq_are_hou_sta(Date req_are_hou_sta) {
        this.req_are_hou_sta = req_are_hou_sta;
    }

    public Date getReq_are_hou_end() {
        return req_are_hou_end;
    }

    public void setReq_are_hou_end(Date req_are_hou_end) {
        this.req_are_hou_end = req_are_hou_end;
    }

    public Date getReq_are_dat() {
        return req_are_dat;
    }

    public void setReq_are_dat(Date req_are_dat) {
        this.req_are_dat = req_are_dat;
    }

    public Date getReq_are_dat_end() {
        return req_are_dat_end;
    }

    public void setReq_are_dat_end(Date req_are_dat_end) {
        this.req_are_dat_end = req_are_dat_end;
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

    public int getReq_are_rea_id() {
        return req_are_rea_id;
    }

    public void setReq_are_rea_id(int req_are_rea_id) {
        this.req_are_rea_id = req_are_rea_id;
    }

    public int getReq_are_typ_id() {
        return req_are_typ_id;
    }

    public void setReq_are_typ_id(int req_are_typ_id) {
        this.req_are_typ_id = req_are_typ_id;
    }

    public String getReq_are_obs() {
        return req_are_obs;
    }

    public void setReq_are_obs(String req_are_obs) {
        this.req_are_obs = req_are_obs;
    }

    public Boolean getReq_are_att() {
        return req_are_att;
    }

    public void setReq_are_att(Boolean req_are_att) {
        this.req_are_att = req_are_att;
    }

    public Boolean getReq_are_req() {
        return req_are_req;
    }

    public void setReq_are_req(Boolean req_are_req) {
        this.req_are_req = req_are_req;
    }

    public Boolean getReq_are_bre_zon() {
        return req_are_bre_zon;
    }

    public void setReq_are_bre_zon(Boolean req_are_bre_zon) {
        this.req_are_bre_zon = req_are_bre_zon;
    }

    public Boolean getReq_are_vie() {
        return req_are_vie;
    }

    public void setReq_are_vie(Boolean req_are_vie) {
        this.req_are_vie = req_are_vie;
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

    public String getReq_are_sta_nam() {
        return req_are_sta_nam;
    }

    public void setReq_are_sta_nam(String req_are_sta_nam) {
        this.req_are_sta_nam = req_are_sta_nam;
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

    public String getReq_are_rea_nam() {
        return req_are_rea_nam;
    }

    public void setReq_are_rea_nam(String req_are_rea_nam) {
        this.req_are_rea_nam = req_are_rea_nam;
    }

    public String getReq_are_typ_nam() {
        return req_are_typ_nam;
    }

    public void setReq_are_typ_nam(String req_are_typ_nam) {
        this.req_are_typ_nam = req_are_typ_nam;
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

    public int getCco_id() {
        return cco_id;
    }

    public void setCco_id(int cco_id) {
        this.cco_id = cco_id;
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
