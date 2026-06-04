package com.microservice.Array;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice {
//    public static int[] mergeSortedArray(int arr1[],int arr2[]){
//        int n1=arr1.length;
//        int n2=arr2.length;
//        int [] result=new int[n1+n2];
//        int i=0,j=0,k=0;
//        while(i<n1 && j<n2){
//            if(arr1[i]<arr2[j]){
//                result[k]=arr1[i];
//                i++;
//            }else{
//                result[k]=arr2[j];
//                k++;
//
//            }
//            k++;
//
//        }
//        while(i<n1){
//            result[k]=arr1[i];
//            i++;
//            k++;
//        }
//        while(j<n2){
//            result[k]=arr2[j];
//            j++;
//            k++;
//        }
//        return result;
//    }
//    public static void main(String[] args) {
//        int arr1[]={1,3,5};
//        int arr2[]={2,4,6};
//        int [] ans=mergeSortedArray(arr1,arr2);
//        System.out.println();
//
//    }

    // practice find first nonrepeating charcater
//public static void main(String[] args) {
//    String str="shahil";
//    Character result=str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
//            .entrySet().stream().filter(entry->entry.getValue()==1)
//            .map(Map.Entry::getKey)
//            .findFirst().orElse(null);
//    System.out.println(result);
//}

    //find most repeating character
//    public static void main(String[] args) {
//        String str="Chandra Sir";
//        Map<Character,Integer> map=new HashMap<>();
//        for(char ch:str.toCharArray()){
//            map.put(ch,map.getOrDefault(ch,0)+1);
//        }
//        char maxChar=' ';
//        int maxCount=0;
//        for(Map.Entry<Character,Integer> entry:map.entrySet()){
//            if(entry.getValue()>maxCount){
//                maxCount= entry.getValue();
//                maxChar= entry.getKey();
//            }
//            System.out.println("Most repeating character: " + maxChar);
////            System.out.println("Count: " + maxCount);
//
      //  }

  //  }
    // find the occurence  of character
/*public static void main(String[] args) {
    String str="findfind";
    Map<Character,Integer> map=new HashMap<>();
    for(char ch:str.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0)+1);
    }
    System.out.println(map);
}*/
    // find the second largest and largest elemnt
/*public static void main(String[] args) {
    int [] arr={1,2,3,4,5,6,7};
    int largest=Integer.MIN_VALUE;
    int secondLargest=Integer.MIN_VALUE;
    for(int num:arr){
        if(num>largest){
            secondLargest=largest;
            largest=num;
        }else if(num>secondLargest&&num!=secondLargest){
            secondLargest=num;
        }

    }
    System.out.println("print largest elment"+largest);
    System.out.println("print the secod  largest lement"+secondLargest);
}*/

    // problem of reverse array
/*public static void main(String[] args) {
    int [] arr={1,2,4,6,8};
    int start=0; int end=arr.length-1;
    while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
    for(int num:arr){
        System.out.println(num+" ");
    }
}*/
    // move all zero to end
/*public static void main(String[] args) {
    int [] arr={1,3,0,6,0};
    int j=0;

        for(int i=0;i< arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for(int num:arr){
            System.out.println(num+"");

        }
    }*/
    // find the missing no in array
    public static int missingNumber(int[] nums){
        int n=nums.length;
        int expectedSum=n*(n+1)/2;
        int actualSum=0;
        for(int num:nums){
            actualSum+=num;
        }
        return expectedSum-actualSum;


    }

    public static void main(String[] args) {
        int [] nums={3,0,1};
        System.out.println(missingNumber(nums));

    }
}


