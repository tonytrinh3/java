import java.io.*;
import java.util.*;

public class ListVectorDemo {
    public static void main(String[] args) {

        // Size of the vector
        int n = 5;

        List<Integer> v = new Vector<Integer>(n); // n size

        for (int i = 1; i <= n; i++) {
            v.add(i);
        }
        // Printing elements
        System.out.println(v);

        // Remove element at index 3
        v.remove(3);

        // Displaying the list after deletion
        System.out.println(v);

        // Printing elements one by one
        for (int i = 0; i < v.size(); i++)
            System.out.print(v.get(i) + " ");
    }

}
