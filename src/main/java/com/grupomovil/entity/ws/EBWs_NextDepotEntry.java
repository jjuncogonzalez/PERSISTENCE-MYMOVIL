package com.grupomovil.entity.ws;

/**
 *
 * @author jeisson.junco
 */
public class EBWs_NextDepotEntry {

    public class Data {

        private int id_task;
        private int id_stop;
        private String code_vehicle;
        private String code_employee;
        private String time_entry;
        private String servbus;
        private Object id_novedad;
        private boolean afecta_disponibilidad;
        private EBWs_Validator obj_val;

        public int getId_task() {
            return id_task;
        }

        public void setId_task(int id_task) {
            this.id_task = id_task;
        }

        public int getId_stop() {
            return id_stop;
        }

        public void setId_stop(int id_stop) {
            this.id_stop = id_stop;
        }

        public String getCode_vehicle() {
            return code_vehicle;
        }

        public void setCode_vehicle(String code_vehicle) {
            this.code_vehicle = code_vehicle;
        }

        public String getCode_employee() {
            return code_employee;
        }

        public void setCode_employee(String code_employee) {
            this.code_employee = code_employee;
        }

        public String getTime_entry() {
            return time_entry;
        }

        public void setTime_entry(String time_entry) {
            this.time_entry = time_entry;
        }

        public String getServbus() {
            return servbus;
        }

        public void setServbus(String servbus) {
            this.servbus = servbus;
        }

        public Object getId_novedad() {
            return id_novedad;
        }

        public void setId_novedad(Object id_novedad) {
            this.id_novedad = id_novedad;
        }

        public boolean isAfecta_disponibilidad() {
            return afecta_disponibilidad;
        }

        public void setAfecta_disponibilidad(boolean afecta_disponibilidad) {
            this.afecta_disponibilidad = afecta_disponibilidad;
        }

        public EBWs_Validator getObj_val() {
            return obj_val;
        }

        public void setObj_val(EBWs_Validator obj_val) {
            this.obj_val = obj_val;
        }

    }

    private String message;
    private boolean valid;
    private Data data;
    private Object list_data;
    private int status;
    private Object id_data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Object getList_data() {
        return list_data;
    }

    public void setList_data(Object list_data) {
        this.list_data = list_data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Object getId_data() {
        return id_data;
    }

    public void setId_data(Object id_data) {
        this.id_data = id_data;
    }

}
