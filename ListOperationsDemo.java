package com.example.listdemo;

import java.util.*;

public class ListOperationsDemo {
    public static void main(String[] args) {
        // Create ArrayList and LinkedList
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        // 1. Adding elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // 2. Adding element at specific index
        arrayList.add(1, "Grapes");
        linkedList.add(1, "Grapes");

        // 3. Adding multiple elements
        List<String> moreFruits = Arrays.asList("Mango", "Pineapple");
        arrayList.addAll(moreFruits);
        linkedList.addAll(moreFruits);

        // 4. Accessing elements
        System.out.println("ArrayList element at index 2: " + arrayList.get(2));
        System.out.println("LinkedList element at index 2: " + linkedList.get(2));

        // 5. Updating elements
        arrayList.set(0, "Strawberry");
        linkedList.set(0, "Strawberry");

        // 6. Removing elements
        arrayList.remove("Banana");
        linkedList.remove("Banana");

        // 7. Searching elements
        System.out.println("ArrayList contains Mango? " + arrayList.contains("Mango"));
        System.out.println("LinkedList contains Mango? " + linkedList.contains("Mango"));

        // 8. List size
        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("LinkedList size: " + linkedList.size());

        // 9. Iterating over list (for-each loop)
        System.out.println("ArrayList iteration:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        System.out.println("LinkedList iteration:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        // 10. Using Iterator
        System.out.println("ArrayList using Iterator:");
        Iterator<String> arrayIterator = arrayList.iterator();
        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }

        System.out.println("LinkedList using Iterator:");
        Iterator<String> linkedIterator = linkedList.iterator();
        while (linkedIterator.hasNext()) {
            System.out.println(linkedIterator.next());
        }

        // 11. Sorting
        Collections.sort(arrayList);
        Collections.sort(linkedList);
        System.out.println("Sorted ArrayList: " + arrayList);
        System.out.println("Sorted LinkedList: " + linkedList);

        // 12. Sublist
        List<String> arraySubList = arrayList.subList(1, 3);
        List<String> linkedSubList = linkedList.subList(1, 3);
        System.out.println("ArrayList Sublist (1-3): " + arraySubList);
        System.out.println("LinkedList Sublist (1-3): " + linkedSubList);

        // 13. Clearing the list
        arrayList.clear();
        linkedList.clear();
        System.out.println("ArrayList after clear: " + arrayList);
        System.out.println("LinkedList after clear: " + linkedList);
    }
}
