package com.grupomovil.entity.ws;

/**
 *
 * @author jeisson.junco
 */
public class EBWs_NextDepotExit {

    public class Data {

        private int id_task;
        private int is_stop;
        private String code_vehicle;
        private String code_employee;
        private String time_exit;
        private String servbus;
        private EBWs_Validator obj_val;

        public int getId_task() {
            return id_task;
        }

        public void setId_task(int id_task) {
            this.id_task = id_task;
        }

        public int getIs_stop() {
            return is_stop;
        }

        public void setIs_stop(int is_stop) {
            this.is_stop = is_stop;
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

        public String getTime_exit() {
            return time_exit;
        }

        public void setTime_exit(String time_exit) {
            this.time_exit = time_exit;
        }

        public String getServbus() {
            return servbus;
        }

        public void setServbus(String servbus) {
            this.servbus = servbus;
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
