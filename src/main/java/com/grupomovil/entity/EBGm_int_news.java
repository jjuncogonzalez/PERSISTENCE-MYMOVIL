package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * NOTICIAS
 * @author Omar.beltran
 */
public class EBGm_int_news implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private int news_id;        //identificador de las noticias
    private byte[] news_ima;    //iamgen que se asocia a la noticia
    private String news_tit;    //Título
    private String news_tex;    //Texto
    private boolean news_tmp;   //noticia temporal
    private Date news_fec_ini;  //fecha de inicio
    private Date news_fec_fin;  //fecha de fin
    private int cat_id;         //identificador de la categoría
    private int ima_id;         //identificador de la imagen
    private boolean news_vis;   //visible S/N
    private int lis_dis_id;     //identificador listas de distribución
    private int usu_cre;
    private Date dat_cre;
    private Date dat_mod;
    private int usu_mod;
    private int nRegistries;

    /**
     * @return the lis_dis_id
     */
    public int getLis_dis_id() {
        return lis_dis_id;
    }

    /**
     * @param lis_dis_id the lis_dis_id to set
     */
    public void setLis_dis_id(int lis_dis_id) {
        this.lis_dis_id = lis_dis_id;
    }

    public int getIma_id() {
        return ima_id;
    }

    public void setIma_id(int ima_id) {
        this.ima_id = ima_id;
    }

    public int getnRegistries() {
        return nRegistries;
    }

    public void setnRegistries(int nRegistries) {
        this.nRegistries = nRegistries;
    }

    public boolean isNews_tmp() {
        return news_tmp;
    }

    public void setNews_tmp(boolean news_tmp) {
        this.news_tmp = news_tmp;
    }

    public int getNews_id() {
        return news_id;
    }

    public void setNews_id(int news_id) {
        this.news_id = news_id;
    }

    public byte[] getNews_ima() {
        return news_ima;
    }

    public void setNews_ima(byte[] news_ima) {
        this.news_ima = news_ima;
    }

    public String getNews_tit() {
        return news_tit;
    }

    public void setNews_tit(String news_tit) {
        this.news_tit = news_tit;
    }

    public String getNews_tex() {
        return news_tex;
    }

    public void setNews_tex(String news_tex) {
        this.news_tex = news_tex;
    }

    public Date getNews_fec_ini() {
        return news_fec_ini;
    }

    public void setNews_fec_ini(Date news_fec_ini) {
        this.news_fec_ini = news_fec_ini;
    }

    public Date getNews_fec_fin() {
        return news_fec_fin;
    }

    public void setNews_fec_fin(Date news_fec_fin) {
        this.news_fec_fin = news_fec_fin;
    }

    public int getCat_id() {
        return cat_id;
    }

    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }

    public boolean isNews_vis() {
        return news_vis;
    }

    public void setNews_vis(boolean news_vis) {
        this.news_vis = news_vis;
    }

    public int getUsu_cre() {
        return usu_cre;
    }

    public void setUsu_cre(int usu_cre) {
        this.usu_cre = usu_cre;
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

    public int getUsu_mod() {
        return usu_mod;
    }

    public void setUsu_mod(int usu_mod) {
        this.usu_mod = usu_mod;
    }

}
