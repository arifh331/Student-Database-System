package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	
	//Instance Variabbles
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses="";
	private int tBalance;
	private static int costOfCourse=600;
	private static int id=1000;
	
    //Constructor prompts Student's name and year 
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Student's Firstname:");
		
		this.firstName=in.nextLine();
		
		System.out.print("Enter the Student's Lastname:");
		
		this.lastName=in.nextLine();
		
		System.out.print("Grade-Levels: \n1-Freshmen\n2-Sophmore\n3-Junior\n4-Senior\nEnter the number associated"
				+ " with Student's Grade Level: ");
		
		this.gradeYear=in.nextInt();
		
		setSid();
		
	
		
		
		
		
	}
	
	//Have an ID
	private void setSid() {
		//Student ID = Grade Level + ID
		id++;
		
		this.studentID= gradeYear+ ""+id;
		
	}
	
	//Classes Enrolled
	
	public void enroll() {
		System.out.println("Each course costs $600.");
		//Get Inside a loop, User hits Q to quit enrolling
	 do {
		System.out.println("Enter the name of a course to enroll for this student(Specifically type Q to quit enrolling):");
		Scanner bob=new Scanner(System.in);
		String course = bob.nextLine();
		if (!course.equalsIgnoreCase("Q")) {
			courses = courses+"\n  " + course;
			this.tBalance= this.tBalance+this.costOfCourse;
			
		}
		else {
			
			break;
		}
	 } while(true);
		
		

	}
	
	//Viewing Balance of Student 
	public void viewbal() {
		System.out.println("This student's current balance is:$"+this.tBalance);
	}
	
	//Pay Tuition
	public void paytut() {
		this.viewbal();
		Scanner payer= new Scanner(System.in);
		System.out.println("How much would you like to pay?");
		int pay = 0;
		//Exception Handle the User Input
		boolean bob = false;
		while (!bob) {
			try {
				 pay=payer.nextInt();
				 bob=true;
			}
			catch (Exception e) {
				System.err.println("This is not a number! Please input a number value!");
				payer.next();
				continue;
				
			 }
		}
		 
		
		
		this.tBalance=this.tBalance-pay;
		System.out.println("Thank you for your payment of $"+pay+"!");
		this.viewbal();
		System.out.println();
	}
	
	//Status of Students 
	public String toString() {
		return "Name: "+this.firstName+" "+this.lastName+"\nCourses Enrolled:"+this.courses+
				"\nStudent Id: "+this.id +
				"\nGrade Level: "+this.gradeYear+
				"\nStudent Balance:$"+this.tBalance;
	}

}
