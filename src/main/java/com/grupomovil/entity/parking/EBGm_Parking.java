package com.grupomovil.entity.parking;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author jjunco
 */
public class EBGm_Parking implements Serializable {

    private List<Parking> parking;

    public List<Parking> getParking() {
        return parking;
    }

    public void setParking(List<Parking> parking) {
        this.parking = parking;
    }

    public class Parking {
        private String _id;
        private String yard;
        private String observation;
        private Date register_date;
        private Date exit_date;
        private List<Vehicle> vehicle;
        private List<Empleado> empleado;

        public String getId() {
            return _id;
        }

        public void setId(String _id) {
            this._id = _id;
        }

        public String getYard() {
            return yard;
        }

        public void setYard(String yard) {
            this.yard = yard;
        }

        public String getObservation() {
            return observation;
        }

        public void setObservation(String observation) {
            this.observation = observation;
        }

        public Date getRegister_date() {
            return register_date;
        }

        public void setRegister_date(Date register_date) {
            this.register_date = register_date;
        }

        public Date getExit_date() {
            return exit_date;
        }

        public void setExit_date(Date exit_date) {
            this.exit_date = exit_date;
        }

        public List<Vehicle> getVehicle() {
            return vehicle;
        }

        public void setVehicle(List<Vehicle> vehicle) {
            this.vehicle = vehicle;
        }

        public List<Empleado> getEmpleado() {
            return empleado;
        }

        public void setEmpleado(List<Empleado> empleado) {
            this.empleado = empleado;
        }

    }

    public class Vehicle {

        private String _id;
        private String type;
        private String color;
        private String identification;
        private String responsible;
        private boolean internal;
        private String name;
        private String company;
        private String contactNumber;
        private Date register_date;

        public String getId() {
            return _id;
        }

        public void setId(String _id) {
            this._id = _id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getIdentification() {
            return identification;
        }

        public void setIdentification(String identification) {
            this.identification = identification;
        }

        public String getResponsible() {
            return responsible;
        }

        public void setResponsible(String responsible) {
            this.responsible = responsible;
        }

        public boolean isInternal() {
            return internal;
        }

        public void setInternal(boolean internal) {
            this.internal = internal;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getContactNumber() {
            return contactNumber;
        }

        public void setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
        }

        public Date getRegister_date() {
            return register_date;
        }

        public void setRegister_date(Date register_date) {
            this.register_date = register_date;
        }

    }
    
    public class Empleado {
        private String _id;
        private String nombre;
        private String cargo;
        private String cedula;
        private String celular;
        private String telefono;
        private String estado;

        public String getId() {
            return _id;
        }

        public void setId(String _id) {
            this._id = _id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getCargo() {
            return cargo;
        }

        public void setCargo(String cargo) {
            this.cargo = cargo;
        }

        public String getCedula() {
            return cedula;
        }

        public void setCedula(String cedula) {
            this.cedula = cedula;
        }

        public String getCelular() {
            return celular;
        }

        public void setCelular(String celular) {
            this.celular = celular;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }
        
    }
}
