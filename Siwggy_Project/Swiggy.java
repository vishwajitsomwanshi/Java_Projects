package school;

import java.util.Scanner;

import exception.OrderNotPlaceException;

public class Swiggy {
		Customer c;
		String hotelName;
		
		Swiggy(String hotelName)
		{
			this.hotelName=hotelName;
			}
		public void placeOrder(Customer c) 
		{
			
			if (this.c==null) 
			{
				this.c=c;
				System.out.println("Order place Successfully.......");
			}
			else {
				System.out.println("Order is already place");
			}
		}
		public void cancleOrder() throws OrderNotPlaceException
		{
		
			if (this.c==null)
			{
				throw new OrderNotPlaceException();
			}
			else 
			{
				this.c=null;
				System.out.println("order cancle succesfully");
			}
			
		}
		public void updateOrder()
		{
			if (this.c==null) {
				System.out.println("First place the Order");
			}
			else 
			{
				Scanner sc=new Scanner(System.in);
				
				System.out.println("First enter the Address");
				String address=sc.next();
				c.setAddress(address);
				
				System.out.println("contact number");
				long moNo=sc.nextLong();
				c.setMoNo(moNo);
				
				System.out.println("Prouct");
				String product=sc.next();
				c.setProduct(product);
				
			}
		}
		public void displayOrder() 
		{
			if (this.c==null) 
			{
				System.out.println("First Place the Order");
			}
			else
			{
				//System.out.println("-------WELCOME TO SWIGGY--------");
				System.out.println("Customer Name :"+c.getName());
				System.out.println("Mobile Number :"+c.getMoNo());
				System.out.println("Customer Address :"+c.getAddress());
				System.out.println("Product Details :"+c.getProduct());
				
			}
		}
		
}
