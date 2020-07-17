package com.sstinson.tutorial.lesson17;

public class Gorilla extends Animal {

    public int age = 30;

    Gorilla(){

    }

    Gorilla(Gorilla gorilla){
        this.age = gorilla.age;
    }

    public void eat(){
        System.out.println("Gorilla is eating bananas");
    }

    @Override
    public void age(){
        System.out.println("Gorilla is overriding age function");
    }


}
