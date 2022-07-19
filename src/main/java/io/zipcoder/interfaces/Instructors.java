package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Instructors extends People<Instructor> {
    private final static Instructors INSTANCE = new Instructors();
    private final List<Instructor> instructorList;
    private Instructors() {
        instructorList = new ArrayList<>();
    }
    public void add(Instructor instructor) {
        instructorList.add(instructor);
    }
    public boolean contains(Instructor instructor) {
        return instructorList.contains(instructor);
    }
    @Override
    public Instructor toArray() {
        return null;
    }
    public static Instructors getInstance() {
        return INSTANCE;
    }
}
