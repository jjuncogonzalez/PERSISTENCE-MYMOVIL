package com.grupomovil.entity.loadFile;

import java.util.Map;

/**
 *
 * @author Omar.beltran
 */
public class EBGm_req_are_mas {
    private String codigo_tm;       //codigo transmilenio (corresponde al operador)
    private String fecha_inicio;   //fecha que indica el inicio de la solicitud
    private String fecha_fin;     //fecha que indica el fin de la solicitud
    private String tipo_solicitud;             
    private String motivo_solicitud;             
    private String hora_inicio;
    private String hora_fin;
    private String capacitacion;
    private String jornada;
    private String turno;
    private String lugar;

    public EBGm_req_are_mas() {
        this.codigo_tm = "";
        this.fecha_fin = "";
        this.fecha_inicio = "";
        this.tipo_solicitud = "";
        this.motivo_solicitud = "";
    }
    
    public EBGm_req_are_mas(String id, String fechaInicio, String fechaFin, String tipoSolicitud, String motivoSolicitud,
            String horaInicio, String horaFin, String capacitacion, String jornada, String turno, String lugar) {
        this.codigo_tm = id;
        this.fecha_fin = fechaFin;
        this.fecha_inicio = fechaInicio;
        this.tipo_solicitud = tipoSolicitud;
        this.motivo_solicitud = motivoSolicitud;
        this.hora_fin = horaFin;
        this.hora_inicio = horaInicio;
        this.capacitacion = capacitacion;
        this.jornada = jornada;
        this.turno = turno;
        this.lugar = lugar;
    }
    
    public EBGm_req_are_mas(Map<String, String> map) {
        this.codigo_tm = map.get("codigo_tm");
        this.fecha_fin = map.get("fecha_fin");
        this.fecha_inicio = map.get("fecha_inicio"); 
        this.tipo_solicitud = map.get("tipo_solicitud");
        this.motivo_solicitud = map.get("motivo_solicitud");
        this.hora_fin = map.get("hora_fin");
        this.hora_inicio = map.get("hora_inicio");
        this.capacitacion = map.get("capacitacion");
        this.jornada = map.get("jornada");
        this.turno = map.get("turno");
        this.lugar = map.get("lugar");
    }
    
    public String getCodigo_tm() {
        return codigo_tm;
    }

    public void setCodigo_tm(String codigo_tm) {
        this.codigo_tm = codigo_tm;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getTipo_solicitud() {
        return tipo_solicitud;
    }

    public void setTipo_solicitud(String tipo_solicitud) {
        this.tipo_solicitud = tipo_solicitud;
    }

    public String getMotivo_solicitud() {
        return motivo_solicitud;
    }

    public void setMotivo_solicitud(String motivo_solicitud) {
        this.motivo_solicitud = motivo_solicitud;
    }

    public String getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public String getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(String hora_fin) {
        this.hora_fin = hora_fin;
    }

    public String getCapacitacion() {
        return capacitacion;
    }

    public void setCapacitacion(String capacitacion) {
        this.capacitacion = capacitacion;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
}
