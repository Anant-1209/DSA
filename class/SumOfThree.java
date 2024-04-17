public class SumOfThree {
    public static void main(String args[]) {
        int n1 = 8;
        int n2 = 10;
        int n3 = 4;

        int largest = n1 > n2 ? n1 > n3 ? n1 : n3 : n2 > n3 ? n2 : n3;
        if (n1 == n2 && n2 == n3) {
            System.out.println("All no. are equal");
        } else {
            System.out.println("the largest of three is: " + largest);
        }
    }

}
