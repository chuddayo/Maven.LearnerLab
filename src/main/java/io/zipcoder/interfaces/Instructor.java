package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {
    public Instructor() {}
    public Instructor(long ID, String name) {
        super(ID, name);
        Instructors.getInstance().add(this);
    }
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }
    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (Learner learner : learners) learner.learn(numberOfHoursPerLearner);
    }
}
