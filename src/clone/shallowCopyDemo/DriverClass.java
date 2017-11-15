package clone.shallowCopyDemo;
public class DriverClass
{
public static void main(String[] args) throws CloneNotSupportedException 
		{
		
	    // Shallow copy of Cloning assign the objects instance references 
	      
	      CloneExp addObj = new CloneExp("Renuka", new Address("Apt. 1", "Utopia Park","West Avenue",52556));
	      
	      System.out.println("Before Cloning---------------");
	      System.out.println(addObj);
	      
	      CloneExp cloAdd= (CloneExp) addObj.clone(); 
	      System.out.println("After Cloning------------------");
	      System.out.println(cloAdd);
	      
	     addObj.address.setHouseNo("Apt. 2");
	     System.out.println("After Modifing the House No.-------------");
	     System.out.println(cloAdd);
	         	       
	     	     
		}

}
/*
Before Cloning
Renuka
 I am Living in  Apt. 1 Utopia Park West Avenue 52556
After Cloning
Renuka
 I am Living in  Apt. 1 Utopia Park West Avenue 52556
After Modifing the House No.
Renuka
 I am Living in  11A Utopia Park West Avenue 52556
*/
