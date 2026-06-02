package com.microservice.Anagram;

import java.util.*;

public class GroupAnagram {
    public List<List<String>> groupAnagram(String[] strs){
        Map<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            char[] chars=str.toCharArray();
            Arrays.sort(chars);
            String key=new String(chars);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());

    }
    public static void main(String[] args) {
        String[] strs = {"act", "pots", "tops", "cat", "stop", "hat"};
        GroupAnagram ga = new GroupAnagram();
        List<List<String>> result = ga.groupAnagram(strs);
        System.out.println(result);


    }
}
