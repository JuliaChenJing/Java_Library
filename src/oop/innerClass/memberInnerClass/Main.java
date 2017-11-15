package oop.innerClass.memberInnerClass;
class Main
{
	public static void main(String args[])

	{

		// Object for outer class

		Outer ot = new Outer();

		ot.callinner();

		// object for inner class

		Outer.Inner obj = new Outer().new Inner();

		obj.printText();

	}
}
