package com.grupomovil.entity.ws;

/**
 *
 * @author jeisson.junco
 */
public class EBWs_CurrentTask {

    public class Data {

        private String date;
        private String service_vehicle;
        private String time;
        private String task;
        private String vehicle;
        private String stop;
        private int id_task;
        private EBWs_Validator obj_val;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getService_vehicle() {
            return service_vehicle;
        }

        public void setService_vehicle(String service_vehicle) {
            this.service_vehicle = service_vehicle;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getTask() {
            return task;
        }

        public void setTask(String task) {
            this.task = task;
        }

        public String getVehicle() {
            return vehicle;
        }

        public void setVehicle(String vehicle) {
            this.vehicle = vehicle;
        }

        public String getStop() {
            return stop;
        }

        public void setStop(String stop) {
            this.stop = stop;
        }

        public int getId_task() {
            return id_task;
        }

        public void setId_task(int id_task) {
            this.id_task = id_task;
        }

        public EBWs_Validator getObj_val() {
            return obj_val;
        }

        public void setObj_val(EBWs_Validator obj_val) {
            this.obj_val = obj_val;
        }

    }

    private String message;
    private boolean valid;
    private Data data;
    private Object list_data;
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

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Object getList_data() {
        return list_data;
    }

    public void setList_data(Object list_data) {
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
