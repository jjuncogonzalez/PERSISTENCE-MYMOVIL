package com.grupomovil.entity.ws;

import java.util.List;

/**
 *
 * @author jeisson.junco
 */
public class EBWs_ScheduledDepot {

    public class Service {

        private String time_destiny;
        private String time_origin;
        private String type_table;
        private String nombre;
        private String ruta;
        private String to_stop;
        private String from_stop;
        private String servbus;
        private String code_employee;
        private String code_vehicle;
        private String table;
        private String line;
        private String validatorList;
        private Boolean validatorHour;
        private String date_official;
        private Object batery;
        private String position;

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public String getTime_destiny() {
            return time_destiny;
        }

        public void setTime_destiny(String time_destiny) {
            this.time_destiny = time_destiny;
        }

        public String getTime_origin() {
            return time_origin;
        }

        public void setTime_origin(String time_origin) {
            this.time_origin = time_origin;
        }

        public String getType_table() {
            return type_table;
        }

        public void setType_table(String type_table) {
            this.type_table = type_table;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
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

        public String getServbus() {
            return servbus;
        }

        public void setServbus(String servbus) {
            this.servbus = servbus;
        }

        public String getCode_employee() {
            return code_employee;
        }

        public void setCode_employee(String code_employee) {
            this.code_employee = code_employee;
        }

        public String getCode_vehicle() {
            return code_vehicle;
        }

        public void setCode_vehicle(String code_vehicle) {
            this.code_vehicle = code_vehicle;
        }

        public String getTable() {
            return table;
        }

        public void setTable(String table) {
            this.table = table;
        }

        public String getLine() {
            return line;
        }

        public void setLine(String line) {
            this.line = line;
        }

        public String getValidatorList() {
            return validatorList;
        }

        public void setValidatorList(String validatorList) {
            this.validatorList = validatorList;
        }

        public Boolean getValidatorHour() {
            return validatorHour;
        }

        public void setValidatorHour(Boolean validatorHour) {
            this.validatorHour = validatorHour;
        }

        public String getDate_official() {
            return date_official;
        }

        public void setDate_official(String date_official) {
            this.date_official = date_official;
        }

        public Object getBatery() {
            return batery;
        }

        public void setBatery(Object batery) {
            this.batery = batery;
        }

    }

    public class Data {

//        private int total_services;
//        private int confirmed_services;
//        private int total_services_entries;
//        private int confirmed_services_entries;
//        private int total_services_exits;
//        private int confirmed_services_exits;
//        private int confirmed_services_exits_day;
//        private int confirmed_services_entries_day;
        private List<Service> services;
        private List<Service> servicesON;
        private List<Service> servicesOFF;
        private List<EBWs_Available.ListData> available;
        private EBWs_Validator obj_val;

//        public int getTotal_services() {
//            return total_services;
//        }
//
//        public void setTotal_services(int total_services) {
//            this.total_services = total_services;
//        }
//
//        public int getConfirmed_services() {
//            return confirmed_services;
//        }
//
//        public void setConfirmed_services(int confirmed_services) {
//            this.confirmed_services = confirmed_services;
//        }
//
//        public int getTotal_services_entries() {
//            return total_services_entries;
//        }
//
//        public void setTotal_services_entries(int total_services_entries) {
//            this.total_services_entries = total_services_entries;
//        }
//
//        public int getConfirmed_services_entries() {
//            return confirmed_services_entries;
//        }
//
//        public void setConfirmed_services_entries(int confirmed_services_entries) {
//            this.confirmed_services_entries = confirmed_services_entries;
//        }
//
//        public int getTotal_services_exits() {
//            return total_services_exits;
//        }
//
//        public void setTotal_services_exits(int total_services_exits) {
//            this.total_services_exits = total_services_exits;
//        }
//
//        public int getConfirmed_services_exits() {
//            return confirmed_services_exits;
//        }
//
//        public void setConfirmed_services_exits(int confirmed_services_exits) {
//            this.confirmed_services_exits = confirmed_services_exits;
//        }
//
//        public int getConfirmed_services_exits_day() {
//            return confirmed_services_exits_day;
//        }
//
//        public void setConfirmed_services_exits_day(int confirmed_services_exits_day) {
//            this.confirmed_services_exits_day = confirmed_services_exits_day;
//        }
//
//        public int getConfirmed_services_entries_day() {
//            return confirmed_services_entries_day;
//        }
//
//        public void setConfirmed_services_entries_day(int confirmed_services_entries_day) {
//            this.confirmed_services_entries_day = confirmed_services_entries_day;
//        }
        public List<Service> getServices() {
            return services;
        }

        public void setServices(List<Service> services) {
            this.services = services;
        }

        public List<Service> getServicesON() {
            return servicesON;
        }

        public void setServicesON(List<Service> servicesON) {
            this.servicesON = servicesON;
        }

        public List<Service> getServicesOFF() {
            return servicesOFF;
        }

        public void setServicesOFF(List<Service> servicesOFF) {
            this.servicesOFF = servicesOFF;
        }

        public List<EBWs_Available.ListData> getAvailable() {
            return available;
        }

        public void setAvailable(List<EBWs_Available.ListData> available) {
            this.available = available;
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
    private List<Data> listData;
    private List<Service> listServices;

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

    public List<Data> getListData() {
        return listData;
    }

    public void setListData(List<Data> listData) {
        this.listData = listData;
    }

    public List<Service> getListServices() {
        return listServices;
    }

    public void setListServices(List<Service> listServices) {
        this.listServices = listServices;
    }

}
