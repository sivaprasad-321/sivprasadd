package p1;
	import java.util.Scanner;
	public  class  ClassZ{	
		int b=39;
		int year;
		public static void meth2()
		{
			System.out.println("static meth1");
		}
		static 
		{
			System.out.println("static block");
		}
		public void meth1()
		{
			System.out.println("enter year number");
			Scanner scn=new Scanner(System.in);
			year=scn.nextInt();
			if(year%400==0)
			   {
				System.out.println("it is a leap year");
			   }
			else if(year%4==0)
			 {
				System.out.println(" it is also a leap year");
			 }
			else if(year%100==0)
			{
				System.out.println(" it is a not a leapyear");	
			}
			else
			{
			System.out.println("it is a not a leapyear");
			}
			
		}
	public static void main(String[] args)
	{
		System.out.println("it is a not a leapyear");
	
	}
	static 
	{
		System.out.println("hello");
	}
}