package com.grupomovil.entity.ws;

import java.util.List;

/**
 *
 * @author jeisson.junco
 */
public class EBWs_Resources {

    public class Keyfile {

        private String filename;
        private String file;

        public String getFilename() {
            return filename;
        }

        public void setFilename(String filename) {
            this.filename = filename;
        }

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }
        
        
    }

    public class Certfile {

        private String filename;
        private String file;

        public String getFilename() {
            return filename;
        }

        public void setFilename(String filename) {
            this.filename = filename;
        }

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }
        
        
    }

    public class Cacertfile {

        private String filename;
        private String file;

        public String getFilename() {
            return filename;
        }

        public void setFilename(String filename) {
            this.filename = filename;
        }

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }
        
        
    }

    public class Headers {
    }

    public class Config {

        private String w_mode;
        private boolean verify;
        private boolean ssl;
        private String servers;
        private int pool_size;
        private String password;
        private String login;
        private Keyfile keyfile;
        private String database;
        private int connectTimoutMS;
        private Certfile certfile;
        private Cacertfile cacertfile;
        private String auth_source;
        private String user;
        private String server;
        private boolean auto_reconnect;
        private String url;
        private String request_timeout;
        private String method;
        private Headers headers;
        private String connect_timeout;
        private String username;

        public String getW_mode() {
            return w_mode;
        }

        public void setW_mode(String w_mode) {
            this.w_mode = w_mode;
        }

        public boolean isVerify() {
            return verify;
        }

        public void setVerify(boolean verify) {
            this.verify = verify;
        }

        public boolean isSsl() {
            return ssl;
        }

        public void setSsl(boolean ssl) {
            this.ssl = ssl;
        }

        public String getServers() {
            return servers;
        }

        public void setServers(String servers) {
            this.servers = servers;
        }

        public int getPool_size() {
            return pool_size;
        }

        public void setPool_size(int pool_size) {
            this.pool_size = pool_size;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public Keyfile getKeyfile() {
            return keyfile;
        }

        public void setKeyfile(Keyfile keyfile) {
            this.keyfile = keyfile;
        }

        public String getDatabase() {
            return database;
        }

        public void setDatabase(String database) {
            this.database = database;
        }

        public int getConnectTimoutMS() {
            return connectTimoutMS;
        }

        public void setConnectTimoutMS(int connectTimoutMS) {
            this.connectTimoutMS = connectTimoutMS;
        }

        public Certfile getCertfile() {
            return certfile;
        }

        public void setCertfile(Certfile certfile) {
            this.certfile = certfile;
        }

        public Cacertfile getCacertfile() {
            return cacertfile;
        }

        public void setCacertfile(Cacertfile cacertfile) {
            this.cacertfile = cacertfile;
        }

        public String getAuth_source() {
            return auth_source;
        }

        public void setAuth_source(String auth_source) {
            this.auth_source = auth_source;
        }

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public String getServer() {
            return server;
        }

        public void setServer(String server) {
            this.server = server;
        }

        public boolean isAuto_reconnect() {
            return auto_reconnect;
        }

        public void setAuto_reconnect(boolean auto_reconnect) {
            this.auto_reconnect = auto_reconnect;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getRequest_timeout() {
            return request_timeout;
        }

        public void setRequest_timeout(String request_timeout) {
            this.request_timeout = request_timeout;
        }

        public String getMethod() {
            return method;
        }

        public void setMethod(String method) {
            this.method = method;
        }

        public Headers getHeaders() {
            return headers;
        }

        public void setHeaders(Headers headers) {
            this.headers = headers;
        }

        public String getConnect_timeout() {
            return connect_timeout;
        }

        public void setConnect_timeout(String connect_timeout) {
            this.connect_timeout = connect_timeout;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }
        
        
    }

    public class Datum {

        private String type;
        private boolean status;
        private String id;
        private String description;
        private Config config;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public boolean isStatus() {
            return status;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Config getConfig() {
            return config;
        }

        public void setConfig(Config config) {
            this.config = config;
        }
        
        
    }

    private List<Datum> data;
    private int code;

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

