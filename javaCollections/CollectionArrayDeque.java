package javaCollections;

import java.util.ArrayDeque;

public class CollectionArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer>ad1 = new ArrayDeque<>();
        ad1.add(1);  //insert at the end of deque
        ad1.add(2);
        ad1.add(3);
        System.out.println(ad1);
        System.out.println(ad1.getFirst()); //gets first ele
        System.out.println(ad1.getLast()); //gets last ele

        ad1.addFirst(1000); //adds at start
        System.out.println(ad1);

        //similarly removeFirst, removeLast...

    }
}
