import java.util.*;


public class GroceryList {

    private int[] myNumbers = new int[50];



    private ArrayList<String> groceryList = new ArrayList<String>();

    public String findItem(String searchItem){
        boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);

        if(position >= 0){
            return groceryList.get(position);
        }

        return null;

    }
}
