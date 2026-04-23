package com.microservice.palindrom;

public class Palindrome {
    public static void main(String[] args) {
        String string = "madam";
        String reversed="";
        for(int i=string.length()-1;i>=0;i--){
            reversed+=string.charAt(i);
        }
        if(string.equals(reversed)){
            System.out.println("Palindrome");
        }

    }
}
