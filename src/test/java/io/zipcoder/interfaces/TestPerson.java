package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void constructorTest() {
        long id = 2352;
        String name = "Johnny";
        Person individual = new Person(id, name);

        Assert.assertEquals(id, individual.getId());
        Assert.assertEquals(name, individual.getName());
    }

    @Test
    public void nullaryConstructorTest() {
        Person individual = new Person();

        long id = 0;
        String name = "";

        Assert.assertEquals(id, individual.getId());
        Assert.assertEquals(name, individual.getName());
    }

    @Test
    public void setNameTest() {
        long id = 42;
        String name = "Ryan";
        Person individual = new Person(id, name);

        individual.setName("Person");

        Assert.assertEquals("Person", individual.getName());
    }

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
