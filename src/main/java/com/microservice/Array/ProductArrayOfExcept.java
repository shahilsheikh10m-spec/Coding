package com.microservice.Array;

import java.util.Arrays;

public class ProductArrayOfExcept {
    public static int[] productExcept(int[] nums){
        int n=nums.length;
        int res[]=new int[n];
        res[0]=1;
        for(int i=1;i<n;i++){
            res[i]=res[i-1]*nums[i-1];
        }
        int suffix=1;
        for(int i=n-1;i>=0;i++){
            res[i]*=suffix;
            suffix*=nums[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int [] arr={1,3,6,12};
        System.out.println(Arrays.toString(productExcept(arr)));

    }
}
