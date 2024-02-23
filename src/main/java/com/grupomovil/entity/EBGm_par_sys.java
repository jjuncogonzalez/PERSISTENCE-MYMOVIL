package com.grupomovil.entity;

import java.io.Serializable;

/**
 * @author jjunco
 */
public class EBGm_par_sys implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer par_sys_id;
    private String par_sys_key;
    private String par_sys_val;

    public Integer getPar_sys_id() {
        return par_sys_id;
    }

    public void setPar_sys_id(Integer par_sys_id) {
        this.par_sys_id = par_sys_id;
    }

    public String getPar_sys_key() {
        return par_sys_key;
    }

    public void setPar_sys_key(String par_sys_key) {
        this.par_sys_key = par_sys_key;
    }

    public String getPar_sys_val() {
        return par_sys_val;
    }

    public void setPar_sys_val(String par_sys_val) {
        this.par_sys_val = par_sys_val;
    }

}
