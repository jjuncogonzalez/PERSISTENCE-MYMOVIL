package com.grupomovil.entity.geo.events;

import org.bson.types.ObjectId;

/**
 * @author omar.beltran
 */
public class EBPeriodic20 {

    public class LocalizacionVehiculo {

        String latitud;
        String longitud;

        public String getLatitud() {
            return latitud;
        }

        public void setLatitud(String latitud) {
            this.latitud = latitud;
        }

        public String getLongitud() {
            return longitud;
        }

        public void setLongitud(String longitud) {
            this.longitud = longitud;
        }
    }

    public class Alarma {

        Object velocidadVehiculo;
        Object aceleracionVehiculo;
        
        public Object getVelocidadVehiculo() {
            return velocidadVehiculo;
        }

        public void setVelocidadVehiculo(Object velocidadVehiculo) {
            this.velocidadVehiculo = velocidadVehiculo;
        }

        public Object getAceleracionVehiculo() {
            return aceleracionVehiculo;
        }

        public void setAceleracionVehiculo(Object aceleracionVehiculo) {
            this.aceleracionVehiculo = aceleracionVehiculo;
        }
    }

    ObjectId _id;
    /**
     * Header *
     */
    String versionTrama;
    String idRegistro;
    String idOperador;
    String idVehiculo;
    String idRuta;
    String idConductor;
    String fechaHoraLecturaDato;
    String fechaHoraEnvioDato;
    String tipoBus;
    LocalizacionVehiculo localizacionVehiculo;
    int tipoTrama;
    int tecnologiaMotor;
    boolean tramaRetransmitida;
    int tipoFreno;
    String codigoPeriodica;
    
    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
    }

    public String getCodigoPeriodica() {
        return codigoPeriodica;
    }

    public void setCodigoPeriodica(String codigoPeriodica) {
        this.codigoPeriodica = codigoPeriodica;
    }

    public String getFechaHoraEnvioDato() {
        return fechaHoraEnvioDato;
    }

    public void setFechaHoraEnvioDato(String fechaHoraEnvioDato) {
        this.fechaHoraEnvioDato = fechaHoraEnvioDato;
    }

    public String getFechaHoraLecturaDato() {
        return fechaHoraLecturaDato;
    }

    public void setFechaHoraLecturaDato(String fechaHoraLecturaDato) {
        this.fechaHoraLecturaDato = fechaHoraLecturaDato;
    }

    public String getIdConductor() {
        return idConductor;
    }

    public void setIdConductor(String idConductor) {
        this.idConductor = idConductor;
    }

    public String getIdOperador() {
        return idOperador;
    }

    public void setIdOperador(String idOperador) {
        this.idOperador = idOperador;
    }

    public String getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(String idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(String idRuta) {
        this.idRuta = idRuta;
    }

    public String getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public LocalizacionVehiculo getLocalizacionVehiculo() {
        return localizacionVehiculo;
    }

    public void setLocalizacionVehiculo(LocalizacionVehiculo localizacionVehiculo) {
        this.localizacionVehiculo = localizacionVehiculo;
    }

    public int getTecnologiaMotor() {
        return tecnologiaMotor;
    }

    public void setTecnologiaMotor(int tecnologiaMotor) {
        this.tecnologiaMotor = tecnologiaMotor;
    }

    public String getTipoBus() {
        return tipoBus;
    }

    public void setTipoBus(String tipoBus) {
        this.tipoBus = tipoBus;
    }

    public int getTipoFreno() {
        return tipoFreno;
    }

    public void setTipoFreno(int tipoFreno) {
        this.tipoFreno = tipoFreno;
    }

    public int getTipoTrama() {
        return tipoTrama;
    }

    public void setTipoTrama(int tipoTrama) {
        this.tipoTrama = tipoTrama;
    }

    public boolean isTramaRetransmitida() {
        return tramaRetransmitida;
    }

    public void setTramaRetransmitida(boolean tramaRetransmitida) {
        this.tramaRetransmitida = tramaRetransmitida;
    }

    public String getVersionTrama() {
        return versionTrama;
    }

    public void setVersionTrama(String versionTrama) {
        this.versionTrama = versionTrama;
    }

}
