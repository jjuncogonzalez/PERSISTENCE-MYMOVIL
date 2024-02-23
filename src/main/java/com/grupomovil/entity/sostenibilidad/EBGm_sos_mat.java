package com.grupomovil.entity.sostenibilidad;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Omar.beltran
 */
public class EBGm_sos_mat implements Serializable {
    private int sos_mat_id;
    private int cco_id;//centro de costo, es el indicador
    private int gm_sos_mat_cod_ind;//centro de costo, es el indicador
    private String cco_des;//nombre del centro de costo
    private String sos_mat_mes;
    private int sos_mat_year;
    private double sos_mat_val;
    private float sos_mat_obj;
    private boolean sos_mat_es_apa;//aplica plan de acción
    private String sos_mat_pla_acc;
    private String sos_mat_res;
    private Date sos_mat_fec_lim;
    private int sos_mat_ava;
    private Date dat_cre;
    private int usu_cre;
    private Date dat_mod;
    private int usu_mod;
    private String indicator;

    public int getGm_sos_mat_cod_ind() {
        return gm_sos_mat_cod_ind;
    }

    public void setGm_sos_mat_cod_ind(int gm_sos_mat_cod_ind) {
        this.gm_sos_mat_cod_ind = gm_sos_mat_cod_ind;
    }

    public String getIndicator() {
        return indicator;
    }

    public void setIndicator(String indicator) {
        this.indicator = indicator;
    }
    
    public int getSos_mat_id() {
        return sos_mat_id;
    }

    public void setSos_mat_id(int sos_mat_id) {
        this.sos_mat_id = sos_mat_id;
    }

    public int getCco_id() {
        return cco_id;
    }

    public void setCco_id(int cco_id) {
        this.cco_id = cco_id;
    }

    public String getSos_mat_mes() {
        return sos_mat_mes;
    }

    public void setSos_mat_mes(String sos_mat_mes) {
        this.sos_mat_mes = sos_mat_mes;
    }

    public int getSos_mat_year() {
        return sos_mat_year;
    }

    public void setSos_mat_year(int sos_mat_year) {
        this.sos_mat_year = sos_mat_year;
    }

    public double getSos_mat_val() {
        return sos_mat_val;
    }

    public void setSos_mat_val(double sos_mat_val) {
        this.sos_mat_val = sos_mat_val;
    }

    public float getSos_mat_obj() {
        return sos_mat_obj;
    }

    public void setSos_mat_obj(float sos_mat_obj) {
        this.sos_mat_obj = sos_mat_obj;
    }

    public boolean isSos_mat_es_apa() {
        return sos_mat_es_apa;
    }

    public void setSos_mat_es_apa(boolean sos_mat_es_apa) {
        this.sos_mat_es_apa = sos_mat_es_apa;
    }

    public String getSos_mat_pla_acc() {
        return sos_mat_pla_acc;
    }

    public void setSos_mat_pla_acc(String sos_mat_pla_acc) {
        this.sos_mat_pla_acc = sos_mat_pla_acc;
    }

    public String getSos_mat_res() {
        return sos_mat_res;
    }

    public void setSos_mat_res(String sos_mat_res) {
        this.sos_mat_res = sos_mat_res;
    }

    public Date getSos_mat_fec_lim() {
        return sos_mat_fec_lim;
    }

    public void setSos_mat_fec_lim(Date sos_mat_fec_lim) {
        this.sos_mat_fec_lim = sos_mat_fec_lim;
    }

    public int getSos_mat_ava() {
        return sos_mat_ava;
    }

    public void setSos_mat_ava(int sos_mat_ava) {
        this.sos_mat_ava = sos_mat_ava;
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

    public String getCco_des() {
        return cco_des;
    }

    public void setCco_des(String cco_des) {
        this.cco_des = cco_des;
    }
    
}
