import java.util.*;

public class SortingArrayList {
    public static void main(String[] args) {
        // collections.sort(list)
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("enter the no. of array");
        int n = sc.nextInt();
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            int elements = sc.nextInt();
            list.add(elements);
        }
        Collections.sort(list);// sorts in ascending order
        for (int i = 0; i < n; i++) {
            System.out.print(list.get(i) + " ");
        }

    }
}
