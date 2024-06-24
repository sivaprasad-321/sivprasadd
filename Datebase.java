package p1;

public class Datebase {
	int i;
	int j;
			

	public void meth1() {
	System.out.println("i love you");
	for (int i=1;i<=10;i++)
	     {
		    int a=0;
		    for(j=1;j<=i;j++)
		    {
		    	if(i%j==0)
		    	{
		    		 a++;
		    		 System.out.println(a);
		    		 //System.out.println("hello");
		    	}
		    //	System.out.println("namasathee");
		    }
		    if (a==2)
		    {
		    	System.out.println(i+"namsathee+");
		    }
     	 }
		
	}
	public static void main(String[] args)
	{
		 Datebase obj=new  Datebase();
		 obj.meth1();
	}

}
