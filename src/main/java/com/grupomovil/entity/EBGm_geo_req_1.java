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
public class EBGm_geo_req_1 {

    private float Latitude;         //Latitud
    private float Longitude;        //Longitud
    private Date VehicleTimestamp;  //Fecha del evento
    private float BatteryVoltage;   //Voltaje de la bataria
    
    // Entradas
    private String vehicle;         //Vehiculo a filtrar


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
