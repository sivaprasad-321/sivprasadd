package p1;

public class Synchronization implements Runnable
{   
    int tickets = 50;
   static int  i = 1,
		   
   		j = 2,
   		k =9;  
  synchronized 
  public void bookticket(String name, int wantedtickets)
      {
        if (wantedtickets <= tickets)
        {
        	System.out.println("if  block is a excuteded");
            System.out.println(wantedtickets + " booked to " + name);
            tickets = tickets - wantedtickets;
        }
        else
        {
            System.out.println("No tickets to book");
        }
    }
    public void run ()
    {
        String name = Thread.currentThread ().getName ();
       if (name.equals ("t1"))
       {
         this.bookticket(name, i);
       }
       else if (name.equals("t2"))
        {
          this.bookticket(name, j);
       }
        else
       {
          this.bookticket(name, k);
        }
    }
    public void meth1()
    {
    	System.out.println(" i loved you");
    }
    public static void main(String[]args)
    {
       Synchronization s = new Synchronization();
       
       
        Thread t1 = new Thread (s);
        Thread t2 = new Thread (s);
        Thread t3 = new Thread (s);
        t1.setName ("t0");
        
        t2.setName ("t1");
        
        t3.setName ("t5");
       t1.start();
    
        t2.start();
        t3.start();
       System.out.println("t1 name: " + t1.getName());
    }

		
	}








