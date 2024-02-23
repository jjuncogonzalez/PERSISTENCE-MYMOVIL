/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupomovil.entity.biometricos;

import java.util.Date;

/**
 *
 * @author julian.arevalo
 */
public class EBGm_wor_day_acc_level {
    
    int idGenericaJornada;
    Date fecha;
    String identificacion;
    String tipoHorario; 
    
    //Filtros
    Date fechaInicio;
    Date fechaFin;
    int area;

    public int getIdGenericaJornada() {
        return idGenericaJornada;
    }

    public void setIdGenericaJornada(int idGenericaJornada) {
        this.idGenericaJornada = idGenericaJornada;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTipoHorario() {
        return tipoHorario;
    }

    public void setTipoHorario(String tipoHorario) {
        this.tipoHorario = tipoHorario;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
    
}
