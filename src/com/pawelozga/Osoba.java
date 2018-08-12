package com.pawelozga;

public class Osoba implements Comparable <Osoba>{
    public Osoba(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    String name;
    String surname;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Osoba o) {

        return this.age - o.age;
    }
}
