package com.company;

public class MyOwnAutoShop {
    public static void main(String[] args) {

        Mercedes c220 = new Mercedes(240, 34000, "red", 5);
        Porsche panamera = new Porsche(300, 78000, "black", 2010, 5000);
        Porsche cayenne = new Porsche(260, 90000, "yellow", 2017, 4500);
        Car car = new Car(180, 23000, "white");

        System.out.println("Car sale price is: " + car.getSalePrice());
        System.out.println("Mercedes C220 sale price is: " + c220.getSalePrice());
        System.out.println("Porsche Panamera sale price is: " + panamera.getSalePrice());
        System.out.println("Porsche Cayenne sale price is: " + cayenne.getSalePrice());
    }
}
