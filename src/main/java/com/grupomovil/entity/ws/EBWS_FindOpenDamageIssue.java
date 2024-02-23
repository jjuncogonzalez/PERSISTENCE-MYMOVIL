package com.grupomovil.entity.ws;

import java.util.ArrayList;

/**
 *
 * @author jeisson.junco
 */
public class EBWS_FindOpenDamageIssue {
public class ListData{
    public int id_check_det;
    public String vehicle;
    public String employee;
    public String description;

        public int getId_check_det() {
            return id_check_det;
        }

        public void setId_check_det(int id_check_det) {
            this.id_check_det = id_check_det;
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

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    
}


    public String message;
    public boolean valid;
    public Object data;
    public ArrayList<ListData> list_data;
    public int status;
    public Object id_data;

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
