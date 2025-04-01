package com.bharath.learning.core.collections.set.hashset;

import java.util.HashSet;
import java.util.Set;

class Person {

    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", email=" + email + "]";
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.age + this.email.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        Person person = (Person) obj;

        return this.name.equals(person.name) && this.age == person.age && this.email.equals(person.email);
    }

}


public class RemoveDuplicatesForCustomClass {

    public static void main(String[] args) {

        Set<Person> persons = new HashSet<>();
        persons.add(new Person("abc",20, "abc@gmail.com"));
        persons.add(new Person("bbbb", 22, "bbb@gmail.com"));
        persons.add(new Person("bbbb", 22, "bbb@gmail.com"));
        persons.add(new Person("abc", 20, "abc@gmail.com"));
        persons.add(new Person("ggg", 30, "gg@gmail.com"));

        System.out.println("Persons: " + persons);





    }
}
