package javaTestsPractice;

public class ArgumentTest {

	public static void main(String[] args) {
		System.out.println("This is argument Test");
		sum();
		sum(5,6);
		sum(8,6,4);
		name("siddhi","vkariya");
		
	}

	public static void sum() {
		int a = 1;
		System.out.println(a);
	}
	public static void sum(int b, int c) {
		int a = b+c;
		System.out.println(a);
	}
	
	public static void sum(int b, int c, int d) {
		int a = b+c+d;
		System.out.println(a);
	}
	public static void name(String a, String b) {
		String c = a+" "+b;
		System.out.println(c);
	}
}
