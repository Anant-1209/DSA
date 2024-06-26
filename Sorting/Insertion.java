import java.util.*;

public class Insertion {

    public static void insertionSort(int arr[]) {
        int i, j, key;
        int n = arr.length;
        for (i = 1; i < n; i++) {
            key = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
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
            insertionSort(arr);
            System.out.print("Sorted array elements are: ");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");

            }
        }

    }
}