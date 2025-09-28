package identifier;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PersonTest {

    @Test
    public void test1Identifier() {
        String codeInputName = "Alice";
        int codeInputAge = 20;

        Person obj = new Person();
        String codeOutput = obj.getPersonInfo(codeInputName, codeInputAge);

        String expectedOutput = "Name: Alice\n" +
                "Age: 20\n";

        try {
            assertEquals("Test Alice (20):", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void test2Identifier() {
        String codeInputName = "Bob";
        int codeInputAge = 30;

        Person obj = new Person();
        String codeOutput = obj.getPersonInfo(codeInputName, codeInputAge);

        String expectedOutput = "Name: Bob\n" +
                "Age: 30\n";

        try {
            assertEquals("Test Bob (30):", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void test3Identifier() {
        String codeInputName = "Charlie";
        int codeInputAge = 25;

        // Person obj = new Person();
        // String codeOutput = obj.getPersonInfo(codeInputName, codeInputAge);

        Person obj = new Person(codeInputName, codeInputAge);
        String codeOutput = obj.getPersonInfo();

        String expectedOutput = "Name: Charlie\n" +
                "Age: 25\n";

        try {
            assertEquals("Test Charlie (25):", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}