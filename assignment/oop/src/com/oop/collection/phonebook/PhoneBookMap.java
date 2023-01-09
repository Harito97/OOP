package com.oop.collection.phonebook;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class PhoneBookMap implements PhoneBook{
    HashMap<String, Student> phoneBook;

    public PhoneBookMap() {
        phoneBook = new HashMap<>();
    }

    public void addPerson(Student s){
        phoneBook.put(s.phone, s);
    }

    public Student searchByName(String name){
        for (Map.Entry<String, Student> item : phoneBook.entrySet()){
            if (item.getValue().name.equals(name)){
                return item.getValue();
            }
        }
        return null;
    }

    public Student searchByLastName(String lastname){
        for (Map.Entry<String, Student> item : phoneBook.entrySet()){
            if (item.getValue().lastname.equals(lastname)){
                return item.getValue();
            }
        }
        return null;
    }

    public Student searchByNumber(String phone){
        for (Map.Entry<String, Student> item : phoneBook.entrySet()){
            if (item.getValue().phone.equals(phone)){
                return item.getValue();
            }
        }
        return null;
    }

    public void deleteByNumber(String phone){
        for (Map.Entry<String, Student> item : phoneBook.entrySet()){
            if (item.getValue().phone.equals(phone)){
                phoneBook.remove(item.getValue().phone);
            }
        }
    }
}
