package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jjunco
 */
public class EBGm_col_doc implements Serializable {

    private static final long serialVersionUID = 1L;

    private int col_doc_id;
    private int com_id;
    private String col_ide;
    private String col_nam;
    private String col_sur;
    private String col_cod;
    private String col_pos_des;
    private int col_doc_typ;
    private String col_doc_num;
    private Date col_doc_dat_exp;
    private Date col_doc_dat_ven;
    private Date col_doc_dat_con;
    private int col_doc_sta_doc;

    private Date dat_cre;
    private int usu_cre;
    private Date dat_mod;
    private int usu_mod;

    public int getCol_doc_id() {
        return col_doc_id;
    }

    public void setCol_doc_id(int col_doc_id) {
        this.col_doc_id = col_doc_id;
    }

    public int getCom_id() {
        return com_id;
    }

    public void setCom_id(int com_id) {
        this.com_id = com_id;
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

    public String getCol_cod() {
        return col_cod;
    }

    public void setCol_cod(String col_cod) {
        this.col_cod = col_cod;
    }

    public String getCol_pos_des() {
        return col_pos_des;
    }

    public void setCol_pos_des(String col_pos_des) {
        this.col_pos_des = col_pos_des;
    }

    public int getCol_doc_typ() {
        return col_doc_typ;
    }

    public void setCol_doc_typ(int col_doc_typ) {
        this.col_doc_typ = col_doc_typ;
    }

    public String getCol_doc_num() {
        return col_doc_num;
    }

    public void setCol_doc_num(String col_doc_num) {
        this.col_doc_num = col_doc_num;
    }

    public Date getCol_doc_dat_exp() {
        return col_doc_dat_exp;
    }

    public void setCol_doc_dat_exp(Date col_doc_dat_exp) {
        this.col_doc_dat_exp = col_doc_dat_exp;
    }

    public Date getCol_doc_dat_ven() {
        return col_doc_dat_ven;
    }

    public void setCol_doc_dat_ven(Date col_doc_dat_ven) {
        this.col_doc_dat_ven = col_doc_dat_ven;
    }

    public Date getCol_doc_dat_con() {
        return col_doc_dat_con;
    }

    public void setCol_doc_dat_con(Date col_doc_dat_con) {
        this.col_doc_dat_con = col_doc_dat_con;
    }

    public int getCol_doc_sta_doc() {
        return col_doc_sta_doc;
    }

    public void setCol_doc_sta_doc(int col_doc_sta_doc) {
        this.col_doc_sta_doc = col_doc_sta_doc;
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
