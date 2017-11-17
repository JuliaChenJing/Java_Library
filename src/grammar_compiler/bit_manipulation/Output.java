package grammar_compiler.bit_manipulation;

public class Output {

	public static void main(String [] args){
		//11=1011
		// 9=1001
		int x=11&9; //1001
		//x=1001
		//3=0011
		//y=1110
		int y=x^3;  
		//12=1100
		//y|12=1110
		System.out.println(y|12);//14
	}
}
