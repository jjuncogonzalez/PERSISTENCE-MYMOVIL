package com.grupomovil.entity.ws;

import java.util.List;

/**
 *
 * @author jeisson.junco
 */
public class EBWs_CheckListSaveRequest {

    public class CheckUpFail {

        private int id_component;
        private int id_component_fails;
        private boolean status;
        private String description;

        public int getId_component() {
            return id_component;
        }

        public void setId_component(int id_component) {
            this.id_component = id_component;
        }

        public int getId_component_fails() {
            return id_component_fails;
        }

        public void setId_component_fails(int id_component_fails) {
            this.id_component_fails = id_component_fails;
        }

        public boolean isStatus() {
            return status;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

    }

    private String vehicle;
    private String employee;
    private String username;
    private List<CheckUpFail> check_up_fails;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<CheckUpFail> getCheck_up_fails() {
        return check_up_fails;
    }

    public void setCheck_up_fails(List<CheckUpFail> check_up_fails) {
        this.check_up_fails = check_up_fails;
    }

}
