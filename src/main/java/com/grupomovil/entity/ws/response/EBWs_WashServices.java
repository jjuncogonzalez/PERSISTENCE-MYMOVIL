package com.grupomovil.entity.ws.response;

import java.util.ArrayList;

/**
 *
 * @author jeisson.junco
 */
public class EBWs_WashServices {

   public class ListDatos{
    private int id;
    private String date_time;
    private String code_vehicle;
    private String id_service_type;
    private String reason;
    private String description;
    private String user_do;
    private String date_time_closed;
    private String user_closed;

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

        public String getId_service_type() {
            return id_service_type;
        }

        public void setId_service_type(String id_service_type) {
            this.id_service_type = id_service_type;
        }

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getUser_do() {
            return user_do;
        }

        public void setUser_do(String user_do) {
            this.user_do = user_do;
        }

        public String getDate_time_closed() {
            return date_time_closed;
        }

        public void setDate_time_closed(String date_time_closed) {
            this.date_time_closed = date_time_closed;
        }

        public String getUser_closed() {
            return user_closed;
        }

        public void setUser_closed(String user_closed) {
            this.user_closed = user_closed;
        }
    
    
    
}
 public int counter_false;
   public int counter_true;
    public String message;
    public boolean valid;
    public Object data;
    public ArrayList<ListDatos> list_data;

    public int getCounter_false() {
        return counter_false;
    }

    public void setCounter_false(int counter_false) {
        this.counter_false = counter_false;
    }

    public int getCounter_true() {
        return counter_true;
    }

    public void setCounter_true(int counter_true) {
        this.counter_true = counter_true;
    }

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

    public ArrayList<ListDatos> getList_data() {
        return list_data;
    }

    public void setList_data(ArrayList<ListDatos> list_data) {
        this.list_data = list_data;
    }

}

