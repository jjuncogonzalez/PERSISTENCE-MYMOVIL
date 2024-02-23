package com.grupomovil.entity.scada;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Omar.beltran
 */

public class DataScada implements Serializable {

    private static final long serialVersionUID = 1L;
    private String gm_fil_nam;
    private int gm_fil_typ;
    private Date gm_dat;
    private Date gm_tim;
    private String gm_typ;
    private String gm_pha;
    private double gm_val;
    private String gm_ref;

    public Date getGm_dat() {
        return gm_dat;
    }

    public void setGm_dat(Date gm_dat) {
        this.gm_dat = gm_dat;
    }

    public Date getGm_tim() {
        return gm_tim;
    }

    public void setGm_tim(Date gm_tim) {
        this.gm_tim = gm_tim;
    }

    public String getGm_typ() {
        return gm_typ;
    }

    public void setGm_typ(String gm_typ) {
        this.gm_typ = gm_typ;
    }

    public String getGm_pha() {
        return gm_pha;
    }

    public void setGm_pha(String gm_pha) {
        this.gm_pha = gm_pha;
    }

    public double getGm_val() {
        return gm_val;
    }

    public void setGm_val(double gm_val) {
        this.gm_val = gm_val;
    }

    public String getGm_ref() {
        return gm_ref;
    }

    public void setGm_ref(String gm_ref) {
        this.gm_ref = gm_ref;
    }

    public String getGm_fil_nam() {
        return gm_fil_nam;
    }

    public void setGm_fil_nam(String gm_fil_nam) {
        this.gm_fil_nam = gm_fil_nam;
    }

    public int getGm_fil_typ() {
        return gm_fil_typ;
    }

    public void setGm_fil_typ(int gm_fil_typ) {
        this.gm_fil_typ = gm_fil_typ;
    }
    
}
