package grammar_compiler;

public class CompileTimeError {

	public static void main(String[] args) {
		int x = 9;
		if (x == 9) {
			//int x = 8;//Duplicate local variable x
			System.out.println(x);
		}
	}
}
