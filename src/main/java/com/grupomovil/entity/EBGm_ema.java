package com.grupomovil.entity;

import java.io.Serializable;

/**
 * Entidad de correo
 *
 * @author jeisson.junco
 */
public class EBGm_ema implements Serializable {

    private static final long serialVersionUID = 1L;

    private String to;
    private String emailto;
    private String cc;
    private String cco;
    private String subject;
    private String message;

    public EBGm_ema() {
        cc = null;
        cco = null;
        to = null;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getEmailto() {
        return emailto;
    }

    public void setEmailto(String emailto) {
        this.emailto = emailto;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getCco() {
        return cco;
    }

    public void setCco(String cco) {
        this.cco = cco;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
