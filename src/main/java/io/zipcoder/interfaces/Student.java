package io.zipcoder.interfaces;

public class Student extends Person implements Learner {
    Double totalStudyTime;
    public Student() {
        totalStudyTime = 0.0;
    }
    public Student(long ID, String name) {
        super(ID, name);
        totalStudyTime = 0.0;
        Students.getInstance().add(this);
    }
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
