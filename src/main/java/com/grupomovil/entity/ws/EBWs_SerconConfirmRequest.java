package com.grupomovil.entity.ws;

/**
 *
 * @author jeisson.junco
 */
public class EBWs_SerconConfirmRequest {
    
    private int id_stop;
    private String code;
    private Long date;
    private int id_task;

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public int getId_stop() {
        return id_stop;
    }

    public void setId_stop(int id_stop) {
        this.id_stop = id_stop;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }



    public int getId_task() {
        return id_task;
    }

    public void setId_task(int id_task) {
        this.id_task = id_task;
    }

   
    
}
