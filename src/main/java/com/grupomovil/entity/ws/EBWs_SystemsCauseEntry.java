package com.grupomovil.entity.ws;

import java.util.List;

/**
 *
 * @author jeisson.junco
 */
public class EBWs_SystemsCauseEntry {

    public class ListObject {

        private int id;
        private String nombre;
        private String descripcion;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }
        
        
    }

    private String mensaje;
    private boolean validador;
    private Object object;
    private List<ListObject> listObject;
    private int httpStatus;
    private Object idObject;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isValidador() {
        return validador;
    }

    public void setValidador(boolean validador) {
        this.validador = validador;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public List<ListObject> getListObject() {
        return listObject;
    }

    public void setListObject(List<ListObject> listObject) {
        this.listObject = listObject;
    }

    public int getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(int httpStatus) {
        this.httpStatus = httpStatus;
    }

    public Object getIdObject() {
        return idObject;
    }

    public void setIdObject(Object idObject) {
        this.idObject = idObject;
    }
    

}
