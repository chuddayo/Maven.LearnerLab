package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation() {
        Student individual = new Student();
        Assert.assertTrue(individual instanceof Learner);
    }

    @Test
    public void testInheritance() {
        Student individual = new Student();
        Assert.assertTrue(individual instanceof Person);
    }

    @Test
    public void testLearn() {
        Double studyTime = 45.00;
        Student individual = new Student();

        individual.learn(studyTime);

        Assert.assertEquals(studyTime, individual.getTotalStudyTime());
    }
}
