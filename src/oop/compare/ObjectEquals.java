package oop.compare;


class laptop
{
	private String name = null;
	private String color = null;
	public laptop(String name, String color)
	{
		this.name = name;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public boolean equals(Object obj)
		{
		// Are they same?
		 if(this == obj)
			 return true;
		 // Is other object a null reference?
		 if(obj == null)
			 return false;
		 // do they belongs to the same class?
		 if (this.getClass() != obj.getClass())
			 return false;
		 // get the reference of obj in a laptop variable type
		laptop lp = (laptop) obj;
		//Do they have same name and same color
		if(lp.name.equals(this.name) && lp.color.equals(this.color)) 
			return true;
		else
		return false;
	}
	@Override
	public int hashCode()
	{
		int hash = 5;
		// User defined formula 
		hash = 11 * hash + color.hashCode() * name.hashCode(); 
		return hash;
	}
	public String toString()
	{
	String info = "Name = " + name + " Color = " + color; 
	return info;
	}
}


public class ObjectEquals {
	public static void main(String[] args) {
		laptop ob1 = new laptop("Apple","Red");
		laptop ob2 = new laptop("Apple","Red");
		laptop ob3 = new laptop("Apple","White");
		laptop ob4 = ob1;
        if (ob1.equals(ob2))
        System.out.println("Ob1 and Ob2 are Equals --> True");
        else
        	System.out.println("Ob1 and Ob2 are not Equal --> False");	
        if (ob1.equals(ob3))
            System.out.println("Ob1 and Ob3 are Equals --> True");
            else
           	System.out.println("Ob1 and Ob3 are not Equal --> False");	
        System.out.println(ob1);
        System.out.println("Hash code Obj1 : " + ob1.hashCode());
        System.out.println(ob2);
        System.out.println("Hash code Obj2 : " +ob2.hashCode()); 
        System.out.println(ob3);
        System.out.println("Hash code Obj3 : " +ob3.hashCode());
        System.out.println(ob4);
        System.out.println("Hash code Obj4 : " +ob4.hashCode());
	}

}
/*
Ob1 and Ob2 are Equals --> True
Ob1 and Ob3 are not Equal --> False
Name = Apple Color = Red
Hash code Obj1 : 1670479057
Name = Apple Color = Red
Hash code Obj2 : 1670479057
Name = Apple Color = White
Hash code Obj3 : 792134977
Name = Apple Color = Red
Hash code Obj4 : 1670479057
*/
