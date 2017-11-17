package grammar_compiler.compileOrder;
public class ClassE{
	static int superInt=10;
	static{
		System.out.println("1 è¶…ç±»é?™æ€?block superInt="+superInt);
	}
	
	ClassE()
	{
		System.out.println("4 è¶…ç±»æž„é€ å‡½æ•°Running ClassE constructor");
	}
	{
		System.out.println("3 è¶…ç±»é?žé?™æ€?blockRunning super object initialazation block");
	}
	
	
}

class SubClass extends ClassE{
	static int subInt=10;
	static{
		System.out.println("2 å­?ç±»é?™æ€?block subInt="+subInt);
	}
	
	SubClass()
	{
		System.out.println("6 å­?ç±»æž„é€ å‡½æ•°Running Subclass constructor");
	}
	{
		System.out.println("5 å­?ç±»é?žé?™æ€?block Running sub object initialazation block");
	}
	
	
	
}
class DriverClass {
	public static void main(String [] args)
	{
		new SubClass();
	}
}


/*
1 è¶…ç±»é?™æ€?block superInt=10
2 å­?ç±»é?™æ€?block subInt=10
3 è¶…ç±»é?žé?™æ€?blockRunning super object initialazation block
4 è¶…ç±»æž„é€ å‡½æ•°Running ClassE constructor
5 å­?ç±»é?žé?™æ€?block Running sub object initialazation block
6 å­?ç±»æž„é€ å‡½æ•°Running Subclass constructor
*/

