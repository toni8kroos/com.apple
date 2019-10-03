import java.util.Scanner;

public class Pyramid{
	public static void main(String[] args){
		System.out.println("please input pyramid height:");
		Scanner C = new Scanner(System.in);
		int a = C.nextInt();
		for(int i=1;i<=a;i++){
			for(int y=1;y<=a-i;y++)
				System.out.print(" ");
			for(int x=1;x<=2*i-1;x++)
				System.out.print("0");
			
			System.out.print("\n");
		}
	}
}