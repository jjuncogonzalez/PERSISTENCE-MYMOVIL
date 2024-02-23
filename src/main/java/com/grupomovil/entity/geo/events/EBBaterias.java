package com.grupomovil.entity.geo.events;

import org.bson.types.ObjectId;

/**
 *
 * @author jeisson.junco
 */
public class EBBaterias {

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
    /**
     * Header *
     */
    String versionTrama;
    String idConductor;
    String idOperador;
    String idRegistro;
    String idRuta;
    String fechaHoraLecturaDato; // fecha lectura
    String fechaHoraEnvioDato;
    String idVehiculo; // vehiculo
    String codigoEvento;
    LocalizacionVehiculo localizacionVehiculo; // localizacion
    Object consumoEnergia; // consumo energia 
    Object regeneracionEnergia; // regeneracion energia
    Object nivelRestanteEnergia; //restante
    Object porcentajeCargaBaterias;
    Object code;
    Boolean patio; // patio 
    Boolean cargando; //cargando
    String tipoBus;
    int tipoFreno;
    int tecnologiaMotor;
    int tipoTrama;
    boolean tramaRetransmitida;
        
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

    public Object getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(Object consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    public Object getRegeneracionEnergia() {
        return regeneracionEnergia;
    }

    public void setRegeneracionEnergia(Object regeneracionEnergia) {
        this.regeneracionEnergia = regeneracionEnergia;
    }

    public Object getNivelRestanteEnergia() {
        return nivelRestanteEnergia;
    }

    public void setNivelRestanteEnergia(Object nivelRestanteEnergia) {
        this.nivelRestanteEnergia = nivelRestanteEnergia;
    }

    public Boolean getPatio() {
        return patio;
    }

    public void setPatio(Boolean patio) {
        this.patio = patio;
    }

    public Boolean getCargando() {
        return cargando;
    }

    public void setCargando(Boolean cargando) {
        this.cargando = cargando;
    }

    public Object getPorcentajeCargaBaterias() {
        return porcentajeCargaBaterias;
    }

    public void setPorcentajeCargaBaterias(Object porcentajeCargaBaterias) {
        this.porcentajeCargaBaterias = porcentajeCargaBaterias;
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

    public Object getCode() {
        return code;
    }

    public void setCode(Object code) {
        this.code = code;
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

    public String getFechaHoraEnvioDato() {
        return fechaHoraEnvioDato;
    }

    public void setFechaHoraEnvioDato(String fechaHoraEnvioDato) {
        this.fechaHoraEnvioDato = fechaHoraEnvioDato;
    }

    public String getCodigoEvento() {
        return codigoEvento;
    }

    public void setCodigoEvento(String codigoEvento) {
        this.codigoEvento = codigoEvento;
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
    
}
