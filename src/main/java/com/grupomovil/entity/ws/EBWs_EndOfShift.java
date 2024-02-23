package com.grupomovil.entity.ws;

import java.util.ArrayList;

/**
 *
 * @author jeisson.junco
 */
public class EBWs_EndOfShift {

public class Data{
    public String employee;
    public int id_task;
    public int id_stop_point;
    public String stop_point;
    public String last_vehicle_checked;
    public String time_destiny;
      private EBWs_Validator obj_val;

        public EBWs_Validator getObj_val() {
            return obj_val;
        }

        public void setObj_val(EBWs_Validator obj_val) {
            this.obj_val = obj_val;
        }

        public String getEmployee() {
            return employee;
        }

        public void setEmployee(String employee) {
            this.employee = employee;
        }

        public int getId_task() {
            return id_task;
        }

        public void setId_task(int id_task) {
            this.id_task = id_task;
        }

        public int getId_stop_point() {
            return id_stop_point;
        }

        public void setId_stop_point(int id_stop_point) {
            this.id_stop_point = id_stop_point;
        }

        public String getStop_point() {
            return stop_point;
        }

        public void setStop_point(String stop_point) {
            this.stop_point = stop_point;
        }

        public String getLast_vehicle_checked() {
            return last_vehicle_checked;
        }

        public void setLast_vehicle_checked(String last_vehicle_checked) {
            this.last_vehicle_checked = last_vehicle_checked;
        }

        public String getTime_destiny() {
            return time_destiny;
        }

        public void setTime_destiny(String time_destiny) {
            this.time_destiny = time_destiny;
        }
    
}

public class ListData{
    public String employee;
    public int id_task;
    public int id_stop_point;
    public String stop_point;
    public String last_vehicle_checked;
    public String time_destiny;

        public String getEmployee() {
            return employee;
        }

        public void setEmployee(String employee) {
            this.employee = employee;
        }

        public int getId_task() {
            return id_task;
        }

        public void setId_task(int id_task) {
            this.id_task = id_task;
        }

        public int getId_stop_point() {
            return id_stop_point;
        }

        public void setId_stop_point(int id_stop_point) {
            this.id_stop_point = id_stop_point;
        }

        public String getStop_point() {
            return stop_point;
        }

        public void setStop_point(String stop_point) {
            this.stop_point = stop_point;
        }

        public String getLast_vehicle_checked() {
            return last_vehicle_checked;
        }

        public void setLast_vehicle_checked(String last_vehicle_checked) {
            this.last_vehicle_checked = last_vehicle_checked;
        }

        public String getTime_destiny() {
            return time_destiny;
        }

        public void setTime_destiny(String time_destiny) {
            this.time_destiny = time_destiny;
        }
    
    
}


    public String message;
    public boolean valid;
    public Data data;
    public ArrayList<ListData> list_data;
    public int status;
    public int id_data;

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

    public int getId_data() {
        return id_data;
    }

    public void setId_data(int id_data) {
        this.id_data = id_data;
    }



}
