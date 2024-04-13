import java.util.*;

public class Quick {

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }

        }
        swap(arr, i + 1, high);

        return i + 1;
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
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
            int n = arr.length;
            quickSort(arr, 0, n - 1);
            System.out.print("Sorted array elements are: ");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");

            }
        }

    }
}
