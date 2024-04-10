import java.util.ArrayList;

public class ArrayListOperation {

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        // Add element in the list
        list.add(1);
        list.add(2);
        list.add(3);
        for (int i = 1; i <= 7; i++) {
            list.add(i);
        }

        list.add(10, 60);

        System.out.println("elements in the arraylist are\n");
        System.out.println(list);
        list.add(10, 60);

        System.out.println(list);

        // get element from the list
        int element1 = list.get(2);
        int element2 = list.get(3);

        System.out.println(element1);
        System.out.println(element2);

        // delete element from the list

        System.out.println(list.remove(2));
        System.out.println(list.remove(10));

        System.out.println(list);

        // set element in the list
        System.out.println(list.set(2, 60));
        System.out.println(list.set(9, 100));

        System.out.println(list);

        // elements contains in the list(return true false)
        System.out.println("element present at " + list.contains(60));
        System.out.println("element present at " + list.contains(100));
    }
}