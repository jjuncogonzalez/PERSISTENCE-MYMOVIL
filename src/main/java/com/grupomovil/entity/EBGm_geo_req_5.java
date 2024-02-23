/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupomovil.entity;

/**
 *
 * @author Omar.beltran
 */
public class EBGm_geo_req_5 {

    // Salidas
    private String vehicle;          //VehÍculo (Salida)
    private float BatteryVoltage;    //voltaje de la Batería
    private boolean response;        //Estado
    private String location;         //Ubicación


    /**
     * @return the vehicle out
     */
    public String get_vehicle() {
        return vehicle;
    }

    /**
     * @param vehicle
     */
    public void set_vehicle(String vehicle) {
        this.vehicle = vehicle;
    }
    
    /**
     * @return the Battery Voltage out
     */
    public Float get_BatteryVoltage() {
        return BatteryVoltage;
    }

    /**
     * @param BatteryVoltage
     */
    public void set_BatteryVoltage(Float BatteryVoltage) {
        this.BatteryVoltage = BatteryVoltage;
    }
    
    /**
     * @return the response
     */
    public boolean get_response() {
        return response;
    }

    /**
     * @param response the response to set
     */
    public void set_response(boolean response) {
        this.response = response;
    }
    
    /**
     * @return the location out
     */
    public String get_location() {
        return location;
    }

    /**
     * @param location
     */
    public void set_location(String location) {
        this.location = location;
    }
    
}
