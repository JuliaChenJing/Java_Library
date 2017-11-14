package  inheritance;
import java.util.Scanner;
/** Class: Fundamental Programming Practice  <br />
  @author "Jing Chen" <br />
  Description:  homework <br />
 */
public class Main {

	public static void main(String[] args) {
		Professor p0 = new Professor("Joshua Webb", 80000, 2009, 12, 15);
		Professor p1 = new Professor("Alex Xie", 90000, 2011, 2, 1);
		Professor p2 = new Professor("Ke Jin", 70000, 2014, 8, 1);
		Secretary s0 = new Secretary("Haiyan Wang", 60000, 2010, 8, 1);
		Secretary s1 = new Secretary("Jianhua Chen", 60000, 2012, 3, 23);

		DeptEmployee[] department = new DeptEmployee[5];

		department[0] = p0;
		department[1] = p1;
		department[2] = p2;
		department[3] = s0;
		department[4] = s1;

		double sumSalaryOfDepEmployees = 0;
		// print names and salaries
		for (DeptEmployee e : department) {
			System.out.println("Name: " + e.getName() + "\nSalary: " + e.salary + "\nHire Day :" + e.getHireDay());
			System.out.println();
			sumSalaryOfDepEmployees += e.salary;
		}

		double sumSalaryOfProfessors = 0;
		for (DeptEmployee e : department) {
			if (e instanceof Professor)
				sumSalaryOfProfessors += e.salary;
		}

		double sumSalaryOfSecretarys = 0;
		for (DeptEmployee e : department) {
			if (e instanceof Secretary)
				sumSalaryOfSecretarys += e.salary;
		}

		Scanner in = new Scanner(System.in);

		System.out.print("Do you want to see the sum salary of all department employees?Please input Y or N ");
		String Sd = in.nextLine();
		if (Sd.equals("Y"))
			System.out.println("the sum salary of all department employees are " + sumSalaryOfDepEmployees);

		System.out.print("Do you want to see the sum salary of all professors?   Please input Y or N ");
		String Sp = in.nextLine();
		if (Sp.equals("Y"))
			System.out.println("the sum salary of all professors are " + sumSalaryOfProfessors);

		System.out.print("Do you want to see the sum salary of all secretaries? Please input Y or N ");
		String Ss = in.nextLine();
		if (Ss.equals("Y"))
			System.out.println("the sum salary of all secretaries are " + sumSalaryOfSecretarys);

	}
}

/*
 * Name: Joshua Webb Salary: 80000.0 Hire Day :Tue Dec 15 00:00:00 CST 2009
 * 
 * Name: Alex Xie Salary: 90000.0 Hire Day :Tue Feb 01 00:00:00 CST 2011
 * 
 * Name: Ke Jin Salary: 70000.0 Hire Day :Fri Aug 01 00:00:00 CDT 2014
 * 
 * Name: Haiyan Wang Salary: 60000.0 Hire Day :Sun Aug 01 00:00:00 CDT 2010
 * 
 * Name: Jianhua Chen Salary: 60000.0 Hire Day :Fri Mar 23 00:00:00 CDT 2012
 * 
 * Do you want to see the sum salary of all department employees?Please input Y
 * or N Y the sum salary of all department employees are 360000.0 Do you want to
 * see the sum salary of all professors? Please input Y or N N Do you want to
 * see the sum salary of all secretaries? Please input Y or N Y the sum salary
 * of all secretaries are 120000.0
 * 
 */
