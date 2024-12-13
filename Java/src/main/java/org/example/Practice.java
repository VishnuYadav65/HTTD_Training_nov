package org.example;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList( 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
//
//        // Create a copy of list1 to avoid modifying the original list
        List<Integer> commonElements = new ArrayList<>(list2);
//
//        // Retain only the elements that are also in list2
//        list1.retainAll(list2);
////        list1.retainAll(list2);
////
//        System.out.println("Common elements: " + list1);  // Output: [3, 4, 5]
//
//    }

        System.out.println(commonElements.removeAll(list1));
        System.out.println(commonElements);
    }
}

