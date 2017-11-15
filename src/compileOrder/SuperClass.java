public class SuperClass{
	
	SuperClass()
	{
		System.out.println("4 Super Class constructor");
	}
	static int a=s();
	static  int s()
	{
		System.out.println("1 超类静态变量引用的静态函数");
		return 1;
	}
	
}

class SubClass extends SuperClass{
	
	static int a=s();
	static  int s()
	{
		System.out.println("2 子类静态变量引用的静态函数");
		return 1;
	}
	public SubClass()
	{
		System.out.println("6 Sub Class constructor");
	}
	
}
class DriverClass {
	public static void main(String [] args)
	{
		new SubClass();
	}
}


/*
1 超类静态变量引用的静态函数
2 子类静态变量引用的静态函数
4 Super Class constructor
6 Sub Class constructor
*/
