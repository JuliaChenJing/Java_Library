package clone;

public class DriverClass {
	
	public static void main(String [] args)throws CloneNotSupportedException 
	{
		Computer c=new Computer("Haier", "CORE", 2000,3000,4000);
		System.out.println(c.toString());
		System.out.println("hashcode:"+c.hashCode());
		Notebook n=new Notebook(200.0,250.0, 13,"Haier", "CORE", 2000,3000,4000);
		System.out.println(n.toString());
		System.out.println("hashcode:"+n.hashCode());
		Notebook n2=(Notebook) n.clone(); 
		 System.out.println("After Cloning");
		System.out.println(n2.toString());
		System.out.println(n.equals(n2));

	}
}
/*
Computer [manufacturer=Haier, processor=CORE, ramSize=2000, diskSize=3000, processorSpeed=4000.0]
hashcode:-295284791
Notebook [height=200.0, width=250.0, weight=13.0, manufacturer=Haier, processor=CORE, ramSize=2000, diskSize=3000, processorSpeed=4000.0]
hashcode:-1546850409
After Cloning
Notebook [height=200.0, width=250.0, weight=13.0, manufacturer=Haier, processor=CORE, ramSize=2000, diskSize=3000, processorSpeed=4000.0]
true

*/

