package com.grupomovil.entity.ws;

/**
 *
 * @author jeisson.junco
 */
public class EBWs_NotProgrammedRequest {

    private String code_veh;
    private String code_emp;
    private int id_system;
    private Long date;
    private String description;
    private String username;

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }
    

    public String getCode_veh() {
        return code_veh;
    }

    public void setCode_veh(String code_veh) {
        this.code_veh = code_veh;
    }

    public String getCode_emp() {
        return code_emp;
    }

    public void setCode_emp(String code_emp) {
        this.code_emp = code_emp;
    }

    public int getId_system() {
        return id_system;
    }

    public void setId_system(int id_system) {
        this.id_system = id_system;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
