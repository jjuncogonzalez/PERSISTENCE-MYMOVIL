package com.grupomovil.entity.sostenibilidad;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Omar.beltran
 */
public class EBGm_sos_seg_ind implements Serializable {
    private int id_seg_ind;
    private int id_ind;
    private Date seg_ind_dat_ges;
    private String seg_ind_mes;
    private String seg_ind_year;
    private float val_var1;
    private float val_var2;
    private float val_var3;
    private float val_var4;
    private float val_var5;
    private float val_var6;
    private float seg_ind_cump;
    private Date dat_cre;
    private int use_cre;
    private Date dat_mod;
    private int use_mod;

    public int getId_seg_ind() {
        return id_seg_ind;
    }

    public void setId_seg_ind(int id_seg_ind) {
        this.id_seg_ind = id_seg_ind;
    }

    public int getId_ind() {
        return id_ind;
    }

    public void setId_ind(int id_ind) {
        this.id_ind = id_ind;
    }

    public Date getSeg_ind_dat_ges() {
        return seg_ind_dat_ges;
    }

    public void setSeg_ind_dat_ges(Date seg_ind_dat_ges) {
        this.seg_ind_dat_ges = seg_ind_dat_ges;
    }

    public String getSeg_ind_mes() {
        return seg_ind_mes;
    }

    public void setSeg_ind_mes(String seg_ind_mes) {
        this.seg_ind_mes = seg_ind_mes;
    }

    public String getSeg_ind_year() {
        return seg_ind_year;
    }

    public void setSeg_ind_year(String seg_ind_year) {
        this.seg_ind_year = seg_ind_year;
    }

    public float getVal_var1() {
        return val_var1;
    }

    public void setVal_var1(float val_var1) {
        this.val_var1 = val_var1;
    }

    public float getVal_var2() {
        return val_var2;
    }

    public void setVal_var2(float val_var2) {
        this.val_var2 = val_var2;
    }

    public float getVal_var3() {
        return val_var3;
    }

    public void setVal_var3(float val_var3) {
        this.val_var3 = val_var3;
    }

    public float getVal_var4() {
        return val_var4;
    }

    public void setVal_var4(float val_var4) {
        this.val_var4 = val_var4;
    }

    public float getVal_var5() {
        return val_var5;
    }

    public void setVal_var5(float val_var5) {
        this.val_var5 = val_var5;
    }

    public float getVal_var6() {
        return val_var6;
    }

    public void setVal_var6(float val_var6) {
        this.val_var6 = val_var6;
    }

    
    public float getSeg_ind_cump() {
        return seg_ind_cump;
    }

    public void setSeg_ind_cump(float seg_ind_cump) {
        this.seg_ind_cump = seg_ind_cump;
    }

    public Date getDat_cre() {
        return dat_cre;
    }

    public void setDat_cre(Date dat_cre) {
        this.dat_cre = dat_cre;
    }

    public int getUse_cre() {
        return use_cre;
    }

    public void setUse_cre(int use_cre) {
        this.use_cre = use_cre;
    }

    public Date getDat_mod() {
        return dat_mod;
    }

    public void setDat_mod(Date dat_mod) {
        this.dat_mod = dat_mod;
    }

    public int getUse_mod() {
        return use_mod;
    }

    public void setUse_mod(int use_mod) {
        this.use_mod = use_mod;
    }
    
    
}
