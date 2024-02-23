/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupomovil.entity;

import java.util.Date;

/**
 *
 * @author Omar.beltran
 */
public class EBGm_geo_rigel {
    
    // Output Params
    private String fecha;           //Fecha de programación
    private String time_origin;     //Hora Origen
    private String time_destiny;    //Hora Destino
    private String codigo;          //Vehículo
    private int id_tarea;           //Id de la ruta
    private String tarea;           //Ruta
    private int codigo_tm;          //Código de transmilenio
    private String nombres;         //Oprador / Nombres
    private String apellidos;       //Oprador / Apellidos
    private String conductor;       //Oprador / Conductor
    private Date hora_inicial;      //Hora de inicio
    private String servbus;         //Servbus
    
    // Input Params
    private String ev_date;        //Fecha del evento
    private String hour;           //Fecha del evento
    private String vehicle;        //Vehiculo a filtrar

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTime_origin() {
        return time_origin;
    }

    public void setTime_origin(String time_origin) {
        this.time_origin = time_origin;
    }

    public String getTime_destiny() {
        return time_destiny;
    }

    public void setTime_destiny(String time_destiny) {
        this.time_destiny = time_destiny;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getId_tarea() {
        return id_tarea;
    }

    public void setId_tarea(int id_tarea) {
        this.id_tarea = id_tarea;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public int getCodigo_tm() {
        return codigo_tm;
    }

    public void setCodigo_tm(int codigo_tm) {
        this.codigo_tm = codigo_tm;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public Date getHora_inicial() {
        return hora_inicial;
    }

    public void setHora_inicial(Date hora_inicial) {
        this.hora_inicial = hora_inicial;
    }

    public String getServbus() {
        return servbus;
    }

    public void setServbus(String servbus) {
        this.servbus = servbus;
    }

    public String getEv_date() {
        return ev_date;
    }

    public void setEv_date(String ev_date) {
        this.ev_date = ev_date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }
    
}
