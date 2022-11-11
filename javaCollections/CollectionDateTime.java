package javaCollections;

import java.util.Date;

/*
    => Date and time stored in form of long number.

    => System.currentTimeMillis() : tells milliSec passed since 1 Jan 1900
*/
public class CollectionDateTime {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());

        Date d=new Date();
        System.out.println(d);
        System.out.println(d.getYear()); //years from 1900
    }
}
