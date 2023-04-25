package q4;

class Emp {
	String name;
	int age;
	int id;

	public Emp(int age, String name, int id) {
		super();
		this.age = age;
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + ", id=" + id + "]";
	}
}

class Constr {
	public static void main(String[] args) {

		Emp emp1 = new Emp(19, "Smith", 1234);
		Emp emp2 = new Emp(35, "Alex", 78912);
		System.out.println(emp1);
		System.out.println(emp2);
	}
}