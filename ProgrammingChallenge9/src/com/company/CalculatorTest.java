package com.company;

import static org.junit.Assert.*;

   public class CalculatorTest {
        Calculator c = new Calculator();

        @org.junit.Test
        public void addCorrect() {
            assertEquals(c.add(11, 5), 16);
        }
       @org.junit.Test
       public void addWrong() {
           assertNotEquals(c.add(11,5),15);
       }

    @org.junit.Test
    public void subtractCorrect() {
            assertEquals(c.subtract(25, 5), 20);
    }
       @org.junit.Test
       public void subtractWrong() {
           assertNotEquals(c.subtract(25,5),19);
       }

    @org.junit.Test
    public void multiplyCorrect() {
            assertEquals(c.multiply(10, 5), 50);

    }
       @org.junit.Test
       public void multiplyWrong() {
           assertNotEquals(c.multiply(10,5),51);
       }

    @org.junit.Test
    public void divideCorrect() {
            assertEquals(c.divide(20, 4), 5);
    }
       @org.junit.Test
       public void divideWrong() {
           assertNotEquals(c.divide(20,4),4);
       }

       @org.junit.Test(expected=java.lang.ArithmeticException.class)
       public void divideByZero() {
           c.divide(10,0);
       }
}