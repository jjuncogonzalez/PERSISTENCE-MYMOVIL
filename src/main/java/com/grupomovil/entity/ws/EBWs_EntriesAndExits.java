package com.grupomovil.entity.ws;

/**
 * @author Omar.beltran
 */
public class EBWs_EntriesAndExits {
    private String disponibles;
    private String totalentradas;
    private String totalsalidas;
    private String contador;
    private int UF;
    private String fechageneral;
    private String fechainicio;
    private String fechafin;

    public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

    public int getUF() {
        return UF;
    }

    public void setUF(int UF) {
        this.UF = UF;
    }

    public String getFechageneral() {
        return fechageneral;
    }

    public void setFechageneral(String fechageneral) {
        this.fechageneral = fechageneral;
    }
    
    public String getDisponibles() {
        return disponibles;
    }

    public void setDisponibles(String disponibles) {
        this.disponibles = disponibles;
    }

    public String getTotalentradas() {
        return totalentradas;
    }

    public void setTotalentradas(String totalentradas) {
        this.totalentradas = totalentradas;
    }

    public String getTotalsalidas() {
        return totalsalidas;
    }

    public void setTotalsalidas(String totalsalidas) {
        this.totalsalidas = totalsalidas;
    }

    public String getContador() {
        return contador;
    }

    public void setContador(String contador) {
        this.contador = contador;
    }
    
}
