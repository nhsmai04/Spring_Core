package org.example.beans.inheritance;

public  class Person {
    private String speak;
    private String work;
    public void setSpeak(String speak){
        this.speak = speak;
    }
    public void setWork(String work)
    {
        this.work = work ;
    }
    public void showInfo() {
        System.out.println("Speak: " + speak);
        System.out.println("Work: " + work);
    }
}
