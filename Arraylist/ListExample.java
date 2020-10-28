import java.util.*; 

// Java program to demonstrate the 
// working of a List with ArrayList 
// class 
  
public class ListExample { 
    public static void main(String[] args) 
    { 
        // Type safe list, stores only string 
        List<Double> al = new ArrayList<Double>(); 
        al.add(1.0); 
        al.add(2.0); 
        al.add(3.0); 
  
        System.out.println(al); //outputs array
    } 
} 