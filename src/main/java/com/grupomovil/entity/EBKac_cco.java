package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jjunco
 */
public class EBKac_cco implements Serializable {

    private static final long serialVersionUID = 1L;

    private int cod_ccos;
    private String nom_ccos;
    private String ind_acti;
    private Date act_hora;

    private String startDate;
    private String endDate;

    public int getCod_ccos() {
        return cod_ccos;
    }

    public void setCod_ccos(int cod_ccos) {
        this.cod_ccos = cod_ccos;
    }

    public String getNom_ccos() {
        return nom_ccos;
    }

    public void setNom_ccos(String nom_ccos) {
        this.nom_ccos = nom_ccos;
    }

    public String getInd_acti() {
        return ind_acti;
    }

    public void setInd_acti(String ind_acti) {
        this.ind_acti = ind_acti;
    }

    public Date getAct_hora() {
        return act_hora;
    }

    public void setAct_hora(Date act_hora) {
        this.act_hora = act_hora;
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

}
