package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jjunco
 */
public class EBKac_col implements Serializable {

    private static final long serialVersionUID = 1L;

    private String col_ide;
    private String col_doc_typ;
    private String col_cod;
    private String col_nam;
    private String col_sur;
    private Date col_bir;
    private String col_tel;
    private String col_gen;
    private String col_ema;
    private String col_sta;
    private int are_kac;
    private int col_pos;

    private Date fec_cont;
    private Integer nro_cont;
    private Date aEmple;
    private Date aContr;

    //Validators
    private String startDate;
    private String endDate;
    private Boolean aEmpleValidator;
    private Boolean aContrValidator;
    private Boolean fec_contValidator;
    private Boolean ind_acti;

    public String getCol_ide() {
        return col_ide;
    }

    public void setCol_ide(String col_ide) {
        this.col_ide = col_ide;
    }

    public String getCol_doc_typ() {
        return col_doc_typ;
    }

    public void setCol_doc_typ(String col_doc_typ) {
        this.col_doc_typ = col_doc_typ;
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

    public String getCol_tel() {
        return col_tel;
    }

    public void setCol_tel(String col_tel) {
        this.col_tel = col_tel;
    }

    public String getCol_gen() {
        return col_gen;
    }

    public void setCol_gen(String col_gen) {
        this.col_gen = col_gen;
    }

    public String getCol_ema() {
        return col_ema;
    }

    public void setCol_ema(String col_ema) {
        this.col_ema = col_ema;
    }

    public String getCol_sta() {
        return col_sta;
    }

    public void setCol_sta(String col_sta) {
        this.col_sta = col_sta;
    }

    public int getAre_kac() {
        return are_kac;
    }

    public void setAre_kac(int are_kac) {
        this.are_kac = are_kac;
    }

    public int getCol_pos() {
        return col_pos;
    }

    public void setCol_pos(int col_pos) {
        this.col_pos = col_pos;
    }

    public Date getFec_cont() {
        return fec_cont;
    }

    public void setFec_cont(Date fec_cont) {
        this.fec_cont = fec_cont;
    }

    public Integer getNro_cont() {
        return nro_cont;
    }

    public void setNro_cont(Integer nro_cont) {
        this.nro_cont = nro_cont;
    }

    public Date getaEmple() {
        return aEmple;
    }

    public void setaEmple(Date aEmple) {
        this.aEmple = aEmple;
    }

    public Date getaContr() {
        return aContr;
    }

    public void setaContr(Date aContr) {
        this.aContr = aContr;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Boolean getaEmpleValidator() {
        return aEmpleValidator;
    }

    public void setaEmpleValidator(Boolean aEmpleValidator) {
        this.aEmpleValidator = aEmpleValidator;
    }

    public Boolean getaContrValidator() {
        return aContrValidator;
    }

    public void setaContrValidator(Boolean aContrValidator) {
        this.aContrValidator = aContrValidator;
    }

    public Boolean getFec_contValidator() {
        return fec_contValidator;
    }

    public void setFec_contValidator(Boolean fec_contValidator) {
        this.fec_contValidator = fec_contValidator;
    }

    public Boolean getInd_acti() {
        return ind_acti;
    }

    public void setInd_acti(Boolean ind_acti) {
        this.ind_acti = ind_acti;
    }


    

}
