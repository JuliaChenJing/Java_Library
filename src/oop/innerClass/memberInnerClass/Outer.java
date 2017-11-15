package oop.innerClass.memberInnerClass;
class Outer {

	private String text1 = "I am Outer Class!";

	public void callinner() {
		Inner iobj = new Inner();
		iobj.printText();
	}

	class Inner {

		private String text2 = "I am Inner Class!";

		void printText() {
			System.out.println(text1);
			System.out.println(text2);
		}
	}
}

