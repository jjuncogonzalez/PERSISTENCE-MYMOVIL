package com.grupomovil.entity;

import java.io.Serializable;

/**
 *
 * @author jeisson.junco
 */
public class EBEmpleados implements Serializable {

    private static final long serialVersionUID = 1L;

    private String identificacion;
    private String nombres;
    private String apellidos;
    private String empresa;

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    

}
