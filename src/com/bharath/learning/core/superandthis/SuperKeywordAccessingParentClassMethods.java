package com.bharath.learning.core.superandthis;

class Animal {

    public void eatingAndSleeping() {
        System.out.println("Animal is eating and sleeping");
    }
}


class Cat extends Animal {

    @Override
    public void eatingAndSleeping() {
        super.eatingAndSleeping(); // Calls the parent class method
        System.out.println("Cat is eating and sleeping for 18 hours");
    }
}


public class SuperKeywordAccessingParentClassMethods {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eatingAndSleeping();
    }
}
