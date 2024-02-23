package com.grupomovil.entity.biometricos;



import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author julian.arevalo
 */
public class EBGm_wor_day_emp_date implements Serializable {
    private int idGenericaJornada;
    private Date fecha;
    private String sercon;
    private int idEmpleado;
    private String timeOrigin;
    private String timeDestiny;
    private int idParamArea;
    private String ParamArea;
    private String username;
    private Date creado;
    private Date modificado;
    private int cargada;
    private String dominicalCompDiurnas;
    private String dominicalCompNocturnas;
    private String dominicalCompDiurnaExtra;
    private String dominicalCompNocturnaExtra;
    private int prgModificada;
    private String realTimeOrigin;
    private String realTimeDestiny;
    private String hiniTurno2;
    private String hfinTurno2;
    private String hiniTurno3;
    private String hfinTurno3;
    private int idGenericaJornadaMotivo;
    private int idGenericaJornadaTipo;
    private String observaciones;
    private String userGenera;
    private Date fechaGenera;
    private int autorizado;
    private String userAutorizado;
    private Date fechaAutoriza;
    private int liquidado;
    private String userLiquida;
    private Date fechaLiquida;
    private int tipoCalculo;
    private int nominaBorrada;
    private String diurnas;
    private String nocturnas;
    private String extraDiurna;
    private String extraNocturna;
    private String festivoDiurno;
    private String festivoNocturno;
    private String festivoExtraDiurno;
    private String festivoExtraNocturno;
    private String productionTime;
    private String workTime;
    private String realHiniTurno2;
    private String realHfinTurno2;
    private String compensatorio;
    private String productionTimeReal;
    private String ordenTrabajo;
    private int idGopUnidadFuncional;
    private int estadoReg;

    public int getIdGenericaJornada() {
        return idGenericaJornada;
    }

    public void setIdGenericaJornada(int idGenericaJornada) {
        this.idGenericaJornada = idGenericaJornada;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getSercon() {
        return sercon;
    }

    public void setSercon(String sercon) {
        this.sercon = sercon;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getTimeOrigin() {
        return timeOrigin;
    }

    public void setTimeOrigin(String timeOrigin) {
        this.timeOrigin = timeOrigin;
    }

    public String getTimeDestiny() {
        return timeDestiny;
    }

    public void setTimeDestiny(String timeDestiny) {
        this.timeDestiny = timeDestiny;
    }

    public int getIdParamArea() {
        return idParamArea;
    }

    public void setIdParamArea(int idParamArea) {
        this.idParamArea = idParamArea;
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

    public int getCargada() {
        return cargada;
    }

    public void setCargada(int cargada) {
        this.cargada = cargada;
    }

    public String getParamArea() {
        return ParamArea;
    }

    public void setParamArea(String ParamArea) {
        this.ParamArea = ParamArea;
    }

    public String getDominicalCompDiurnas() {
        return dominicalCompDiurnas;
    }

    public void setDominicalCompDiurnas(String dominicalCompDiurnas) {
        this.dominicalCompDiurnas = dominicalCompDiurnas;
    }

    public String getDominicalCompNocturnas() {
        return dominicalCompNocturnas;
    }

    public void setDominicalCompNocturnas(String dominicalCompNocturnas) {
        this.dominicalCompNocturnas = dominicalCompNocturnas;
    }

    public String getDominicalCompDiurnaExtra() {
        return dominicalCompDiurnaExtra;
    }

    public void setDominicalCompDiurnaExtra(String dominicalCompDiurnaExtra) {
        this.dominicalCompDiurnaExtra = dominicalCompDiurnaExtra;
    }

    public String getDominicalCompNocturnaExtra() {
        return dominicalCompNocturnaExtra;
    }

    public void setDominicalCompNocturnaExtra(String dominicalCompNocturnaExtra) {
        this.dominicalCompNocturnaExtra = dominicalCompNocturnaExtra;
    }

    public int getPrgModificada() {
        return prgModificada;
    }

    public void setPrgModificada(int prgModificada) {
        this.prgModificada = prgModificada;
    }

    public String getRealTimeOrigin() {
        return realTimeOrigin;
    }

    public void setRealTimeOrigin(String realTimeOrigin) {
        this.realTimeOrigin = realTimeOrigin;
    }

    public String getRealTimeDestiny() {
        return realTimeDestiny;
    }

    public void setRealTimeDestiny(String realTimeDestiny) {
        this.realTimeDestiny = realTimeDestiny;
    }

    public String getHiniTurno2() {
        return hiniTurno2;
    }

    public void setHiniTurno2(String hiniTurno2) {
        this.hiniTurno2 = hiniTurno2;
    }

    public String getHfinTurno2() {
        return hfinTurno2;
    }

    public void setHfinTurno2(String hfinTurno2) {
        this.hfinTurno2 = hfinTurno2;
    }

    public String getHiniTurno3() {
        return hiniTurno3;
    }

    public void setHiniTurno3(String hiniTurno3) {
        this.hiniTurno3 = hiniTurno3;
    }

    public String getHfinTurno3() {
        return hfinTurno3;
    }

    public void setHfinTurno3(String hfinTurno3) {
        this.hfinTurno3 = hfinTurno3;
    }

    public int getIdGenericaJornadaMotivo() {
        return idGenericaJornadaMotivo;
    }

    public void setIdGenericaJornadaMotivo(int idGenericaJornadaMotivo) {
        this.idGenericaJornadaMotivo = idGenericaJornadaMotivo;
    }

    public int getIdGenericaJornadaTipo() {
        return idGenericaJornadaTipo;
    }

    public void setIdGenericaJornadaTipo(int idGenericaJornadaTipo) {
        this.idGenericaJornadaTipo = idGenericaJornadaTipo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getUserGenera() {
        return userGenera;
    }

    public void setUserGenera(String userGenera) {
        this.userGenera = userGenera;
    }

    public Date getFechaGenera() {
        return fechaGenera;
    }

    public void setFechaGenera(Date fechaGenera) {
        this.fechaGenera = fechaGenera;
    }

    public int getAutorizado() {
        return autorizado;
    }

    public void setAutorizado(int autorizado) {
        this.autorizado = autorizado;
    }

    public String getUserAutorizado() {
        return userAutorizado;
    }

    public void setUserAutorizado(String userAutorizado) {
        this.userAutorizado = userAutorizado;
    }

    public Date getFechaAutoriza() {
        return fechaAutoriza;
    }

    public void setFechaAutoriza(Date fechaAutoriza) {
        this.fechaAutoriza = fechaAutoriza;
    }

    public int getLiquidado() {
        return liquidado;
    }

    public void setLiquidado(int liquidado) {
        this.liquidado = liquidado;
    }

    public String getUserLiquida() {
        return userLiquida;
    }

    public void setUserLiquida(String userLiquida) {
        this.userLiquida = userLiquida;
    }

    public Date getFechaLiquida() {
        return fechaLiquida;
    }

    public void setFechaLiquida(Date fechaLiquida) {
        this.fechaLiquida = fechaLiquida;
    }

    public int getTipoCalculo() {
        return tipoCalculo;
    }

    public void setTipoCalculo(int tipoCalculo) {
        this.tipoCalculo = tipoCalculo;
    }

    public int getNominaBorrada() {
        return nominaBorrada;
    }

    public void setNominaBorrada(int nominaBorrada) {
        this.nominaBorrada = nominaBorrada;
    }

    public String getDiurnas() {
        return diurnas;
    }

    public void setDiurnas(String diurnas) {
        this.diurnas = diurnas;
    }

    public String getNocturnas() {
        return nocturnas;
    }

    public void setNocturnas(String nocturnas) {
        this.nocturnas = nocturnas;
    }

    public String getExtraDiurna() {
        return extraDiurna;
    }

    public void setExtraDiurna(String extraDiurna) {
        this.extraDiurna = extraDiurna;
    }

    public String getExtraNocturna() {
        return extraNocturna;
    }

    public void setExtraNocturna(String extraNocturna) {
        this.extraNocturna = extraNocturna;
    }

    public String getFestivoDiurno() {
        return festivoDiurno;
    }

    public void setFestivoDiurno(String festivoDiurno) {
        this.festivoDiurno = festivoDiurno;
    }

    public String getFestivoNocturno() {
        return festivoNocturno;
    }

    public void setFestivoNocturno(String festivoNocturno) {
        this.festivoNocturno = festivoNocturno;
    }

    public String getFestivoExtraDiurno() {
        return festivoExtraDiurno;
    }

    public void setFestivoExtraDiurno(String festivoExtraDiurno) {
        this.festivoExtraDiurno = festivoExtraDiurno;
    }

    public String getFestivoExtraNocturno() {
        return festivoExtraNocturno;
    }

    public void setFestivoExtraNocturno(String festivoExtraNocturno) {
        this.festivoExtraNocturno = festivoExtraNocturno;
    }

    public String getProductionTime() {
        return productionTime;
    }

    public void setProductionTime(String productionTime) {
        this.productionTime = productionTime;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    public String getRealHiniTurno2() {
        return realHiniTurno2;
    }

    public void setRealHiniTurno2(String realHiniTurno2) {
        this.realHiniTurno2 = realHiniTurno2;
    }

    public String getRealHfinTurno2() {
        return realHfinTurno2;
    }

    public void setRealHfinTurno2(String realHfinTurno2) {
        this.realHfinTurno2 = realHfinTurno2;
    }

    public String getCompensatorio() {
        return compensatorio;
    }

    public void setCompensatorio(String compensatorio) {
        this.compensatorio = compensatorio;
    }

    public String getProductionTimeReal() {
        return productionTimeReal;
    }

    public void setProductionTimeReal(String productionTimeReal) {
        this.productionTimeReal = productionTimeReal;
    }

    public String getOrdenTrabajo() {
        return ordenTrabajo;
    }

    public void setOrdenTrabajo(String ordenTrabajo) {
        this.ordenTrabajo = ordenTrabajo;
    }

    public int getIdGopUnidadFuncional() {
        return idGopUnidadFuncional;
    }

    public void setIdGopUnidadFuncional(int idGopUnidadFuncional) {
        this.idGopUnidadFuncional = idGopUnidadFuncional;
    }

    public int getEstadoReg() {
        return estadoReg;
    }

    public void setEstadoReg(int estadoReg) {
        this.estadoReg = estadoReg;
    }
    
        
}
