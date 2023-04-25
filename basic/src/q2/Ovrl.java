package q2;

class Addition {
	public int add(int a, int b) {
		return a + b;
	}

	public float add(float a, float b, float c) {
		return a + b + c;
	}

	public double add(double a, double b) {
		return a + b;
	}
}

public class Ovrl {
	public static void main(String[] args) {
		Addition addition = new Addition();
		System.out.println(addition.add(5, 6));
		System.out.println(addition.add(2.1, 0.4));
		System.out.println(addition.add(1, 2, 3));
	}
}
