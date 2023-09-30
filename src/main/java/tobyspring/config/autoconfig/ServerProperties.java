package tobyspring.config.autoconfig;

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
