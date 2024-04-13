import java.util.*;

public class Merge {

    public static void merge(int arr[], int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];

        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }
        int k = left, i = 0, j = 0;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;

        }
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static int[] getInputArray(Scanner sc) {
        System.out.print("enter the size of the array: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("the array size must be greater than zero ");
            return null;
        }
        int[] arr = new int[n];
        System.out.print("enter the array elements: ");
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
            mergeSort(arr, 0, n - 1);
            System.out.print("Sorted array elements are: ");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");

            }
        }

    }

}
