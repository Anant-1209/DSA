import java.util.*;

public class FindMaxInTheArray {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of elements in the array\n");

        int n = sc.nextInt();
        System.out.println("enter the elements in the array\n");

        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            list.add(element);
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println("the max element in the list is " + max);
    }
}
