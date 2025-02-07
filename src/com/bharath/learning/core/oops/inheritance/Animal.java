package com.bharath.learning.core.oops.inheritance;

public class Animal extends Object {

    String species;

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    public void dancing() {
        System.out.println("Default behaviour");
    }
}


class Dog extends Animal {


    @Override
    public void makeSound() {
        System.out.println("Dog is barking");
    }

    public void dancing() {
        System.out.println("Dog is dancing");
    }

}

class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Cat Is Meeiooo");
    }

}

class Lion extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Lion is Roaring");
    }

    @Override
    public void dancing() {
        System.out.println("Lion is dancing");
    }
}

class Crocodile extends Animal {

    public void dancing() {
        System.out.println("crocodile is dancing");
    }
}

class Hippo extends Animal {

    public void dancing() {
        System.out.println("Hippo is dancing");
    }

}


class Runner {


    public static void main(String[] args) {

        Animal leo = new Dog();
        Animal kitty = new Cat();
        Animal king = new Lion();
        Animal crocs = new Crocodile();


//       leo.makeSound();
//       kitty.makeSound();
//       king.makeSound();

//       crocs.makeSound();
//       crocs.dancing();

       Animal animal = new Hippo();

       animal.dancing();





    }
}