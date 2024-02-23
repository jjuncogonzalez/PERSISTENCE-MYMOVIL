package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jjunco
 */
public class EBGm_zone implements Serializable {

    private static final long serialVersionUID = 1L;

    private int gm_zon_id;
    private Date gm_zon_dat;
    private String gm_zon_nam;
    private String gm_zon_des;
    private int gm_zon_sta;
    private int gm_zon_typ_id;

    public int getGm_zon_id() {
        return gm_zon_id;
    }

    public void setGm_zon_id(int gm_zon_id) {
        this.gm_zon_id = gm_zon_id;
    }

    public Date getGm_zon_dat() {
        return gm_zon_dat;
    }

    public void setGm_zon_dat(Date gm_zon_dat) {
        this.gm_zon_dat = gm_zon_dat;
    }

    public String getGm_zon_nam() {
        return gm_zon_nam;
    }

    public void setGm_zon_nam(String gm_zon_nam) {
        this.gm_zon_nam = gm_zon_nam;
    }

    public String getGm_zon_des() {
        return gm_zon_des;
    }

    public void setGm_zon_des(String gm_zon_des) {
        this.gm_zon_des = gm_zon_des;
    }

    public int getGm_zon_sta() {
        return gm_zon_sta;
    }

    public void setGm_zon_sta(int gm_zon_sta) {
        this.gm_zon_sta = gm_zon_sta;
    }

    public int getGm_zon_typ_id() {
        return gm_zon_typ_id;
    }

    public void setGm_zon_typ_id(int gm_zon_typ_id) {
        this.gm_zon_typ_id = gm_zon_typ_id;
    }

}
