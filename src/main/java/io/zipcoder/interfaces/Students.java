package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Students extends People<Student> {
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
    @Override
    public Student toArray() {
        return null;
    }
    public static Students getInstance() {
        return INSTANCE;
    }
}
