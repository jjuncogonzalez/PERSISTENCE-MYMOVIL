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
public class EBGm_geo_req_2 {

    private String Vehicle;      //Vehículo
    private String EventType;       //EventType
    private String Status;          //Status
    private Date VehicleTimestamp;  //Fecha del evento
    private Date Now;               //Fecha actual
    
    // Entradas
    private Integer minutes;         //Minutos a filtrar

    /**
     * @return the tm_com_ide
     */
    public String get_Vehicle() {
        return Vehicle;
    }

    /**
     * @param tm_com_ide the tm_com_ide to set
     */
    public void set_Vehicle(String Vehicle) {
        this.Vehicle = Vehicle;
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
     * @return the Status
     */
    public String get_Status() {
        return Status;
    }

    /**
     * @param Status the Status to set
     */
    public void set_Status(String Status) {
        this.Status = Status;
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
     * @return the VehicleTimestamp
     */
    public Date get_Now() {
        return Now;
    }

    /**
     * @param VehicleTimestamp the VehicleTimestamp to set
     */
    public void set_Now(Date Now) {
        this.Now = Now;
    }
    
    /**
     * @return the minutes
     */
    public Integer get_minutes() {
        return minutes;
    }

    /**
     * @param minutes the minutes to set
     */
    public void set_minutes(Integer minutes) {
        this.minutes = minutes;
    }
    
}
