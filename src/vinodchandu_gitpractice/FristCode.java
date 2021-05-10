package vinodchandu_gitpractice;

public class FristCode {

	public static void m1() {
		System.out.println("THIS IS  m1() static method avillable in FrsitCode class");
	}

	public void m2() {
		System.out.println("THIS IS m2() instance method avillable in FristCode class");
	}

	public void modi() {
		System.out.println("i created a new method modi method after clone my code");
		System.out.println("THIS METHOD I ADDED AFTER I CLONED MY PROJECT TO NEW BRACH");
	}

	public static void main(String[] args) {
		FristCode code = new FristCode();
		m1();
		code.m2();
		code.modi();

	}
}
