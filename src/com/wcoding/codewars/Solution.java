package com.wcoding.codewars;

import java.lang.StringBuilder;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {

    static String toCamelCase(String s){
        String[] words = s.split("[-_]");
        int counter = 1;
        while(counter < words.length){
            words[counter] = words[counter].substring(0,1).toUpperCase() + words[counter].substring(1);
            counter++;
        }
        return String.join("", words);
    }

    public static String highAndLow(String input) {
        String[] numbers = input.split(" ");

        int max = Integer.parseInt(numbers[0]);
        int min = Integer.parseInt(numbers[0]);

        for(String number:numbers){
            int current = Integer.parseInt(number);
            max = current > max ? current : max;
            min = current < min ? current: min;
        }

        return max + " " + min;
    }

    public static String seriesSum(int n) {
        double sum = 0.0;

        for(int i = 0; i< n; i++){
            sum += (double)1/(1+3*i);
        }

        return String.format("%.2f", sum) ;
    }

    public static int persistence(long n) {
        String[] numbers = String.valueOf(n).split("");
        int counter  = 0;

        while(numbers.length > 1){
            counter ++;
            int result = 1;
            for(String i: numbers) {
                result = 1*Integer.parseInt(i) * result;
            }
            numbers = String.valueOf(result).split("");
        }
        return counter;
    };

    public static String getMiddle(String word) {
        int firstHalf = word.length()/2;
        int secondHalf = word.length()/2+1;
        return word.length() % 2 == 0 ? word.substring(firstHalf-1,secondHalf) : word.substring(firstHalf, secondHalf);
    };

    public static String revRot(String strong, int sz) {
        if(sz <= 0 || strong == "" ){
            return "";
        } else if (sz > strong.length() || strong.length() < sz) {
            return "";
        }
        else{
            ArrayList<String> list = new ArrayList<>();
            String result = "";

            for(int i = 0; i < strong.length(); i++){
                if( i % sz == 0 && i + sz < strong.length()){
                        list.add(strong.substring(i, i+sz));
                }
            }

            for (String item: list) {
                double sum = 0;
                String[] digits = item.split("");

                for(String digit: digits){
                        sum += Math.pow(Integer.parseInt(digit),3);
                }

                if(sum % 2 == 0){
                        result = result + new StringBuilder(item).reverse().toString();
                }else {
                        result = result + item.substring(1) + item.substring(0, 1);
                }
            }
            return result;
        }
    };

    public static String[] wave(String str) {
        ArrayList<String> waves = new ArrayList<>();

        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) != ' '){
                waves.add(str.substring(0,i)+ Character.toUpperCase(str.charAt(i)) +str.substring(i+1));
            }
        }

        return waves.toArray(new String[waves.size()]);
    }

    public static int[] parse(String data) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int counter = 0;

        for(int i =0; i < data.length(); i++){
            switch (data.charAt(i)){
                case 'i':
                    counter++;
                    break;
                case 'd':
                    counter--;
                    break;
                case 's':
                    counter = counter*counter;
                    break;
                case 'o':
                    numbers.add(counter);
                    break;
            }
        }
        return numbers.stream().mapToInt(i->i).toArray();
    }

    public static double findUniq(double arr[]) {
        double result = 0;

        for(int counter = 1; counter < arr.length-1; counter++){
            if(arr[counter] != arr[counter+1]){
               result = arr[counter-1] == arr[counter] ? arr[counter+1]: arr[counter];
            }
        }
        return result;
    }

}
