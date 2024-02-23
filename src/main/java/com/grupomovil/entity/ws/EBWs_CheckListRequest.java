package com.grupomovil.entity.ws;

/**
 *
 * @author jeisson.junco
 */
public class EBWs_CheckListRequest {

    private int fail1;
    private int fail2;
    private int fail3;
    private int fail4;
    private int fail5;
    private String observation1;
    private String observation2;
    private String observation3;
    private String observation4;
    private String observation5;
    private String employee;
    private String vehicle;
    private String components;

    public int getFail1() {
        return fail1;
    }

    public void setFail1(int fail1) {
        this.fail1 = fail1;
    }

    public int getFail2() {
        return fail2;
    }

    public void setFail2(int fail2) {
        this.fail2 = fail2;
    }

    public int getFail3() {
        return fail3;
    }

    public void setFail3(int fail3) {
        this.fail3 = fail3;
    }

    public int getFail4() {
        return fail4;
    }

    public void setFail4(int fail4) {
        this.fail4 = fail4;
    }

    public int getFail5() {
        return fail5;
    }

    public void setFail5(int fail5) {
        this.fail5 = fail5;
    }

    public String getObservation1() {
        return observation1;
    }

    public void setObservation1(String observation1) {
        this.observation1 = observation1;
    }

    public String getObservation2() {
        return observation2;
    }

    public void setObservation2(String observation2) {
        this.observation2 = observation2;
    }

    public String getObservation3() {
        return observation3;
    }

    public void setObservation3(String observation3) {
        this.observation3 = observation3;
    }

    public String getObservation4() {
        return observation4;
    }

    public void setObservation4(String observation4) {
        this.observation4 = observation4;
    }

    public String getObservation5() {
        return observation5;
    }

    public void setObservation5(String observation5) {
        this.observation5 = observation5;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getComponents() {
        return components;
    }

    public void setComponents(String components) {
        this.components = components;
    }

    public class ListData {

        private int id;
        private String name;
        private boolean valid;

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

        public boolean isValid() {
            return valid;
        }

        public void setValid(boolean valid) {
            this.valid = valid;
        }

      

    }
}
