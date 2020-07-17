package com.sstinson.tutorial.lesson17;

import org.junit.Test;
import static org.junit.Assert.*;

public class ZooTest {

    @Test
    public void shouldFeedAllAnimals(){
        Zoo zoo = new Zoo();
        Animal[] animals = {new Dog(), new Gorilla(), new Tiger()};
        zoo.feedAnimals(animals);
    }

    @Test
    public void testDogInterface(){
        Dog dog = new Dog();
        dog.print();
        System.out.println(dog.message());
    }

    @Test
    public void testVariableInheritance(){
        Dog dog  = new Dog();
        System.out.println(dog.age);

        Gorilla gorilla = new Gorilla();
        System.out.println(gorilla.age);
    }

    @Test
    public void testCopyGorilla(){
        Gorilla gorilla = new Gorilla();

        Gorilla newGorilla = new Gorilla(gorilla);
        newGorilla.age = 35;
        assertNotEquals(gorilla.age, newGorilla.age);

    }
}
