import java.util.*;

// public class ContainerWithMostWater {

//     // Brute Force Approach
//     public static int storeWater(ArrayList<Integer> height) {
//         int maxWater = 0;
//         for (int i = 0; i < height.size(); i++) {
//             for (int j = i + 1; j < height.size(); j++) {
//                 int ht = Math.min(height.get(i), height.get(j));
//                 int width = j - i;
//                 int currentWater = ht * width;
//                 maxWater = Math.max(maxWater, currentWater);
//             }
//         }
//         return maxWater;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         ArrayList<Integer> height = new ArrayList<>();
//         System.out.print("enter the heights: ");
//         for (int i = 0; i < 9; i++) {
//             int element = sc.nextInt();
//             height.add(element);

//         }
//         System.out.print("The Maximum Area Of Container With Most water is: ");
//         System.out.println(storeWater(height));

//     }
// }

// Two Pointer Approach

public class ContainerWithMostWater {
    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.size() - 1;

        while (lp < rp) {
            int Height = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currentWater = Height * width;
            maxWater = Math.max(maxWater, currentWater);

            // update pointer
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> height = new ArrayList<>();
        System.out.print("enter the heights: ");
        for (int i = 0; i < 9; i++) {
            int element = sc.nextInt();
            height.add(element);

        }
        System.out.print("The Maximum Area Of Container With Most water is: ");
        System.out.println(storeWater(height));

    }
}
