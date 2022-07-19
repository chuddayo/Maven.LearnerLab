package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {
    @Test
    public void testHostLecture() {
        Instructor kris = new Instructor(1, "Kris");
        Student fitru = new Student(1, "Fitru");
        Student kyle = new Student(2, "Kyle");
        Learner[] learners = new Learner[]{fitru, kyle};
        kris.lecture(learners , 22);
        Double expected = 11.0;

        Double fitruHours = fitru.getTotalStudyTime();
        Double kyleHours = kyle.getTotalStudyTime();

        Assert.assertEquals(fitruHours, expected);
        Assert.assertEquals(fitruHours, kyleHours);
    }
}
