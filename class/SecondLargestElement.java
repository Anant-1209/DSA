import java.util.*;

public class SecondLargestElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("enter the elements into the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int temp = Integer.MIN_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                temp = max;
                max = arr[i];

            } else if (arr[i] > temp && arr[i] != max) {
                temp = arr[i];
            }

        }
        if (temp == Integer.MIN_VALUE) {
            System.out.print("There is no second largest element.");
        } else {
            System.out.print("The second largest element is: " + temp);
        }
    }
}