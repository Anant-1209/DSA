import java.util.*;

public class SwapElementsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("enter the no. of array");
        int n = sc.nextInt();
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            int elements = sc.nextInt();
            list.add(elements);
        }
        System.out.println("enter the index of elements of swap");
        System.out.print("index1: ");

        int idx1 = sc.nextInt();
        System.out.print("index2: ");
        int idx2 = sc.nextInt();
        Swap(list, idx1, idx2);

        System.out.println("elements of list are");
        for (int i = 0; i < n; i++) {
            System.out.print(list.get(i) + " ");
        }

    }

    public static void Swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
}
