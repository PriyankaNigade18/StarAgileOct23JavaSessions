package exceptionHandling;

import java.util.Scanner;

public class RunTimeExceptions 
{
	int id=101;
	

	public static void main(String[] args)
	{
		
		RunTimeExceptions  r1=new RunTimeExceptions ();
		r1=null;
		System.out.println("Id is: "+r1.id);//NullPointerException
		
		
		
		
		
/*
		String s1="100ABC";
		int num=Integer.parseInt(s1);//NumberFormatException
		System.out.println(num);
		
		
		
		
		
		
		
		
		
		
		/*
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter index between 0 to 5");
			int index=sc.nextInt();
			
			
			int arr[]= {10,20,30,40,50,60};
			System.out.println(arr[index]);//ArrayIndexOutOfBoundsException
			
			sc.close();
			
		
		
		
		/*
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter two numbers: ");
			int a=sc.nextInt();
			int b=sc.nextInt();
			
			System.out.println("Addition is: "+(a+b));
			System.out.println("Subtraction is: "+(a-b));
			System.out.println("Division is: "+(a/b));//ArithmeticException
			System.out.println("Multiplication is: "+(a*b));
			
			sc.close();
			*/
			
			
			
		

	}

}
