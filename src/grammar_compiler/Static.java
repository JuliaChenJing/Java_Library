package grammar_compiler;

public class Static {

	static int i;

	public static void main(String[] args) {
		System.out.println(i);//0
		while (i < 0)
			i--;
		System.out.println(i);//0

		boolean x = true;
		int a;
		// System.out.println(a);//The local variable a may not have been
		// initialized
		if (x)
			a = x ? 1 : 2;
		else
			a = x ? 3 : 4;
		System.out.println(a);//1
	}

}
