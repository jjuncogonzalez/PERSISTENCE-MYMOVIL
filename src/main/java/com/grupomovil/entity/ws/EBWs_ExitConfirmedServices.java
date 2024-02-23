/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupomovil.entity.ws;

import java.util.List;

/**
 *
 * @author jeisson.junco
 */
public class EBWs_ExitConfirmedServices {

    public class Data {

        public int confirm_services;

        public int getConfirm_services() {
            return confirm_services;
        }

        public void setConfirm_services(int confirm_services) {
            this.confirm_services = confirm_services;
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
