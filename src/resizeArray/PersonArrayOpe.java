package resizeArray;
public class PersonArrayOpe 
{
	
	private  Person[]a; // reference to array 
	private int size; // No. of elements currently hold
	public PersonArrayOpe(int max) // constructor to initialize person array with size max 
	{
		a=new Person[max];
		size=0;
	}
	public Person find(String searchName) // Pass Lastname as an argument
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i].getLastName()==searchName)
				return a[i];
		}
		return null;
	}

	public void insert(String last, String first, int age)// Insert at last
	{
		if(size == a.length) resize();
		a[size++] = new Person(last,first,age);
		System.out.println("inserted "+last);
	}

	public boolean delete(String searchName) // Shift down the elements.
												// Argument should be lastname
	{
		if(size == 0) return false;
		int index = -1;
		for(int i = 0; i < size; ++i ){
			if(( a[i].getLastName() ).equals(searchName)){
				index = i;
				break;
			}
		}
		if(index==-1) return false;
		Person[] temp = new Person[a.length];
		System.arraycopy(a,0,temp,0,index);
		System.arraycopy(a,index+1,temp,index,a.length-(index+1));
		a = temp;
		--size;
		System.out.println("deleted "+searchName);
		return true;
	}

	public void displayAll() // displays array contents
	{
		for(int i=0;i<size;i++)
		{
			a[i].displayPerson();
		}
	}

	public int size() // Return the number of persons stored in the array
	{
		return size;
	}
	
	public int capacity() // Return the number of persons stored in the array
	{
		return a.length;
	}

	private void resize() {
		
		System.out.println("resizing");
		int len = a.length;
		int newlen = 2*len;
		Person[] temp = new Person [newlen];
		System.arraycopy(a,0,temp,0,len);
		a= temp;
	}
}
