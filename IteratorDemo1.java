package p1;
import java.io.*;
import java.util.*;
	        class IteratorDemo1 {
	        public IteratorDemo1(String string) {
					// TODO Auto-generated constructor stub
				}

			public IteratorDemo1(String string, int i) {
					// TODO Auto-generated constructor stub
				}

				@SuppressWarnings("unchecked")
			public static void main(String[] args)
	            {
	               // ArrayList<Integer> list
	            ArrayList<Integer> list   = new ArrayList<Integer>();
	               
	                list.add(0);
	                list.add(2);
	                list.add(3);
	                list.add(4);
	                list.add(5);
	              //  list.add(new IteratorDemo1("sivaprasad",10));
	            
	              list.get(0);
	                System.out.println( list.get(1));
	                System.out.println( list.get(2));
	                // Iterator
	                Iterator itr = list.iterator();
	         
	                System.out.println("Iterator:");
	                System.out.println("Forward traversal: ");
	               while (itr.hasNext())
	                
	                    System.out.print(itr.next() + " ");
	                
	              //  System.out.println( ((List<Integer>) itr).contains(5));
	                
	                System.out.println();
	                
	                // ListIterator
	                ListIterator i = list.listIterator();
	         
	                System.out.println("ListIterator:");
	                System.out.println("Forward Traversal : ");         
	                while(i.hasNext())
	                    System.out.print(i.next() + " ");
	         
	                System.out.println();
	                System.out.println("Backward Traversal : ");         
	                while (i.hasPrevious())
	                    System.out.print(i.previous() + " ");
	         
                      }
}