package com.example.capitalservice.controlller;

public class FindIndexOfTargetString {
    public static void main(String[] args) {
        String s = "aababcaaabbbabcaaa";
        String targetS = "abc";

        for (int i = 0; i < s.length()-2 ; i++) {
            System.out.println("substring    " + s.substring(i, i+3));
            if (s.substring(i, i+3).equals(targetS)) {
                System.out.println("Index is " + i);
                i=i+2;
            }
        }


        System.out.println(s.contains(targetS));
    }
}
