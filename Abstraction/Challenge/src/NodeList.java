public interface NodeList {
    ListItem getRoot(); //the head
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
    //which will start at the root and print in the values of each item in the structure.

}
