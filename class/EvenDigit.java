import java.util.*;

public class EvenDigit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the integer ");
        int n = sc.nextInt();
        int count = 0;
        while (n != 0) {
            int temp = n % 10;
            if (temp % 2 == 0) {
                count++;
                System.out.println(temp);
            }
            n = n / 10;
        }
        if (count == 0) {
            System.out.println(-1);
        }

    }

}
