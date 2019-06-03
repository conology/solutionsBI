package com.company;

public class Mercedes extends Car {

    private int length;

    public Mercedes(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double getSalePrice(){
        double salePrice = this.getRegularPrice() * 0.8;
        return salePrice;
    }
}
