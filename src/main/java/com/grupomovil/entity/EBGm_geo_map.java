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
public class EBGm_geo_map {
    
    // Geo
    private int tm_sig_id;          //ID Señal
    private int AxleWeightTotal;    //Peso en los ejes
    private int TotalDistance;      //Kilometraje
    private int TotalFuelUsed;      //Combustible
    private int EngineCoolantTemp;  //Temperatura del motor
    private int FuelLevel;          //Nivel de Combustible
    private float BatteryVoltage;   //Voltaje de la bataria
    private int tm_eve_id;          //ID Event
    private String tm_date_diff;    //Diferencia tiempo
    private float Speed;            //Velocidad
    private String EventType;       //Tipo de evento
    private float Latitude;         //Latitud
    private float Longitude;        //Longitud
    private Date VehicleTimestamp;  //Fecha del evento
    private String date;            //Solamente fecha del evento
    private String hour;            //Solamente hora del evento
    private int Polygon;            //Poligono
    private int tm_veh_id;          //ID Vehículo
    private String tm_com_ide;      //Vehículo
    private String tm_veh_lic;      //Placa del vehículo
    private int tm_veh_typ;         //Tipo de vehículo
    
    // Rigel
    private String fecha_pro;          //Fecha de programación
    private String time_origin;       //Hora Origen
    private String time_destiny;      //Hora Destino
    private String codigo;          //Vehículo
    private int id_tarea;           //Id de la ruta
    private String tarea;           //Ruta
    private int codigo_tm;          //Código de transmilenio
    private String conductor;       //Oprador / Conductor
    private Date hora_inicial;      //Hora de inicio
    private String servbus;         //Servbus
    
    // Entradas
    private String vehicle;         //Vehiculo a filtrar

    /**
     * @return the tm_sig_id
     */
    public int get_tm_sig_id() {
        return tm_sig_id;
    }

    /**
     * @param tm_sig_id the tm_sig_id to set
     */
    public void set_tm_sig_id(int tm_sig_id) {
        this.tm_sig_id = tm_sig_id;
    }

    /**
     * @return the AxleWeightTotal
     */
    public int get_AxleWeightTotal() {
        return AxleWeightTotal;
    }

    /**
     * @param AxleWeightTotal the AxleWeightTotal to set
     */
    public void set_AxleWeightTotal(int AxleWeightTotal) {
        this.AxleWeightTotal = AxleWeightTotal;
    }

    /**
     * @return the TotalDistance
     */
    public int get_TotalDistance() {
        return TotalDistance;
    }

    /**
     * @param TotalDistance the TotalDistance to set
     */
    public void set_TotalDistance(int TotalDistance) {
        this.TotalDistance = TotalDistance;
    }

    /**
     * @return the TotalFuelUsed
     */
    public int get_TotalFuelUsed() {
        return TotalFuelUsed;
    }

    /**
     * @param TotalFuelUsed the TotalFuelUsed to set
     */
    public void set_TotalFuelUsed(int TotalFuelUsed) {
        this.TotalFuelUsed = TotalFuelUsed;
    }

    /**
     * @return the EngineCoolantTemp
     */
    public int get_EngineCoolantTemp() {
        return EngineCoolantTemp;
    }

    /**
     * @param EngineCoolantTemp the EngineCoolantTemp to set
     */
    public void set_EngineCoolantTemp(int EngineCoolantTemp) {
        this.EngineCoolantTemp = EngineCoolantTemp;
    }

    /**
     * @return the FuelLevel
     */
    public int get_FuelLevel() {
        return FuelLevel;
    }

    /**
     * @param FuelLevel the FuelLevel to set
     */
    public void set_FuelLevel(int FuelLevel) {
        this.FuelLevel = FuelLevel;
    }

    /**
     * @return the BatteryVoltage
     */
    public Float get_BatteryVoltage() {
        return BatteryVoltage;
    }

    /**
     * @param BatteryVoltage the BatteryVoltage to set
     */
    public void set_BatteryVoltage(Float BatteryVoltage) {
        this.BatteryVoltage = BatteryVoltage;
    }
    
    /**
     * @return the tm_eve_id
     */
    public int get_tm_eve_id() {
        return tm_eve_id;
    }

    /**
     * @param tm_eve_id the tm_eve_id to set
     */
    public void set_tm_eve_id(int tm_eve_id) {
        this.tm_eve_id = tm_eve_id;
    }

    /**
     * @return the tm_date_diff
     */
    public String get_tm_date_diff() {
        return tm_date_diff;
    }

    /**
     * @param tm_date_diff the tm_date_diff to set
     */
    public void set_tm_date_diff(String tm_date_diff) {
        this.tm_date_diff = tm_date_diff;
    }

    /**
     * @return the Speed
     */
    public Float get_Speed() {
        return Speed;
    }

    /**
     * @param Speed the Speed to set
     */
    public void set_Speed(Float Speed) {
        this.Speed = Speed;
    }

    /**
     * @return the EventType
     */
    public String get_EventType() {
        return EventType;
    }

    /**
     * @param EventType the EventType to set
     */
    public void set_EventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * @return the Latitude
     */
    public Float get_Latitude() {
        return Latitude;
    }

    /**
     * @param Latitude the Latitude to set
     */
    public void set_Latitude(Float Latitude) {
        this.Latitude = Latitude;
    }

    /**
     * @return the Longitude
     */
    public Float get_Longitude() {
        return Longitude;
    }

    /**
     * @param Longitude the Longitude to set
     */
    public void set_Longitude(Float Longitude) {
        this.Longitude = Longitude;
    }

    /**
     * @return the VehicleTimestamp
     */
    public Date get_VehicleTimestamp() {
        return VehicleTimestamp;
    }

    /**
     * @param VehicleTimestamp the VehicleTimestamp to set
     */
    public void set_VehicleTimestamp(Date VehicleTimestamp) {
        this.VehicleTimestamp = VehicleTimestamp;
    }

    /**
     * @return the date
     */
    public String get_date() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void set_date(String date) {
        this.date = date;
    }

    /**
     * @return the hour
     */
    public String get_hour() {
        return hour;
    }

    /**
     * @param hour the hour to set
     */
    public void set_hour(String hour) {
        this.hour = hour;
    }

    /**
     * @return the Polygon
     */
    public int get_Polygon() {
        return Polygon;
    }

    /**
     * @param Polygon the Polygon to set
     */
    public void set_Polygon(int Polygon) {
        this.Polygon = Polygon;
    }

    /**
     * @return the tm_veh_id
     */
    public int get_tm_veh_id() {
        return tm_veh_id;
    }

    /**
     * @param tm_veh_id the tm_veh_id to set
     */
    public void set_tm_veh_id(int tm_veh_id) {
        this.tm_veh_id = tm_veh_id;
    }

    /**
     * @return the tm_com_ide
     */
    public String get_tm_com_ide() {
        return tm_com_ide;
    }

    /**
     * @param tm_com_ide the tm_com_ide to set
     */
    public void set_tm_com_ide(String tm_com_ide) {
        this.tm_com_ide = tm_com_ide;
    }

    /**
     * @return the tm_veh_lic
     */
    public String get_tm_veh_lic() {
        return tm_veh_lic;
    }

    /**
     * @param tm_veh_lic the tm_veh_lic to set
     */
    public void set_tm_veh_lic(String tm_veh_lic) {
        this.tm_veh_lic = tm_veh_lic;
    }

    /**
     * @return the tm_veh_typ
*
     */
    public int get_tm_veh_typ() {
        return tm_veh_typ;
    }

    /**
     * @param tm_veh_typ the tm_veh_typ to set
     */
    public void set_tm_veh_typ(int tm_veh_typ) {
        this.tm_veh_typ = tm_veh_typ;
    }
    
    // Rigel
    
    /**
     * @return the date_pro
     */
    public String get_fecha_pro() {
        return fecha_pro;
    }

    /**
     * @param fecha_pro
     */
    public void set_fecha_pro(String fecha_pro) {
        this.fecha_pro = fecha_pro;
    }
    
    /**
     * @return the time_origin
     */
    public String get_time_origin() {
        return time_origin;
    }

    /**
     * @param time_origin
     */
    public void set_time_origin(String time_origin) {
        this.time_origin = time_origin;
    }
    
    /**
     * @return the time_destiny
     */
    public String get_time_destiny() {
        return time_destiny;
    }

    /**
     * @param time_destiny
     */
    public void set_time_destiny(String time_destiny) {
        this.time_destiny = time_destiny;
    }
    
    /**
     * @return the codigo
     */
    public String get_codigo() {
        return codigo;
    }

    /**
     * @param codigo
     */
    public void set_codigo(String codigo) {
        this.codigo = codigo;
    }
    
    /**
     * @return the id_tarea
     */
    public int get_id_tarea() {
        return id_tarea;
    }

    /**
     * @param id_tarea
     */
    public void set_id_tarea(int id_tarea) {
        this.id_tarea = id_tarea;
    }
    
    /**
     * @return the tarea
     */
    public String get_tarea() {
        return tarea;
    }

    /**
     * @param tarea
     */
    public void set_tarea(String tarea) {
        this.tarea = tarea;
    }
    
    /**
     * @return the codigo_tm
     */
    public int get_codigo_tm() {
        return codigo_tm;
    }

    /**
     * @param codigo_tm
     */
    public void set_codigo_tm(int codigo_tm) {
        this.codigo_tm = codigo_tm;
    }

    /**
     * @return the conductor
     */
    public String get_conductor() {
        return conductor;
    }

    /**
     * @param conductor the conductor to set
     */
    public void set_conductor(String conductor) {
        this.conductor = conductor;
    }
    
    /**
     * @return the hora_inicial
     */
    public Date get_hora_inicial() {
        return hora_inicial;
    }

    /**
     * @param hora_inicial
     */
    public void set_hora_inicial(Date hora_inicial) {
        this.hora_inicial = hora_inicial;
    }
    
    /**
     * @return the servbus
     */
    public String get_servbus() {
        return servbus;
    }

    /**
     * @param servbus
     */
    public void set_servbus(String servbus) {
        this.servbus = servbus;
    }
    
    // Input params
    
    /**
     * @return the vehicle
     */
    public String get_vehicle() {
        return vehicle;
    }

    /**
     * @param vehicle the vehicle to set
     */
    public void set_vehicle(String vehicle) {
        this.vehicle = vehicle;
    }
    
}
