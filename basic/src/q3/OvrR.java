package q3;

class Parent1 {
	public void disp() {
		System.out.println("This is Parent class");
	}
}

class Child1 extends Parent1 {
	@Override
	public void disp() {
		System.out.println("This is Child class, It inherits properties from parent class");
	}
}

public class OvrR {
	public static void main(String[] args) {
		Parent1 parent1 = new Parent1();
		parent1.disp();

		Child1 child1 = new Child1();
		child1.disp();
	}
}
