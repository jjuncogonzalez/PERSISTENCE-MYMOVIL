package com.grupomovil.entity.loadFile;

import java.util.Map;

/**
 * @author Omar.beltran
 */
public class EBGm_req_mas {
    private String codigo_tm;       //codigo transmilenio (corresponde al operador)
    private String fecha_inicio;   //fecha que indica el inicio de la solicitud
    private String fecha_fin;     //fecha que indica el fin de la solicitud
    private String tipo_solicitud;             
    private String motivo_solicitud;             
    private String observaciones;   
    
    public EBGm_req_mas() {
        this.codigo_tm = "";
        this.fecha_fin = "";
        this.fecha_inicio = "";
        this.tipo_solicitud = "";
        this.motivo_solicitud = "";
        this.observaciones = "";
    }
    
    public EBGm_req_mas(String id, String fechaInicial, String fechaFin, String tipoSolicitud, String motivoSolicitud, String observaciones) {
        this.codigo_tm = id;
        this.fecha_fin = fechaFin;
        this.fecha_inicio = fechaInicial;
        this.tipo_solicitud = tipoSolicitud;
        this.motivo_solicitud = motivoSolicitud;
        this.observaciones = observaciones;
    }
    
    public EBGm_req_mas(Map<String, String> map) {
        this.codigo_tm = map.get("codigo_tm");
        this.fecha_fin = map.get("fecha_fin");
        this.fecha_inicio = map.get("fecha_inicio"); 
        this.tipo_solicitud = map.get("tipo_solicitud");
        this.motivo_solicitud = map.get("motivo_solicitud");
        this.observaciones = map.get("observaciones");
    }

    public String getCodigo_tm() {
        return codigo_tm;
    }

    public void setCodigo_tm(String codigo_tm) {
        this.codigo_tm = codigo_tm;
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

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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
    
}
