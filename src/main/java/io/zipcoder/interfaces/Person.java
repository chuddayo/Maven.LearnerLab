package io.zipcoder.interfaces;

public class Person {
    public final long id;
    String name;
    public Person() {
        this.id = 0;
        this.name = "";
    }
    public Person(long ID, String name) {
        this.id = ID;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
