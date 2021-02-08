package Spectre;

public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String initialName, int age) {
        this.age = age;
        this.name = initialName;
        this.height = 0;
        this.weight = 0;
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

    // grow old
    public void growOld() {
        this.age = this.age + 1;
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
    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // method to return bodyMassIndex
    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }

}
