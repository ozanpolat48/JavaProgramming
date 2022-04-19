package day33_Statics;

public class EmployeeObject {

    public static void main(String[] args) {


        Employee employee1 = new Employee();
        employee1.name = "Ahmet";
        employee1.salary= 110000;

        Employee employee2 = new Employee();
        employee2.name = "Aygun";
        employee2.salary = 115000;

        Employee employee3 = new Employee();
        employee3.name = "Fady";
        employee3.salary = 120000;


        System.out.println( employee1.name+" : "+employee1.salary);
        System.out.println( employee2.name+" : "+employee2.salary);
        System.out.println( employee3.name+" : "+employee3.salary);

        System.out.println(employee1.ishuman);
        System.out.println(employee2.ishuman);
        System.out.println(employee3.ishuman);


        int a = 100;

        a = 200;

        a = 300;


    }
}
