package day36_Inheritance.Task;

public class Developer extends Employee{

   public void coding(){
       System.out.println(jopTitle+ " "+name+" is coding");
   }

   public void fixingBugs(){
       System.out.println(jopTitle+" " +name+" is fixing bugs");
   }

}
/*
2.3 Create the sub class of Employee named Developer:
			variables:
				name, gender, age, id, jobTitle, salary
			Methods:
				setInfo()
				work()
				coding()
				fixingBugs()
				toString()
 */