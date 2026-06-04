package com.microservice.Array;

import java.util.*;

public class TopKFrequentElement {
    public static int [] topKFrequent(int[] nums,int k){
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);


        }
        List<int[]> arr=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            arr.add(new int[]{entry.getValue(), entry.getKey()});
        }
        arr.sort((a,b)->b[0]-a[0]);
        int [] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=arr.get(i)[1];
        }
        return res;


    }
    public static void main(String[] args) {
        int []nums={1,2,2,3,3,3};
        int k=2;
        int [] result=topKFrequent(nums,k);
        System.out.println(Arrays.toString(result));

    }
}
