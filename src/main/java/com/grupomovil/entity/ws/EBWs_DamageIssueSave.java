package com.grupomovil.entity.ws;

/**
 *
 * @author jeisson.junco
 */
public class EBWs_DamageIssueSave {

    private String date_time;
    private String vehicle;
    private String employee;
    private int id_component;
    private int id_demage_component;
    private int id_severity;
    private String description;
    private String username;

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public int getId_component() {
        return id_component;
    }

    public void setId_component(int id_component) {
        this.id_component = id_component;
    }

    public int getId_demage_component() {
        return id_demage_component;
    }

    public void setId_demage_component(int id_demage_component) {
        this.id_demage_component = id_demage_component;
    }

    public int getId_severity() {
        return id_severity;
    }

    public void setId_severity(int id_severity) {
        this.id_severity = id_severity;
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
