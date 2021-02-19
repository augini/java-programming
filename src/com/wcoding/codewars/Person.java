package com.wcoding.codewars;

public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;

    // constructor overloading
    // calling the second constructor from within the first constructor
    public Person(String initialName) {
        this(initialName, 0);
    }

    public Person(String initialName, int age) {
        this.age = age;
        this.name = initialName;
        this.height = 0;
        this.weight = 0;
    }

    // method overloading
    public void growOld() {
        this.growOld(1);
    }

    public void growOld(int age) {
        this.age = this.age + age;
    }

    // print name
    public void printName() {
        System.out.println(this.name);
    }

    // create string representation
    public String toString() {
        // return this.name + ", age " + this.age + " years, my body mass index is " +
        // bodyMassIndex();
        return this.name + ", age " + this.age + " years";
    }

    // return the age
    public int returnAge() {
        return this.age;
    }

    // find if legal age
    public boolean isOfLegalAge() {
        if (this.age < 18) {
            return false;
        }

        return true;
    }

    // methods that take params

    // setters
    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // getters
    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getName() {
        return this.name;
    }

    // method to return bodyMassIndex
    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }

}

