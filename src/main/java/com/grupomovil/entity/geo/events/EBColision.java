package com.grupomovil.entity.geo.events;

import org.bson.types.ObjectId;
/**
 * Entidad relacionada con el evento detección de accidente o colisión
 * @author Omar.beltran
 */
public class EBColision {
    
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
    
    ObjectId _id;
    String fechaHoraLecturaDato; // fecha lectura
    String idVehiculo;           // vehiculo
    LocalizacionVehiculo localizacionVehiculo; // localizacion
    String codigoEvento;
    String nombreEvento;
    String idRegistro;
    String idConductor;
    String idOperador;
    String idRuta;
    String fechaHoraEnvioDato; // fecha lectura
    String tipoBus;
    int tecnologiaMotor;
    int tipoTrama;
    int tipoFreno;
    boolean tramaRetransmitida;

    public String getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(String idRegistro) {
        this.idRegistro = idRegistro;
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

    public String getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(String idRuta) {
        this.idRuta = idRuta;
    }

    public String getFechaHoraEnvioDato() {
        return fechaHoraEnvioDato;
    }

    public void setFechaHoraEnvioDato(String fechaHoraEnvioDato) {
        this.fechaHoraEnvioDato = fechaHoraEnvioDato;
    }

    public String getTipoBus() {
        return tipoBus;
    }

    public void setTipoBus(String tipoBus) {
        this.tipoBus = tipoBus;
    }

    public int getTecnologiaMotor() {
        return tecnologiaMotor;
    }

    public void setTecnologiaMotor(int tecnologiaMotor) {
        this.tecnologiaMotor = tecnologiaMotor;
    }

    public int getTipoTrama() {
        return tipoTrama;
    }

    public void setTipoTrama(int tipoTrama) {
        this.tipoTrama = tipoTrama;
    }

    public int getTipoFreno() {
        return tipoFreno;
    }

    public void setTipoFreno(int tipoFreno) {
        this.tipoFreno = tipoFreno;
    }

    public boolean isTramaRetransmitida() {
        return tramaRetransmitida;
    }

    public void setTramaRetransmitida(boolean tramaRetransmitida) {
        this.tramaRetransmitida = tramaRetransmitida;
    }
    
    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
    }

    public String getFechaHoraLecturaDato() {
        return fechaHoraLecturaDato;
    }

    public void setFechaHoraLecturaDato(String fechaHoraLecturaDato) {
        this.fechaHoraLecturaDato = fechaHoraLecturaDato;
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

    public String getCodigoEvento() {
        return codigoEvento;
    }

    public void setCodigoEvento(String codigoEvento) {
        this.codigoEvento = codigoEvento;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }
    
    
}

