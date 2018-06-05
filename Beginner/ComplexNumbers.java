/* WAP to add and subtract two complex numbers */

import java.util.Scanner;
class ComplexNumber
{
	private double realPart;
	private double imagPart;
	
	void getData(Scanner sc)
	{
		System.out.println("Enter real part : ");
		this.realPart = sc.nextDouble();
		System.out.println("Enter imaginary part : ");
		this.imagPart = sc.nextDouble();
	}

	void showdata()
	{
		System.out.println("Imaginary number = "+this.realPart +" + "+this.imagPart+"i");
	}
	

	public static ComplexNumber addd (ComplexNumber a, ComplexNumber b)
	{
		ComplexNumber temp = new ComplexNumber();
		temp.realPart =  a.realPart + b.realPart ;
		temp.imagPart =  a.imagPart + b.imagPart ;
		
		return temp;
	}
	
	public static ComplexNumber subb (ComplexNumber a, ComplexNumber b)
	{
		ComplexNumber temp = new ComplexNumber();
		temp.realPart =  a.realPart - b.realPart ;
		temp.imagPart =  a.imagPart - b.imagPart ;
		
		return temp;
	}
	
	
	
	
}

public class ComplexNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first  complex number ");
		ComplexNumber num1 = new ComplexNumber();
		num1.getData(sc);
		
		System.out.println("\nEnter second complex number ");
		ComplexNumber num2 = new ComplexNumber();
		num2.getData(sc); 
		
		System.out.println("\nWhat operation you want to do with these complex number ?");
		System.out.print("Enter 1 for addition, 2 for subtraction : ");
		int a;
		a= sc.nextInt();
		
		switch(a)
		{
		
		case 1:
		{
			System.out.println("\nAddition of two complex number : ");
			ComplexNumber newNum ;
			newNum = ComplexNumber.addd(num1, num2);
			newNum.showdata();
		}
		break;
		
		case 2:
		{
			System.out.println("\nSubtraction of two complex number : ");
			ComplexNumber newNum2 ;
			newNum2 = ComplexNumber.subb(num1, num2);		
			newNum2.showdata();
		}
		break;
		
		default:
		System.out.println("Wrong choice. Program exiting!");
		
		}
		
		
		
       
		sc.close();
	}
	
	
}
	

