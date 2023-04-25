class Emp {
	String name = "Smith";
	int id = 2121;
	static String Deptname = "Mumbai";
	int Salary = 25000;

	public void showInfo() {
		System.out.println(name);
		System.out.println(id);
	}

	public void getSalary() {
		System.out.println(Salary);
	}

	static public void showDeptname() {
		System.out.println(Deptname);
	}
}

public class StaticNonStatic {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.showInfo();
		Emp.showDeptname();
		emp.getSalary();
	}
}
