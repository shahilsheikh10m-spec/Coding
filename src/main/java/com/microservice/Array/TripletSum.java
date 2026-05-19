package com.microservice.Array;

import java.util.Arrays;

public class TripletSum {
public static void tripletSum(int[] arr, int target){


    Arrays.sort(arr);
    for(int i=0;i<arr.length-2;i++){
        int left=i+1;
        int right=arr.length-1;
        //System.out.println("\nFixed Element: " + arr[i]);
        while(left<right){
            int sum=arr[i]+arr[left]+arr[right];
            if(sum==target){

                System.out.println(
                        "Checking -> "
                                + arr[i] + " + "
                                + arr[left] + " + "
                                + arr[right]
                                + " = " + sum
                );
                return ;

            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
    }

    System.out.println("No triplet found");
}
    public static void main(String[] args) {
    int arr[]={1, 4, 45, 6, 10, 8};
    int target=22;
        tripletSum(arr,target);


    }
}
