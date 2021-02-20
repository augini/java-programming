package com.wcoding.codewars;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SolutionSet_2 {
    public static String makeReadable(int seconds) {
        List<String> formattedTime = new ArrayList<>();
        formattedTime.add(String.valueOf((int)Math.floor(seconds/3600)));
        int remaining = seconds % 3600;

        formattedTime.add(String.valueOf((int)Math.floor(remaining/60)));
        formattedTime.add(String.valueOf(remaining % 60));

        return formattedTime.stream().map(element -> {
            return element.length() == 2 ? element : "0" + element;
        }).collect(Collectors.joining(":"));
    }

    //Codewars top solution
    public static String Tickets(int[] peopleInLine){
        int bill25 = 0, bill50 = 0;
        for (int payment : peopleInLine){
            if(payment==25){
                bill25++;
            } else if(payment==50){
                bill25--;
                bill50++;
            } else if(payment==100){
                if(bill50>0){
                    bill50--;
                    bill25--;
                } else{
                    bill25-=3;
                }
            }
            if(bill25<0 || bill50 <0){
                return "NO";
            }
        }
        return "YES";
    }

    public static int TripleDouble(long num1, long num2) {
        char[] chars = String.valueOf(num1).toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for(char c : chars)
        {
            if(map.containsKey(c)) {
                int counter = map.get(c);
                map.put(c, ++counter);
            } else {
                map.put(c, 1);
            }
        }

        for(char c : map.keySet()) {
            if(map.get(c) >= 3 && String.valueOf(num1).contains(c+""+c+""+c)) {
                return !String.valueOf(num2).contains(c+""+c) ? 0 : 1;
            }
        }

        return 0;
    }

    public static int countBits(int n){
       return  Integer.toBinaryString(n).replace("0","").length();
    };

    public static int digital_root(int n) {
        String input = String.valueOf(n);
        int sum = 0;

        while (input.length() > 1){

           for (int i = 0; i < input.length(); i++){
               sum+=Long.parseLong(String.valueOf(input.charAt(i)));
           }

           if (String.valueOf(sum).length() > 1){
               input = String.valueOf(sum);
               sum = 0;
           } else {
                break;
            }
       }
        return sum;
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        List<Integer> list = Arrays.stream(elements).boxed().collect(Collectors.toList());
        int counter = 0;
        int cut = 0;
        System.out.println(Arrays.toString(elements));
        for (int i = 0; i < list.size(); i++){
            for (int x = 0; x < list.size(); x++){
                if(list.get(i).equals(list.get(x))){
                    counter++;
                    if (counter > maxOccurrences){
                        list.remove(x-cut);
                        cut++;
                    }
                }
            }
            counter = 0;
            cut=0;
        }

        System.out.println(list);
        return list.stream().mapToInt(i->i).toArray();
    }
}
