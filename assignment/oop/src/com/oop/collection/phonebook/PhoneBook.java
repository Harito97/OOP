package com.oop.collection.phonebook;

public interface PhoneBook {
    Student searchByLastName(String lastName);
    Student searchByNumber(String number);
    void addPerson(Student student);
    Student searchByName(String name);
    void deleteByNumber(String number);
}
