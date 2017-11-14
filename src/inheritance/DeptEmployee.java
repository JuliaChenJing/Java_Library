package  inheritance;

import java.util.Date;
import java.util.GregorianCalendar;

public class DeptEmployee {

	private String name;
	protected double salary;
	private Date hireDay;
	
	// constructor
	DeptEmployee(String aName, double aSalary, int aYear, int aMonth, int aDay) {
		name = aName;
		salary = aSalary;
		GregorianCalendar cal = new GregorianCalendar(aYear, aMonth - 1, aDay);
		hireDay = cal.getTime();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double computeSalary()
	{
		return salary;
	}

	public Date getHireDay() {
		return hireDay;
	}

	public void setHireDay(Date hireDay) {
		this.hireDay = hireDay;
	}
}


class Professor extends DeptEmployee{
	
	 int  numberOfPublications;
	 
	 public Professor(String name, double salary, int year, int month, int day)
	 {
		 super(name, salary, year, month, day);
	}
	 
		public int getNumberOfPublications() {
			return numberOfPublications;
		}
		public void setName(int numberOfPublications) {
			this.numberOfPublications =numberOfPublications;
		}
}


class Secretary extends DeptEmployee{
	 double overtimeHours;
	 
	 public Secretary(String name, double salary, int year, int month, int day)
	 {
		 super(name, salary, year, month, day);
	}
	 
	 public double getOvertimeHours() 
	 {
			return overtimeHours;
	}
	public void setOvertimeHours(int overtimeHours) 
	{
		this.overtimeHours=overtimeHours;
	}
	@Override
	public double computeSalary()
	{
		return salary+12*overtimeHours;
	}
}
