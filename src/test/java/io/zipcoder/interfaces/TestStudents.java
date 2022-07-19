package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {
    @Test
    public void testStudentsSingleton() {
        Student individual = new Student(2, "Jim");
        Assert.assertTrue(Students.getInstance().contains(individual));
    }

}
