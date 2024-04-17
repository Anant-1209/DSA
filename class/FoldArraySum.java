import java.util.Scanner;

// public class FoldArraySum {

//     public static void foldArraySum(int[] arr, int mid) {
//         int sum = 0;
//         for (int i = 0; i < mid; i++, mid++) {

//             sum = sum + arr[i];
//             sum = sum + arr[mid];
//         }
//     }

//     static void reverse(int a[], int n, int mid) {
//         int[] b = new int[n];
//         int j = n;
//         for (int i = mid; i < n; i++) {
//             b[j - 1] = a[i];
//             j = j - 1;
//         }
//     }

//     public static void main(String args[]) {
//         int n = 4;
//         int mid = n / 2;
//         int arr[] = { 1, 2, 3, 4 };
//         reverse(arr, n, mid);
//         foldArraySum(arr, mid);

//     }
// }

public class FoldArraySum {
    public static void main(String args[]) {
        int sum = 0;
        int arr[] = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.print("sum of elements of array are: " + sum);
    }
}