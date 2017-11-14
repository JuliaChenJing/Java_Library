package compare.priorityQueueRegistration;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueRegistration {
	public static void main(String args[]) 
	{
		//a prioritQueue needs a compareTo
		Queue<Registration> pq = new PriorityQueue<>();
		pq.add(new Registration(95643,"C++","Joshua","95643"));
		pq.add(new Registration(95644,"Java","Julia","95644"));
		pq.add(new Registration(95641,"Database","Alex","95641"));
		pq.add(new Registration(95646,"C#","Rebecca","95646"));
		pq.add(new Registration(95647,"Python","Tina","95647"));
	
		
		System.out.println("1 The peek object is:"+pq.peek());
		System.out.println("2 The size of the queue is:"+pq.size());
		Iterator<Registration> it = pq.iterator();
		System.out.println("3 List of Elements :");
		
		while(it.hasNext())
		{
			Registration ob = pq.remove();
			System.out.println(ob);
		}
		
		System.out.println("4 The peek object is:"+pq.peek());
		System.out.println("5 The peek object is empty or ot?:"+pq.isEmpty());
		
		

		
	}
}
/*
1 The peek object is:Registration [regno=95641, cname=Database, sname=Alex, sid=95641]
2 The size of the queue is:5
3 List of Elements :
Registration [regno=95641, cname=Database, sname=Alex, sid=95641]
Registration [regno=95643, cname=C++, sname=Joshua, sid=95643]
Registration [regno=95644, cname=Java, sname=Julia, sid=95644]
Registration [regno=95646, cname=C#, sname=Rebecca, sid=95646]
Registration [regno=95647, cname=Python, sname=Tina, sid=95647]
4 The peek object is:null
5 The peek object is empty or ot?:true

*/

