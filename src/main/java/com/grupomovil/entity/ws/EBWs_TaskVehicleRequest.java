package com.grupomovil.entity.ws;

/**
 *
 * @author jeisson.junco
 */
public class EBWs_TaskVehicleRequest {
    public int id_task;
    public Long date_time;
    public String old_code_vehicle;
    public String new_code_vehicle;
    public int id_system;
    public String observation;
    public String username;

    public Long getDate_time() {
        return date_time;
    }

    public void setDate_time(Long date_time) {
        this.date_time = date_time;
    }

    public int getId_task() {
        return id_task;
    }

    public void setId_task(int id_task) {
        this.id_task = id_task;
    }



    public String getOld_code_vehicle() {
        return old_code_vehicle;
    }

    public void setOld_code_vehicle(String old_code_vehicle) {
        this.old_code_vehicle = old_code_vehicle;
    }

    public String getNew_code_vehicle() {
        return new_code_vehicle;
    }

    public void setNew_code_vehicle(String new_code_vehicle) {
        this.new_code_vehicle = new_code_vehicle;
    }

    public int getId_system() {
        return id_system;
    }

    public void setId_system(int id_system) {
        this.id_system = id_system;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
}
