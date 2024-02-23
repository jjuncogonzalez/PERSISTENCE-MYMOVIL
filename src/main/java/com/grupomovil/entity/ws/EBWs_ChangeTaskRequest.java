package com.grupomovil.entity.ws;

/**
 *
 * @author jeisson.junco
 */
public class EBWs_ChangeTaskRequest {

    public String route;
    public String control_tm;
    public Long date_time;
    public String employee;

    public Long getDate_time() {
        return date_time;
    }

    public void setDate_time(Long date_time) {
        this.date_time = date_time;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getControl_tm() {
        return control_tm;
    }

    public void setControl_tm(String control_tm) {
        this.control_tm = control_tm;
    }

   

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

}
