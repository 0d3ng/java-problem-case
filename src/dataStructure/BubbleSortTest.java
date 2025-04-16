package dataStructure;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class BubbleSortTest {
    @Test
    public void testBubbleSort1() {
        BubbleSort bSort = new BubbleSort();
        int[] codeInput1 = { 5, 2, 8, 1, 9 };
        int codeInput2 = 2;
        int[] codeOutput = bSort.bubbleSort(codeInput1, codeInput2);
        // Expected state after 2 iterations
        int[] expOutput = { 2, 1, 5, 8, 9 };
        try {
            assertEquals("Test 1:", Arrays.toString(expOutput), Arrays.toString(codeOutput));
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testBubbleSort2() {
        BubbleSort bSort = new BubbleSort();
        int[] codeInput1 = { 121, -1, 9, 83, 52, -7, 3, -83, 75 };
        int codeInput2 = 120;
        int[] codeOutput = bSort.bubbleSort(codeInput1, codeInput2);
        // Expected state after 120 iterations
        int[] expOutput = { -83, -7, -1, 3, 9, 52, 75, 83, 121 };
        try {
            assertEquals("Test 2:", Arrays.toString(expOutput), Arrays.toString(codeOutput));
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testBubbleSort3() {
        BubbleSort bSort = new BubbleSort();
        int[] codeInput1 = { -123, 53, 5, 23, -2, 48, 90, -83 };
        int codeInput2 = -10;
        int[] codeOutput = bSort.bubbleSort(codeInput1, codeInput2);
        // Expected state after -10 iterations
        int[] expOutput = { -123, 53, 5, 23, -2, 48, 90, -83 };
        try {
            assertEquals("Test 3:", Arrays.toString(expOutput), Arrays.toString(codeOutput));
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}
