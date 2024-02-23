package com.grupomovil.entity.ws;

/**
 *
 * @author jeisson.junco
 */
public class EBWs_CurrentServiceVehicle {

    public class Employye {

        public String name;
        public String number;
        public String code_tm;

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

    }

    public class Data {

        public Employye employye;
        public String route;

        public Employye getEmployye() {
            return employye;
        }

        public void setEmployye(Employye employye) {
            this.employye = employye;
        }

        public String getRoute() {
            return route;
        }

        public void setRoute(String route) {
            this.route = route;
        }

    }

    public String message;
    public boolean valid;
    public Data data;
    public Object list_data;
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
