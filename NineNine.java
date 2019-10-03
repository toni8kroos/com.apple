public class NineNine{
	public static void main(String[] args){
		for(int t = 1; t <= 9; t++){
			for(int i = 1; i <= t; i++){
				int answer = 0;
				answer = t * i;
				System.out.print(t +"*" +i +"=" +answer +" ");
			}
			System.out.print("\n");
		}
	}
}