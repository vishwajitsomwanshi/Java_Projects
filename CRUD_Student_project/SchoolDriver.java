package school;

import java.util.Scanner;

public class SchoolDriver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		School s1=new School("z p school");
		boolean exit=true;
		while(exit)
		{	
		System.out.println("Enter the choice \n1.Take Admission \n2.cancle Admission \n3.update student \n4.Display student Details");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Enter the student id");
			int id=sc.nextInt();
			System.out.println("Enter the student name");
			String name=sc.next();
			System.out.println("Enter the student std");
			String std=sc.next();
			s1.addStudent(new Student(name,id,std));
			
		}
		break;
		case 2:
		{
			s1.cancleAdmission();
		}
		break;
		case 3:
		{
			s1.updateStudent();
		}
		break;
		case 4:
		{
			s1.displayStudent();
		}
		break;
		default:
		{
			System.out.println("Invalid Input");
		}
		break;
		}
		}

	}

}
