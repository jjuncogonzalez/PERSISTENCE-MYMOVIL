package com.grupomovil.entity.ws;

import java.util.ArrayList;



/**
 *
 * @author jeisson.junco
 */
public class EBWs_OpenedSpecial {

public class ListData{
    private int id;
    private String date_time;
    private String code_vehicle;
    private String service_type;
    private String reason;
    private String description_reason;
    private String user_do;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDate_time() {
            return date_time;
        }

        public void setDate_time(String date_time) {
            this.date_time = date_time;
        }

        public String getCode_vehicle() {
            return code_vehicle;
        }

        public void setCode_vehicle(String code_vehicle) {
            this.code_vehicle = code_vehicle;
        }

        public String getService_type() {
            return service_type;
        }

        public void setService_type(String service_type) {
            this.service_type = service_type;
        }

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }

        public String getDescription_reason() {
            return description_reason;
        }

        public void setDescription_reason(String description_reason) {
            this.description_reason = description_reason;
        }

        public String getUser_do() {
            return user_do;
        }

        public void setUser_do(String user_do) {
            this.user_do = user_do;
        }
    
}


    private String message;
    private boolean valid;
    private Object data;
    private ArrayList<ListData> list_data;
    private int status;
    private Object id_data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ArrayList<ListData> getList_data() {
        return list_data;
    }

    public void setList_data(ArrayList<ListData> list_data) {
        this.list_data = list_data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Object getId_data() {
        return id_data;
    }

    public void setId_data(Object id_data) {
        this.id_data = id_data;
    }


}
    
       

