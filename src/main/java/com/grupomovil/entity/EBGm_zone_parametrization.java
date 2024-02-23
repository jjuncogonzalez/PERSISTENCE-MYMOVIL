package com.grupomovil.entity;

import java.io.Serializable;

/**
 * @author jjunco
 */
public class EBGm_zone_parametrization implements Serializable {

    private static final long serialVersionUID = 1L;

    private String gm_zon_par_val;
    private int gm_zon_id;
    private int gm_var_id;
    private int gm_var_ran_id;

    public String getGm_zon_par_val() {
        return gm_zon_par_val;
    }

    public void setGm_zon_par_val(String gm_zon_par_val) {
        this.gm_zon_par_val = gm_zon_par_val;
    }

    public int getGm_zon_id() {
        return gm_zon_id;
    }

    public void setGm_zon_id(int gm_zon_id) {
        this.gm_zon_id = gm_zon_id;
    }

    public int getGm_var_id() {
        return gm_var_id;
    }

    public void setGm_var_id(int gm_var_id) {
        this.gm_var_id = gm_var_id;
    }

    public int getGm_var_ran_id() {
        return gm_var_ran_id;
    }

    public void setGm_var_ran_id(int gm_var_ran_id) {
        this.gm_var_ran_id = gm_var_ran_id;
    }
  
    

}
