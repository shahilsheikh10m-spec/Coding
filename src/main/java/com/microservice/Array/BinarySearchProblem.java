package com.microservice.Array;

public class BinarySearchProblem {
    public static int binarySearch(int [] num, int target){
        int left=0;
        int right=num.length;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(num[mid]==target){
                return mid;
            }else if(num[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;

            }
        }

        return left;
    }
    public static void main(String[] args) {

    }
}
