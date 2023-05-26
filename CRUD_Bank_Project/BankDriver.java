package school;

import java.util.Scanner;

public class BankDriver {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		 Bank b=new Bank("=====State Bank Of India=====");
		 
		 boolean exit=true;
		 
		 while(exit)
		 {
			 System.out.println("Enter the choice \n1.Create Account\n2.Delet Account\n3.Update Account\n4.Display Details\n5.Change Password\n6.Balance Enquiry\n7.Deposite\n8.Widrawal \n9.exit");
			int choice=sc.nextInt();
			 switch (choice) {
			case 1:{
				System.out.println("Enter the Account Holder Name");
				String acHolderName=sc.next();
				
				System.out.println("Enter account number");
				long acNo=sc.nextLong();
				
				System.out.println("Enter IFSC code");
				String ifsc=sc.next();
				
				System.out.println("Enter Contact Number");
				long cNo=sc.nextLong();
				
				System.out.println("Enter Branch Details");
				String branch=sc.next();
				
				System.out.println("Enter Password");
				int password=sc.nextInt();
				
				System.out.println("Enter balance");
				double balance=sc.nextDouble();
				
//				System.out.println("Enter Deposite Amount");
//				double deposite=sc.nextDouble();
//				
//				System.out.println("Enter widrawal Amount");
//				double widrawal=sc.nextDouble();
				
				
				b.createAccount(new Account(acHolderName,acNo,ifsc,cNo,branch,password,balance));
			}
				break;
			case 2:{
				b.deleteAccount();
			}
			break;
			case 3:{
				b.updateAccount();
			}
			break;
			case 4:
			{
				b.displayDetails();
			}
			break;
			case 5:
			{
				b.changePassword();
			}
			break;
			case 6:{
				b.balanceInquiry();
			}
			break;
			case 7:
			{
				double deposite;
				b.deposite();
			}
			break;
			case 8:
			{
				double widrawal;
				b.widrawal();
			}
			break;
			case 9:
			{
				exit=false;
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


