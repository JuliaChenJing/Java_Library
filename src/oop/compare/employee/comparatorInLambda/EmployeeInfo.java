package oop.compare.employee.comparatorInLambda;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeInfo {
	static enum SortMethod {BYNAME, BYSALARY};
	private boolean ignoreCase = true;
	public void setIgnoreCase(boolean b) {
		ignoreCase = b;
	}
	public void sort(List<Employee> emps, SortMethod method) {
		Collections.sort(emps, (e1,e2) ->
		{
			//local variable method must be effectively final, 
			//but not necessarily final
			if(method == SortMethod.BYNAME) {
				//instance vble ignoreCase does not need to be effectively final
				if(ignoreCase) return e1.name.compareToIgnoreCase(e2.name);
				else return e1.name.compareTo(e2.name);
			} else {
				if(e1.salary == e2.salary) return 0;
				else if(e1.salary < e2.salary) return -1;
				else return 1;
			}		
		});
	}
	
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Andy", 60000));
		EmployeeInfo ei = new EmployeeInfo();
		ei.sort(emps, EmployeeInfo.SortMethod.BYNAME);
		System.out.println(emps);
		//same instance
		ei.sort(emps, EmployeeInfo.SortMethod.BYSALARY);
		System.out.println(emps);
	}
}
/*
[<name: Andy salary: 60000>, <name: Joe salary: 100000>, <name: Tim salary: 50000>]
[<name: Tim salary: 50000>, <name: Andy salary: 60000>, <name: Joe salary: 100000>]
*/
