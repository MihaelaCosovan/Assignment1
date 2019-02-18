import java.util.Random;
import java.util.Scanner;

class Shape4 {
	public void display()
	{
		System.out.print("\nI am a valid shape. ");
	}
}

//Inheritance 
class Square extends Shape4 {
	//Polimorphism
	//1. Override display method
	public void display()
	{
		System.out.println("I have four sides and four corners.");
	}
	
	//2. Overload DisplayDetails method
	public void display(int num1, int num2)
	{
		if(num1 == num2) {
			System.out.println("My name is Square and I have the following details: "+num1+", "+num2+".");	
		}
		else
		{
			System.out.println("My name is Rectangle and I have the following details: "+num1+", "+num2+".");	
		}
	}
}

//abstract class
abstract class ShapeCalculation {
	// abstract method
	abstract void area (int num1, int num2);
	abstract void perimeter(int num1, int num2);
	
	//concret method
	void label() {
		System.out.println("Area and perimeter: ");
	}
}

class Shape4Calculation extends ShapeCalculation {
	public void area(int num1, int num2) 
	{
		System.out.println("Area: " + num1 * num2);
				
	}

	public void perimeter(int num1, int num2)
	{
		if(num1 == num2) {
			System.out.println("Perimeter: " + 4*num1);}
		else {
			System.out.println("Perimeter: " + 2*(num1+num2));
		}
	}
}

class ShapeDetails {
	private int idc;
	
	//Getter methods
	public int getIdc() {
		return idc;
	}
	
	//Setter methods
	public void setIdc(int idc) {
		this.idc = idc;
	}
}


public class Assignment1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int num1, num2;
				
		System.out.println("Please insert the details for your shape. The values should be greater than 0.\n");
		
			System.out.print("Type first value: ");
			num1 = s.nextInt();
					
			System.out.print("Type second value: ");
			num2 = s.nextInt();
			
			if (num1 == 0  | num2 == 0) {
				System.out.print("\nThe numbers are not valid. Bye Bye!");}
			else
				{ 
				Shape4 shape4 = new Shape4();
				Square square = new Square();
					shape4.display();
					square.display();
					square.display(num1, num2);
				
			ShapeCalculation shapecalc = new Shape4Calculation();
				shapecalc.area(num1, num2);
				shapecalc.perimeter(num1, num2);
			
			Random r = new Random();
			int idr = r.nextInt(100);
			ShapeDetails shapedesc = new ShapeDetails();
				shapedesc.setIdc(idr);
				System.out.println("My Id is: " + shapedesc.getIdc());	}
			
			s.close();
	}		
}