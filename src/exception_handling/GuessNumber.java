package exception_handling;

import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) throws Exception {
		
		try
		{
			System.out.println("请输入法0-99的数字：");
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			int count;
			int number = (int) (Math.random() * 100);
			int guess;
			boolean flag = false;
			for (count = 0; count < 10; count++) {
				guess = input.nextInt();
				if (guess == number) {
					flag = true;
					break;
				}
				if (guess < 0 || guess >= 100) {
					System.out.println("输入数字越界，请重新输入：");
				} else if (guess > number) {
					System.out.println("输入数字过大，请重新输入：");
				} else if (guess < number) {
					System.out.println("输入数字偏小，请重新输入：");
				}
			}
			if (flag && count == 1) {
				System.out.println("你太有才了");
			} else if (flag && count < 6) {
				System.out.println("真聪明！");
			} else if (flag && count >= 6) {
				System.out.println("还不错！");
			} else {
				System.out.println("真差劲！");
			}
		}
		catch(Exception e){
			System.out.println("Error: "+e+" is caught!");
		}
		
	
	}
}

/*
请输入法0-99的数字：
a
Error: java.util.InputMismatchException is caught!
*/
