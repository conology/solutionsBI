package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Ask a user for a ID number. The correct input for a id number is 10 in length and they must all be numbers.
        // If not throw an exception

        //pridobitev ID-ja od uporabnika
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID");
        Integer input = 1000000000;
        //Poskrbimo da program ne pade vkup zaradi nesodelujočega uporabnika (Bojaa)
        try { //probas zagnati spodnjo odo (try == probaj)
            //preberem število, če pa uporabnik ne sodeluje pa se pogram sesuje...
            input = scanner.nextInt();
        } catch (Exception e){
            //če uporabnik vpiše besedo oz. karkoli kar bi program seulo, prideš sm v CATCH == ujami
            //e.printStackTrace(); to dobiš ponavadi od JVM
            System.out.println("Ne dela prjatu... vpiši ID");
        }
        //omejitev sprejemanja
        int length = String.valueOf(input).length();
        if(length==10){
            System.out.println("Correct");
        }
        else {
            System.out.println("Incorrect");
        }
    }
}
