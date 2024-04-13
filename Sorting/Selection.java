import java.util.*;

public class Selection {

    public static void selectionSort(int arr[]) {
        int n = arr.length;
        int i, j, min_idx;
        for (i = 0; i < n - 1; i++) {
            min_idx = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;

                }

            }
            if (min_idx != i) {
                swap(arr, min_idx, i);
            }

        }
    }

    public static void swap(int arr[], int n1, int n2) {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
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
            selectionSort(arr);
            System.out.print("Sorted array elements are: ");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");

            }
        }

    }

}
