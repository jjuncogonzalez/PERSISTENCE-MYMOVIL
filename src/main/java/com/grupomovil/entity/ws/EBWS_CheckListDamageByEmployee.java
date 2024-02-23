package com.grupomovil.entity.ws;

import java.util.List;

/**
 *
 * @author jeisson.junco
 */
public class EBWS_CheckListDamageByEmployee {

    public class Fail {

        private int id_check_det;
        private String component_fails;
        private String component;
        private boolean status;
        private Object description;

        public int getId_check_det() {
            return id_check_det;
        }

        public void setId_check_det(int id_check_det) {
            this.id_check_det = id_check_det;
        }

        public String getComponent_fails() {
            return component_fails;
        }

        public void setComponent_fails(String component_fails) {
            this.component_fails = component_fails;
        }

        public String getComponent() {
            return component;
        }

        public void setComponent(String component) {
            this.component = component;
        }

        public boolean isStatus() {
            return status;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }

        public Object getDescription() {
            return description;
        }

        public void setDescription(Object description) {
            this.description = description;
        }

    }

    public class Data {

        private int id_check_up;
        private String vehicle;
        private String employee;
        private String date_time;
        private List<Fail> fails;
        private EBWs_Validator obj_val;

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

        public List<Fail> getFails() {
            return fails;
        }

        public void setFails(List<Fail> fails) {
            this.fails = fails;
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
