package grammar_compiler.compileOrder;
public class ClassE{
	static int superInt=10;
	static{
		System.out.println("1 超类�?��?block superInt="+superInt);
	}
	
	ClassE()
	{
		System.out.println("4 超类构造函数Running ClassE constructor");
	}
	{
		System.out.println("3 超类�?��?��?blockRunning super object initialazation block");
	}
	
	
}

class SubClass extends ClassE{
	static int subInt=10;
	static{
		System.out.println("2 �?类�?��?block subInt="+subInt);
	}
	
	SubClass()
	{
		System.out.println("6 �?类构造函数Running Subclass constructor");
	}
	{
		System.out.println("5 �?类�?��?��?block Running sub object initialazation block");
	}
	
	
	
}
class DriverClass {
	public static void main(String [] args)
	{
		new SubClass();
	}
}


/*
1 超类�?��?block superInt=10
2 �?类�?��?block subInt=10
3 超类�?��?��?blockRunning super object initialazation block
4 超类构造函数Running ClassE constructor
5 �?类�?��?��?block Running sub object initialazation block
6 �?类构造函数Running Subclass constructor
*/

