package mypackage;

import java.util.LinkedList;

public class InsertAtEnd {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");

        // Insert at end
        list.offerLast("Pink");

        System.out.println("After inserting at end: " + list);
    }
}