package com.grupomovil.entity.ws;

import java.util.ArrayList;



/**
 *
 * @author jeisson.junco
 */
public class EBWs_FindCheckListDamageByEmployee {
// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString), Root.class); */
public class Fail{
    public int id_check_det;
    public String component_fails;
    public String component;
    public boolean status;
    public String description;
}

public class Data{
    public int id_check_up;
    public String vehicle;
    public String employee;
    public String date_time;
    public ArrayList<Fail> fails;

        public int getId_check_up() {
            return id_check_up;
        }

        public void setId_check_up(int id_check_up) {
            this.id_check_up = id_check_up;
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

        public String getDate_time() {
            return date_time;
        }

        public void setDate_time(String date_time) {
            this.date_time = date_time;
        }

        public ArrayList<Fail> getFails() {
            return fails;
        }

        public void setFails(ArrayList<Fail> fails) {
            this.fails = fails;
        }
    
}

public class ListData{
    public int id_check_up;
    public String vehicle;
    public String employee;
    public String date_time;
    public ArrayList<Fail> fails;

        public int getId_check_up() {
            return id_check_up;
        }

        public void setId_check_up(int id_check_up) {
            this.id_check_up = id_check_up;
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

        public String getDate_time() {
            return date_time;
        }

        public void setDate_time(String date_time) {
            this.date_time = date_time;
        }

        public ArrayList<Fail> getFails() {
            return fails;
        }

        public void setFails(ArrayList<Fail> fails) {
            this.fails = fails;
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
    
       

