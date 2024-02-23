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
public class EBGm_geo_req_4 {
    
    private float Latitude;         //Latitud
    private float Longitude;        //Longitud
    private Date VehicleTimestamp;  //Fecha del evento
    private String Vehicle;         //Vehiculo
    
    // Entradas
    private Integer yard;               //Patio a filtrar
    
    
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
     * @return the vehicle
     */
    public String get_Vehicle() {
        return Vehicle;
    }
    
    /**
     * @param vehicle the vehicle to set
     */
    public void set_Vehicle(String Vehicle) {
        this.Vehicle = Vehicle;
    }
    
    /**
     * @return the yard
     */
    public Integer get_yard() {
        return yard;
    }
    
    /**
     * @param yard the yard to set
     */
    public void set_yard(Integer yard) {
        this.yard = yard;
    }
    
}
