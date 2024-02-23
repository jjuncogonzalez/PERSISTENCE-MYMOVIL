package com.grupomovil.entity.ws;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;


/**
 *
 * @author jeisson.junco
 */
public class EBWs_Rules {

    public class Metric {

        public double speed_max;
        public double speed_last5m;
        public double speed;
        public String node;
        public int matched;
        public int taken;
        public int success;
        public int failed;

        public double getSpeed_max() {
            return speed_max;
        }

        public void setSpeed_max(double speed_max) {
            this.speed_max = speed_max;
        }

        public double getSpeed_last5m() {
            return speed_last5m;
        }

        public void setSpeed_last5m(double speed_last5m) {
            this.speed_last5m = speed_last5m;
        }

        public double getSpeed() {
            return speed;
        }

        public void setSpeed(double speed) {
            this.speed = speed;
        }

        public String getNode() {
            return node;
        }

        public void setNode(String node) {
            this.node = node;
        }

        public int getMatched() {
            return matched;
        }

        public void setMatched(int matched) {
            this.matched = matched;
        }

        public int getTaken() {
            return taken;
        }

        public void setTaken(int taken) {
            this.taken = taken;
        }

        public int getSuccess() {
            return success;
        }

        public void setSuccess(int success) {
            this.success = success;
        }

        public int getFailed() {
            return failed;
        }

        public void setFailed(int failed) {
            this.failed = failed;
        }
        
    }

    public class Params {

        public String payload_tmpl;
        public String collection;
        @JsonProperty("$resource")
        public String resource;
        public String target_topic;
        public int target_qos;
        public int sync_timeout;
        public String sql;
        public boolean enable_batch;

        public String getPayload_tmpl() {
            return payload_tmpl;
        }

        public void setPayload_tmpl(String payload_tmpl) {
            this.payload_tmpl = payload_tmpl;
        }

        public String getCollection() {
            return collection;
        }

        public void setCollection(String collection) {
            this.collection = collection;
        }

        public String getResource() {
            return resource;
        }

        public void setResource(String resource) {
            this.resource = resource;
        }

        public String getTarget_topic() {
            return target_topic;
        }

        public void setTarget_topic(String target_topic) {
            this.target_topic = target_topic;
        }

        public int getTarget_qos() {
            return target_qos;
        }

        public void setTarget_qos(int target_qos) {
            this.target_qos = target_qos;
        }

        public int getSync_timeout() {
            return sync_timeout;
        }

        public void setSync_timeout(int sync_timeout) {
            this.sync_timeout = sync_timeout;
        }

        public String getSql() {
            return sql;
        }

        public void setSql(String sql) {
            this.sql = sql;
        }

        public boolean isEnable_batch() {
            return enable_batch;
        }

        public void setEnable_batch(boolean enable_batch) {
            this.enable_batch = enable_batch;
        }

    }

    public class Action {

        public Params params;
        public String name;
        public List<Metric> metrics;
        public String id;
        public List<Object> fallbacks;

        public Params getParams() {
            return params;
        }

        public void setParams(Params params) {
            this.params = params;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Metric> getMetrics() {
            return metrics;
        }

        public void setMetrics(List<Metric> metrics) {
            this.metrics = metrics;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public List<Object> getFallbacks() {
            return fallbacks;
        }

        public void setFallbacks(List<Object> fallbacks) {
            this.fallbacks = fallbacks;
        }

    }

    public class Datum {

        public String rawsql;
        public String on_action_failed;
        public List<Metric> metrics;
        public String id;
        @JsonProperty("for")
        public List<String> myfor;
        public boolean enabled;
        public String description;
        public List<Action> actions;

        public String getRawsql() {
            return rawsql;
        }

        public void setRawsql(String rawsql) {
            this.rawsql = rawsql;
        }

        public String getOn_action_failed() {
            return on_action_failed;
        }

        public void setOn_action_failed(String on_action_failed) {
            this.on_action_failed = on_action_failed;
        }

        public List<Metric> getMetrics() {
            return metrics;
        }

        public void setMetrics(List<Metric> metrics) {
            this.metrics = metrics;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public List<String> getMyfor() {
            return myfor;
        }

        public void setMyfor(List<String> myfor) {
            this.myfor = myfor;
        }

        public boolean isEnabled() {
            return enabled;
        }

        public void setEnabled(boolean enabled) {
            this.enabled = enabled;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public List<Action> getActions() {
            return actions;
        }

        public void setActions(List<Action> actions) {
            this.actions = actions;
        }

    }

    public List<Datum> data;
    public int code;

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
