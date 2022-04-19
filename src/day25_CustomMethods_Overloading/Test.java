package day25_CustomMethods_Overloading;

import utilities.StringUtilitiy;

public class Test {

public static void main(String[] args){

    String str = "Java Programming Language";

    StringUtilitiy.printEachChar(str);

    System.out.println("------------------------");

    String s1 = "Cydeo School";

    String reverse = StringUtilitiy.reverse(s1);

    System.out.println(reverse);

    System.out.println("-------------------------");

    String word =  "Java";

    boolean palindrome = StringUtilitiy.isPalindrome(word);

    System.out.println("palindrome = " + palindrome);

    System.out.println("------------------------------");

    String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};

    int count = 0;

    for (String each : names) {
        if (StringUtilitiy.isPalindrome(each)){
            count++;
        }
    }
    System.out.println(count);

    System.out.println("---------------------------");


    String a2 = "aaaaaabbbbbbccccccdddddd";

    String nonDup = StringUtilitiy.removeDuplicates(a2);

    System.out.println(nonDup);

}
}
