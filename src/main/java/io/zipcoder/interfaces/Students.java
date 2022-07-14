package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Students extends People {
    private final static Students INSTANCE = new Students();
    private final List<Student> studentList;
    private Students() {
        studentList = new ArrayList<>();
    }
    public void add(Student student) {
        studentList.add(student);
    }
    public boolean contains(Student student){
        return studentList.contains(student);
    }
    public static Students getInstance() {
        return INSTANCE;
    }
    // TODO create add and retrieve methods to be test-able
}
