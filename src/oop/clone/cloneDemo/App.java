package oop.clone.cloneDemo;

public class App {

	public static void main(String[] args) throws CloneNotSupportedException {
		Computer c = new Computer("Haier", "CORE", 2000, 3000, 4000);
		System.out.println(c.toString());
		System.out.println("hashcode:" + c.hashCode());
		
		LabTopComputer n = new LabTopComputer(200.0, 250.0, 13, "Haier", "CORE", 2000, 3000, 4000);
		System.out.println(n.toString());
		System.out.println("hashcode:" + n.hashCode());
		
		LabTopComputer n2 = (LabTopComputer) n.clone();
		System.out.println("After Cloning");
		System.out.println(n2.toString());
		System.out.println(n.equals(n2));

	}
}
/*
Computer [manufacturer=Haier, processor=CORE, ramSize=2000, diskSize=3000, processorSpeed=4000.0]
hashcode:-295284791
Laptop Computer [height=200.0, width=250.0, weight=13.0, manufacturer=Haier, processor=CORE, ramSize=2000, diskSize=3000, processorSpeed=4000.0]
hashcode:-1546850409
After Cloning
Laptop Computer [height=200.0, width=250.0, weight=13.0, manufacturer=Haier, processor=CORE, ramSize=2000, diskSize=3000, processorSpeed=4000.0]
true
 */
