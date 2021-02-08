package Spectre;

public class Student {
    private int credits;

    public Student() {
        this.credits = 0;
    }

    public void play() {
        this.credits = this.credits - 8;
        System.out.println("We have been playing a game");
    }
}
