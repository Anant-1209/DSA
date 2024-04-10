
//Find if any pair in a sorted arraylist has a target sum
import java.util.*;

// public class PairSum1 {
//     // Brute Force Approach

//     public static boolean pairsum1(ArrayList<Integer> list, int target) {
//         for (int i = 0; i < list.size(); i++) {
//             for (int j = i + 1; j < list.size(); j++) {
//                 if (list.get(i) + list.get(j) == target) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         ArrayList<Integer> list = new ArrayList<>();
//         System.out.print("enter the elements: ");
//         for (int i = 0; i < 9; i++) {
//             int element = sc.nextInt();
//             list.add(element);

//         }
//         System.out.print("enter the target element: ");
//         int target = sc.nextInt();

//         System.out.println(pairsum1(list, target));
//     }
// }

public class PairSum1 {
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        int rp = list.size() - 1;
        int lp = 0;

        while (lp != rp) {
            // case1
            if (list.get(lp) + list.get(rp) == target) {

                return true;
            }

            // case 2
            if (list.get(lp) + list.get(rp) < target) {
                lp++;
            } else {
                // case 3
                if (list.get(lp) + list.get(rp) > target)
                    ;
                {
                    rp--;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("enter the elements: ");
        for (int i = 0; i < 9; i++) {
            int element = sc.nextInt();
            list.add(element);

        }
        System.out.print("enter the target element: ");
        int target = sc.nextInt();

        System.out.println(pairSum1(list, target));
    }
}