package day42_Exceptions;

public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello");
        Thread.sleep(3000);     //throws keywordun avantajı ekranda daha az cod bloğunun olması.
        System.out.println("Cydeo");

        System.out.println("-----------Test 1 Completed-----");

        System.out.println("-----------Test 2---------------");

        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("Batch 25");

        System.out.println("--------Test 2 Completed------------");

    }
}
