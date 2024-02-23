package com.grupomovil.entity.ws;

import java.util.Date;

/**
 * @author Omar.beltran
 */
public class EBWs_FilterRigelNovedades {
    private Date dat_ini;//fecha inicio o desde
    private Date dat_fin;//fecha fin o hasta
    private int tip_nov;//tipo detalle novedad
    private String id_ope;//identificador del operador, empleado para hacer filtro "ausentismo por persona"
    private Date aus_dia;//ausentismo por día (P) ¿se toma fecha actual del sistema?
    private Date con_dia;//consulta diaria
    private int uni_fun;//unidad funcional
    
    public Date getDat_ini() {
        return dat_ini;
    }

    public void setDat_ini(Date dat_ini) {
        this.dat_ini = dat_ini;
    }

    public Date getDat_fin() {
        return dat_fin;
    }

    public void setDat_fin(Date dat_fin) {
        this.dat_fin = dat_fin;
    }

    public int getTip_nov() {
        return tip_nov;
    }

    public void setTip_nov(int tip_nov) {
        this.tip_nov = tip_nov;
    }

    public String getId_ope() {
        return id_ope;
    }

    public void setId_ope(String id_ope) {
        this.id_ope = id_ope;
    }

    public Date getAus_dia() {
        return aus_dia;
    }

    public void setAus_dia(Date aus_dia) {
        this.aus_dia = aus_dia;
    }

    public Date getCon_dia() {
        return con_dia;
    }

    public void setCon_dia(Date con_dia) {
        this.con_dia = con_dia;
    }

    public int getUni_fun() {
        return uni_fun;
    }

    public void setUni_fun(int uni_fun) {
        this.uni_fun = uni_fun;
    }

}
