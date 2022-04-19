package day20_Arrays;

public class UniqueElements {

    public static void main(String[] args) {

        String[] words = {"Layan", "Layan", "Oleksandr0", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"};


        for (int j = 0; j < words.length; j++) {


            String element = words[j]; // "Java"
            int freaquency = 0;
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(element)){
                    freaquency++;
                }
            }
                    if (freaquency == 1){
                        System.out.println(element);
                    }
        }
    }
}
