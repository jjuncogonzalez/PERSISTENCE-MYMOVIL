package com.grupomovil.entity;

/**
 * @author Omar.beltran
 */
public class EntityListServices {
//tc.id_prg_tc, tc.id_vehiculo, tc.id_empleado, em.codigo_tm,CONCAT(em.nombres,' ',em.apellidos) as nombre, tc.servbus,
//veh.codigo as bus, tc.time_origin, tc.time_destiny, rou.name as ruta, tc.to_stop, tc.from_stop, tc.tabla,
//tc.id_task_type,0 as type_entry,1 as type_exit

    private String id_prg_tc;
    private String id_vehiculo;
    private String id_empleado;
    private String codigo_tm;
    private String nombre;
    private String servbus;
    private String bus;
    private String time_origin;
    private String time_destiny;
    private String ruta;
    private String to_stop;
    private String from_stop;
    private String tabla;
    private String id_task_type;
    private int type_entry;//es valor 0 cero
    private int type_exit;//es valor 1 uno
    private String type_table;

    private int UF;
    private String fecha;

    public String getId_prg_tc() {
        return id_prg_tc;
    }

    public void setId_prg_tc(String id_prg_tc) {
        this.id_prg_tc = id_prg_tc;
    }

    public String getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(String id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    public String getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(String id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getCodigo_tm() {
        return codigo_tm;
    }

    public void setCodigo_tm(String codigo_tm) {
        this.codigo_tm = codigo_tm;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getServbus() {
        return servbus;
    }

    public void setServbus(String servbus) {
        this.servbus = servbus;
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public String getTime_origin() {
        return time_origin;
    }

    public void setTime_origin(String time_origin) {
        this.time_origin = time_origin;
    }

    public String getTime_destiny() {
        return time_destiny;
    }

    public void setTime_destiny(String time_destiny) {
        this.time_destiny = time_destiny;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getTo_stop() {
        return to_stop;
    }

    public void setTo_stop(String to_stop) {
        this.to_stop = to_stop;
    }

    public String getFrom_stop() {
        return from_stop;
    }

    public void setFrom_stop(String from_stop) {
        this.from_stop = from_stop;
    }

    public String getTabla() {
        return tabla;
    }

    public void setTabla(String tabla) {
        this.tabla = tabla;
    }

    public String getId_task_type() {
        return id_task_type;
    }

    public void setId_task_type(String id_task_type) {
        this.id_task_type = id_task_type;
    }

    public int getType_entry() {
        return type_entry;
    }

    public void setType_entry(int type_entry) {
        this.type_entry = type_entry;
    }

    public int getType_exit() {
        return type_exit;
    }

    public void setType_exit(int type_exit) {
        this.type_exit = type_exit;
    }

    public int getUF() {
        return UF;
    }

    public void setUF(int UF) {
        this.UF = UF;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getType_table() {
        return type_table;
    }

    public void setType_table(String type_table) {
        this.type_table = type_table;
    }

}
