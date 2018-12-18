/* WAP and create a class StudentData and make its related function to store name, roll number and marks of three different 
   subjects.  and then create array of objects. 
*/
   


package Training;
import java.util.*;


public class ArrayObjectStudent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		StudentData s1[] = new StudentData[3];  // This creates reference to the Student class
											   //  Read More at https://www.guru99.com/array-of-objects.html
		for (int i =0; i<s1.length; i++)
		{
		
		s1[i] = new StudentData();   //This creates memory space for the each object  
		s1[i].getBasicData(sc);
		s1[i].getMarks(sc);
		s1[i].showData();
		System.out.println();
		System.out.println();
		
		}
		sc.close();

	}

}

class StudentData
{
	private String name;
	private double maths;
	private double science;
	private double english;
	private int rollNo;  
	void getBasicData(Scanner sc)
	{
		//Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter name : ");
		this.name = sc.next();
		System.out.println("Enter Roll Numebr : ");
		this.rollNo = sc.nextInt();
	   // sc.close();
	}
	
	void getMarks(Scanner sc)
	{
		//Scanner st = new Scanner(System.in);
		System.out.println("Enter Maths Marks : ");
		
		this.maths = sc.nextDouble();
		System.out.println("Enter English Marks : ");
		this.english = sc.nextDouble();
		System.out.println("Enter Science Marks : ");
		this.science = sc.nextDouble();
		
	}
	
	void calPercentage ()
	{
		double per;
		per = this.maths+this.english+this.science;
		System.out.println("Percentage of student = " + (per/3) + "%");
	}
	
	void showData()
	{
		System.out.println();
		System.out.println();
		System.out.println("Name = "+this.name);
		System.out.println("Roll number = "+this.rollNo);
		System.out.println("Marks in Maths = "+this.maths);
		System.out.println("Marks in English = "+this.english);
		System.out.println("Marks in Science = "+this.science);
		this.calPercentage();
		
	}
	
	
	
}

