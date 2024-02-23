package com.grupomovil.entity;

import java.io.Serializable;

/**
 * @author Omar.beltran
 */
public class EBGm_use_pla implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private int use_pla_id;         //id del usuario
    private String use_pla_use;     //usuario
    private String use_pla_nam;     //nombre del usuario
    private String use_pla_pas;     //contraseña del usuario
    private String use_pla_exp;     //fecha de expiración del usuario
    private Boolean use_pla_sta;    //Estado (0 = Inactivo, 1 = Activo, 3 = Eliminado)
    private String use_pla_ima;     //imagen
    private int com_id;             //llave foranéa que asocia a compañía 
    private int cco_id;             //llave foranéa que asocia al área de la compañía 
    private int col_id;             //llave foranéa que asocia a colaborador 
    private int rol_id;             //llave foranéa que asocia un rol 
    private String use_pla_las_ent; //última entrada
    private String use_pla_pas_cha; //fecha caducidad contraseña
    private String use_pla_las_cha; //último cambio de contraseña
    private int use_pla_num_ent;    // # ingresos
    private int usu_cre;            //Usuario creacion
    private String dat_mod;         //Fecha de modificación
    private int usu_mod;            //Usuario modificación
    /**
     * @return the col_id
     */
    public int getCol_id() {
        return col_id;
    }

    /**
     * @param col_id the col_id to set
     */
    public void setCol_id(int col_id) {
        this.col_id = col_id;
    }

    /**
     * @return the dat_mod
     */
    public String getDat_mod() {
        return dat_mod;
    }

    /**
     * @param dat_mod the dat_mod to set
     */
    public void setDat_mod(String dat_mod) {
        this.dat_mod = dat_mod;
    }

    /**
     * @return the usu_mod
     */
    public int getUsu_mod() {
        return usu_mod;
    }

    /**
     * @param usu_mod the usu_mod to set
     */
    public void setUsu_mod(int usu_mod) {
        this.usu_mod = usu_mod;
    }

    /**
     * retorna el ID del usuario
     * @return int
     */
    public int getUse_pla_id() {
        return use_pla_id;
    }

    /**
     * permite asignar un valor al atributo ID del usuario
     * @param use_pla_id tipo int
     */
    public void setUse_pla_id(int use_pla_id) {
        this.use_pla_id = use_pla_id;
    }

    /**
     * retorna el USUARIO
     * @return String
     */
    public String getUse_pla_use() {
        return use_pla_use;
    }

    /**
     * permite asignar un valor al atributo USUARIO
     * @param use_pla_use tipo String
     */
    public void setUse_pla_use(String use_pla_use) {
        this.use_pla_use = use_pla_use;
    }

    /**
     * retorna el NOMBRE del usuario
     * @return String
     */
    public String getUse_pla_nam() {
        return use_pla_nam;
    }

    /**
     * permite asignar un valor al atributo NOMBRE del usuario
     * @param use_pla_nam tipo String
     */
    public void setUse_pla_nam(String use_pla_nam) {
        this.use_pla_nam = use_pla_nam;
    }

    /**
     * retorna la CONTRASEÑA del usuario
     * @return String
     */
    public String getUse_pla_pas() {
        return use_pla_pas;
    }

    /**
     * permite asignar un valor al atributo CONTRASEÑA del usuario
     * @param use_pla_pas tipo String
     */
    public void setUse_pla_pas(String use_pla_pas) {
        this.use_pla_pas = use_pla_pas;
    }

    /**
     * retorna la FECHA EXPIRACION del usuario
     * @return String
     */
    public String getUse_pla_exp() {
        return use_pla_exp;
    }

    /**
     * permite asignar un valor al atributo FECHA EXPIRACION del usuario
     * @param use_pla_exp tipo String
     */
    public void setUse_pla_exp(String use_pla_exp) {
        this.use_pla_exp = use_pla_exp;
    }

    /**
     * retorna el ESTADO del usuario
     * @return String
     */
    public Boolean getUse_pla_sta() {
        return use_pla_sta;
    }

    /**
     * permite asignar un valor al atributo ESTADO del usuario
     * @param use_pla_sta
     */
    public void setUse_pla_sta(Boolean use_pla_sta) {
        this.use_pla_sta = use_pla_sta;
    }

    /**
     * retorna la IMAGEN del usuario
     * @return String
     */
    public String getUse_pla_ima() {
        return use_pla_ima;
    }

    /**
     * permite asignar un valor al atributo IMAGEN del usuario
     * @param use_pla_ima
     */
    public void setUse_pla_ima(String use_pla_ima) {
        this.use_pla_ima = use_pla_ima;
    }

    /**
     * retorna la   del usuario
     * @return String
     */
    public int getCom_id() {
        return com_id;
    }

    /**
     * permite asignar un valor al atributo   del usuario
     * @param com_id
     */
    public void setCom_id(int com_id) {
        this.com_id = com_id;
    }

    /**
     * retorna la FECHA ÚLTIMA ENTRADA del usuario
     * @return String
     */
    public String getUse_pla_las_ent() {
        return use_pla_las_ent;
    }

    /**
     * permite asignar un valor al atributo FECHA ÚLTIMA ENTRADA del usuario
     * @param use_pla_las_ent
     */
    public void setUse_pla_las_ent(String use_pla_las_ent) {
        this.use_pla_las_ent = use_pla_las_ent;
    }

    /**
     * retorna la FECHA CADUCIDAD CONTRASEÑA del usuario
     * @return String
     */
    public String getUse_pla_pas_cha() {
        return use_pla_pas_cha;
    }

    /**
     * permite asignar un valor al atributo FECHA CADUCIDAD CONTRASEÑA
     * del usuario.
     * ¡Actualmente se establece que la contraseña se debe cambiar al menos 
     * una vez cada 6 meses!.
     * @param use_pla_pas_cha
     */
    public void setUse_pla_pas_cha(String use_pla_pas_cha) {
        this.use_pla_pas_cha = use_pla_pas_cha;
    }

    /**
     * retorna el FECHA ULTIMO CAMBIO CONTRASEÑA del usuario
     * @return String
     */
    public String getUse_pla_las_cha() {
        return use_pla_las_cha;
    }

    /**
     * permite asignar un valor al atributo FECHA ÚLTIMO CAMBIO CONTRASEÑA del usuario
     * @param use_pla_las_cha
     */
    public void setUse_pla_las_cha(String use_pla_las_cha) {
        this.use_pla_las_cha = use_pla_las_cha;
    }

    /**
     * retorna el NÚMERO DE INGRESOS del usuario
     * @return String
     */
    public int getUse_pla_num_ent() {
        return use_pla_num_ent;
    }

    /**
     * permite asignar un valor al atributo NÚMERO DE INGRESOS del usuario
     * @param use_pla_num_ent
     */
    public void setUse_pla_num_ent(int use_pla_num_ent) {
        this.use_pla_num_ent = use_pla_num_ent;
    }

    public int getUsu_cre() {
        return usu_cre;
    }

    public void setUsu_cre(int usu_cre) {
        this.usu_cre = usu_cre;
    }

    public void setUse_pla_id(Object object) {
        this.com_id = (int) object;
    }

    /**
     * permite obtener el identificador del área de la compañía a la que 
     * pertenece el usuario.
     * @return int que contiene el identificador del área de la compañía
     */
    public int getCco_id() {
        return cco_id;
    }

    /**
     * Asignar un valor al identificador del área de la compñía
     * @param cco_id valor que se desea asignar
     */
    public void setCco_id(int cco_id) {
        this.cco_id = cco_id;
    }

    /**
     * permite obtener el identificador del rol asign ado al usuario
     * @return int que contiene el identificador del rol
     */
    public int getRol_id() {
        return rol_id;
    }

    /**
     * asignar el valor al identificador del rol
     * @param rol_id valor que se desea asignar
     */
    public void setRol_id(int rol_id) {
        this.rol_id = rol_id;
    }
    
}
