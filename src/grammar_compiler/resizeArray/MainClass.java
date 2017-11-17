package grammar_compiler.resizeArray;

public class MainClass {
	
	public static void main(String [] args)
	{
		PersonArrayOpe l = new PersonArrayOpe(1);
		
		l.insert("Hou","Bob",32);
		System.out.println("the capacity of list is "+l.capacity());
		l.insert("Pan","Steven",40);
		System.out.println("the capacity of list is "+l.capacity());
		l.insert("Tian","Lulu",24);
		System.out.println("the capacity of list is "+l.capacity());
		System.out.println();
	
		System.out.println("the capacity of list is "+l.capacity());
		System.out.println("The list of size "+l.size()+" is ");
		l.displayAll();
		System.out.println();
		
		l.delete("Pan");
		System.out.println("the capacity of list is "+l.capacity());
		System.out.println("The list of size "+l.size()+" is ");
		l.displayAll();
		System.out.println();
		
		l.insert("Zou","Zoe",32);
		System.out.println("the capacity of list is "+l.capacity());
		System.out.println("The list of size "+l.size()+" is ");
		l.displayAll();
		System.out.println();
		
		l.insert("Gu","Lin",32);
		System.out.println("the capacity of list is "+l.capacity());
		System.out.println("The list of size "+l.size()+" is ");
		l.displayAll();
		System.out.println();
		
		System.out.println("try to find Zoe:");
		 (l.find("Zou")   ).displayPerson();
		
	}
}

/*
inserted Hou
the capacity of list is 1
resizing
inserted Pan
the capacity of list is 2
resizing
inserted Tian
the capacity of list is 4

the capacity of list is 4
The list of size 3 is 
 [Bob Hou's age is 32]
 [Steven Pan's age is 40]
 [Lulu Tian's age is 24]

deleted Pan
the capacity of list is 4
The list of size 2 is 
 [Bob Hou's age is 32]
 [Lulu Tian's age is 24]

inserted Zou
the capacity of list is 4
The list of size 3 is 
 [Bob Hou's age is 32]
 [Lulu Tian's age is 24]
 [Zoe Zou's age is 32]

inserted Gu
the capacity of list is 4
The list of size 4 is 
 [Bob Hou's age is 32]
 [Lulu Tian's age is 24]
 [Zoe Zou's age is 32]
 [Lin Gu's age is 32]

try to find Zoe:
 [Zoe Zou's age is 32]
 
 */
