package day36_Inheritance.Task;

public class Tester extends Employee{


    public void testing(){
        System.out.println(jopTitle+" "+name+" is testing");
    }

    public void createTicket(){
        System.out.println(jopTitle+" "+name+" is creating ticket");
    }
}

/*
2.2 Create the sub class of Employee named Tester:
			variables:
				name, gender, age, id, jobTitle, salary
			Methods:
				setInfo()
				work()
				testing()
				creatingTicket()

 */
