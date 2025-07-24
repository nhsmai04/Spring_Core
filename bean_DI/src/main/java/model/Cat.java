package model;

public class Cat {
    private String language;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setLanguage(String sound) {
        this.language = sound;
    }

    public void speak(){
        System.out.println(name+ " kêu: " +language);
    }
}
