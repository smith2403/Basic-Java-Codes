package practice;

class A {
	String name;
	int id;
	static int salary = 30000;

	@Override
	public String toString() {
		return "A [name=" + name + ", id=" + id + "]";
	}

	public A() {
		System.out.println("Default Constructor");
	}

	public A(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public void showId() {
		System.out.println("non-static method " + id);

	}

	static void showSal() {
		System.out.println("Static Method " + salary);
	}
}

abstract class B {
	abstract void methB2();
}

interface C {
	void methC1();
}

class D extends B implements C {

	@Override
	public void methC1() {
		System.out.println("Interface class");
	}

	@Override
	void methB2() {
		System.out.println("Abstract class");
	}
}

class MethOverLoading {
	public int sum(int x, int y) {
		return x + y;
	}

	public int sum(int x, int y, int z) {
		return x + y + z;
	}
}

class MethOverRiding extends MethOverLoading {
	@Override
	public int sum(int x, int y) {
		// TODO Auto-generated method stub
		return x + y;
	}

	@Override
	public int sum(int x, int y, int z) {
		// TODO Auto-generated method stub
		return x + y + z;
	}
}

public class Main {
	public static void main(String[] args) {
		A a = new A("Smith", 123);
		System.out.println(a);

		A.showSal();
		a.showId();

		A a2 = new A();
		System.out.println(a2);

		MethOverLoading loading = new MethOverLoading();
		System.out.println("Overloading " + loading.sum(5, 5));

		MethOverRiding methOverRiding = new MethOverRiding();
		System.out.println("Overriding " + methOverRiding.sum(5, 5, 20));

		D d = new D();
		d.methB2();
		d.methC1();
	}
}
