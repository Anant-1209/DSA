import java.util.*;

public class RepeatedElement {
    public static int[] repeated(int arr[], int n) {
        int result[] = new int[2];
        for (int i = 0; i < n + 2; i++) {
            if (arr[Math.abs(arr[i])] < 0) {
                if (result[0] == 0) {
                    result[0] = Math.abs(arr[i]);
                } else {
                    result[1] = Math.abs(arr[i]);
                }
            } else {
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            }
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n + 2];
        System.out.print("enter the array elements: ");
        for (int i = 0; i < n + 2; i++) {
            arr[i] = sc.nextInt();
        }
        int result[] = repeated(arr, n);
        System.out.println("repeated elements are: ");
        for (int i = 0; i < 2; i++) {
            System.out.print(result[i] + " ");
        }

    }
}
