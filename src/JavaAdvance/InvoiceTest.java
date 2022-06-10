package JavaAdvance;

import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Invoice inv = new Invoice();
		
		System.out.println("Enter No-");
		inv.setNumber(sc.next());
		System.out.println("Enter description-");
		inv.setDescription(sc.next());
		System.out.println("Enter quantity-");
		inv.setQuantity(sc.nextInt());
		System.out.println("Enter Price-");
		inv.setPrice(sc.nextDouble());
		
		System.out.println("*****Invoice*****");
		System.out.println("Invoice No-"+inv.getNumber()+
				"\nDescription-"+inv.getDescription()+
				"\nQuantity-"+inv.getQuantity()+
				"\nPrice-"+inv.getPrice()+
				"\n-------------"+
				"\nTotal-"+inv.getInvoiceAmount());
		System.out.println("*****************");

	}

}

class Invoice {
	String number, description;
	int quantity;
	double price;

	Invoice() {
		number = null;
		description = null;
		quantity = 0;
		price = 0.0;
	}
	
	public double getInvoiceAmount() {
		double total=this.quantity*this.price;
		return total;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if(0<quantity)
		this.quantity = quantity;
		else 
			this.quantity=0;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(0<price)
		this.price = price;
		else 
			price=0.0;
	}

}
