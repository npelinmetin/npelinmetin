package cmpe113_lab13;
import java.util.*;
public class Student {

	String department, id, name;
	int yearsOfStudy;
	double gpa;
	boolean hasScholarship;
	
	public Student(String department) 
	{
		super();
		this.department = department;
	}

	public Student(String department, String id, String name, int yearsOfStudy, double gpa, String has) {
		this.department = department;
		this.id = id;
		this.name = name;
		this.yearsOfStudy = yearsOfStudy;
		this.gpa = gpa;
		if(has.equals("Yes"))
			this.hasScholarship = true;
		else if(has.equals("No"))
			this.hasScholarship = false;
	}
	
	public void readInformation()
	{
		Scanner scan = new Scanner(System.in);
		String has1;
		System.out.println("Student ID:");
		this.id = scan.nextLine();
		
		System.out.println("Name:");
		this.name = scan.nextLine();
		
		System.out.println("Years of study:");
		this.yearsOfStudy = scan.nextInt();
		
		System.out.println("GPA:");
		this.gpa = scan.nextDouble();
		
		System.out.println("Scholarship (Yes/No):");
		has1 = scan.next();
		if(has1.equals("Yes"))
			this.hasScholarship = true;
		else if(has1.equals("No"))
			this.hasScholarship = false;
	}
	
	public void predictFutureSalary(int w)
	{
		double salary;
		if(w == 1)
		{
			salary = (this.gpa * 1000) - (this.yearsOfStudy * 10);
			if(this.hasScholarship == true) salary += 300;
			System.out.println("This student may get " + salary + " TL as salary in Turkey.");
		}
		else if(w == 2)
		{
			salary = (this.gpa * 10000) - (this.yearsOfStudy * 100);
			if(this.hasScholarship == false) salary -= 2000;
			System.out.println("This student may get " + salary + " TL as salary abroad.");
		}
	}
	
	public void printInformation()
	{ 
		String year;
		switch (this.yearsOfStudy) {
			case 1: year = "1st"; break;
			case 2: year = "2nd"; break;
			case 3: year = "3rd"; break;
			case 4: year = "4th"; break;
			default: year = "0"; break;
		}
		
		if(this.hasScholarship == true)
			System.out.println(this.name + ", whose student ID is "+this.id+", is studying "+year+" year at the \""+ this.department+"\" department with scholarship. "+ this.name+" has a GPA of "+this.gpa+".");
		else 
			System.out.println(this.name + ", whose student ID is "+this.id+", is studying "+year+" year at the \""+ this.department+"\" department without scholarship. "+ this.name+" has a GPA of "+this.gpa+".");
	}
	
	public static void main(String[] args) 
	{
		Student s1 = new Student("CENG", "12345", "Ada", 4, 3.7, "Yes");
		Student s2 = new Student("ECON");
		
		s1.printInformation();
		System.out.println();
		
		s1.predictFutureSalary(1);
		System.out.println();

		System.out.println("Enter information of second student:");
		s2.readInformation();
		System.out.println();

		s2.printInformation();
		System.out.println();

		s2.predictFutureSalary(2);
		System.out.println();

		
		
	}

}
