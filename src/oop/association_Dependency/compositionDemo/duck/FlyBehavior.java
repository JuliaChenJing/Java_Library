package oop.association_Dependency.compositionDemo.duck;
public interface FlyBehavior {
	public void fly();
}

class FlyWithWings implements FlyBehavior{
	public FlyWithWings() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Flying with Wings");
	}
	
}

class CannotFly implements FlyBehavior{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Cannot fly with wings");
	}
	
}
