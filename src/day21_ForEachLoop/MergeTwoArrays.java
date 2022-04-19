package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        String[] group1 = {"Ali", "Layan", "Aysenur"}; //3
        String[] group2 = {"Maria", "Aygun", "Duygu", "Suat", "Valeriy"}; //5

        String[] students = new String[group1.length + group2.length]; //8

        int i =0;
        for (String each : group1) { // Ali, Layan, Aysenur
            students[i++] = each;
        }

        for (String each :group2) {
            students[i++] = each;
        }

        System.out.println(Arrays.toString(students));


        System.out.println("---------------------------------------------------");

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'D', 'E', 'F', 'G', 'H'};

        char[] chars = new char[ch1.length + ch2.length];

        int j = 0;

        for (char ch : ch1) {
            chars[j] = ch;
            j++;
        }

        for (char ch: ch2) {
            chars[j] = ch;
            j++;
        }

        System.out.println(Arrays.toString(chars));

        System.out.println("------------------------------------------");

        int[] as1 = {1,2,3,4};
        int[] as2 = {5,6};

        int[] ass = new int[as1.length + as2.length];

        int k = 0;

        for (int ad: as1) {
            ass[k] = ad;
            k++;
        }

        for (int ad: as2) {
            ass[k] = ad;
            k++;
        }

        System.out.println(Arrays.toString(ass));

    }
}
