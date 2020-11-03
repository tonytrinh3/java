public class Main {
    /* method to create a simple linked list with 3 nodes*/
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedList llist = new LinkedList(); // makes sense

        llist.head = new LinkedList.Node(1); // asdign head to 1
        LinkedList.Node second = new LinkedList.Node(2); //made a new node
        LinkedList.Node third = new LinkedList.Node(3); //made a new node

        llist.head.next = second; // Link first node with the second node - LinkedList.node al
        second.next = third; // Link second node with the third node

        llist.printList();
    }
}
