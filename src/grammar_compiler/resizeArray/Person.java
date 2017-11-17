package grammar_compiler.resizeArray;
class Person {
	private String lastName;
	private String firstName;
	private int age;

	public Person(String last, String first, int a) {
		// constructor to initialize the values
		lastName=last;
		firstName=first;
		age=a;
	}
	// [or]Override thetoString()

	public void displayPerson() // Display fisrtName, lastName and age
	{
		System.out.println(" ["+firstName+" "+lastName+"'s age is "+age+"]");
	}

	public String getLastName() // get only the last name
	{
		return   lastName;
	}
	
	public static void main(String [] args)
	{
		Person Julia=new Person("Chen","Jing",27);
		Julia.displayPerson();
	}
} 

/*
  [Jing Chen's age is 27]
  */
