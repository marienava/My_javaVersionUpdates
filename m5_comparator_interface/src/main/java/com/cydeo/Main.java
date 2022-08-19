package com.cydeo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,0,15,5,20);
        System.out.println(list);

        //Ascending
        Collections.sort(list);
        System.out.println(list);

        //Descending
        Collections.sort(list,new MyComparator());
        System.out.println(list);

        //Descending sorting with lambda
        Collections.sort(list,((o1,o2) -> (o1>o2) ? -1 : (o1<o2) ? 1 : 0));

        //Ascending
        list.sort((o1,o2)->o1.compareTo(o2));
        System.out.println(list);

        //Descending
        list.sort((o2,o1)->o1.compareTo(o2));
        System.out.println(list);




    }
}
