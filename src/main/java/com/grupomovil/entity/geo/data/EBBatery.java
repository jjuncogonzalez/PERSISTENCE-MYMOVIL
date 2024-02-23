package com.grupomovil.entity.geo.data;

/**
 * @author Omar.beltran
 */
public class EBBatery {
    private String idVehiculo;
    private String unidadFuncional;
    private String fechaHoraLecturaDato;
    private String porcentajeEnergiaGenerada;
    private String nivelRestanteEnergia;
    private String consumoEnergia;
    private String regeneracionEnergia;
    private String patio;
    private String temperaturaBaterias;

    public String getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getUnidadFuncional() {
        return unidadFuncional;
    }

    public void setUnidadFuncional(String unidadFuncional) {
        this.unidadFuncional = unidadFuncional;
    }

    public String getFechaHoraLecturaDato() {
        return fechaHoraLecturaDato;
    }

    public void setFechaHoraLecturaDato(String fechaHoraLecturaDato) {
        this.fechaHoraLecturaDato = fechaHoraLecturaDato;
    }

    public String getPorcentajeEnergiaGenerada() {
        return porcentajeEnergiaGenerada;
    }

    public void setPorcentajeEnergiaGenerada(String porcentajeEnergiaGenerada) {
        this.porcentajeEnergiaGenerada = porcentajeEnergiaGenerada;
    }

    public String getNivelRestanteEnergia() {
        return nivelRestanteEnergia;
    }

    public void setNivelRestanteEnergia(String nivelRestanteEnergia) {
        this.nivelRestanteEnergia = nivelRestanteEnergia;
    }

    public String getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(String consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    public String getRegeneracionEnergia() {
        return regeneracionEnergia;
    }

    public void setRegeneracionEnergia(String regeneracionEnergia) {
        this.regeneracionEnergia = regeneracionEnergia;
    }

    public String getPatio() {
        return patio;
    }

    public void setPatio(String patio) {
        this.patio = patio;
    }

    public String getTemperaturaBaterias() {
        return temperaturaBaterias;
    }

    public void setTemperaturaBaterias(String temperaturaBaterias) {
        this.temperaturaBaterias = temperaturaBaterias;
    }
    
}
