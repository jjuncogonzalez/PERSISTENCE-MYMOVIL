package com.grupomovil.entity.ws;

import java.util.ArrayList;

/**
 *
 * @author jeisson.junco
 */
public class EBWs_ShiftStart {

    public class PresentationService {

        private String date;
        private String time_origin;
        private int id_stop;
        private String stop;
        private String vehicle;
        private int id_task;
        private boolean exp_time;

        public boolean isExp_time() {
            return exp_time;
        }

        public void setExp_time(boolean exp_time) {
            this.exp_time = exp_time;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getTime_origin() {
            return time_origin;
        }

        public void setTime_origin(String time_origin) {
            this.time_origin = time_origin;
        }

        public int getId_stop() {
            return id_stop;
        }

        public void setId_stop(int id_stop) {
            this.id_stop = id_stop;
        }

        public String getStop() {
            return stop;
        }

        public void setStop(String stop) {
            this.stop = stop;
        }

        public String getVehicle() {
            return vehicle;
        }

        public void setVehicle(String vehicle) {
            this.vehicle = vehicle;
        }

        public int getId_task() {
            return id_task;
        }

        public void setId_task(int id_task) {
            this.id_task = id_task;
        }

    }

    public class DrivingService {

        private String date;
        private String time_origin;
        private int id_stop;
        private String stop;
        private String vehicle;
        private int id_task;
        private String position;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getTime_origin() {
            return time_origin;
        }

        public void setTime_origin(String time_origin) {
            this.time_origin = time_origin;
        }

        public int getId_stop() {
            return id_stop;
        }

        public void setId_stop(int id_stop) {
            this.id_stop = id_stop;
        }

        public String getStop() {
            return stop;
        }

        public void setStop(String stop) {
            this.stop = stop;
        }

        public String getVehicle() {
            return vehicle;
        }

        public void setVehicle(String vehicle) {
            this.vehicle = vehicle;
        }

        public int getId_task() {
            return id_task;
        }

        public void setId_task(int id_task) {
            this.id_task = id_task;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

    }

    public class Data {

        private PresentationService presentation_service;
        private DrivingService driving_service;
        private boolean is_shift_started;
        private double date_shift_started;
        private EBWs_Validator obj_val;

        public PresentationService getPresentation_service() {
            return presentation_service;
        }

        public void setPresentation_service(PresentationService presentation_service) {
            this.presentation_service = presentation_service;
        }

        public DrivingService getDriving_service() {
            return driving_service;
        }

        public void setDriving_service(DrivingService driving_service) {
            this.driving_service = driving_service;
        }

        public boolean isIs_shift_started() {
            return is_shift_started;
        }

        public void setIs_shift_started(boolean is_shift_started) {
            this.is_shift_started = is_shift_started;
        }

        public double getDate_shift_started() {
            return date_shift_started;
        }

        public void setDate_shift_started(double date_shift_started) {
            this.date_shift_started = date_shift_started;
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
