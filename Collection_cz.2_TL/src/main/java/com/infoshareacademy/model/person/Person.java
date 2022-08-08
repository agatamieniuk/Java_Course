package com.infoshareacademy.model.person;

import com.google.gson.annotations.Expose;

import java.io.*;
import java.util.Objects;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private static String country = "POLAND";
    @Expose private String name;
    @Expose private int age;
    private transient int height;
    @Expose private Address address; // Serializable

    @Override
    public String toString() {
        String strAddr = address == null ? null : address.street;
        return "Person[name="+name+", age="+age+", height="+height+", address="+strAddr+"]";
    }

    public void saveToFile(String filename)
            throws IOException {
        FileOutputStream fileOutputStream
                = new FileOutputStream(filename);
        ObjectOutputStream objectOutputStream
                = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(this);
        objectOutputStream.flush();
        objectOutputStream.close();
    }

    public static Person loadFromFile(String filename)
            throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream
                = new FileInputStream(filename);
        ObjectInputStream objectInputStream
                = new ObjectInputStream(fileInputStream);
        Person p = (Person) objectInputStream.readObject();
        objectInputStream.close();
        return p;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static String getCountry() {
        return country;
    }

    public static void setCountry(String country) {
        Person.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person p = (Person) o;
        return age == p.getAge() &&
                Objects.equals(name, p.getName());
    }
}
