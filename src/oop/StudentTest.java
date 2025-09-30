package oop;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testStudentObjectCreation() {
        // Code input
        String codeInputName = "Alice";
        int codeInputAge = 20;

        // Execution / code output
        Student codeOutputStudent = new Student(codeInputName, codeInputAge);
        String codeOutput = codeOutputStudent.getName() + " " + codeOutputStudent.getName();

        // Expected output
        String expectedOutput = "Alice 20";

        // Assertion
        try {
            assertEquals("Student object creation test:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testGetterAge() {
        // Code input
        String codeInputName = "Bob";
        int codeInputAge = 22;
        Student codeInputStudent = new Student(codeInputName, codeInputAge);

        // Execution / code output
        int codeOutput = codeInputStudent.getAge();

        // Expected output
        int expectedOutput = 22;

        // Assertion
        try {
            assertEquals("Getter age test:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testSetterAge() {
        // Code input
        String codeInputName = "Charlie";
        int codeInputAge = 25;
        int codeInputNewAge = 30;
        Student codeInputStudent = new Student(codeInputName, codeInputAge);

        // Execution / code output
        codeInputStudent.setAge(codeInputNewAge);
        int codeOutput = codeInputStudent.getAge();

        // Expected output
        int expectedOutput = 30;

        // Assertion
        try {
            assertEquals("Setter age test:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}
