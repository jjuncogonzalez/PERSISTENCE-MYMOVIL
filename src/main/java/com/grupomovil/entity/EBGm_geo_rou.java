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
public class EBGm_geo_rou {
    
    private int tm_eve_id;          //ID Event
    private Date VehicleTimestamp;  //Fecha del evento
    private String EventType;       //Tipo de evento
    private int TotalDistance;      //Kilometraje
    private float FuelConsumption;  //Consumo de Combustible
    private int FuelLevel;          //Nivel de Combustible
    private float Speed;            //Velocidad
    private float Latitude;         //Latitud
    private float Longitude;        //Longitud
    private int Polygon;            //Poligono
    private String vehicle;         //Vehiculo a filtrar
    
    // Input Param
    private Date dateStart;         //Fecha del evento
    private Date dateEnd;           //Fecha del evento
    private String dataVehicle;     //Vehiculo a filtrar
    
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
     * @return the BatteryVoltage
     */
    public Float get_FuelConsumption() {
        return FuelConsumption;
    }

    /**
     * @param BatteryVoltage the BatteryVoltage to set
     */
    public void set_FuelConsumption(Float FuelConsumption) {
        this.FuelConsumption = FuelConsumption;
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
    
    // Input Params
    
    /**
     * @return the dateStart
     */
    public Date get_dateStart() {
        return dateStart;
    }
    
    /**
     * @param dateStart the dateStart to set
     */
    public void set_dateStart(Date dateStart) {
        this.dateStart = dateStart;
    }
    
    /**
     * @return the dateEnd
     */
    public Date get_dateEnd() {
        return dateEnd;
    }

    /**
     * @param dateEnd the dateEnd to set
     */
    public void set_dateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }
    
    /**
     * @return the dataVehicle
     */
    public String get_dataVehicle() {
        return dataVehicle;
    }

    /**
     * @param dataVehicle the dataVehicle to set
     */
    public void set_dataVehicle(String dataVehicle) {
        this.dataVehicle = dataVehicle;
    }
    
}
