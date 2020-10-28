import java.util.*;

public class ArraylistExample {
    public static void main(String[] args) {
        // Type safe ArrayList, stores
        // only string
        ArrayList<String> al = new ArrayList<String>();

        al.add("Geeks");
        al.add("for");
        al.add("Geeks");

        System.out.println(al); //outputs array
    }
}