import java.util.*;

public class Heap {
    public static void heapSort(int arr[], int n) {
        // Build heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            shift(arr, i, n - 1);
        }
        // Extract elements from heap
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            shift(arr, 0, i - 1);
        }
    }

    public static void shift(int arr[], int root, int bottom) {
        int temp, maxChild;
        boolean done = false;

        while ((root * 2 <= bottom) && (!done)) {
            int leftChild = root * 2 + 1; // +1 because array indices start from 0
            int rightChild = root * 2 + 2; // +2 because array indices start from 0

            if (rightChild <= bottom && arr[leftChild] < arr[rightChild]) {
                maxChild = rightChild;
            } else {
                maxChild = leftChild;
            }

            if (arr[root] < arr[maxChild]) {
                temp = arr[root];
                arr[root] = arr[maxChild];
                arr[maxChild] = temp;
                root = maxChild;
            } else {
                done = true;
            }
        }
    }

    public static int[] getInputArray(Scanner sc) {
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("The array size must be greater than zero.");
            return null;
        }
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for (int j = 0; j < n; j++) {
            arr[j] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = getInputArray(sc);
        if (arr != null) {
            int n = arr.length;
            heapSort(arr, n);
            System.out.print("Sorted array elements are: ");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
        }
    }
}
