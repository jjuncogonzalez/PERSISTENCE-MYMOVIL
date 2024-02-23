package com.grupomovil.entity.geo.events;

import org.bson.types.ObjectId;

/**
 *
 * @author jeisson.junco
 */
public class EBPeriodic {

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
        Object temperaturaMotor;
        Object presionAceiteMotor;
        Object revolucionesMotor;
        Object estadoDesgasteFrenos;
        Object kilometrosOdometro;
        Object consumoCombustible;
        Object nivelTanqueCombustible;
        Object consumoEnergia;
        Object regeneracionEnergia;
        int nivelRestanteEnergia;
        Object porcentajeEnergiaGenerada;
        Object temperaturaSts;
        Object usoCpuSts;
        Object memRamSts;
        Object memDiscoSts;
        Object temperaturaBaterias;
        Object sentidoMarcha;
        Object peso;
        Object temperaturaCabina;
        Object estimacionOcupacionSuben;
        Object estimacionOcupacionBajan;
        Object estimacionOcupacionAbordo;
        Object estadoAperturaCierrePuertas;
        Object fotoConductor;
        Object codigoComportamientoAnomalo;
        Object porcentajeCargaBaterias;
        Object estadoCinturonSeguridad;
        Object codigoCamara;
        int level;
        String idVehiculo;
        Object fechaHoraLecturaDato;
        String emails;
        Object code;
        Object clasification;
        String description;

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

        public Object getTemperaturaMotor() {
            return temperaturaMotor;
        }

        public void setTemperaturaMotor(Object temperaturaMotor) {
            this.temperaturaMotor = temperaturaMotor;
        }

        public Object getPresionAceiteMotor() {
            return presionAceiteMotor;
        }

        public void setPresionAceiteMotor(Object presionAceiteMotor) {
            this.presionAceiteMotor = presionAceiteMotor;
        }

        public Object getRevolucionesMotor() {
            return revolucionesMotor;
        }

        public void setRevolucionesMotor(Object revolucionesMotor) {
            this.revolucionesMotor = revolucionesMotor;
        }

        public Object getEstadoDesgasteFrenos() {
            return estadoDesgasteFrenos;
        }

        public void setEstadoDesgasteFrenos(Object estadoDesgasteFrenos) {
            this.estadoDesgasteFrenos = estadoDesgasteFrenos;
        }

        public Object getKilometrosOdometro() {
            return kilometrosOdometro;
        }

        public void setKilometrosOdometro(Object kilometrosOdometro) {
            this.kilometrosOdometro = kilometrosOdometro;
        }

        public Object getConsumoCombustible() {
            return consumoCombustible;
        }

        public void setConsumoCombustible(Object consumoCombustible) {
            this.consumoCombustible = consumoCombustible;
        }

        public Object getNivelTanqueCombustible() {
            return nivelTanqueCombustible;
        }

        public void setNivelTanqueCombustible(Object nivelTanqueCombustible) {
            this.nivelTanqueCombustible = nivelTanqueCombustible;
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

        public Object getPorcentajeEnergiaGenerada() {
            return porcentajeEnergiaGenerada;
        }

        public int getNivelRestanteEnergia() {
            return nivelRestanteEnergia;
        }

        public void setNivelRestanteEnergia(int nivelRestanteEnergia) {
            this.nivelRestanteEnergia = nivelRestanteEnergia;
        }

        public void setPorcentajeEnergiaGenerada(Object porcentajeEnergiaGenerada) {
            this.porcentajeEnergiaGenerada = porcentajeEnergiaGenerada;
        }

        public Object getTemperaturaSts() {
            return temperaturaSts;
        }

        public void setTemperaturaSts(Object temperaturaSts) {
            this.temperaturaSts = temperaturaSts;
        }

        public Object getUsoCpuSts() {
            return usoCpuSts;
        }

        public void setUsoCpuSts(Object usoCpuSts) {
            this.usoCpuSts = usoCpuSts;
        }

        public Object getMemRamSts() {
            return memRamSts;
        }

        public void setMemRamSts(Object memRamSts) {
            this.memRamSts = memRamSts;
        }

        public Object getMemDiscoSts() {
            return memDiscoSts;
        }

        public void setMemDiscoSts(Object memDiscoSts) {
            this.memDiscoSts = memDiscoSts;
        }

        public Object getTemperaturaBaterias() {
            return temperaturaBaterias;
        }

        public void setTemperaturaBaterias(Object temperaturaBaterias) {
            this.temperaturaBaterias = temperaturaBaterias;
        }

        public Object getSentidoMarcha() {
            return sentidoMarcha;
        }

        public void setSentidoMarcha(Object sentidoMarcha) {
            this.sentidoMarcha = sentidoMarcha;
        }

        public Object getPeso() {
            return peso;
        }

        public void setPeso(Object peso) {
            this.peso = peso;
        }

        public Object getTemperaturaCabina() {
            return temperaturaCabina;
        }

        public void setTemperaturaCabina(Object temperaturaCabina) {
            this.temperaturaCabina = temperaturaCabina;
        }

        public Object getEstimacionOcupacionSuben() {
            return estimacionOcupacionSuben;
        }

        public void setEstimacionOcupacionSuben(Object estimacionOcupacionSuben) {
            this.estimacionOcupacionSuben = estimacionOcupacionSuben;
        }

        public Object getEstimacionOcupacionBajan() {
            return estimacionOcupacionBajan;
        }

        public void setEstimacionOcupacionBajan(Object estimacionOcupacionBajan) {
            this.estimacionOcupacionBajan = estimacionOcupacionBajan;
        }

        public Object getEstimacionOcupacionAbordo() {
            return estimacionOcupacionAbordo;
        }

        public void setEstimacionOcupacionAbordo(Object estimacionOcupacionAbordo) {
            this.estimacionOcupacionAbordo = estimacionOcupacionAbordo;
        }

        public Object getEstadoAperturaCierrePuertas() {
            return estadoAperturaCierrePuertas;
        }

        public void setEstadoAperturaCierrePuertas(Object estadoAperturaCierrePuertas) {
            this.estadoAperturaCierrePuertas = estadoAperturaCierrePuertas;
        }

        public Object getFotoConductor() {
            return fotoConductor;
        }

        public void setFotoConductor(Object fotoConductor) {
            this.fotoConductor = fotoConductor;
        }

        public Object getCodigoComportamientoAnomalo() {
            return codigoComportamientoAnomalo;
        }

        public void setCodigoComportamientoAnomalo(Object codigoComportamientoAnomalo) {
            this.codigoComportamientoAnomalo = codigoComportamientoAnomalo;
        }

        public Object getPorcentajeCargaBaterias() {
            return porcentajeCargaBaterias;
        }

        public void setPorcentajeCargaBaterias(Object porcentajeCargaBaterias) {
            this.porcentajeCargaBaterias = porcentajeCargaBaterias;
        }

        public Object getEstadoCinturonSeguridad() {
            return estadoCinturonSeguridad;
        }

        public void setEstadoCinturonSeguridad(Object estadoCinturonSeguridad) {
            this.estadoCinturonSeguridad = estadoCinturonSeguridad;
        }

        public Object getCodigoCamara() {
            return codigoCamara;
        }

        public void setCodigoCamara(Object codigoCamara) {
            this.codigoCamara = codigoCamara;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public String getIdVehiculo() {
            return idVehiculo;
        }

        public void setIdVehiculo(String idVehiculo) {
            this.idVehiculo = idVehiculo;
        }

        public Object getFechaHoraLecturaDato() {
            return fechaHoraLecturaDato;
        }

        public void setFechaHoraLecturaDato(Object fechaHoraLecturaDato) {
            this.fechaHoraLecturaDato = fechaHoraLecturaDato;
        }

        public String getEmails() {
            return emails;
        }

        public void setEmails(String emails) {
            this.emails = emails;
        }

        public Object getCode() {
            return code;
        }

        public void setCode(Object code) {
            this.code = code;
        }

        public Object getClasification() {
            return clasification;
        }

        public void setClasification(Object clasification) {
            this.clasification = clasification;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

    }

    ObjectId _id;
    /**
     * Header *
     */
    String codigoPeriodica;
    String fechaHoraEnvioDato;
    String fechaHoraLecturaDato;
    String idConductor;
    String idOperador;
    String idRegistro;
    String idRuta;
    String idVehiculo;
    LocalizacionVehiculo localizacionVehiculo;
    Alarma alarma;
    int tecnologiaMotor;
    String tipoBus;
    int tipoFreno;
    int tipoTrama;
    boolean tramaRetransmitida;
    String versionTrama;
    String codigoEvento;
    int porcentajeCargaBaterias;

    /**
     * Telemetry *
     */
    //desgasteFrenos
    //temperaturaCabina
    Object desgasteFrenos;
    Object temperaturaCabina;

    Object velocidadVehiculo;
    Object aceleracionVehiculo;
    Object temperaturaMotor;
    Object presionAceiteMotor;
    Object revolucionesMotor;
    Object estadoDesgasteFrenos;
    Object kilometrosOdometro;
    Object consumoCombustible;
    Object nivelTanqueCombustible;
    Object consumoEnergia;
    Object regeneracionEnergia;
    int nivelRestanteEnergia;
    Object porcentajeEnergiaGenerada;
    Object temperaturaSts;
    int usoCpuSts;
    int memRamSts;
    Object memDiscoSts;
    Object temperaturaBaterias;
    int sentidoMarcha;
    String description;
    Boolean patio;
    Boolean cargando;

    String nombreEvento;
    Object fotoConductor;
    Boolean estadoAperturaCierrePuertas;
    Boolean encendido;

    String placa;
    int unidadFuncional;

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

    public Alarma getAlarma() {
        return alarma;
    }

    public void setAlarma(Alarma alarma) {
        this.alarma = alarma;
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

    public String getCodigoEvento() {
        return codigoEvento;
    }

    public void setCodigoEvento(String codigoEvento) {
        this.codigoEvento = codigoEvento;
    }

    public int getPorcentajeCargaBaterias() {
        return porcentajeCargaBaterias;
    }

    public void setPorcentajeCargaBaterias(int porcentajeCargaBaterias) {
        this.porcentajeCargaBaterias = porcentajeCargaBaterias;
    }

    public Object getDesgasteFrenos() {
        return desgasteFrenos;
    }

    public void setDesgasteFrenos(Object desgasteFrenos) {
        this.desgasteFrenos = desgasteFrenos;
    }

    public Object getTemperaturaCabina() {
        return temperaturaCabina;
    }

    public void setTemperaturaCabina(Object temperaturaCabina) {
        this.temperaturaCabina = temperaturaCabina;
    }

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

    public Object getTemperaturaMotor() {
        return temperaturaMotor;
    }

    public void setTemperaturaMotor(Object temperaturaMotor) {
        this.temperaturaMotor = temperaturaMotor;
    }

    public Object getPresionAceiteMotor() {
        return presionAceiteMotor;
    }

    public void setPresionAceiteMotor(Object presionAceiteMotor) {
        this.presionAceiteMotor = presionAceiteMotor;
    }

    public Object getRevolucionesMotor() {
        return revolucionesMotor;
    }

    public void setRevolucionesMotor(Object revolucionesMotor) {
        this.revolucionesMotor = revolucionesMotor;
    }

    public Object getEstadoDesgasteFrenos() {
        return estadoDesgasteFrenos;
    }

    public void setEstadoDesgasteFrenos(Object estadoDesgasteFrenos) {
        this.estadoDesgasteFrenos = estadoDesgasteFrenos;
    }

    public Object getKilometrosOdometro() {
        return kilometrosOdometro;
    }

    public void setKilometrosOdometro(Object kilometrosOdometro) {
        this.kilometrosOdometro = kilometrosOdometro;
    }

    public Object getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(Object consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }

    public Object getNivelTanqueCombustible() {
        return nivelTanqueCombustible;
    }

    public void setNivelTanqueCombustible(Object nivelTanqueCombustible) {
        this.nivelTanqueCombustible = nivelTanqueCombustible;
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

    public int getNivelRestanteEnergia() {
        return nivelRestanteEnergia;
    }

    public void setNivelRestanteEnergia(int nivelRestanteEnergia) {
        this.nivelRestanteEnergia = nivelRestanteEnergia;
    }

    public Object getPorcentajeEnergiaGenerada() {
        return porcentajeEnergiaGenerada;
    }

    public void setPorcentajeEnergiaGenerada(Object porcentajeEnergiaGenerada) {
        this.porcentajeEnergiaGenerada = porcentajeEnergiaGenerada;
    }

    public Object getTemperaturaSts() {
        return temperaturaSts;
    }

    public void setTemperaturaSts(Object temperaturaSts) {
        this.temperaturaSts = temperaturaSts;
    }

    public int getUsoCpuSts() {
        return usoCpuSts;
    }

    public void setUsoCpuSts(int usoCpuSts) {
        this.usoCpuSts = usoCpuSts;
    }

    public int getMemRamSts() {
        return memRamSts;
    }

    public void setMemRamSts(int memRamSts) {
        this.memRamSts = memRamSts;
    }

    public Object getMemDiscoSts() {
        return memDiscoSts;
    }

    public void setMemDiscoSts(Object memDiscoSts) {
        this.memDiscoSts = memDiscoSts;
    }

    public Object getTemperaturaBaterias() {
        return temperaturaBaterias;
    }

    public void setTemperaturaBaterias(Object temperaturaBaterias) {
        this.temperaturaBaterias = temperaturaBaterias;
    }

    public int getSentidoMarcha() {
        return sentidoMarcha;
    }

    public void setSentidoMarcha(int sentidoMarcha) {
        this.sentidoMarcha = sentidoMarcha;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public Object getFotoConductor() {
        return fotoConductor;
    }

    public void setFotoConductor(Object fotoConductor) {
        this.fotoConductor = fotoConductor;
    }

    public Boolean getEstadoAperturaCierrePuertas() {
        return estadoAperturaCierrePuertas;
    }

    public void setEstadoAperturaCierrePuertas(Boolean estadoAperturaCierrePuertas) {
        this.estadoAperturaCierrePuertas = estadoAperturaCierrePuertas;
    }

    public Boolean getEncendido() {
        return encendido;
    }

    public void setEncendido(Boolean encendido) {
        this.encendido = encendido;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getUnidadFuncional() {
        return unidadFuncional;
    }

    public void setUnidadFuncional(int unidadFuncional) {
        this.unidadFuncional = unidadFuncional;
    }

}
