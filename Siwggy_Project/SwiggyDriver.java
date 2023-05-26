package school;

import java.util.Scanner;

import exception.OrderNotPlaceException;

public class SwiggyDriver 
{

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		Swiggy sw=new Swiggy("Welcome to Swiggy");
		
		boolean exit=true;
		while (exit)
		{
			System.out.println("enter the choice \n1.Place Order\n2.Cancle Order\n3.Update Order\n4.Display Order\n5.exit\n6.default");
			int choice=sc.nextInt();
			
			switch(choice) 
			{
			case 1:{
				
			System.out.println("Enter the Customer Name");
			String name=sc.next();
			
			System.out.println("Enter the Contact Number");
			long moNo=sc.nextLong();
			
			System.out.println("Enter the Address");
			String address=sc.next();
			
			System.out.println("Product");
			String product=sc.next();
		
			sw.placeOrder(new Customer(name,address,moNo,product));
			
			}
			break;
			case 2:{
				try {
				sw.cancleOrder();
				}
				catch (OrderNotPlaceException e) {
					
					System.out.println(e);
				}
			}
			break;
			case 3:{
				sw.updateOrder();
			}
			break;
			case 4:{
				sw.displayOrder();
			}
			break;
			case 5:
			{
				exit=false;
			}
			break;
			default:
			{
				System.out.println("Invalid Input............."+choice);
			}
		
			}
		}

	}

}
