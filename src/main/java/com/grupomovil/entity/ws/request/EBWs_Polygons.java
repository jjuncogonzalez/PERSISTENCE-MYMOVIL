package com.grupomovil.entity.ws.request;

import java.util.List;

/**
 *
 * @author jeisson.junco
 */
public class EBWs_Polygons {

    public class Polygon {

        private double lat;
        private double lng;

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }

        public double getLng() {
            return lng;
        }

        public void setLng(double lng) {
            this.lng = lng;
        }

    }

    public class Radius {

        private double lat;
        private double lng;

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }

        public double getLng() {
            return lng;
        }

        public void setLng(double lng) {
            this.lng = lng;
        }

    }

    public class Coords {

        private int radius;
        private Radius center;

        public int getRadius() {
            return radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }

        public Radius getCenter() {
            return center;
        }

        public void setCenter(Radius center) {
            this.center = center;
        }

    }

    private String form;
    private String name;
    private String description;
    private String status_input;
    private String variable_focus;
    private String variable_input;
    private String range_focus;
    private String range_input;
    private String value;
    private int zone_type;
    private Coords coords;
    private List<Polygon> polygon;

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus_input() {
        return status_input;
    }

    public void setStatus_input(String status_input) {
        this.status_input = status_input;
    }

    public String getVariable_focus() {
        return variable_focus;
    }

    public void setVariable_focus(String variable_focus) {
        this.variable_focus = variable_focus;
    }

    public String getVariable_input() {
        return variable_input;
    }

    public void setVariable_input(String variable_input) {
        this.variable_input = variable_input;
    }

    public String getRange_focus() {
        return range_focus;
    }

    public void setRange_focus(String range_focus) {
        this.range_focus = range_focus;
    }

    public String getRange_input() {
        return range_input;
    }

    public void setRange_input(String range_input) {
        this.range_input = range_input;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getZone_type() {
        return zone_type;
    }

    public void setZone_type(int zone_type) {
        this.zone_type = zone_type;
    }

    public Coords getCoords() {
        return coords;
    }

    public void setCoords(Coords coords) {
        this.coords = coords;
    }

    public List<Polygon> getPolygon() {
        return polygon;
    }

    public void setPolygon(List<Polygon> polygon) {
        this.polygon = polygon;
    }

}
