package com.grupomovil.entity.ws.response;

import java.util.List;

/**
 *
 * @author jeisson.junco
 */
public class EBWs_OpenServicesATV {

    public class ListData {

        private int id_issue;
        private String vehicle;
        private String date_issue;
        private String type;
        private String type_det;
        private Object description;

        public int getId_issue() {
            return id_issue;
        }

        public void setId_issue(int id_issue) {
            this.id_issue = id_issue;
        }

        public String getVehicle() {
            return vehicle;
        }

        public void setVehicle(String vehicle) {
            this.vehicle = vehicle;
        }

        public String getDate_issue() {
            return date_issue;
        }

        public void setDate_issue(String date_issue) {
            this.date_issue = date_issue;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getType_det() {
            return type_det;
        }

        public void setType_det(String type_det) {
            this.type_det = type_det;
        }

        public Object getDescription() {
            return description;
        }

        public void setDescription(Object description) {
            this.description = description;
        }

    }

    private String message;
    private boolean valid;
    private Object data;
    private List<ListData> list_data;
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
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

    public Object getId_data() {
        return id_data;
    }

    public void setId_data(Object id_data) {
        this.id_data = id_data;
    }

}
