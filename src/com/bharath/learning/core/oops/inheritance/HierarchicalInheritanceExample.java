package com.bharath.learning.core.oops.inheritance;

class Shape {

    public void draw() {
        System.out.println("Shape is drawn");
    }
}


class Square extends Shape{

    @Override
   public void draw() {
        System.out.println("Drawing a Square Shape");
    }
}

class Rectangle extends  Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}


public class HierarchicalInheritanceExample {

    public static void main(String[] args) {

        Shape shape = new Shape();
        Shape rectangle = new Rectangle();
        Shape square = new Square();

        shape.draw();
        rectangle.draw();
        square.draw();


    }
}
