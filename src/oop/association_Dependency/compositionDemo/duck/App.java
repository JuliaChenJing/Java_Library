package oop.association_Dependency.compositionDemo.duck;

public class App {
	public static void main(String[] args) {
		Duck[] ducks = { new MallardDuck(), new DecoyDuck(), new RedheadDuck(), new RubberDuck() };
		for (Duck d : ducks) {
			System.out.println(d.getClass().getSimpleName() + ":");
			d.display();
			d.fly.fly();
			d.quack.quack();
			d.swim();
			System.out.println("");
		}
	}
}
/*

*/