package javaCollections;

/*
    HASHING : technique to convert a range of key value to range of indices
*/

import java.util.HashSet;

public class CollectionHashSet {
    public static void main(String[] args) {
        HashSet<Integer> hSet=new HashSet<>(6,0.5f);
        hSet.add(10);
        hSet.add(2);
        hSet.add(3);
        hSet.add(4);
        System.out.println(hSet);


    }
}
