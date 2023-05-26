package school;

import java.util.Scanner;

public class School {
	String sname;
	
	Student s;
	
	School (String sname){
		this.sname=sname;
	}
	public void addStudent(Student s)
	{
		if (this.s==null) {
			this.s=s;
					System.out.println("Admission taken Successfully........");
		}
		else {
			System.out.println("Student already present");
		}
	}
	public void cancleAdmission() {
		if (this.s==null)
		{
			System.out.println("First take admission");
		}
		else {
			this.s=null;
			System.out.println("Admission cancled susccesfully....");
		}
	}
	public void updateStudent()
	{
		if (this.s==null) {
			System.out.println("First take admission");
		}
		else {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the id to update");
			int id=sc.nextInt();
			s.setId(id);
			System.out.println("Enter the std to update");
			String std=sc.next();
			s.setStd(std);
			System.out.println("Details updated successfully.....");
		}
	}
	public void displayStudent()
	{
		if (this.s==null) {
			System.out.println("First take admission");
		}
		else {
			System.out.println(sname);
			System.out.println("student id :"+s.getName());
			System.out.println("Student name :"+s.getId());
			System.out.println("student std :"+s.getStd());
		}
	}
}
