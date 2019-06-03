package com.company;

public class Truck extends Car {
    private int weight;
    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    @Override
    public double getSalePrice(){
        double salePrice = this.getRegularPrice() * 0.8;
        return salePrice;
    }

}