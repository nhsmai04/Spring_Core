package org.example.beans.inheritance;

public class Cat {
    private String speak;
    public void setSpeak(String speak)
    {
        this.speak = speak;
    }
    public void showInfo() {
        System.out.println("Speak: " + speak);

    }
}
