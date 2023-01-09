package com.patterns.singleton.ex_singleton;

import java.util.HashMap;

public class MyNickName {
    //Attributes
    private String nickName;
    private static HashMap<String, MyNickName> instance = new HashMap<>();

    //Constructor
    private MyNickName(String name){
        nickName = name;
    }

    //APIs
    public static MyNickName getInstance(String name){
        if (!instance.containsKey(name)){
            instance.put(name, new MyNickName(name));
        }
        return instance.get(name);
    }

    public void getNickName(){
        System.out.println("Your nick name: " + nickName);
    }
}
