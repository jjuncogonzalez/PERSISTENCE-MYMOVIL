package com.grupomovil.entity;

import java.io.Serializable;

/**
 * @author Omar.beltran
 */
public class EBGm_emp_park implements Serializable{
    
    private static final long serialVersionUID = 1L;

    private int emp_park_id;
    private String emp_park_ide ;
    private int emp_park_doc_typ_id ;
    private String emp_park_nam ;
    private String emp_park_sur ;
    private String emp_park_tel ;
    private String emp_park_nit ;
private  String dat_cre; 
private int usu_cre;
private  String dat_mod;
private  int usu_mod;
private  boolean emp_status;
   private boolean results;

    public boolean isEmp_status() {
        return emp_status;
    }

    public void setEmp_status(boolean emp_status) {
        this.emp_status = emp_status;
    }

    public boolean isResults() {
        return results;
    }

    public void setResults(boolean results) {
        this.results = results;
    }

    public Boolean getResults() {
        return results;
    }

    public void setResults(Boolean results) {
        this.results = results;
    }
   

    public int getEmp_park_id() {
        return emp_park_id;
    }

    public void setEmp_park_id(int emp_park_id) {
        this.emp_park_id = emp_park_id;
    }

    public String getEmp_park_ide() {
        return emp_park_ide;
    }

    public void setEmp_park_ide(String emp_park_ide) {
        this.emp_park_ide = emp_park_ide;
    }

    public int getEmp_park_doc_typ_id() {
        return emp_park_doc_typ_id;
    }

    public void setEmp_park_doc_typ_id(int emp_park_doc_typ_id) {
        this.emp_park_doc_typ_id = emp_park_doc_typ_id;
    }

    public String getEmp_park_nam() {
        return emp_park_nam;
    }

    public void setEmp_park_nam(String emp_park_nam) {
        this.emp_park_nam = emp_park_nam;
    }

    public String getEmp_park_sur() {
        return emp_park_sur;
    }

    public void setEmp_park_sur(String emp_park_sur) {
        this.emp_park_sur = emp_park_sur;
    }

    public String getEmp_park_tel() {
        return emp_park_tel;
    }

    public void setEmp_park_tel(String emp_park_tel) {
        this.emp_park_tel = emp_park_tel;
    }

    public String getEmp_park_nit() {
        return emp_park_nit;
    }

    public void setEmp_park_nit(String emp_park_nit) {
        this.emp_park_nit = emp_park_nit;
    }

    public String getDat_cre() {
        return dat_cre;
    }

    public void setDat_cre(String dat_cre) {
        this.dat_cre = dat_cre;
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

    public int getUsu_mod() {
        return usu_mod;
    }

    public void setUsu_mod(int usu_mod) {
        this.usu_mod = usu_mod;
    }

 

 

}
