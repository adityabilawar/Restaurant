import static java.lang.System.*;

public class Restaurant
{
	private ListNode front;
	public Restaurant(ListNode a) {
		front = a;
	}
	//this method will print the entire list on the screen
   public static void print(Restaurant a)
   {
	   ListNode list = a.front;
	   while(list!=null) {
		   System.out.println(list.getValue());
		   list = list.getNext();
	   }
   }		
	
	//this method will return the number of nodes present in list
	public static int nodeCount(Restaurant a)
	{
		  ListNode list = a.front;
   	int count=0;
    while(list!=null) {
		 count ++;
		   list = list.getNext();
	   }
		return count;
	}
		
	//this method will create a new node with the same value as the first node and add this
	//new node to the list.  Once finished, the first node will occur twice.
	public static void doubleFirst(Restaurant a)
	{
		 ListNode list = a.front;
		ListNode temp = new ListNode(list.getValue(), list.getNext());
		list.setNext(temp);
	
	}

	//this method will create a new node with the same value as the last node and add this
	//new node at the end.  Once finished, the last node will occur twice.
	public static  void doubleLast(Restaurant a)
	{
		 ListNode list = a.front;
   	ListNode prev= new ListNode();
   	while(list.getNext()!=null) {
   		list  = list.getNext();
   	}
   	prev.setValue(list.getValue());
   	list.setNext(prev);
   	
 	}
		
	//method skipEveryOther will remove every other node
	public static void skipEveryOther(Restaurant a)
	{
		 ListNode list = a.front;
		 ListNode prev = null;
		int count = 1;
		while(list!=null) {
			if(count%2==0) {
				prev.setNext(list.getNext());
				count++;
			}
			else {
				prev = list;
			count++;
			}
		
			list = list.getNext();
		}
	}

	//this method will set the value of every xth node in the list
	public static  void setXthNode( Restaurant a, int x, Comparable value)
	{
		 ListNode list = a.front;
		int count=1;
		while(list!=null) {
			if(count%x==0) {
				list.setValue(value);
				count++;
			}
			else {
				
			count++;
			}
		
			list = list.getNext();
		}
	}	

	//this method will remove every xth node in the list
	public static void removeXthNode(Restaurant a, int x)
	{
		 ListNode list = a.front;
		ListNode prev = null;
		int count=1;
		while(list!=null) {
			if(count%x==0) {
				prev.setNext(list.getNext());
				count++;
			}
			else {
			prev = list;
			count++;
			}
		
			list = list.getNext();
		}
	}		
}