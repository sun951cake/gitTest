package com.git.test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BranchTest {

    public static void main(String[] args) {
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();

        concurrentHashMap.put("key01","value01");
        concurrentHashMap.put("key02","value02");

        for(Map.Entry<String,String> maps : concurrentHashMap.entrySet()){
            System.out.println(maps.getKey() + " : " + maps.getValue());
        }
    }

}