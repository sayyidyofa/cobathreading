package xyz.yoffa.cobathreading;

import xyz.yoffa.cobathreading.tasks.RequestServerImpl;
import xyz.yoffa.cobathreading.types.Request;

public class Main {

    public static void main(String[] args) {

        Runnable serviceInstance1 = new RequestServerImpl(new Request("localhost", "/home", "hi!"));
        Runnable serviceInstance2 = new RequestServerImpl(new Request("google.com", "/login", "authToken"));

        Thread thread1 = new Thread(serviceInstance1, "thread1");
        Thread thread2 = new Thread(serviceInstance2, "thread2");

        thread1.start();
        thread2.start();
    }
}