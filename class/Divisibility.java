
public class Divisibility {
    public static void main(String args[]) {

        // Calculating sum of digit

        for (int n = 1; n <= 100; n++) {
            int temp = n;
            int threeDivisible = SumOFDigit(n); /// alternate (number / divisor * divisor == number)
            int digitVal = DigitValue(temp);
            if (digitVal == 0 || digitVal == 5) {

                if (threeDivisible == 3 || threeDivisible == 6 || threeDivisible == 9) {
                    System.out.println("Hello World " + n);
                }
                System.out.println("world " + n);
            } else if (threeDivisible == 3 || threeDivisible == 6 || threeDivisible == 9) {
                System.out.println("Hello " + n);

            } else {
                System.out.println(n);
            }
        }

    }

    public static int SumOFDigit(int n) {
        int sum = 0;

        while (n != 0) {
            int digit = n - (n / 10) * 10;

            sum += digit;
            n = n / 10;

        }
        return sum;
    }

    public static int DigitValue(int n) {

        int val = n - (n / 10) * 10;

        return val;
    }

}
