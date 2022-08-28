package javaTestsPractice;

public class StaticAndNonStaticMethod {
	static StaticAndNonStaticMethod t1 = new StaticAndNonStaticMethod();
	static Test2 t2 = new Test2();

	public static void main(String[] args) {
		System.out.println("This is practice for static and non static");
		siddhi();
		t1.siddhi0();
		siddhi1();
		t1.siddhi2();
		siddhi3();
		t2.StaticAndNonStaticMethod();
		t2.method2();
		Test2.method3();
		t2.method4();
		
		
		
		
		
		

	}
	
	public static void siddhi() {
		
		System.out.println("This is static 1 method");
	}
	public void siddhi0() {
		
		System.out.println("This is static 2 method");
	}
	
	public static void siddhi1() {
	
		System.out.println("This is static 3 method");
}
	public void siddhi2() {
	
		System.out.println("This is static 4 method");
}
	public static void siddhi3() {
	
		System.out.println("This is static 5 method");
}

	

}
