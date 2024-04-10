
//Find if any pair in a sorted & rotated arraylist has a target sum
import java.util.*;

public class PairSum2 {
    // Two Pointer Approach
    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int bp = -1;
        int n = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        int lp = bp + 1;
        int rp = bp;

        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;

            }
            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
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

        System.out.println(pairSum2(list, target));
    }
}
