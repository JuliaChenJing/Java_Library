package grammar_compiler.compileOrder;
public class ClassE{
	
	public static void main(String [] args)
	{
		new SubClass();
	}
	static int superInt=10;
	static{
		System.out.println("1 block superInt="+superInt);
	}
	
	ClassE()
	{
		System.out.println("4 Running ClassE constructor");
	}
	{
		System.out.println("3 blockRunning super object initialization block");
	}
	
	
}

class SubClass extends ClassE{
	static int subInt=10;
	static{
		System.out.println("2 block subInt="+subInt);
	}
	
	SubClass()
	{
		System.out.println("6 Running Subclass constructor");
	}
	{
		System.out.println("5 block Running sub object initialization block");
	}
	
	
	
}



/*
1 block superInt=10
2 block subInt=10
3 blockRunning super object initialization block
4 Running ClassE constructor
5 block Running sub object initialazition block
6 Running Subclass constructor

*/

