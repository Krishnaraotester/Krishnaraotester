import java.util.Scanner;
class ScannerEx1
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter name");
	String name=s.nextLine();
	System.out.println("Enter first subject marks");
	int m1=s.nextInt();
	System.out.println("Enter second subject marks");
	int m2=s.nextInt();
	System.out.println("Enter fees");
	double fees=s.nextDouble();
	System.out.println("student details are");
	System.out.println("Name "+name);
	System.out.println("fee "+fees);
	System.out.println("m1 "+m1);
	if(m1>=35&&m2>=35)
	{
	System.out.println("Student is pass");
	int total =m1+m2;
	int avg =total/2;
	System.out.println("total "+total);
	System.out.println("Average "+avg);
	}
	else
	{
	System.out.println("student is fail");
	}

	}
	}
