package org.example.aspect;

public class AspectXML {
    public void monitor(Object service)
    {
        System.out.println("Before advice - Service class: " + service.getClass().getName());
    }
}
