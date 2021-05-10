package vinodchandu_gitpractice;

public class FristCode {

	public static void m1() {
		System.out.println("THIS IS  m1() static method avillable in FrsitCode class");
	}

	public void m2() {
		System.out.println("THIS IS m2() instance method avillable in FristCode class");
	}

	public static void main(String[] args) {
		FristCode code = new FristCode();
		m1();
		code.m2();

	}
}
