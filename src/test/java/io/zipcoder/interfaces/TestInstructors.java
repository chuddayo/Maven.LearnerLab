package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void testInstructorsSingleton() {
        Instructor teach = new Instructor(39, "Billy");
        Assert.assertTrue(Instructors.getInstance().contains(teach));
    }
}
