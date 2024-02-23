package com.grupomovil.entity;

import java.util.List;

/**
 *
 * @author jeisson.junco
 */
public class EBGoogleSheets {

    public class C {

        private Object v;
        private String f;

        public Object getV() {
            return v;
        }

        public void setV(Object v) {
            this.v = v;
        }

        public String getF() {
            return f;
        }

        public void setF(String f) {
            this.f = f;
        }

    }

    public class Col {

        private String id;
        private String label;
        private String type;
        private String pattern;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getPattern() {
            return pattern;
        }

        public void setPattern(String pattern) {
            this.pattern = pattern;
        }

    }

    private String version;
    private String reqId;
    private String status;
    private String sig;
    private Table table;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getReqId() {
        return reqId;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSig() {
        return sig;
    }

    public void setSig(String sig) {
        this.sig = sig;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public class Row {

        private List<C> c;

        public List<C> getC() {
            return c;
        }

        public void setC(List<C> c) {
            this.c = c;
        }

    }

    public class Table {

        private List<Col> cols;
        private List<Row> rows;
        private int parsedNumHeaders;

        public List<Col> getCols() {
            return cols;
        }

        public void setCols(List<Col> cols) {
            this.cols = cols;
        }

        public List<Row> getRows() {
            return rows;
        }

        public void setRows(List<Row> rows) {
            this.rows = rows;
        }

        public int getParsedNumHeaders() {
            return parsedNumHeaders;
        }

        public void setParsedNumHeaders(int parsedNumHeaders) {
            this.parsedNumHeaders = parsedNumHeaders;
        }

    }

}
