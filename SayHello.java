public class SayHello{
	public static void main(String[] args){
		System.out.println("Below is function of sayhello");
		SayHello(sum());
	}
	
	public static int sum(){
		System.out.println("say hello!"+sum);
	}
	
	public static int sum(){
		int sum = 0;
		for(int i=0;i<=100;i++){
			sum += i;
		}
		return sum;
	}