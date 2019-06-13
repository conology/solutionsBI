package com.company;

public class Main {
    /*
    JUnit testing takes care of testing our application at low level, meaning we want to make sure our classe methods
    are tested against different conditions, and they provide expected results in such a cases. Our methods we want to
     test can, during application runtime, receive different values for input parameters. We want to make sure our
     method is tested against these. Of course - not against all possible values, since that's not possible, but against
      some meaningful values, as well as some edge cases where our methods can receive, let's say null as parameter, or
      some other value that could potentially crush our application. Let's start writing com.mydomain.Calculator.javaand
       JUnit tests for it, com.mydomain.CalculatorTest.java. Test classes are also known as Test cases.
It's a common practice to name test class after class we're testing (sometimes referred to as System Under Test - SUT),
by appending Test suffix to it. In our case, our SUT is Calculator.java, so our test class should be CalculatorTest.java.
 Also, common practice is that test class should reside in same package as SUT one (in our case, both are
 in com.mydomainpackage, but test class is in src/test/javatree, and SUT is in src/main/java.
 These are maven defaults which state that application code should go to X, whereas test code should be inside
 src/testpackages. Our Calculator class should look like:
     */
    public static void main(String[] args) {
        // write your code here
    }
}