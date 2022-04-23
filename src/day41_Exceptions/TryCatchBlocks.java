package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {

    public static void main(String[] args){

        System.out.println("Test1 started");

        try {

            System.out.println(9/0);

            System.out.println("Try Block");

        }catch (ArithmeticException e){

            System.out.println("Catch Block");

            System.out.println("Arithmetic Exception was occurred");
        }


        System.out.println("Test1 Completed");

        System.out.println("--------------------------------------------");

        System.out.println("Test2 started");

        int[] numbers = {1,2,3,4,5};

        try {

            System.out.println(numbers[200]);

            System.out.println("Try Block");

        }catch (RuntimeException e){    // RuntimeException tüm un check lerin Ana sınıfıdır.

            e.printStackTrace();  // komple hatanın içerğini verir. Runda

            //System.out.println( e.getMessage() );

        }

        System.out.println("Test2 Completed");

        System.out.println("-------------------------------------------------------------");


        System.out.println("Test3 started");


        try {

            System.out.println("Cydeo".substring(2,0));

        }catch (RuntimeException e){

            e.printStackTrace();

        }

        System.out.println("Test3 started");


        System.out.println("--------------------------------------------------------------");


        System.out.println("Hello");

        try {
            Thread.sleep(3000);  // sleepin altı kırmızı çizgi hata olduğunda yanına tıkla solda kırmızı ampül çıkacak oradan 2. sıradaki try catch seçenekli ampüle tıkladığında otomatik olarak try catch i yapıyor.

        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        System.out.println("Cydeo");


        System.out.println("---------------------------------------------------------------");


        try {
            FileInputStream file = new FileInputStream("File path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }





    }
}
