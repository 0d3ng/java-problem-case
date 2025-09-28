package dataStructure;

public class ArrayMinMax {
    public int[] findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[] { Integer.MAX_VALUE, Integer.MIN_VALUE };
        }
        int min = arr[0];
        int max = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return new int[] { min, max };
    }
}
