package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author jeisson.junco
 */
public class EBGm_his_cap_tip implements Serializable {

    private int his_cap_tip_id;
    private String his_cap_tip_cap;
    private int his_cap_tip_val;
    private Date dat_cre;
    private Date dat_mod;

    public int getHis_cap_tip_id() {
        return his_cap_tip_id;
    }

    public void setHis_cap_tip_id(int his_cap_tip_id) {
        this.his_cap_tip_id = his_cap_tip_id;
    }

    public String getHis_cap_tip_cap() {
        return his_cap_tip_cap;
    }

    public void setHis_cap_tip_cap(String his_cap_tip_cap) {
        this.his_cap_tip_cap = his_cap_tip_cap;
    }

    public int getHis_cap_tip_val() {
        return his_cap_tip_val;
    }

    public void setHis_cap_tip_val(int his_cap_tip_val) {
        this.his_cap_tip_val = his_cap_tip_val;
    }

    public Date getDat_cre() {
        return dat_cre;
    }

    public void setDat_cre(Date dat_cre) {
        this.dat_cre = dat_cre;
    }

    public Date getDat_mod() {
        return dat_mod;
    }

    public void setDat_mod(Date dat_mod) {
        this.dat_mod = dat_mod;
    }

    

}
