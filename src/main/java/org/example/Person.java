package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    String hairColor;
    int weight;
    String eyeColor;

    public Person(String firstName, String lastName, int age){
        this.firstName= firstName;
        this.lastName=lastName;
        this.age=age;
    }
    public Person(String firstName, String lastName, int age, String hairColor, int weight, String eyeColor){
        this(firstName, lastName ,age);
        this.hairColor=hairColor;
        this.weight=weight;
        this.eyeColor=eyeColor;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public boolean isTeen(){
        return this.age >= 13 && this.age <= 19;
    }
}
