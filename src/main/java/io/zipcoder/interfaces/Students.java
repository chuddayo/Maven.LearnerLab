package io.zipcoder.interfaces;

public class Students extends People {
    private final static Students INSTANCE = new Students();

    private Students() {}

    public static Students getInstance() {
        return INSTANCE;
    }
}
