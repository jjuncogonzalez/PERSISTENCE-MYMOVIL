package com.grupomovil.entity.ws;

/**
 *
 * @author jeisson.junco
 */
public class EBWs_ConfirmDepotEntryRequest {
    private Long date_time;
    private int id_task;
    private String code_vehicle;

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

    public String getCode_vehicle() {
        return code_vehicle;
    }

    public void setCode_vehicle(String code_vehicle) {
        this.code_vehicle = code_vehicle;
    }
    
    
    
}
