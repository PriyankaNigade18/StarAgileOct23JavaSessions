package week1;

public class OperatorDemo {

	public static void main(String[] args) 
	{
		// Arithmetic operators +,-,/,*,%
		
		int a=20,b=10;
		System.out.println("Addition is: "+a+b);//2010
		System.out.println("Addition is: "+(a+b));//30
		System.out.println("Subtraction is: "+(a-b));//10
		System.out.println("Division is: "+(a/b));//2
		System.out.println("Multiplication is: "+(a*b));//200
		System.out.println("Modulus is: "+(a%b));//0

		/*
		 * Increment and decrement
		 * ++             --
		 * 
		 * post increment(value will update in next iteration)
		 * a++---> a=a+1
		 *
		 *Pre increment
		 *++a----->a=a+1
		 */
		
		//post increment
		System.out.println("a="+a);//20
		System.out.println(a++);//20
		System.out.println(a);//21
		
		
		//pre increment
		System.out.println(b);//10
		System.out.println(++b);//11
		
		
		int c=90;
		int d=c++;
		
		System.out.println(d);//90
		System.out.println(c);//91
		
		
		
		int e=156;
		int f=e++;
		
		System.out.println(f);//156
		System.out.println(e);//157
		
		int x=46;
		int y=++x;
		System.out.println(y);//47
		System.out.println(x);//47
		
		
		int p=869;
		int q=++p;
		System.out.println(q);//870
		System.out.println(p);//870
		
		//Decrement
		
		int c1=90;
		System.out.println(c1);//90
		System.out.println(c1--);//90
		System.out.println(c1);//89
		
		
		int d1=57;
		System.out.println(d1);//57
		System.out.println(--d1);//56
		
		int a1=78;
		int b1=a1--;
		System.out.println(b1);//78
		System.out.println(a1);//77
		
		
		int r=138;
		int s=r--;
		System.out.println(s);//138
		System.out.println(r);//137
		
		int i=49;
		int j=--i;
		System.out.println(j);//48
		System.out.println(i);//48
		
		int u=199;
		int v=--u;
		System.out.println(u);//198
		System.out.println(v);//198
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
