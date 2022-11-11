package javaCollections;

import java.util.LinkedList;

public class CollectionLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer>list = new LinkedList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);

        list.add(1,10);//add(index,ele) => adds ele at the index index

        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i)); //get(index)
        }

        LinkedList list2=new LinkedList();
        list2.add(100);
        list2.add(200);


        //Adding list2 in list
        list.addAll(list2);
        System.out.println("Modified list after adding list2 :"+list);

        //Adding list2 in list at index 1
        list.addAll(1,list2);
        System.out.println("Modified list after adding list2 at index 1 : "+list);

        //clear()
        System.out.println("List 2 before clear() : "+list2);
        list2.clear();
        System.out.println("List 2 after clear() : "+list2);

        //contains()
        System.out.println(list.contains(100));

        //indexOf() -> index of first occurrence of element
        System.out.println(list.indexOf(100));
        System.out.println(list.lastIndexOf(100));

        //set(index,element)
        list.set(0,10000);
        System.out.println(list);
    }
}
