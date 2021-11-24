package com.Properties.Properties.entity;

// @ConfigurationProperties("my-properties")
// @Configuration
// @Component
public class MyProperties {

    private String host;
    private int port;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public MyProperties(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public MyProperties() {
    }

    @Override
    public String toString() {
        return "MyProperties [host=" + host + ", port=" + port + "]";
    }

}
