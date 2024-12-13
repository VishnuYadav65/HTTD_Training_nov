package org.example.Pages;


import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.valueOf;

public class practice {

    public static void main(String[] args) {
        int i=4;
        int j=5;

//       List list=new  ArrayList<>();
        List<Integer> result1 =new ArrayList<Integer>();
        result1.add((10));

//        List<Integer> result2=new ArrayList<Integer>();
        ArrayList<Integer> result2 = new ArrayList<>();
        for(int val=1;val<11;val++){
            int result=0;
            result=i*val;
            result1.add((10));
        }
        for(int val=1;val<11;val++){
            int result=0;
            int nn = result = j * val;
            System.out.println(nn);
            result1.add(result);

        }
        result1.retainAll(result2);

//        List<> result3= Collections.singletonList(result1.retainAll(result2));
//        System.out.println(result3);

    } 
}
