package oop.clone.shallowCopyDemo;


public class CloneExp implements Cloneable 
{

	  private String name;
	  protected Address address;
	  
	  public CloneExp(){
	    
	  }
		  public CloneExp(String name, Address add)
	  {
		  this.name = name;
		  this.address = add;
		  
	  }
	  public String toString()
	  {
		  String ot = this.name + "\n I am Living in  " + address.houseNo + " " + address.address1 + " " + address.address2 + " " + address.zipcode;
	      return ot; 
	  }

	  public Object clone() throws CloneNotSupportedException {

	    CloneExp clone=(CloneExp)super.clone();
	    
	    return clone;

	  }

	
}


