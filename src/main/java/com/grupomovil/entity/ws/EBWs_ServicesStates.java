package com.grupomovil.entity.ws;

import java.util.List;

/**
 *
 * @author jeisson.junco
 */
public class EBWs_ServicesStates {

    public class VehiclesInDepot {

        private String codigo;
        private String type_vehicle;

        public String getCodigo() {
            return codigo;
        }

        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }

        public String getType_vehicle() {
            return type_vehicle;
        }

        public void setType_vehicle(String type_vehicle) {
            this.type_vehicle = type_vehicle;
        }

    }

    public class Vehicle {

        private String codigo;
        private String type_vehicle;

        public String getCodigo() {
            return codigo;
        }

        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }

        public String getType_vehicle() {
            return type_vehicle;
        }

        public void setType_vehicle(String type_vehicle) {
            this.type_vehicle = type_vehicle;
        }

    }

    public class VehiclesAssigment {

        private Vehicle vehicle;

        public Vehicle getVehicle() {
            return vehicle;
        }

        public void setVehicle(Vehicle vehicle) {
            this.vehicle = vehicle;
        }

    }

    public class Employee {

        private String name;
        private String number;
        private String code_tm;
        private String dni;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getCode_tm() {
            return code_tm;
        }

        public void setCode_tm(String code_tm) {
            this.code_tm = code_tm;
        }

        public String getDni() {
            return dni;
        }

        public void setDni(String dni) {
            this.dni = dni;
        }

    }

    public class VehiclesStranded {

        private Employee employee;
        private String fail_system;
        private Vehicle vehicle;

        public Employee getEmployee() {
            return employee;
        }

        public void setEmployee(Employee employee) {
            this.employee = employee;
        }

        public String getFail_system() {
            return fail_system;
        }

        public void setFail_system(String fail_system) {
            this.fail_system = fail_system;
        }

        public Vehicle getVehicle() {
            return vehicle;
        }

        public void setVehicle(Vehicle vehicle) {
            this.vehicle = vehicle;
        }

    }

    public class VehiclesAccident {

        private Employee employee;
        private String route;
        private Vehicle vehicle;
        private String type_event;
        private boolean assisted;

        public Employee getEmployee() {
            return employee;
        }

        public void setEmployee(Employee employee) {
            this.employee = employee;
        }

        public String getRoute() {
            return route;
        }

        public void setRoute(String route) {
            this.route = route;
        }

        public Vehicle getVehicle() {
            return vehicle;
        }

        public void setVehicle(Vehicle vehicle) {
            this.vehicle = vehicle;
        }

        public String getType_event() {
            return type_event;
        }

        public void setType_event(String type_event) {
            this.type_event = type_event;
        }

        public boolean isAssisted() {
            return assisted;
        }

        public void setAssisted(boolean assisted) {
            this.assisted = assisted;
        }

    }

    public class VehiclesIssueOther {

        private Employee employee;
        private Vehicle vehicle;
        private int inoperative_days;
        private String type_event;

        public Employee getEmployee() {
            return employee;
        }

        public void setEmployee(Employee employee) {
            this.employee = employee;
        }

        public Vehicle getVehicle() {
            return vehicle;
        }

        public void setVehicle(Vehicle vehicle) {
            this.vehicle = vehicle;
        }

        public int getInoperative_days() {
            return inoperative_days;
        }

        public void setInoperative_days(int inoperative_days) {
            this.inoperative_days = inoperative_days;
        }

        public String getType_event() {
            return type_event;
        }

        public void setType_event(String type_event) {
            this.type_event = type_event;
        }

    }

    public class VehiclesMantenimentDepot {

        private String type_attention;
        private Vehicle vehicle;
        private int inoperative_days;

        public String getType_attention() {
            return type_attention;
        }

        public void setType_attention(String type_attention) {
            this.type_attention = type_attention;
        }

        public Vehicle getVehicle() {
            return vehicle;
        }

        public void setVehicle(Vehicle vehicle) {
            this.vehicle = vehicle;
        }

        public int getInoperative_days() {
            return inoperative_days;
        }

        public void setInoperative_days(int inoperative_days) {
            this.inoperative_days = inoperative_days;
        }

    }

    public class Data {

        private int total_operatives;
        private int total_in_depot;
        private List<VehiclesInDepot> vehicles_in_depot;
        private int total_assigment;
        private List<VehiclesAssigment> vehicles_assigment;
        private int total_inoperatives;
        private int total_stranded;
        private List<VehiclesStranded> vehicles_stranded;
        private int total_accident;
        private List<VehiclesAccident> vehicles_accident;
        private int total_others;
        private List<VehiclesIssueOther> vehicles_issue_others;
        private int total_manteniment;
        private List<VehiclesMantenimentDepot> vehicles_manteniment_depot;

        public int getTotal_operatives() {
            return total_operatives;
        }

        public void setTotal_operatives(int total_operatives) {
            this.total_operatives = total_operatives;
        }

        public int getTotal_in_depot() {
            return total_in_depot;
        }

        public void setTotal_in_depot(int total_in_depot) {
            this.total_in_depot = total_in_depot;
        }

        public List<VehiclesInDepot> getVehicles_in_depot() {
            return vehicles_in_depot;
        }

        public void setVehicles_in_depot(List<VehiclesInDepot> vehicles_in_depot) {
            this.vehicles_in_depot = vehicles_in_depot;
        }

        public int getTotal_assigment() {
            return total_assigment;
        }

        public void setTotal_assigment(int total_assigment) {
            this.total_assigment = total_assigment;
        }

        public List<VehiclesAssigment> getVehicles_assigment() {
            return vehicles_assigment;
        }

        public void setVehicles_assigment(List<VehiclesAssigment> vehicles_assigment) {
            this.vehicles_assigment = vehicles_assigment;
        }

        public int getTotal_inoperatives() {
            return total_inoperatives;
        }

        public void setTotal_inoperatives(int total_inoperatives) {
            this.total_inoperatives = total_inoperatives;
        }

        public int getTotal_stranded() {
            return total_stranded;
        }

        public void setTotal_stranded(int total_stranded) {
            this.total_stranded = total_stranded;
        }

        public List<VehiclesStranded> getVehicles_stranded() {
            return vehicles_stranded;
        }

        public void setVehicles_stranded(List<VehiclesStranded> vehicles_stranded) {
            this.vehicles_stranded = vehicles_stranded;
        }

        public int getTotal_accident() {
            return total_accident;
        }

        public void setTotal_accident(int total_accident) {
            this.total_accident = total_accident;
        }

        public List<VehiclesAccident> getVehicles_accident() {
            return vehicles_accident;
        }

        public void setVehicles_accident(List<VehiclesAccident> vehicles_accident) {
            this.vehicles_accident = vehicles_accident;
        }

        public int getTotal_others() {
            return total_others;
        }

        public void setTotal_others(int total_others) {
            this.total_others = total_others;
        }

        public List<VehiclesIssueOther> getVehicles_issue_others() {
            return vehicles_issue_others;
        }

        public void setVehicles_issue_others(List<VehiclesIssueOther> vehicles_issue_others) {
            this.vehicles_issue_others = vehicles_issue_others;
        }

        public int getTotal_manteniment() {
            return total_manteniment;
        }

        public void setTotal_manteniment(int total_manteniment) {
            this.total_manteniment = total_manteniment;
        }

        public List<VehiclesMantenimentDepot> getVehicles_manteniment_depot() {
            return vehicles_manteniment_depot;
        }

        public void setVehicles_manteniment_depot(List<VehiclesMantenimentDepot> vehicles_manteniment_depot) {
            this.vehicles_manteniment_depot = vehicles_manteniment_depot;
        }

    }

    public class ListData {

        private int total_operatives;
        private int total_in_depot;
        private List<VehiclesInDepot> vehicles_in_depot;
        private int total_assigment;
        private List<VehiclesAssigment> vehicles_assigment;
        private int total_inoperatives;
        private int total_stranded;
        private List<VehiclesStranded> vehicles_stranded;
        private int total_accident;
        private List<VehiclesAccident> vehicles_accident;
        private int total_others;
        private List<VehiclesIssueOther> vehicles_issue_others;
        private int total_manteniment;
        private List<VehiclesMantenimentDepot> vehicles_manteniment_depot;

        public int getTotal_operatives() {
            return total_operatives;
        }

        public void setTotal_operatives(int total_operatives) {
            this.total_operatives = total_operatives;
        }

        public int getTotal_in_depot() {
            return total_in_depot;
        }

        public void setTotal_in_depot(int total_in_depot) {
            this.total_in_depot = total_in_depot;
        }

        public List<VehiclesInDepot> getVehicles_in_depot() {
            return vehicles_in_depot;
        }

        public void setVehicles_in_depot(List<VehiclesInDepot> vehicles_in_depot) {
            this.vehicles_in_depot = vehicles_in_depot;
        }

        public int getTotal_assigment() {
            return total_assigment;
        }

        public void setTotal_assigment(int total_assigment) {
            this.total_assigment = total_assigment;
        }

        public List<VehiclesAssigment> getVehicles_assigment() {
            return vehicles_assigment;
        }

        public void setVehicles_assigment(List<VehiclesAssigment> vehicles_assigment) {
            this.vehicles_assigment = vehicles_assigment;
        }

        public int getTotal_inoperatives() {
            return total_inoperatives;
        }

        public void setTotal_inoperatives(int total_inoperatives) {
            this.total_inoperatives = total_inoperatives;
        }

        public int getTotal_stranded() {
            return total_stranded;
        }

        public void setTotal_stranded(int total_stranded) {
            this.total_stranded = total_stranded;
        }

        public List<VehiclesStranded> getVehicles_stranded() {
            return vehicles_stranded;
        }

        public void setVehicles_stranded(List<VehiclesStranded> vehicles_stranded) {
            this.vehicles_stranded = vehicles_stranded;
        }

        public int getTotal_accident() {
            return total_accident;
        }

        public void setTotal_accident(int total_accident) {
            this.total_accident = total_accident;
        }

        public List<VehiclesAccident> getVehicles_accident() {
            return vehicles_accident;
        }

        public void setVehicles_accident(List<VehiclesAccident> vehicles_accident) {
            this.vehicles_accident = vehicles_accident;
        }

        public int getTotal_others() {
            return total_others;
        }

        public void setTotal_others(int total_others) {
            this.total_others = total_others;
        }

        public List<VehiclesIssueOther> getVehicles_issue_others() {
            return vehicles_issue_others;
        }

        public void setVehicles_issue_others(List<VehiclesIssueOther> vehicles_issue_others) {
            this.vehicles_issue_others = vehicles_issue_others;
        }

        public int getTotal_manteniment() {
            return total_manteniment;
        }

        public void setTotal_manteniment(int total_manteniment) {
            this.total_manteniment = total_manteniment;
        }

        public List<VehiclesMantenimentDepot> getVehicles_manteniment_depot() {
            return vehicles_manteniment_depot;
        }

        public void setVehicles_manteniment_depot(List<VehiclesMantenimentDepot> vehicles_manteniment_depot) {
            this.vehicles_manteniment_depot = vehicles_manteniment_depot;
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
