public class staticMethodTest {
	void nonStaticMethod() {
		System.out.println("This is a non static method");
	}
	static void staticMethod(staticMethodTest s) {
		s.nonStaticMethod();
		System.out.println("This is a static method");

	}
	public static void main(String[] args) {
		staticMethodTest obj=new staticMethodTest();
		staticMethod(obj);
	}
}