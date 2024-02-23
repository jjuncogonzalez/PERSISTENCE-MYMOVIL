package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Omar.beltran
 */
public class EBGm_asi_men implements Serializable{
    
    private static final long serialVersionUID = 1L;

    private int asi_men_id;
    private int use_pla_id;
    private int men_id;
    private boolean opt_cre;
    private boolean opt_upd;
    private boolean opt_del;
    private boolean opt_vie;
    private int usu_cre;
    private int usu_mod;
    private Date dat_cre;
    private Date dat_mod;
    
    /**
     * @return the usu_cre
     */
    public int getUsu_cre() {
        return usu_cre;
    }

    /**
     * @param usu_cre the usu_cre to set
     */
    public void setUsu_cre(int usu_cre) {
        this.usu_cre = usu_cre;
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
     * permite obtener el ID del menú
     * @return the asi_men_id
     */
    public int getAsi_men_id() {
        return asi_men_id;
    }

    /**
     * @param asi_men_id the asi_men_id to set
     */
    public void setAsi_men_id(int asi_men_id) {
        this.asi_men_id = asi_men_id;
    }

    /**
     * FK usuario plataforma
     * @return the use_pla_id
     */
    public int getUse_pla_id() {
        return use_pla_id;
    }

    /**
     * @param use_pla_id the use_pla_id to set
     */
    public void setUse_pla_id(int use_pla_id) {
        this.use_pla_id = use_pla_id;
    }

    /**
     * FK menú
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
     * permite obtener el valor de OPCION CREAR
     * @return the opt_cre
     */
    public boolean isOpt_cre() {
        return opt_cre;
    }

    /**
     * @param opt_cre the opt_cre to set
     */
    public void setOpt_cre(boolean opt_cre) {
        this.opt_cre = opt_cre;
    }

    /**
     *  permite obtener el valor de OPCION ACTUALIZAR
     * @return the opt_upd
     */
    public boolean isOpt_upd() {
        return opt_upd;
    }

    /**
     * @param opt_upd the opt_upd to set
     */
    public void setOpt_upd(boolean opt_upd) {
        this.opt_upd = opt_upd;
    }

    /**
     * permite obtener el valor de OPCION ELIMINAR
     * @return the opt_del
     */
    public boolean isOpt_del() {
        return opt_del;
    }

    /**
     * @param opt_del the opt_del to set
     */
    public void setOpt_del(boolean opt_del) {
        this.opt_del = opt_del;
    }

    /**
     * permite obtener el valor de OPCION VISTA
     * @return the opt_vie
     */
    public boolean isOpt_vie() {
        return opt_vie;
    }

    /**
     * @param opt_vie the opt_vie to set
     */
    public void setOpt_vie(boolean opt_vie) {
        this.opt_vie = opt_vie;
    }

    public Date getDat_cre() {
        return dat_cre;
    }

    public void setDat_cre(Date dat_cre) {
        this.dat_cre = dat_cre;
    }

    public Date getDat_mod() {
        return dat_mod;
    }

    public void setDat_mod(Date dat_mod) {
        this.dat_mod = dat_mod;
    }

}
