package org.example.beans;

public class ClientService {
    private static final  ClientService instance = new ClientService();

    private ClientService() {
        System.out.println("ClientService constructor called");
    }

    public static ClientService createInstance() {
        return instance;
    }

    public void doWork() {
        System.out.println("Doing some work...");
    }
}