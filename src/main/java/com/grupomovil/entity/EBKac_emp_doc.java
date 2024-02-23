package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jjunco
 */
public class EBKac_emp_doc implements Serializable {

    private static final long serialVersionUID = 1L;

    private int cod_empr;
    private String cod_empl;
    private int cod_docu;
    private String num_docu;
    private Date fec_expe;
    private Date fec_venc;
    private Date fec_cont;
    private int status_doc;

    private String startDate;
    private String endDate;
    private Boolean aDocValidator;

    public int getCod_empr() {
        return cod_empr;
    }

    public void setCod_empr(int cod_empr) {
        this.cod_empr = cod_empr;
    }

    public String getCod_empl() {
        return cod_empl;
    }

    public void setCod_empl(String cod_empl) {
        this.cod_empl = cod_empl;
    }

    public int getCod_docu() {
        return cod_docu;
    }

    public void setCod_docu(int cod_docu) {
        this.cod_docu = cod_docu;
    }

    public String getNum_docu() {
        return num_docu;
    }

    public void setNum_docu(String num_docu) {
        this.num_docu = num_docu;
    }

    public Date getFec_expe() {
        return fec_expe;
    }

    public void setFec_expe(Date fec_expe) {
        this.fec_expe = fec_expe;
    }

    public Date getFec_venc() {
        return fec_venc;
    }

    public void setFec_venc(Date fec_venc) {
        this.fec_venc = fec_venc;
    }

    public Date getFec_cont() {
        return fec_cont;
    }

    public void setFec_cont(Date fec_cont) {
        this.fec_cont = fec_cont;
    }

    public int getStatus_doc() {
        return status_doc;
    }

    public void setStatus_doc(int status_doc) {
        this.status_doc = status_doc;
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

    public Boolean getaDocValidator() {
        return aDocValidator;
    }

    public void setaDocValidator(Boolean aDocValidator) {
        this.aDocValidator = aDocValidator;
    }

}
