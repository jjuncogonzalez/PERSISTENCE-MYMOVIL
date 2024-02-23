package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Entidad Usuarios comunes
 * @author Omar.beltran
 */
public class EBGm_use_com implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private int use_com_id;         //identificador único
    private Date dat_cre;           //Fecha de creación
    private int usu_cre;            //Usuario creacion
    private Date dat_mod;           //Fecha de modificación
    private int usu_mod;            //Usuario modificación
    private int col_id;             //fk identificador del colaborador
    private String use_com_id_dis;  //identificador del dispositivo
    private String use_com_nam;     //nombre del usuario
    private String use_com_use;     //usuario
    private String use_com_pas;     //contraseña del usuario
    private Boolean use_com_sta;    //Estado (0 = Inactivo, 1 = Activo, 3 = Eliminado)
    private String use_com_ima;     //imagen
    private int com_id;             //llave foranéa que asocia a compañía 
    private String use_com_las_ent; //última entrada
    private String use_com_pas_cha; //fecha caducidad contraseña
    private String use_com_las_cha; //último cambio de contraseña
    private int use_com_num_ent;    // # ingresos
    private int rig_id;             //identificador RIGEL

    // Validaciones de WS
    private Boolean validator; // Validador de ingreso MÓvil
    private String message;    // Mensaje del servicio
    private Boolean qrcode;    // Utiliza qr

    public int getUse_com_id() {
        return use_com_id;
    }

    public void setUse_com_id(int use_com_id) {
        this.use_com_id = use_com_id;
    }

    public Date getDat_cre() {
        return dat_cre;
    }

    public void setDat_cre(Date dat_cre) {
        this.dat_cre = dat_cre;
    }

    public int getUsu_cre() {
        return usu_cre;
    }

    public void setUsu_cre(int usu_cre) {
        this.usu_cre = usu_cre;
    }

    public Date getDat_mod() {
        return dat_mod;
    }

    public void setDat_mod(Date dat_mod) {
        this.dat_mod = dat_mod;
    }

    public int getUsu_mod() {
        return usu_mod;
    }

    public void setUsu_mod(int usu_mod) {
        this.usu_mod = usu_mod;
    }

    public int getCol_id() {
        return col_id;
    }

    public void setCol_id(int col_id) {
        this.col_id = col_id;
    }

    public String getUse_com_id_dis() {
        return use_com_id_dis;
    }

    public void setUse_com_id_dis(String use_com_id_dis) {
        this.use_com_id_dis = use_com_id_dis;
    }

    public String getUse_com_nam() {
        return use_com_nam;
    }

    public void setUse_com_nam(String use_com_nam) {
        this.use_com_nam = use_com_nam;
    }

    public String getUse_com_use() {
        return use_com_use;
    }

    public void setUse_com_use(String use_com_use) {
        this.use_com_use = use_com_use;
    }

    public String getUse_com_pas() {
        return use_com_pas;
    }

    public void setUse_com_pas(String use_com_pas) {
        this.use_com_pas = use_com_pas;
    }

    public Boolean getUse_com_sta() {
        return use_com_sta;
    }

    public void setUse_com_sta(Boolean use_com_sta) {
        this.use_com_sta = use_com_sta;
    }

    public String getUse_com_ima() {
        return use_com_ima;
    }

    public void setUse_com_ima(String use_com_ima) {
        this.use_com_ima = use_com_ima;
    }

    public int getCom_id() {
        return com_id;
    }

    public void setCom_id(int com_id) {
        this.com_id = com_id;
    }

    public String getUse_com_las_ent() {
        return use_com_las_ent;
    }

    public void setUse_com_las_ent(String use_com_las_ent) {
        this.use_com_las_ent = use_com_las_ent;
    }

    public String getUse_com_pas_cha() {
        return use_com_pas_cha;
    }

    public void setUse_com_pas_cha(String use_com_pas_cha) {
        this.use_com_pas_cha = use_com_pas_cha;
    }

    public String getUse_com_las_cha() {
        return use_com_las_cha;
    }

    public void setUse_com_las_cha(String use_com_las_cha) {
        this.use_com_las_cha = use_com_las_cha;
    }

    public int getUse_com_num_ent() {
        return use_com_num_ent;
    }

    public void setUse_com_num_ent(int use_com_num_ent) {
        this.use_com_num_ent = use_com_num_ent;
    }

    public Boolean getValidator() {
        return validator;
    }

    public void setValidator(Boolean validator) {
        this.validator = validator;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getQrcode() {
        return qrcode;
    }

    public void setQrcode(Boolean qrcode) {
        this.qrcode = qrcode;
    }

    public int getRig_id() {
        return rig_id;
    }

    public void setRig_id(int rig_id) {
        this.rig_id = rig_id;
    }
}