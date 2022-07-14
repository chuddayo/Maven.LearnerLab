package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {
    // TODO not sure how to write this singleton test
    @Test
    public void testSingleton() {
        Student individual = new Student(2, "Jim");
        Assert.assertTrue(Students.getInstance().contains(individual));
    }

}
