/**
 * entidad que permite realizar el reporte de las incapacidades listadas en 
 * la tabla rigel_inca de Kactus
 */
package com.grupomovil.entity.kactus;

import java.util.Date;

/**
 * @author Omar.beltran
 */
public class EBKac_inca {
    private String nom_empl;
    private String ape_empl;
    private int cod_empl;
    private float num_dias;
    private String NOM_DIAG;
    private Date fec_desd;
    private Date fec_hast;
    private Date fec_inic;
    private int cod_conc;
    private int cod_diag;
    private String COD_DIAR;
    private Date fecha_actua;
    private String act_esta;

    public String getNom_empl() {
        return nom_empl;
    }

    public void setNom_empl(String nom_empl) {
        this.nom_empl = nom_empl;
    }

    public String getApe_empl() {
        return ape_empl;
    }

    public void setApe_empl(String ape_empl) {
        this.ape_empl = ape_empl;
    }

    public int getCod_empl() {
        return cod_empl;
    }

    public void setCod_empl(int cod_empl) {
        this.cod_empl = cod_empl;
    }

    public float getNum_dias() {
        return num_dias;
    }

    public void setNum_dias(float num_dias) {
        this.num_dias = num_dias;
    }

    public String getNOM_DIAG() {
        return NOM_DIAG;
    }

    public void setNOM_DIAG(String NOM_DIAG) {
        this.NOM_DIAG = NOM_DIAG;
    }

    public Date getFec_desd() {
        return fec_desd;
    }

    public void setFec_desd(Date fec_desd) {
        this.fec_desd = fec_desd;
    }

    public Date getFec_inic() {
        return fec_inic;
    }

    public void setFec_inic(Date fec_inic) {
        this.fec_inic = fec_inic;
    }

    public int getCod_conc() {
        return cod_conc;
    }

    public void setCod_conc(int cod_conc) {
        this.cod_conc = cod_conc;
    }

    public int getCod_diag() {
        return cod_diag;
    }

    public void setCod_diag(int cod_diag) {
        this.cod_diag = cod_diag;
    }

    public Date getFecha_actua() {
        return fecha_actua;
    }

    public void setFecha_actua(Date fecha_actua) {
        this.fecha_actua = fecha_actua;
    }

    public String getAct_esta() {
        return act_esta;
    }

    public void setAct_esta(String act_esta) {
        this.act_esta = act_esta;
    }

    public Date getFec_hast() {
        return fec_hast;
    }

    public void setFec_hast(Date fec_hast) {
        this.fec_hast = fec_hast;
    }

    public String getCOD_DIAR() {
        return COD_DIAR;
    }

    public void setCOD_DIAR(String COD_DIAR) {
        this.COD_DIAR = COD_DIAR;
    }
   
}
