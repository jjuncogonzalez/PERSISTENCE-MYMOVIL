package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jjunco
 */
public class EBGm_col_hom implements Serializable {

    private static final long serialVersionUID = 1L;

    private int col_id;
    private String col_ide;
    private int col_doc_typ_id;
    private String col_cod;
    private String col_nam;
    private String col_sur;
    private Date col_bir;
    private int col_gen_id;
    private int col_pos_id;
    private int are_kac_id;
    private String col_tel;
    private String col_ema;
    private Boolean col_int;
    private Boolean col_sta;
    private int com_id;
    private int cco_id;
    private Date dat_cre;
    private int usu_cre;
    private Date dat_mod;
    private int usu_mod;

    private int use_com_id;

    private String col_pos_des;
    
    
     private String con_nom;
       private String con_tel;
       private String col_dir;
       private String col_tel2;
          private int con_id;
          private Boolean results;

    public Boolean getResults() {
        return results;
    }

    public void setResults(Boolean results) {
        this.results = results;
    }

    public int getCon_id() {
        return con_id;
    }

    public void setCon_id(int con_id) {
        this.con_id = con_id;
    }

    public String getCon_nom() {
        return con_nom;
    }

    public void setCon_nom(String con_nom) {
        this.con_nom = con_nom;
    }

    public String getCon_tel() {
        return con_tel;
    }

    public void setCon_tel(String con_tel) {
        this.con_tel = con_tel;
    }

    public String getCol_dir() {
        return col_dir;
    }

    public void setCol_dir(String col_dir) {
        this.col_dir = col_dir;
    }

    public String getCol_tel2() {
        return col_tel2;
    }

    public void setCol_tel2(String col_tel2) {
        this.col_tel2 = col_tel2;
    }
       
       

    public int getCol_id() {
        return col_id;
    }

    public void setCol_id(int col_id) {
        this.col_id = col_id;
    }

    public String getCol_ide() {
        return col_ide;
    }

    public void setCol_ide(String col_ide) {
        this.col_ide = col_ide;
    }

    public int getCol_doc_typ_id() {
        return col_doc_typ_id;
    }

    public void setCol_doc_typ_id(int col_doc_typ_id) {
        this.col_doc_typ_id = col_doc_typ_id;
    }

    public String getCol_cod() {
        return col_cod;
    }

    public void setCol_cod(String col_cod) {
        this.col_cod = col_cod;
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

    public Date getCol_bir() {
        return col_bir;
    }

    public void setCol_bir(Date col_bir) {
        this.col_bir = col_bir;
    }

    public int getCol_gen_id() {
        return col_gen_id;
    }

    public void setCol_gen_id(int col_gen_id) {
        this.col_gen_id = col_gen_id;
    }

    public int getCol_pos_id() {
        return col_pos_id;
    }

    public void setCol_pos_id(int col_pos_id) {
        this.col_pos_id = col_pos_id;
    }

    public int getAre_kac_id() {
        return are_kac_id;
    }

    public void setAre_kac_id(int are_kac_id) {
        this.are_kac_id = are_kac_id;
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

    public Boolean getCol_int() {
        return col_int;
    }

    public void setCol_int(Boolean col_int) {
        this.col_int = col_int;
    }

    public Boolean getCol_sta() {
        return col_sta;
    }

    public void setCol_sta(Boolean col_sta) {
        this.col_sta = col_sta;
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

    public int getCco_id() {
        return cco_id;
    }

    public void setCco_id(int cco_id) {
        this.cco_id = cco_id;
    }

    public String getCol_pos_des() {
        return col_pos_des;
    }

    public void setCol_pos_des(String col_pos_des) {
        this.col_pos_des = col_pos_des;
    }

    public int getUse_com_id() {
        return use_com_id;
    }

    public void setUse_com_id(int use_com_id) {
        this.use_com_id = use_com_id;
    }

    public void getResults(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
