package com.grupomovil.entity.ws;

import java.util.ArrayList;

/**
 *
 * @author jeisson.junco
 */
public class EBWs_User {

    public class Employee {

        private String name;
        private String number;
        private String code_tm;
        private String dni;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getCode_tm() {
            return code_tm;
        }

        public void setCode_tm(String code_tm) {
            this.code_tm = code_tm;
        }

        public String getDni() {
            return dni;
        }

        public void setDni(String dni) {
            this.dni = dni;
        }

    }

    public class FuntionalUnit {

        private int id;
        private String name;
        private String description;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

    }

    public class Data {

        private Employee employee;
        private ArrayList<String> role;
        private FuntionalUnit funtional_unit;
        private EBWs_Validator obj_val;

        public Employee getEmployee() {
            return employee;
        }

        public void setEmployee(Employee employee) {
            this.employee = employee;
        }

        public ArrayList<String> getRole() {
            return role;
        }

        public void setRole(ArrayList<String> role) {
            this.role = role;
        }

        public FuntionalUnit getFuntional_unit() {
            return funtional_unit;
        }

        public void setFuntional_unit(FuntionalUnit funtional_unit) {
            this.funtional_unit = funtional_unit;
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
