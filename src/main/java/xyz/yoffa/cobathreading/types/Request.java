package xyz.yoffa.cobathreading.types;

public class Request {
    private String source;
    private String destination;
    private String data;


    public Request(String source, String destination, String data) {
        this.source = source;
        this.destination = destination;
        this.data = data;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
