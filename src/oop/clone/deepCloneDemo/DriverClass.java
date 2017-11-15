package oop.clone.deepCloneDemo;

public class DriverClass {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
	
    // Deep copy of Cloning copy the objects instance references too
      
      CloneExp address = new CloneExp("Renuka", new Address("Apt.1", "Utopia Park","West Avenue",52556));
      
      System.out.println("Before Cloning:");
      System.out.println("address: "+address);
      System.out.println();
      
      CloneExp clonedAddress= (CloneExp) address.clone(); 
      System.out.println("After Cloning:");
      System.out.println("clonedAddress :"+clonedAddress);
      System.out.println();
      
     address.address.setHouseNo("Apt.2");
     System.out.println("After Modifing the original House  No.:");
     System.out.println("address: "+address);
     System.out.println();
     System.out.println("//it does not change anything");
     System.out.println("clonedAddress:"+clonedAddress);
     System.out.println();
     
     clonedAddress.address.setHouseNo("Apt.3");
     System.out.println("After Modifing the copied House No.:");
     System.out.println("clonedAddress: "+clonedAddress);
     System.out.println();
     

         	       	     	     
	}
}


/*
 Before Cloning:
Renuka
 I am Living in  Apt. 1 Utopia Park West Avenue 52556

After Cloning:
Renuka
 I am Living in  Apt. 1 Utopia Park West Avenue 52556

After Modifing the original House  No.:
//it does not change anything
Renuka
 I am Living in  Apt. 1 Utopia Park West Avenue 52556

After Modifing the copied House No.:
Renuka
 I am Living in  11A Utopia Park West Avenue 52556
 * */
