package studentdatabaseapp;

import java.util.Scanner;

public class StudentDataBaseApp {
	public static void main (String [] args) {
		
		
		//Ask the User for amount of students 
		System.out.println("Welcome to our Student Data Base System!\nEnter the amount of students for this class to enroll:");
		Scanner bob= new Scanner(System.in);
		int numbs = 0;
		
		//Exception Handling on Invalid User Inputs 
		boolean tr= false;
		while (!tr) {
		 try {
			numbs= bob.nextInt();
			tr=true;
			
		 }
		 catch (Exception e) {
			System.err.println("This is not a number! Please input a number value!");
			bob.next();
			continue;
			
		 }
		}
		System.out.println("There are "+numbs+" students in this class."
				+ "\nLet's Enroll These Students one by one!");
		Student [] clss= new Student[numbs];
		
		
		//Create n amount of students
		
		for (int i=0; i <numbs;i++) {
			System.out.println("\nStudent "+(i+1)+":");
			clss[i]= new Student();
			clss[i].enroll();
			clss[i].paytut();
			System.out.println(clss[i].toString());
			
			
		}
		
		System.out.println("\nThat's all of them!");
		
		System.out.println("Thank you for enrolling your students through our DataBase System!");
		
	}

}
