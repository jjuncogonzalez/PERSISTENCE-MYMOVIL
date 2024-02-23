package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Omar.beltran
 */
public class EBGm_Vehicles_yard implements Serializable{
    private static final long serialVersionUID = 1L;

    private String _Latitude;
    private String _Longitude;
    private String _Vehicle;
    private String _VehicleTimestamp;

    public String get_Latitude() {
        return _Latitude;
    }

    public void set_Latitude(String _Latitude) {
        this._Latitude = _Latitude;
    }

    public String get_Longitude() {
        return _Longitude;
    }

    public void set_Longitude(String _Longitude) {
        this._Longitude = _Longitude;
    }

    public String get_Vehicle() {
        return _Vehicle;
    }

    public void set_Vehicle(String _Vehicle) {
        this._Vehicle = _Vehicle;
    }

    public String get_VehicleTimestamp() {
        return _VehicleTimestamp;
    }

    public void set_VehicleTimestamp(String _VehicleTimestamp) {
        this._VehicleTimestamp = _VehicleTimestamp;
    }

    
    
}
