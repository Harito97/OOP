package com.patterns.singleton.ex_singleton;

public class ClientUse {
    public static void main(String[] args) {
        MyNickName myNickName = MyNickName.getInstance("Harito");
        myNickName.getNickName();
        myNickName.getInstance("no no");
        //MyNickName anotherNickName = new MyNickName();    //Bao loi
        System.out.println("Now I change your nick name to \"no no\", but your nick name now is: ");
        myNickName.getNickName();
        System.out.println("So you can only have a nick name and you can't change your nick name after generate it");
    }
}
