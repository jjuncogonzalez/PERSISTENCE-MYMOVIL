package com.grupomovil.entity.sostenibilidad;

import java.io.Serializable;
import java.util.Date;

/**
 * Clase que corresponde a la entidad de la tabla indicadores de sostenibilidad
 * @author Omar.beltran
 */
public class EBGm_sos_ind implements Serializable {
    private int id_ind;//identificador único de la tabla
    private String cod_ind;//código del indicador
    private String des_ind;//descripcion del indicador
    private String des_ope_mat;//descripcion de la operación matemática
    private int id_obj; //llave foránea a la tabla de objetivos 
    private int id_pro; //llave foránea a la tabla de procesos 
    private int id_cla; //llave foránea a la tabla clasificación 
    private int id_fre; //llave foránea a la tabla frecuencia
    private int id_cco; //llave foránea al área de la compañía (no deberia estar, el proceso está asociado aun centro de costos)
    private int id_estado_ind;//llave foránea la estado del indicador
    private int id_resp;//llave foránea a la persona responsable del indicador
    private int es_tasa;//indica si los valores del indicador son porcentuales o no
    private float meta_val;//cuantificador de la meta
    private Date fech_cump_ind;//fecha en la que se debe cumplir el indicador
    private String resultado_periodo_anetrior;
    private String proceso_permiso_diligenciamiento;
    private Date dat_cre;
    private int use_cre;
    private Date dat_mod;
    private int use_mod;

    public int getId_ind() {
        return id_ind;
    }

    public void setId_ind(int id_ind) {
        this.id_ind = id_ind;
    }

    public String getCod_ind() {
        return cod_ind;
    }

    public void setCod_ind(String cod_ind) {
        this.cod_ind = cod_ind;
    }

    public String getDes_ind() {
        return des_ind;
    }

    public void setDes_ind(String des_ind) {
        this.des_ind = des_ind;
    }

    public String getDes_ope_mat() {
        return des_ope_mat;
    }

    public void setDes_ope_mat(String des_ope_mat) {
        this.des_ope_mat = des_ope_mat;
    }

    public int getId_obj() {
        return id_obj;
    }

    public void setId_obj(int id_obj) {
        this.id_obj = id_obj;
    }

    public int getId_fre() {
        return id_fre;
    }

    public void setId_fre(int id_fre) {
        this.id_fre = id_fre;
    }

    public int getId_cco() {
        return id_cco;
    }

    public void setId_cco(int id_cco) {
        this.id_cco = id_cco;
    }

    public int getId_estado_ind() {
        return id_estado_ind;
    }

    public void setId_estado_ind(int id_estado_ind) {
        this.id_estado_ind = id_estado_ind;
    }

    public int getId_resp() {
        return id_resp;
    }

    public void setId_resp(int id_resp) {
        this.id_resp = id_resp;
    }

    public Date getFech_cump_ind() {
        return fech_cump_ind;
    }

    public void setFech_cump_ind(Date fech_cump_ind) {
        this.fech_cump_ind = fech_cump_ind;
    }

    public String getResultado_periodo_anetrior() {
        return resultado_periodo_anetrior;
    }

    public void setResultado_periodo_anetrior(String resultado_periodo_anetrior) {
        this.resultado_periodo_anetrior = resultado_periodo_anetrior;
    }

    public String getProceso_permiso_diligenciamiento() {
        return proceso_permiso_diligenciamiento;
    }

    public void setProceso_permiso_diligenciamiento(String proceso_permiso_diligenciamiento) {
        this.proceso_permiso_diligenciamiento = proceso_permiso_diligenciamiento;
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

    public int getId_pro() {
        return id_pro;
    }

    public void setId_pro(int id_pro) {
        this.id_pro = id_pro;
    }

    public int getId_cla() {
        return id_cla;
    }

    public void setId_cla(int id_cla) {
        this.id_cla = id_cla;
    }

    public int getEs_tasa() {
        return es_tasa;
    }

    public void setEs_tasa(int es_tasa) {
        this.es_tasa = es_tasa;
    }

    public float getMeta_val() {
        return meta_val;
    }

    public void setMeta_val(float meta_val) {
        this.meta_val = meta_val;
    }
    
}
