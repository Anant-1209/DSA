import java.util.*;

public class MarsNo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no.: ");
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        while (n > 9) {

            sum = 0;
            while (n != 0) {
                int digit = n % 10;
                sum += digit;
                n = n / 10;
            }
            n = sum;
            count++;
            System.out.println(sum);
        }

        if (sum < 10) {
            if (count % 2 == 0) {
                System.out.println("Mars No " + "count: " + count);
            } else {
                System.out.println("Not a Mars No " + "count: " + count);
            }
        } else {
            System.out.println("Not a Mars Number as the sum of digits is not a single digit.");
        }

    }

}
