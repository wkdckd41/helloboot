package tobyspring.config.autoconfig;

import tobyspring.config.MyConfigurationProperties;

@MyConfigurationProperties(prefix = "server")
public class ServerProperties {
    private String ContextPath;

    private int port;

    public String getContextPath() {
        return ContextPath;
    }

    public void setContextPath(String contextPath) {
        ContextPath = contextPath;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
