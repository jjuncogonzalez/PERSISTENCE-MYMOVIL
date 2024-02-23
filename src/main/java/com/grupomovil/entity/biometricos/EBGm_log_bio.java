package com.grupomovil.entity.biometricos;

import java.util.Date;

/**
 *
 * @author jeisson.junco
 */
public class EBGm_log_bio {

    private int log_bio_id;
    private String log_bio_tok;
    private String log_bio_ide;
    private String log_bio_men;
    private boolean log_bio_suc;
    private boolean log_bio_pho;
    private Date dat_cre;

    public int getLog_bio_id() {
        return log_bio_id;
    }

    public void setLog_bio_id(int log_bio_id) {
        this.log_bio_id = log_bio_id;
    }

    public String getLog_bio_tok() {
        return log_bio_tok;
    }

    public void setLog_bio_tok(String log_bio_tok) {
        this.log_bio_tok = log_bio_tok;
    }

    public String getLog_bio_ide() {
        return log_bio_ide;
    }

    public void setLog_bio_ide(String log_bio_ide) {
        this.log_bio_ide = log_bio_ide;
    }

    public String getLog_bio_men() {
        return log_bio_men;
    }

    public void setLog_bio_men(String log_bio_men) {
        this.log_bio_men = log_bio_men;
    }

    public boolean isLog_bio_suc() {
        return log_bio_suc;
    }

    public void setLog_bio_suc(boolean log_bio_suc) {
        this.log_bio_suc = log_bio_suc;
    }

    public boolean isLog_bio_pho() {
        return log_bio_pho;
    }

    public void setLog_bio_pho(boolean log_bio_pho) {
        this.log_bio_pho = log_bio_pho;
    }

    public Date getDat_cre() {
        return dat_cre;
    }

    public void setDat_cre(Date dat_cre) {
        this.dat_cre = dat_cre;
    }


   

}
