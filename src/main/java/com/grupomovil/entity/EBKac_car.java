package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jjunco
 */
public class EBKac_car implements Serializable {

    private static final long serialVersionUID = 1L;

    private int cod_carg;
    private String ind_acti;
    private String nom_carg;
    private Date act_hora;

    private String startDate;
    private String endDate;

    public int getCod_carg() {
        return cod_carg;
    }

    public void setCod_carg(int cod_carg) {
        this.cod_carg = cod_carg;
    }

    public String getInd_acti() {
        return ind_acti;
    }

    public void setInd_acti(String ind_acti) {
        this.ind_acti = ind_acti;
    }

    public String getNom_carg() {
        return nom_carg;
    }

    public void setNom_carg(String nom_carg) {
        this.nom_carg = nom_carg;
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
