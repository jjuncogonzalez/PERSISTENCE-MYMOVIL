package com.grupomovil.entity.ws;

import java.util.List;

/**
 *
 * @author jeisson.junco
 */
public class EBWs_Vehicle {

    public class ListData {

        private int id_task;
        private String code_vehicle;
        private String stop_from;
        private String time_origin;
        private String stop_to;
        private String time_destiny;

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

        public String getStop_from() {
            return stop_from;
        }

        public void setStop_from(String stop_from) {
            this.stop_from = stop_from;
        }

        public String getTime_origin() {
            return time_origin;
        }

        public void setTime_origin(String time_origin) {
            this.time_origin = time_origin;
        }

        public String getStop_to() {
            return stop_to;
        }

        public void setStop_to(String stop_to) {
            this.stop_to = stop_to;
        }

        public String getTime_destiny() {
            return time_destiny;
        }

        public void setTime_destiny(String time_destiny) {
            this.time_destiny = time_destiny;
        }

    }

    private String message;
    private boolean valid;
    private Object data;
    private List<ListData> list_data;
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

    public List<ListData> getList_data() {
        return list_data;
    }

    public void setList_data(List<ListData> list_data) {
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
