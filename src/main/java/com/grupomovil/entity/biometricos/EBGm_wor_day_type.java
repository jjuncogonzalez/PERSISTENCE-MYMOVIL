/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupomovil.entity.biometricos;

import java.util.Date;

/**
 *
 * @author julian.arevalo
 */
public class EBGm_wor_day_type {
    private int id_generica_jornada_tipo;
    private String hini_t1;
    private String hfin_t1;
    private String hini_t2;
    private String hfin_t2;
    private String hini_t3;
    private String hfin_t3;
    private String descanso;
    private String descripcion;
    private int id_param_area;
    private int tipo_calculo;
    private String username;
    private Date creado;
    private Date modificado;
    private int estadoReg;

    public int getId_generica_jornada_tipo() {
        return id_generica_jornada_tipo;
    }

    public void setId_generica_jornada_tipo(int id_generica_jornada_tipo) {
        this.id_generica_jornada_tipo = id_generica_jornada_tipo;
    }

    public String getHini_t1() {
        return hini_t1;
    }

    public void setHini_t1(String hini_t1) {
        this.hini_t1 = hini_t1;
    }

    public String getHfin_t1() {
        return hfin_t1;
    }

    public void setHfin_t1(String hfin_t1) {
        this.hfin_t1 = hfin_t1;
    }

    public String getHini_t2() {
        return hini_t2;
    }

    public void setHini_t2(String hini_t2) {
        this.hini_t2 = hini_t2;
    }

    public String getHfin_t2() {
        return hfin_t2;
    }

    public void setHfin_t2(String hfin_t2) {
        this.hfin_t2 = hfin_t2;
    }

    public String getHini_t3() {
        return hini_t3;
    }

    public void setHini_t3(String hini_t3) {
        this.hini_t3 = hini_t3;
    }

    public String getHfin_t3() {
        return hfin_t3;
    }

    public void setHfin_t3(String hfin_t3) {
        this.hfin_t3 = hfin_t3;
    }

    public String getDescanso() {
        return descanso;
    }

    public void setDescanso(String descanso) {
        this.descanso = descanso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId_param_area() {
        return id_param_area;
    }

    public void setId_param_area(int id_param_area) {
        this.id_param_area = id_param_area;
    }

    public int getTipo_calculo() {
        return tipo_calculo;
    }

    public void setTipo_calculo(int tipo_calculo) {
        this.tipo_calculo = tipo_calculo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getCreado() {
        return creado;
    }

    public void setCreado(Date creado) {
        this.creado = creado;
    }

    public Date getModificado() {
        return modificado;
    }

    public void setModificado(Date modificado) {
        this.modificado = modificado;
    }

    public int getEstadoReg() {
        return estadoReg;
    }

    public void setEstadoReg(int estadoReg) {
        this.estadoReg = estadoReg;
    }
    
    
    
}
