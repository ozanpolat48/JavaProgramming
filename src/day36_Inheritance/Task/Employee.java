package day36_Inheritance.Task;

public class Employee {

    public String name;
    public char gender;
    public int age;
    public int jopTitle;
    public String id;
    public double salary;


    public void setInfo(String name, char gender, int age, int jopTitle, String id, double salary) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.jopTitle = jopTitle;
        this.id = id;
        this.salary = salary;

    }

    public void work(){
        System.out.println(jopTitle+" "+ name+" is working");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", jopTitle='" + jopTitle + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}

/*
lunch task:

	Employee:
		name, gender, age, jobTitle, id, salary,
		setInfo(), work(), toString()

	Tester

	Developer

	Driver

	Teacher

 */