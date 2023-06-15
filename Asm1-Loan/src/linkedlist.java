import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements to the linked list
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);

        // Displaying the linked list
        System.out.println("Linked List: " + linkedList);

        // Adding an element at the beginning
        linkedList.addFirst(5);
        System.out.println("After adding an element at the beginning: " + linkedList);

        // Adding an element at the end
        linkedList.addLast(50);
        System.out.println("After adding an element at the end: " + linkedList);

        // Removing an element from the linked list
        linkedList.remove(2);
        System.out.println("After removing an element at index 2: " + linkedList);

        // Accessing an element in the linked list
        int element = linkedList.get(3);
        System.out.println("Element at index 3: " + element);

        // Checking if an element is present in the linked list
        boolean contains = linkedList.contains(20);
        System.out.println("Contains 20? " + contains);

        // Size of the linked list
        int size = linkedList.size();
        System.out.println("Size of the linked list: " + size);
    }

}
