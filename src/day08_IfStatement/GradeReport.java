package day08_IfStatement;

public class GradeReport {

    public static void main(String[] args) {

        /*
        System.out.println( true == !false ); // true
        System.out.println( !true != false); //false
        System.out.println(!false == true); //true

        System.out.println(!!false); //false
        System.out.println(!!!true); //false

         */

        int score = 85;

        boolean a = score >= 90 && score <= 100; // false
        boolean b = score >= 80 && score <= 89; // true
        // boolen b = score >= 80 && !a; // if score is A, but score is greater than 80

        boolean c = score >= 70 && score <= 79; // false
        // boleen c = !a && !b && score >= 70

        boolean d = score >= 60 && score >= 69; // false

        boolean f = score >= 0 && score >=59; // true
        // boleen f = !a && !b && !c && !d;

        if(a) { //if the studend made an A
            System.out.println("Excellent");
        }

        if(b) { //if the student made an B
            System.out.println("Great");
        }

        if(c) { //if the student made a C
            System.out.println("Good");
        }

        if(d) { //if the student made a D
            System.out.println("Passed");
        }

        if(f) { // if the student made a F
            System.out.println("Failed");
        }





    }
}
/*
score
      90 ~ 100 ==> Excellent
      80 ~ 89 ==> Great
      70 ~ 70 ==> Good
      60 ~ 69 ==> Passed
      0 ~ 59 ==> Failed


 */