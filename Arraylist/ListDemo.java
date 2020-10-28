import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();

        l1.add(0, 1); // add 1 to 0 index
        l1.add(1, 2); // add 2 to 1 index

        System.out.println(l1);

        List<Integer> l2 = new ArrayList<Integer>();

        l2.add(1); // same as adding 1 to 0 index
        l2.add(2);
        l2.add(3);

        System.out.println(l2);

        l1.addAll(1, l2); // will add list l2 from 1 index
        System.out.println(l1);

        // Removes element from index 1
        l1.remove(1);
        System.out.println(l1);

        // Prints element at index 3
        System.out.println(l1.get(3));

        // Replace 0th element with 5
        l1.set(0, 5);
        System.out.println(l1);

    }

}
