package io.zipcoder.interfaces;

public class Student extends Person implements Learner {
    double totalStudyTime;
    public Student() {}
    public Student(long ID, String name) {
        super(ID, name);
        Students.getInstance().add(this);
    }
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
