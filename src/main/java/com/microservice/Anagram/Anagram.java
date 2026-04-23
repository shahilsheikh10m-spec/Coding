package com.microservice.Anagram;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String a="car";
        String b="rac";
        if(a.length()!=b.length()){
            System.out.println("Not a anagram");
            return;
        }
        char[] arr1=a.toCharArray();
        char[] arr2=b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.println("Angram");
        }else{
            System.out.println("Not a anagram");
        }

    }
}
