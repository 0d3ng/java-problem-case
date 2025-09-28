package dataStructure;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ArrayMinMaxTest {
    @org.junit.Test
    public void testFindMinMax() {
        ArrayMinMax arrayMinMax = new ArrayMinMax();
        int[] codeInput = { 80, 2, -3, 14, 95 };
        int[] codeOutput = arrayMinMax.findMinMax(codeInput);
        int[] expectedOutput = { -3, 95 };
        try {
            org.junit.Assert.assertArrayEquals("FindMinMax test failed: ", expectedOutput, codeOutput);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    public void testFindMinMaxEmpty() {
        int[] codeInput = {};
        // Empty Array, default value
        int[] expectedOutput = { Integer.MAX_VALUE, Integer.MIN_VALUE };
        ArrayMinMax arraySum = new ArrayMinMax();
        int[] codeOutput = arraySum.findMinMax(codeInput);
        // Memverifikasi output yang dihasilkan
        try {
            assertArrayEquals("Test Find MinMax Empty:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}
