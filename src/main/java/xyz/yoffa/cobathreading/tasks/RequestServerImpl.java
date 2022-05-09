package xyz.yoffa.cobathreading.tasks;

import xyz.yoffa.cobathreading.types.Request;
import xyz.yoffa.cobathreading.types.Response;

public class RequestServerImpl implements RequestServer {

    private final Request request;

    public RequestServerImpl(Request request) {
        this.request = request;
    }

    @Override
    public void run() {
        var response = buildResponse();
        System.out.printf("I am %s. My sole purpose is to serve a request %n", Thread.currentThread().getName());
        System.out.printf("Data received from %s %n", getCurrentRequest().getSource());
        System.out.printf("Response generated: {Status: %d, Data: %s }%n", response.getStatus(), response.getData());
        System.out.println("My purpose is fulfilled. Goodbye");
    }

    @Override
    public Request getCurrentRequest() {
        return request;
    }

    @Override
    public Response buildResponse() {
        return new Response(200, getCurrentRequest().getData());
    }
}
