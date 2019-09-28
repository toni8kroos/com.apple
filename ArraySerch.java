import java.util.Arrays;

public class ArraySerch{
	public static void main(String[] args){
		int array1[] = {1,9,58,4};
		Arrays.sort(array1);
		int ser = Arrays.binarySearch(array1,5);
		System.out.print(ser);
	}
}