import java.util.*;
import static java.lang.System.*;

public class RestaurantRunner
{
	public static void main ( String[] args )
	{
		ListNode z = new ListNode("cheese",
	 			new ListNode("pepperoni",
      		new ListNode("onions",
       		new ListNode("peppers",
	 			new ListNode("bacon",
      		new ListNode("pineapple",
       		new ListNode("sausage",		       		
	 			new ListNode("garlic",null))))))));
		Restaurant a = new Restaurant(z);
			 			
		out.println("Worksheet LL#2 Runner\n\n");	
		
		out.println("Original list values\n");	
		out.print("\t");
		Restaurant.print(a);
		out.println("\n");
		
		out.println("\t num nodes = " + a.nodeCount(a));

		out.println("\nList values after calling nodeCount\n");	
		out.print("\t");
		Restaurant.print(a);
		out.println();		
//
//		a.doubleFirst(a);		
//		out.println("\nList values after calling doubleFirst\n");							
//		out.print("\t");
//		Restaurant.print(a);
//		out.println();	
//
//		a.doubleLast(a);		
//		out.println("\nList values after calling doubleLast\n");							
//		out.print("\t");
//		Restaurant.print(a);
//		out.println();	
		a.skipEveryOther(a);	
		out.println("\nList values after calling skipEveryOther\n");							
		out.print("\t");
		Restaurant.print(a);
		out.println();	
//		
//		
//		a.removeXthNode(a,2);		
//		out.println("\nList values after calling removeXthNode(2)\n");					
//		out.print("\t");
//		Restaurant.print(a);
//		out.println();			
//		
//	
//		a.setXthNode(a,2,"PIZZA!");		
//		out.print("\t");
//		out.println("\nList values after calling setXthNode(2,PIZZA!)\n");										
//		out.print("\t");
//		Restaurant.print(a);
//		out.println();				
	}
}