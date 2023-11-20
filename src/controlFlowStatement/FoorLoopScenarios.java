package controlFlowStatement;

public class FoorLoopScenarios {

	public static void main(String[] args)
	{
			//for loop with if condition
		/*
		 * print all even numbers upto 25
		 */
		for(int i=1;i<=25;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even Number: "+i);
			}
		}
		
		System.out.println("******************");
		
		//Nested for loop
		//print table of 2
		
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(5*i);
		}
		
		System.out.println("*****************************");

		
		
		for(int num=1;num<=10;num++)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.print(num*i+"\t");
			}
			//after one row completed come to the next link
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
	}

}
