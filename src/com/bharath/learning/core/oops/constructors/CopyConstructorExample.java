package com.bharath.learning.core.oops.constructors;


class Aeroplane {

    private String brand;
    private int enginesCount;
    private String type;


    // Parameterized Constructor
    public Aeroplane(String brand, int enginesCount, String type) {
        this.brand = brand;
        this.enginesCount = enginesCount;
        this.type = type;
    }

    public Aeroplane(Aeroplane aeroplane) {
        this.brand = aeroplane.brand;
        this.type = aeroplane.type;
        this.enginesCount = aeroplane.enginesCount;
    }


}



public class CopyConstructorExample {

    public static void main(String[] args) {
        Aeroplane gulfStream = new Aeroplane("Boeing", 2, "Private Jet");
        Aeroplane indiGo = new Aeroplane(gulfStream);
    }


}
