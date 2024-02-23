package com.grupomovil.entity.ws;

/**
 *
 * @author jeisson.junco
 */
public class EBWs_SaveIssueRequest {

    private int id_issue_type;
    private String code_vehicle;
    private String code_employee;
    private String description;
    private int id_system;
    private String username;

    public int getId_issue_type() {
        return id_issue_type;
    }

    public void setId_issue_type(int id_issue_type) {
        this.id_issue_type = id_issue_type;
    }

    public String getCode_vehicle() {
        return code_vehicle;
    }

    public void setCode_vehicle(String code_vehicle) {
        this.code_vehicle = code_vehicle;
    }

    public String getCode_employee() {
        return code_employee;
    }

    public void setCode_employee(String code_employee) {
        this.code_employee = code_employee;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId_system() {
        return id_system;
    }

    public void setId_system(int id_system) {
        this.id_system = id_system;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
