package oop.association_Dependency.compositionDemo.duck;

public abstract class Duck {
	abstract public void display();
	void swim(){
		System.out.println("Can Swim ");
	}
	
	FlyBehavior fly;
	QuakBehavior quack;
}

class MallardDuck extends Duck{
	public MallardDuck() {
		fly = new FlyWithWings();
		quack = new Quack();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is MallardDuck----");
	}
	
}

class RedheadDuck extends Duck{
	public RedheadDuck() {
		fly = new FlyWithWings();
		quack = new Quack();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is RedheadDuck----");
	}
	
}
class RubberDuck extends Duck{

	public RubberDuck() {
		fly = new CannotFly();
		quack = new Squeak();
		// TODO Auto-generated constructor stub
	}
	@Override
	public void display() {
		System.out.println("This is RubberDuck----");
	}
	
}
class DecoyDuck extends Duck{
	public DecoyDuck() {
		fly = new CannotFly();
		quack = new MuteQuack();
		// TODO Auto-generated constructor stub
	}
	@Override
	public void display() {
		System.out.println("This is DecoyDuck----");
//		System.out.println("My Properties are: "+fly.getClass()+"-----"+quack.getClass());
		
	}
	
}
