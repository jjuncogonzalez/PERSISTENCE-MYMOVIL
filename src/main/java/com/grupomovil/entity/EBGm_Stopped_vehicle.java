package com.grupomovil.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Omar.beltran
 */
public class EBGm_Stopped_vehicle implements Serializable{
    private static final long serialVersionUID = 1L;

    private String _VehicleTimestamp;
    private String _Vehicle;
    private String _Status;

    public String get_VehicleTimestamp() {
        return _VehicleTimestamp;
    }

    public void set_VehicleTimestamp(String _VehicleTimestamp) {
        this._VehicleTimestamp = _VehicleTimestamp;
    }

    public String get_Vehicle() {
        return _Vehicle;
    }

    public void set_Vehicle(String _Vehicle) {
        this._Vehicle = _Vehicle;
    }

    public String get_Status() {
        return _Status;
    }

    public void set_Status(String _Status) {
        this._Status = _Status;
    }

   
}
