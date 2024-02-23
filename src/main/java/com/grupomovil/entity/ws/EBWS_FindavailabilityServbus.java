package com.grupomovil.entity.ws;

import java.util.ArrayList;

/**
 *
 * @author jeisson.junco
 */
public class EBWS_FindavailabilityServbus {
public class Employee{
    public String name;
    public String number;
    public String code_tm;
    public String dni;

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

public class Data{
    public Employee employee;
    public String servbus;
    public String time_origin;
    public String tipo_vehiculo;
}

public class ListData{
    public Employee employee;
    public String servbus;
    public String time_origin;
    public String tipo_vehiculo;

        public Employee getEmployee() {
            return employee;
        }

        public void setEmployee(Employee employee) {
            this.employee = employee;
        }

        public String getServbus() {
            return servbus;
        }

        public void setServbus(String servbus) {
            this.servbus = servbus;
        }

        public String getTime_origin() {
            return time_origin;
        }

        public void setTime_origin(String time_origin) {
            this.time_origin = time_origin;
        }

        public String getTipo_vehiculo() {
            return tipo_vehiculo;
        }

        public void setTipo_vehiculo(String tipo_vehiculo) {
            this.tipo_vehiculo = tipo_vehiculo;
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
