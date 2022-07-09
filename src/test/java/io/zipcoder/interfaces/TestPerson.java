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
    public void setNameTest() {
        long id = 42;
        String name = "Ryan";
        Person individual = new Person(id, name);

        individual.setName("Person");

        Assert.assertEquals("Person", individual.getName());
    }
}
