package com.microservice.Array;



public class SecondLargest {
    public static void main(String[] args) {
        int [] arr={2,4,6,8,9};
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>largest){
                secondLargest=largest;
                largest=num;
            }else if(num>secondLargest && num!=secondLargest){
                secondLargest=num;
            }

        }
        System.out.println("print largest element:"+largest);
        System.out.println("print second  largest element:"+secondLargest);

    }

}
