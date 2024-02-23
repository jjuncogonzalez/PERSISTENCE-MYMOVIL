package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jjunco
 */
public class EBKac_vac implements Serializable {

    private static final long serialVersionUID = 1L;

    private String cod_empl;
    private String nom_empl;
    private String ape_empl;
    private int sec_empl;
    private int per_disf;
    private Date fec_cau1;
    private Date fec_cau2;
    private float dia_acum;
    private float dia_tomt;
    private float dia_tomd;
    private Date fec_dis1;
    private Date fec_dis2;
    private Date fec_regr;
    private float dia_pagt;
    private float dia_pagd;
    private Date act_hora;
    private String OBS_ERVA;

    private int afiltro;

    public String getCod_empl() {
        return cod_empl;
    }

    public void setCod_empl(String cod_empl) {
        this.cod_empl = cod_empl;
    }

    public String getNom_empl() {
        return nom_empl;
    }

    public void setNom_empl(String nom_empl) {
        this.nom_empl = nom_empl;
    }

    public String getApe_empl() {
        return ape_empl;
    }

    public void setApe_empl(String ape_empl) {
        this.ape_empl = ape_empl;
    }

    public int getSec_empl() {
        return sec_empl;
    }

    public void setSec_empl(int sec_empl) {
        this.sec_empl = sec_empl;
    }

    public int getPer_disf() {
        return per_disf;
    }

    public void setPer_disf(int per_disf) {
        this.per_disf = per_disf;
    }

    public Date getFec_cau1() {
        return fec_cau1;
    }

    public void setFec_cau1(Date fec_cau1) {
        this.fec_cau1 = fec_cau1;
    }

    public Date getFec_cau2() {
        return fec_cau2;
    }

    public void setFec_cau2(Date fec_cau2) {
        this.fec_cau2 = fec_cau2;
    }

    public float getDia_acum() {
        return dia_acum;
    }

    public void setDia_acum(float dia_acum) {
        this.dia_acum = dia_acum;
    }

    public float getDia_tomt() {
        return dia_tomt;
    }

    public void setDia_tomt(float dia_tomt) {
        this.dia_tomt = dia_tomt;
    }

    public float getDia_tomd() {
        return dia_tomd;
    }

    public void setDia_tomd(float dia_tomd) {
        this.dia_tomd = dia_tomd;
    }

    public Date getFec_dis1() {
        return fec_dis1;
    }

    public void setFec_dis1(Date fec_dis1) {
        this.fec_dis1 = fec_dis1;
    }

    public Date getFec_dis2() {
        return fec_dis2;
    }

    public void setFec_dis2(Date fec_dis2) {
        this.fec_dis2 = fec_dis2;
    }

    public Date getFec_regr() {
        return fec_regr;
    }

    public void setFec_regr(Date fec_regr) {
        this.fec_regr = fec_regr;
    }

    public float getDia_pagt() {
        return dia_pagt;
    }

    public void setDia_pagt(float dia_pagt) {
        this.dia_pagt = dia_pagt;
    }

    public float getDia_pagd() {
        return dia_pagd;
    }

    public void setDia_pagd(float dia_pagd) {
        this.dia_pagd = dia_pagd;
    }

    public Date getAct_hora() {
        return act_hora;
    }

    public void setAct_hora(Date act_hora) {
        this.act_hora = act_hora;
    }

    public String getOBS_ERVA() {
        return OBS_ERVA;
    }

    public void setOBS_ERVA(String OBS_ERVA) {
        this.OBS_ERVA = OBS_ERVA;
    }

    public int getAfiltro() {
        return afiltro;
    }

    public void setAfiltro(int afiltro) {
        this.afiltro = afiltro;
    }

}
