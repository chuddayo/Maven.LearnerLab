package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    /* Create a testImplementation method that asserts that an Instructor is an instanceof a Teacher.
Create a testInheritance method that asserts that a Instructor is an instanceof a Person.
Create a testTeach method that ensures when an Instructor invokes the teach method, a respective student's totalStudyTime instance variable is incremented by the specified numberOfHours.
Create a testLecture method that ensures when an Instructor invokes the lecture method, a respective array of students' totalStudyTime instance variables is incremented by numberOfHours/students.length.
*/
    @Test
    public void implementationTest() {
        Instructor instructor = new Instructor();
        Assert.assertTrue(instructor instanceof Teacher);
    }
    @Test
    public void inheritanceTest() {
        Instructor instructor = new Instructor();
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        Student student = new Student();
        Instructor instructor = new Instructor();
        Double numberOfHours = 42.0;

        instructor.teach(student, numberOfHours);

        Assert.assertEquals(student.getTotalStudyTime(), numberOfHours);
    }

    @Test
    public void testLecture() {
        Student student1 = new Student();
        Student student2 = new Student();
        Student[] students = new Student[]{student1, student2};
        Instructor instructor = new Instructor();
        Double numberOfHours = 50.0;

        instructor.lecture(students, numberOfHours);
        Double expectedNum = 25.0;

        Assert.assertEquals(student1.getTotalStudyTime(), expectedNum);
    }
}
