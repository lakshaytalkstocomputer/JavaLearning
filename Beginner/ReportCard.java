/* WAP and create a class Student and make its related function to store name, roll number and marks of three different 
   subjects. 
*/
   

package Training;
import java.util.*;


public class ReportCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Student s1 = new Student();
		
		     
		s1.getBasicData(sc);
		s1.getMarks(sc);
		s1.showData();
		
		sc.close();

	}

}

class Student
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

