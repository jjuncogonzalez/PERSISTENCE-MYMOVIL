package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Entidad de pronostico de vacaciones
 *
 * @author jeisson.junco
 */
public class EBGm_vac_pro implements Serializable {

    private static final long serialVersionUID = 1L;

    private int month_sug_vaca;
    private int id;
    private int per_vac_year;
    private Date cau1s;
    private Date cau2s;
    private int cod_gpro;
    private String ind_acti;
    private int cod_carg;
    private String cod_empl;
    private String nom_empl;
    private String ape_empl;
    private String cod_inte;
    private int usu_modv;
    private int per_disf;
    private Date fec_cau1;
    private Date fec_cau2;
    private int dia_acum;
    private int dia_tomt;
    private int dia_tomd;
    private int dia_pend;
    private Date fec_dis1;
    private Date fec_dis2;
    private Date fec_regr;
    private int dia_pagt;
    private int dia_pagd;
    private Date act_hora;
    private String OBS_ERVA;
    private String pri_vac;

    private Boolean opeValidator;

    private Date pronoIni;
    private Date pronoFin;
    private int pronoId;

    private String pronoIniStr;
    private String pronoFinStr;

    public int getMonth_sug_vaca() {
        return month_sug_vaca;
    }

    public void setMonth_sug_vaca(int month_sug_vaca) {
        this.month_sug_vaca = month_sug_vaca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPer_vac_year() {
        return per_vac_year;
    }

    public void setPer_vac_year(int per_vac_year) {
        this.per_vac_year = per_vac_year;
    }

    public Date getCau1s() {
        return cau1s;
    }

    public void setCau1s(Date cau1s) {
        this.cau1s = cau1s;
    }

    public Date getCau2s() {
        return cau2s;
    }

    public void setCau2s(Date cau2s) {
        this.cau2s = cau2s;
    }

    public int getCod_gpro() {
        return cod_gpro;
    }

    public void setCod_gpro(int cod_gpro) {
        this.cod_gpro = cod_gpro;
    }

    public String getInd_acti() {
        return ind_acti;
    }

    public void setInd_acti(String ind_acti) {
        this.ind_acti = ind_acti;
    }

    public int getCod_carg() {
        return cod_carg;
    }

    public void setCod_carg(int cod_carg) {
        this.cod_carg = cod_carg;
    }

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

    public String getCod_inte() {
        return cod_inte;
    }

    public void setCod_inte(String cod_inte) {
        this.cod_inte = cod_inte;
    }

    public int getUsu_modv() {
        return usu_modv;
    }

    public void setUsu_modv(int usu_modv) {
        this.usu_modv = usu_modv;
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

    public int getDia_acum() {
        return dia_acum;
    }

    public void setDia_acum(int dia_acum) {
        this.dia_acum = dia_acum;
    }

    public int getDia_tomt() {
        return dia_tomt;
    }

    public void setDia_tomt(int dia_tomt) {
        this.dia_tomt = dia_tomt;
    }

    public int getDia_tomd() {
        return dia_tomd;
    }

    public void setDia_tomd(int dia_tomd) {
        this.dia_tomd = dia_tomd;
    }

    public int getDia_pend() {
        return dia_pend;
    }

    public void setDia_pend(int dia_pend) {
        this.dia_pend = dia_pend;
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

    public int getDia_pagt() {
        return dia_pagt;
    }

    public void setDia_pagt(int dia_pagt) {
        this.dia_pagt = dia_pagt;
    }

    public int getDia_pagd() {
        return dia_pagd;
    }

    public void setDia_pagd(int dia_pagd) {
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

    public String getPri_vac() {
        return pri_vac;
    }

    public void setPri_vac(String pri_vac) {
        this.pri_vac = pri_vac;
    }

    public Boolean getOpeValidator() {
        return opeValidator;
    }

    public void setOpeValidator(Boolean opeValidator) {
        this.opeValidator = opeValidator;
    }

    public Date getPronoIni() {
        return pronoIni;
    }

    public void setPronoIni(Date pronoIni) {
        this.pronoIni = pronoIni;
    }

    public Date getPronoFin() {
        return pronoFin;
    }

    public void setPronoFin(Date pronoFin) {
        this.pronoFin = pronoFin;
    }

    public int getPronoId() {
        return pronoId;
    }

    public void setPronoId(int pronoId) {
        this.pronoId = pronoId;
    }

    public String getPronoIniStr() {
        return pronoIniStr;
    }

    public void setPronoIniStr(String pronoIniStr) {
        this.pronoIniStr = pronoIniStr;
    }

    public String getPronoFinStr() {
        return pronoFinStr;
    }

    public void setPronoFinStr(String pronoFinStr) {
        this.pronoFinStr = pronoFinStr;
    }

}
