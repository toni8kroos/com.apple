public class try1{
	public static void main(String[] args){
		try1 tk = new try1();
		sayHello(tk);
	}
	public static void sayHello(try1 a){
		//a.sum();
		System.out.println("Hello World!"+ a.sum());
	}
	public int sum(){
		int sum = 0;
		for(int i = 0;i<=100;i++){
			sum += i;
		}
		return sum;
	}
}