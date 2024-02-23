package com.grupomovil.entity.parking;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Omar.beltran
 */
public class EBGm_ParkingParm implements Serializable {

    public class Parameter {

        public String _id;
        public String yard;
        public String type;
        public int quota;
        public Date register_date;
        public int __v;

        public String getId() {
            return _id;
        }

        public void setId(String _id) {
            this._id = _id;
        }

        public String getYard() {
            return yard;
        }

        public void setYard(String yard) {
            this.yard = yard;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getQuota() {
            return quota;
        }

        public void setQuota(int quota) {
            this.quota = quota;
        }

        public Date getRegister_date() {
            return register_date;
        }

        public void setRegister_date(Date register_date) {
            this.register_date = register_date;
        }

        public int getV() {
            return __v;
        }

        public void setV(int __v) {
            this.__v = __v;
        }

    }

    List<Parameter> parameter;

    public List<Parameter> getParameter() {
        return parameter;
    }

    public void setParameter(List<Parameter> parameter) {
        this.parameter = parameter;
    }

}
