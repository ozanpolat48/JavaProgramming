package day13_String;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstname = scan.next(); //"Java"

        System.out.println("Enter your last name");
        String lastname = scan.next();

        char f = firstname.charAt(0);
        char l = lastname.charAt(0);

        String inital = f + "." + l;
        System.out.println("inital = " + inital);

        scan.close();

    }
}
