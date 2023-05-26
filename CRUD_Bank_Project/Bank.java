package school;

import java.util.Scanner;

public class Bank {
		Account a;
		
		String bname;
		
		Bank(String bname)
		{
			this.bname=bname;
		}
		public void createAccount(Account a)
		{
			if ((this.a==null)) {
				this.a=a;
				System.out.println("Account created succesfully.......");
			}
			else {
				System.out.println("Account is already careted......");
			}
		}
		public void deleteAccount()
		{
			if (this.a==null) {
				System.out.println("First create account.......");
			}
			else {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the password");
				int password1=sc.nextInt();
				if (password1==a.getPassword()) {
					
				}
				this.a=null;
				System.out.println("Account delete succesfully.....");
			}
		}
		public void updateAccount()
		{
			if (this.a==null) {
				System.out.println("First caeate Account");
			}
			else {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the password");
				int password=sc.nextInt();
				if (password==a.getPassword()) {
					
					System.out.println("Enter the new cNo");
					long cNo=sc.nextLong();
					a.setcNo(cNo);
					
					System.out.println("Enter the new city");
					String branch=sc.next();
					a.setBranch(branch);
					
					System.out.println("enter the name");
					String acHolderName=sc.next();
					a.setAcHolderName(acHolderName);
					
					System.out.println("details updates succsefully");
				}
				else {
					System.out.println("Incorrect Password");
				}
			}
		}
		public void displayDetails()
		{
				if (this.a==null)
				{
				System.out.println("First create account");
				}
				else
					{
				
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the password");
				int password=sc.nextInt();
				if (password==a.getPassword()) {
					
					System.out.println("Account holder name :"+a.getAcHolderName());
					System.out.println("Account no :"+a.getAcNo());
					System.out.println("IFSC code :"+a.getIfsc());
					System.out.println("Contact No :"+a.getcNo());
					System.out.println("Branch :"+a.getBranch());
					
					}
				else
				{
					System.out.println("Incorrect Password");
				}
					}
		}

		
		public void changePassword()
		{
			if (this.a==null) {
				System.out.println("Account is not created...");
			}
			else {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the Old password");
				int password= sc.nextInt();
				
				if (password==a.getPassword()) {
					System.out.println("Enter the password");
					int npassword=sc.nextInt();
					a.setPassword(npassword);
					System.out.println("password update succesfully");
				}
				else {
					System.out.println("Incorrect password");
				}
				
			}
		}
		public void balanceInquiry() {
			if (this.a==null) {
				System.out.println("First Create Account");
			}
			else {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the Password");
			double password=sc.nextDouble();
			if (password==a.getPassword()) {
				
				System.out.println("Your Account Balance is :"+a.getBalance());
				
				
			}
			else {
				System.out.println("Encorrect Password");
			}
		}
		}
		public void deposite()
		{
			if (this.a==null) 
			{
				System.out.println("First Create Acount");
			}
			else
			{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the password");
			int password=sc.nextInt();
			if (password==a.getPassword())
			 {
//				System.out.println("Enter the Balance ");
//				double balance=sc.nextDouble();
				
				System.out.println("enter the deposite amount");
				double deposite=sc.nextDouble();
				
				double balance=a.getBalance()+deposite;
				System.out.println("balance after deposite money :"+balance); 
			 }
				else 
				{
					System.out.println("Invalid Password");
				}
			}
		}
		public void widrawal()
		{
			if (this.a==null) {
				System.out.println("First create Account");
			}
			else {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the password");
				int password=sc.nextInt();
				if (password==a.getPassword()) {
//					System.out.println("Enter the Balance");
//					double balance=sc.nextDouble();
					
					System.out.println("Enter the Widrawal Amount");
					double widrawal=sc.nextDouble();
					
					
					double balance=a.getBalance()-widrawal;
					
					System.out.println("after widrawal remaining balance :"+balance);
				}
				else {
					System.out.println("invalid password");
				}
			}
		}
	}		
	
		

