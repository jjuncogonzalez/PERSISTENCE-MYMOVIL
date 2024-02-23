package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Omar.beltran
 */
public class EBGm_men implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private int usu_cre;    //usuario creación
    private Date dat_mod;   //fecha modificación
    private int usu_mod;    //usuario modificación
    private String men_des; //descripción del menú
    private String men_lin; //link 
    private String men_ico; //icono del menú
    private boolean men_tip;//1=menú, 0=header
    private int men_id;     //identificador 
    private int men_ord;    //orden del menú
    private boolean men_est;//estado
    private int cab_id;     //indice a cabecera
    
    /**
     * @return the men_est
     */
    public boolean getMen_est() {
        return men_est;
    }

    /**
     * @param men_est the men_est to set
     */
    public void setMen_est(boolean men_est) {
        this.men_est = men_est;
    }

    /**
     * @return the cab_id
     */
    public int getCab_id() {
        return cab_id;
    }

    /**
     * @param cab_id the cab_id to set
     */
    public void setCab_id(int cab_id) {
        this.cab_id = cab_id;
    }

    /**
     * @return the men_ord
     */
    public int getMen_ord() {
        return men_ord;
    }

    /**
     * @param men_ord the men_ord to set
     */
    public void setMen_ord(int men_ord) {
        this.men_ord = men_ord;
    }

    /**
     * @return the men_id
     */
    public int getMen_id() {
        return men_id;
    }

    /**
     * @param men_id the men_id to set
     */
    public void setMen_id(int men_id) {
        this.men_id = men_id;
    }
    
    /**
     * permite obtener el USUARIO CREACION del menú
     * @return the usu_cre
     */
    public int getUsu_cre() {
        return usu_cre;
    }

    /**
     * permite setear el USUARIO CREACION del menú
     * @param usu_cre the usu_cre to set
     */
    public void setUsu_cre(int usu_cre) {
        this.usu_cre = usu_cre;
    }

    /**
     * permite obtener la FECHA DE MODIFICACION del menú
     * @return the dat_mod
     */
    public Date getDat_mod() {
        return dat_mod;
    }

    /**
     * permite setear la FECHA DE MODIFICACION del menú
     * @param dat_mod the dat_mod to set
     */
    public void setDat_mod(Date dat_mod) {
        this.dat_mod = dat_mod;
    }

    /**
     * permite obtener el USUARIO QUE MODIFICA del menú
     * @return the usu_mod
     */
    public int getUsu_mod() {
        return usu_mod;
    }

    /**
     * permite setear el USUARIO QUE MODIFICA del menú
     * @param usu_mod the usu_mod to set
     */
    public void setUsu_mod(int usu_mod) {
        this.usu_mod = usu_mod;
    }

    /**
     * permite obtener la DESCRIPCIÓN del menú
     * @return the men_des
     */
    public String getMen_des() {
        return men_des;
    }

    /**
     * permite setear la DESCRIPCIÓN del menú
     * @param men_des the men_des to set
     */
    public void setMen_des(String men_des) {
        this.men_des = men_des;
    }

    /**
     * permite obtener el LINK del menú
     * @return the men_lin
     */
    public String getMen_lin() {
        return men_lin;
    }

    /**
     * permite setear el LINK del menú
     * @param men_lin the men_lin to set
     */
    public void setMen_lin(String men_lin) {
        this.men_lin = men_lin;
    }

    /**
     * permite obtener el ICONO del menú
     * @return the men_ico
     */
    public String getMen_ico() {
        return men_ico;
    }

    /**
     * permite setear el ICONO del menú 
     * @param men_ico the men_ico to set
     */
    public void setMen_ico(String men_ico) {
        this.men_ico = men_ico;
    }

    /**
     * permite obtener si es un MENU o un HEADER
     * @return the men_tip
     */
    public boolean isMen_tip() {
        return men_tip;
    }

    /**
     * permite indicar si es un MENU o un HEADER
     * @param men_tip the men_tip to set
     */
    public void setMen_tip(boolean men_tip) {
        this.men_tip = men_tip;
    }
    
    //---------------------------constructores----------------------------------
    
    /**
     * Permite crear objeto con valores especificos 
     * @param usu_cre
     * @param dat_mod
     * @param usu_mod
     * @param men_des
     * @param men_lin
     * @param men_ico
     * @param men_tip
     * @param men_ord
     * @param men_est
     * @param cab_id
     */
    public EBGm_men(int usu_cre, Date dat_mod, int usu_mod, String men_des, 
            String men_lin, String men_ico, boolean men_tip, int men_ord,
            boolean men_est, int cab_id) {
        this.usu_cre = usu_cre;
        this.dat_mod = dat_mod;
        this.usu_mod = usu_mod;
        this.men_des = men_des;
        this.men_lin = men_lin;
        this.men_ico = men_ico;
        this.men_tip = men_tip;
        this.men_ord = men_ord;
        this.men_est = men_est;
        this.cab_id = cab_id;
    }
    
    /**
     * Constructor por default 
     */
    public EBGm_men(){
        this.usu_cre = 0;
        this.dat_mod = null;
        this.usu_mod = 0;
        this.men_des = null;
        this.men_lin = null;
        this.men_ico = null;
        this.men_tip = false;
        this.men_ord = 0;
        this.men_est = false;
        this.cab_id = 0;
    }
    
    //----------------------fin constructores-----------------------------------
}
