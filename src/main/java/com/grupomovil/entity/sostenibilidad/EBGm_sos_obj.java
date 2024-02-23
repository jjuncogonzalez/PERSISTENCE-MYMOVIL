package com.grupomovil.entity.sostenibilidad;

import java.io.Serializable;
import java.util.Date;

/**
 * Clase que corresponde a la entidad de la tabla objetivos de sostenibilidad
 * @author Omar.beltran
 */
public class EBGm_sos_obj implements Serializable {
    private int id_obj;//identificador único de la tabla 
    private String des_obj;//descripcion del objeto
    private int id_est_obj; //llave foránea a la estrategia
    private int id_estado_obj;//llave foránea la estado del proceso
    private Date dat_cre;
    private int use_cre;
    private Date dat_mod;
    private int use_mod;

    public int getId_obj() {
        return id_obj;
    }

    public void setId_obj(int id_obj) {
        this.id_obj = id_obj;
    }

    public String getDes_obj() {
        return des_obj;
    }

    public void setDes_obj(String des_obj) {
        this.des_obj = des_obj;
    }
    
    public int getId_est_obj() {
        return id_est_obj;
    }

    public void setId_est_obj(int id_est_obj) {
        this.id_est_obj = id_est_obj;
    }

    public int getId_estado_obj() {
        return id_estado_obj;
    }

    public void setId_estado_obj(int id_estado_obj) {
        this.id_estado_obj = id_estado_obj;
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
