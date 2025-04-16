package dataStructure;

public class SelectionSort {
    public int[] selectionSort(int[] arr, int maxIterations) {
        int n = arr.length;
        int iterations = 0;

        for (int i = 0; i < n - 1 && iterations < maxIterations; i++) {
            int minIndex = i;

            // Cari elemen terkecil di sisa array
            for (int j = i + 1; j < n && iterations < maxIterations; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
                iterations++;
            }

            // Tukar elemen terkecil dengan elemen di posisi i
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        return arr;
    }
}
