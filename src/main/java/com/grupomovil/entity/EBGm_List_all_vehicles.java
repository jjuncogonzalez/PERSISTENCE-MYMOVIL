package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Omar.beltran
 */
public class EBGm_List_all_vehicles implements Serializable{
    private static final long serialVersionUID = 1L;

    private String _BatteryCharge;
    private String _location;
    private Boolean _response;
    private String _vehicle;

    public String get_BatteryCharge() {
        return _BatteryCharge;
    }

    public void set_BatteryCharge(String _BatteryCharge) {
        this._BatteryCharge = _BatteryCharge;
    }
    
    public String get_location() {
        return _location;
    }

    public void set_location(String _location) {
        this._location = _location;
    }

    public Boolean get_response() {
        return _response;
    }

    public void set_response(Boolean _response) {
        this._response = _response;
    }

    public String get_vehicle() {
        return _vehicle;
    }

    public void set_vehicle(String _vehicle) {
        this._vehicle = _vehicle;
    }
    
}
