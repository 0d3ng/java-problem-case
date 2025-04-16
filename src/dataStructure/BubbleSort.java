package dataStructure;

public class BubbleSort {
    public int[] bubbleSort(int[] arr, int maxIterations){
        int n = arr.length;
        int iterations = 0;
        boolean swapped;

        for (int i = 0; i < n - 1 && iterations < maxIterations; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1 && iterations < maxIterations; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
                iterations++;
            }

            // Optimization: break if no two elements were swapped in inner loop
            if (!swapped) break;
        }

        return arr;
    }
}
