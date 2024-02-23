package com.grupomovil.entity.ws;

import java.util.List;

/**
 *
 * @author jeisson.junco
 */
public class EBConfirmDepotEntryResponse {

    public class ListTaskMtto {

        private String task;
        private String time_origin;
        private String time_destiny;
        private String vehicle;

        public String getTask() {
            return task;
        }

        public void setTask(String task) {
            this.task = task;
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

        public String getVehicle() {
            return vehicle;
        }

        public void setVehicle(String vehicle) {
            this.vehicle = vehicle;
        }

    }

    public class ListCheckFail {

        private int id_check_det;
        private String component_fails;
        private String component;
        private boolean status;
        private String description;

        public int getId_check_det() {
            return id_check_det;
        }

        public void setId_check_det(int id_check_det) {
            this.id_check_det = id_check_det;
        }

        public String getComponent_fails() {
            return component_fails;
        }

        public void setComponent_fails(String component_fails) {
            this.component_fails = component_fails;
        }

        public String getComponent() {
            return component;
        }

        public void setComponent(String component) {
            this.component = component;
        }

        public boolean isStatus() {
            return status;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

    }

    public class Data {

        private List<ListTaskMtto> list_task_mtto;
        private List<ListCheckFail> list_check_fails;

        public List<ListTaskMtto> getList_task_mtto() {
            return list_task_mtto;
        }

        public void setList_task_mtto(List<ListTaskMtto> list_task_mtto) {
            this.list_task_mtto = list_task_mtto;
        }

        public List<ListCheckFail> getList_check_fails() {
            return list_check_fails;
        }

        public void setList_check_fails(List<ListCheckFail> list_check_fails) {
            this.list_check_fails = list_check_fails;
        }

    }

    public class ListData {

        private List<ListTaskMtto> list_task_mtto;
        private List<ListCheckFail> list_check_fails;

        public List<ListTaskMtto> getList_task_mtto() {
            return list_task_mtto;
        }

        public void setList_task_mtto(List<ListTaskMtto> list_task_mtto) {
            this.list_task_mtto = list_task_mtto;
        }

        public List<ListCheckFail> getList_check_fails() {
            return list_check_fails;
        }

        public void setList_check_fails(List<ListCheckFail> list_check_fails) {
            this.list_check_fails = list_check_fails;
        }

    }

    private String message;
    private boolean valid;
    private Data data;
    private List<ListData> list_data;
    private int status;
    private int id_data;

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

    public List<ListData> getList_data() {
        return list_data;
    }

    public void setList_data(List<ListData> list_data) {
        this.list_data = list_data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getId_data() {
        return id_data;
    }

    public void setId_data(int id_data) {
        this.id_data = id_data;
    }

}
