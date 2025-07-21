package org.example.beans.innerbeans;

public class Customer {
    private Person person;

    public Person getPerson()
    {
        return person;
    }
    public void setPerson(Person person){
        this.person = person;
    }
}
