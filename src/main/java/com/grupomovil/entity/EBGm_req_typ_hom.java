package com.grupomovil.entity;

import java.util.Date;

/**
 * Entidad para hacer homolación de los tipos de solcitudes entre RIGEL y MyMovil
 * @author Omar.beltran
 */
public class EBGm_req_typ_hom {
    private int req_typ_hom_id;
    private int req_typ_id_mym;
    private int req_typ_id_rig;
    private Date dat_cre;
    private int usu_cre;
    private Date dat_mod;
    private int usu_mod;
    private int tip_req;//0 = solicitudes   1 = solicitudes área, cero por  defecto
    
    public int getReq_typ_hom_id() {
        return req_typ_hom_id;
    }

    public void setReq_typ_hom_id(int req_typ_hom_id) {
        this.req_typ_hom_id = req_typ_hom_id;
    }

    public int getReq_typ_id_mym() {
        return req_typ_id_mym;
    }

    public void setReq_typ_id_mym(int req_typ_id_mym) {
        this.req_typ_id_mym = req_typ_id_mym;
    }

    public int getReq_typ_id_rig() {
        return req_typ_id_rig;
    }

    public void setReq_typ_id_rig(int req_typ_id_rig) {
        this.req_typ_id_rig = req_typ_id_rig;
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

    public int getTip_req() {
        return tip_req;
    }

    public void setTip_req(int tip_req) {
        this.tip_req = tip_req;
    }
    
}
