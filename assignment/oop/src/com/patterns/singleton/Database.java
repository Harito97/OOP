package com.patterns.singleton;

public class Database {
    //Attributes
    private static Database instance;

    //Constructor
    private Database(){

    }

    //APIs
    public static Database getInstance(){
        if (instance == null){
            instance = new Database();
        }
        return instance;
    }

    public void query(String sql){
        System.out.println("executed the code: " + sql);
    }
}
