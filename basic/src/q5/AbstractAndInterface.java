package q5;

abstract class A {
	public void disp() {
		System.out.println("This is abstract");
	}
}

interface B {
	public void show();
}

public class AbstractAndInterface extends A implements B {
	public void show() {
		System.out.println("This is interface");
	}

	public static void main(String[] args) {
		A a = new AbstractAndInterface();
		a.disp();

		B b = new AbstractAndInterface();
		b.show();

	}
}
