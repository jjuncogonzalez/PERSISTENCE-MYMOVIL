package com.grupomovil.entity.parking;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Omar.beltran
 * se emplea para castear la coleccion de objetos que se trae del servicio
 * que se consume en la URL http://service.grupomovil.com.co:3000/parking/all
 */
public class EBGm_par_cast implements Serializable {
    private String id;
    private String placa;
    private String tipo_vehiculo;
    private String color;
    private String id_Responsable;
    private String nombre_responsable;
    private String compania;
    private String contacto;
    private String patio;
    private Date ingreso;
    private Date salida;
    private String observacion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    public void setTipo_vehiculo(String tipo_vehiculo) {
        this.tipo_vehiculo = tipo_vehiculo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getId_Responsable() {
        return id_Responsable;
    }

    public void setId_Responsable(String id_Responsable) {
        this.id_Responsable = id_Responsable;
    }

    public String getNombre_responsable() {
        return nombre_responsable;
    }

    public void setNombre_responsable(String nombre_responsable) {
        this.nombre_responsable = nombre_responsable;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getPatio() {
        return patio;
    }

    public void setPatio(String patio) {
        this.patio = patio;
    }

    public Date getIngreso() {
        return ingreso;
    }

    public void setIngreso(Date ingreso) {
        this.ingreso = ingreso;
    }

    public Date getSalida() {
        return salida;
    }

    public void setSalida(Date salida) {
        this.salida = salida;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    
}
