package com.grupomovil.entity;

import java.io.Serializable;

/**
 * @author jjunco
 */
public class EBGm_loc_veh implements Serializable {

    private static final long serialVersionUID = 1L;

    private int batery;

    public int getBatery() {
        return batery;
    }

    public void setBatery(int batery) {
        this.batery = batery;
    }
private String est_nam;
  private int  typ_id;

    public int getTyp_id() {
        return typ_id;
    }

    public void setTyp_id(int typ_id) {
        this.typ_id = typ_id;
    }
  
    private int loc_id;
    private String loc_veh;
    private String loc_pos;
    private String loc_est;

    private Boolean results;
    private String loc_niv_cari;
    private String loc_niv_carf;
    private String loc_km;
    private int usu_cre;
    private String dat_cre;

    public String getEst_nam() {
        return est_nam;
    }

    public void setEst_nam(String est_nam) {
        this.est_nam = est_nam;
    }

    public int getLoc_id() {
        return loc_id;
    }

    public void setLoc_id(int loc_id) {
        this.loc_id = loc_id;
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

    public String getLoc_est() {
        return loc_est;
    }

    public void setLoc_est(String loc_est) {
        this.loc_est = loc_est;
    }

    public String getLoc_niv_cari() {
        return loc_niv_cari;
    }

    public void setLoc_niv_cari(String loc_niv_cari) {
        this.loc_niv_cari = loc_niv_cari;
    }

    public String getLoc_niv_carf() {
        return loc_niv_carf;
    }

    public void setLoc_niv_carf(String loc_niv_carf) {
        this.loc_niv_carf = loc_niv_carf;
    }

    public String getLoc_km() {
        return loc_km;
    }

    public void setLoc_km(String loc_km) {
        this.loc_km = loc_km;
    }

    public String getLoc_veh() {
        return loc_veh;
    }

    public void setLoc_veh(String loc_veh) {
        this.loc_veh = loc_veh;
    }

    public String getLoc_pos() {
        return loc_pos;
    }

    public void setLoc_pos(String loc_pos) {
        this.loc_pos = loc_pos;
    }

    public Boolean getResults() {
        return results;
    }

    public void setResults(Boolean results) {
        this.results = results;
    }

}
