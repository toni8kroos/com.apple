public class Algorithm1{
	public static void main(String[] args){
		int answer = countp();
		System.out.print(answer);
	}
public static int countp(){
		int count = 10;
		count *= count+2;
		count /= 100;
		count++;
            return count;		
	}
}