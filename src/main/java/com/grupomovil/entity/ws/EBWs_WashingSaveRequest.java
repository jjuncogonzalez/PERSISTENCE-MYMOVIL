package com.grupomovil.entity.ws;

/**
 *
 * @author jeisson.junco
 */
public class EBWs_WashingSaveRequest {

    private String vehicle;
    private int id_service_type;
    private int id_reason;
    private Boolean force;
    private String description;
    private Long date_time;
    private String username;

    public Long getDate_time() {
        return date_time;
    }

    public void setDate_time(Long date_time) {
        this.date_time = date_time;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public int getId_service_type() {
        return id_service_type;
    }

    public void setId_service_type(int id_service_type) {
        this.id_service_type = id_service_type;
    }

    public int getId_reason() {
        return id_reason;
    }

    public void setId_reason(int id_reason) {
        this.id_reason = id_reason;
    }

    public Boolean getForce() {
        return force;
    }

    public void setForce(Boolean force) {
        this.force = force;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
