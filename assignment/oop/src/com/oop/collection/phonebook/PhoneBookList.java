package com.oop.collection.phonebook;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook{
    ArrayList<Student> phoneBook;

    public PhoneBookList(){
        phoneBook = new ArrayList<>();
    }

    @Override
    public void addPerson(Student p){
        phoneBook.add(p);
    }

    @Override
    public Student searchByName(String name){
        for (Student std : phoneBook){
            if (std.name.equals(name)){
                return std;
            }
        }
        return null;
    }

    @Override
    public Student searchByLastName(String lastname){
        for (Student std : phoneBook){
            if (std.lastname.equals(lastname)){
                return std;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone){
        for (Student std : phoneBook){
            if (std.phone.equals(phone)){
                return std;
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String phone){
        phoneBook.removeIf(std -> std.phone.equals(phone));
    }
}
