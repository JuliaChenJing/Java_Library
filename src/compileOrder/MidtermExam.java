public class ClassE{
	static int superInt=10;
	static{
		System.out.println("1 超类静态block superInt="+superInt);
	}
	
	ClassE()
	{
		System.out.println("4 超类构造函数Running ClassE constructor");
	}
	{
		System.out.println("3 超类非静态blockRunning super object initialazation block");
	}
	
	
}

class SubClass extends ClassE{
	static int subInt=10;
	static{
		System.out.println("2 子类静态block subInt="+subInt);
	}
	
	SubClass()
	{
		System.out.println("6 子类构造函数Running Subclass constructor");
	}
	{
		System.out.println("5 子类非静态block Running sub object initialazation block");
	}
	
	
	
}
class DriverClass {
	public static void main(String [] args)
	{
		new SubClass();
	}
}


/*
1 超类静态block superInt=10
2 子类静态block subInt=10
3 超类非静态blockRunning super object initialazation block
4 超类构造函数Running ClassE constructor
5 子类非静态block Running sub object initialazation block
6 子类构造函数Running Subclass constructor
*/

