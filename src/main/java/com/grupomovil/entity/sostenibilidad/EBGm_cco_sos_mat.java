package com.grupomovil.entity.sostenibilidad;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Omar.beltran
 */
public class EBGm_cco_sos_mat implements Serializable {
    private int gm_cco_sos_mat_id;
    private String gm_sos_mat_cod_ind;
    private String gm_sos_mat_ind_log;
    private int cco_id;
    private Date dat_cre;
    private int usu_cre;
    private Date dat_mod;
    private int usu_mod;

    public int getGm_cco_sos_mat_id() {
        return gm_cco_sos_mat_id;
    }

    public void setGm_cco_sos_mat_id(int gm_cco_sos_mat_id) {
        this.gm_cco_sos_mat_id = gm_cco_sos_mat_id;
    }

    public String getGm_sos_mat_cod_ind() {
        return gm_sos_mat_cod_ind;
    }

    public void setGm_sos_mat_cod_ind(String gm_sos_mat_cod_ind) {
        this.gm_sos_mat_cod_ind = gm_sos_mat_cod_ind;
    }

    public String getGm_sos_mat_ind_log() {
        return gm_sos_mat_ind_log;
    }

    public void setGm_sos_mat_ind_log(String gm_sos_mat_ind_log) {
        this.gm_sos_mat_ind_log = gm_sos_mat_ind_log;
    }

    public int getCco_id() {
        return cco_id;
    }

    public void setCco_id(int cco_id) {
        this.cco_id = cco_id;
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
