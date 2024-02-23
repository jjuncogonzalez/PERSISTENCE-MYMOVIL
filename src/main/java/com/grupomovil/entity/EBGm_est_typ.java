package com.grupomovil.entity;

import java.io.Serializable;

/**
 * @author jjunco
 */
public class EBGm_est_typ implements Serializable {

    private static final long serialVersionUID = 1L;

   
    private int typ_id;
    private String est_nam;
    private Boolean est_act;
    private String loc_est;

    private Boolean results;
  
    private int usu_cre;
    private String dat_cre;

    public int getTyp_id() {
        return typ_id;
    }

    public void setTyp_id(int typ_id) {
        this.typ_id = typ_id;
    }

    public String getEst_nam() {
        return est_nam;
    }

    public void setEst_nam(String est_nam) {
        this.est_nam = est_nam;
    }

    public Boolean getEst_act() {
        return est_act;
    }

    public void setEst_act(Boolean est_act) {
        this.est_act = est_act;
    }

    public String getLoc_est() {
        return loc_est;
    }

    public void setLoc_est(String loc_est) {
        this.loc_est = loc_est;
    }

    public Boolean getResults() {
        return results;
    }

    public void setResults(Boolean results) {
        this.results = results;
    }

    public int getUsu_cre() {
        return usu_cre;
    }

    public void setUsu_cre(int usu_cre) {
        this.usu_cre = usu_cre;
    }

    public String getDat_cre() {
        return dat_cre;
    }

    public void setDat_cre(String dat_cre) {
        this.dat_cre = dat_cre;
    }


}
