package com.grupomovil.entity.ws;

/**
 *
 * @author jeisson.junco
 */
public class EBWS_OperationalIssue {

    private int id_issue_type;
    private String code_employee;
    private String description;
    private Long date_time_from;
    private Long date_time_to;
    private String username;

    public int getId_issue_type() {
        return id_issue_type;
    }

    public void setId_issue_type(int id_issue_type) {
        this.id_issue_type = id_issue_type;
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

    public Long getDate_time_from() {
        return date_time_from;
    }

    public void setDate_time_from(Long date_time_from) {
        this.date_time_from = date_time_from;
    }

    public Long getDate_time_to() {
        return date_time_to;
    }

    public void setDate_time_to(Long date_time_to) {
        this.date_time_to = date_time_to;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
