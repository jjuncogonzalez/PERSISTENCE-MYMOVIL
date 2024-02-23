package com.grupomovil.entity;

/**
 * @author Omar.beltran
 */
public class EntityCounterBus {

    private int total;
    private int confirmado;
    private int entryConfirm;
    private int exitConfirm;
    private int depotentry;
    private int depotexit;
    private String fecha;
    private int UF;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getConfirmado() {
        return confirmado;
    }

    public void setConfirmado(int confirmado) {
        this.confirmado = confirmado;
    }

    public int getEntryConfirm() {
        return entryConfirm;
    }

    public void setEntryConfirm(int entryConfirm) {
        this.entryConfirm = entryConfirm;
    }

    public int getExitConfirm() {
        return exitConfirm;
    }

    public void setExitConfirm(int exitConfirm) {
        this.exitConfirm = exitConfirm;
    }

    public int getDepotentry() {
        return depotentry;
    }

    public void setDepotentry(int depotentry) {
        this.depotentry = depotentry;
    }

    public int getDepotexit() {
        return depotexit;
    }

    public void setDepotexit(int depotexit) {
        this.depotexit = depotexit;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getUF() {
        return UF;
    }

    public void setUF(int UF) {
        this.UF = UF;
    }
    
}
