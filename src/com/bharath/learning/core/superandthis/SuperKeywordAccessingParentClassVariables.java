package com.bharath.learning.core.superandthis;


class Person {
    public String name = "Default Person";

    public void display() {

        System.out.println("Parent Name :: "+ this.name);
    }

}

class Customer extends Person {
    public String name = "Bharath";

    public void display() {
        System.out.println("Parent Name :: "+ super.name);
        System.out.println("Child Name :: "+ this.name);
    }
}






public class SuperKeywordAccessingParentClassVariables {

    public static void main(String[] args) {
        Customer bharath = new Customer();
        bharath.display();

        Person p = new Person();
        p.display();

    }
}
