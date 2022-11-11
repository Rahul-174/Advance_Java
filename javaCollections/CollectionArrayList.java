package javaCollections;
/*
    add(element)
    add(index,element)
    get(index)
    addALL(<collection>)
    addAll(index,<collection>)
    clear()
    contains()
    indexOf() -> index of first occurrence of element
    lastIndexOf() -> index of last occurrence of element
    set(index,element) -> inputs element at defined index

*/

import java.util.ArrayList;

public class CollectionArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(60); //add(ele) => adds the ele at end of list
        list.add(36);
        list.add(62);
        list.add(16);
        list.add(1,10);//add(index,ele) => adds ele at the index index

        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i)); //get(index)
        }

        ArrayList list2=new ArrayList<>();
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
