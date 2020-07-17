package com.sstinson.tutorial.lesson17;

public class Dog extends Animal implements Loggable, Printable {

    public void eat() {
        System.out.println("Dog is eating meat");
    }

    public void print(){
        System.out.println("DOG");
    }

    public String message(){
        return "woof";
    }
}
