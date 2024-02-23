package com.grupomovil.entity;

import java.io.Serializable;

/**
 * @author Omar.beltran
 */
public class EBGm_his_park implements Serializable {

    private static final long serialVersionUID = 1L;

    private int veh_park_id;
    private String dat_cre;
    private int his_nov_id;
    private String nov_nam;
    private int nov_id;
    private int emp_park_id;
    private String emp_park_nam;
    private String emp_park_sur;
    private String emp_park_ide;
    private String usu_cre;
    private String emp_park_tel;

    public String getUsu_cre() {
        return usu_cre;
    }

    public void setUsu_cre(String usu_cre) {
        this.usu_cre = usu_cre;
    }

    public int getVeh_park_id() {
        return veh_park_id;
    }

    public void setVeh_park_id(int veh_park_id) {
        this.veh_park_id = veh_park_id;
    }

    public String getDat_cre() {
        return dat_cre;
    }

    public void setDat_cre(String dat_cre) {
        this.dat_cre = dat_cre;
    }

    public int getHis_nov_id() {
        return his_nov_id;
    }

    public void setHis_nov_id(int his_nov_id) {
        this.his_nov_id = his_nov_id;
    }

    public String getNov_nam() {
        return nov_nam;
    }

    public void setNov_nam(String nov_nam) {
        this.nov_nam = nov_nam;
    }

    public int getNov_id() {
        return nov_id;
    }

    public void setNov_id(int nov_id) {
        this.nov_id = nov_id;
    }

    public int getEmp_park_id() {
        return emp_park_id;
    }

    public void setEmp_park_id(int emp_park_id) {
        this.emp_park_id = emp_park_id;
    }

    public String getEmp_park_nam() {
        return emp_park_nam;
    }

    public void setEmp_park_nam(String emp_park_nam) {
        this.emp_park_nam = emp_park_nam;
    }

    public String getEmp_park_sur() {
        return emp_park_sur;
    }

    public void setEmp_park_sur(String emp_park_sur) {
        this.emp_park_sur = emp_park_sur;
    }

    public String getEmp_park_ide() {
        return emp_park_ide;
    }

    public void setEmp_park_ide(String emp_park_ide) {
        this.emp_park_ide = emp_park_ide;
    }

    public String getEmp_park_tel() {
        return emp_park_tel;
    }

    public void setEmp_park_tel(String emp_park_tel) {
        this.emp_park_tel = emp_park_tel;
    }

}
