import java.util.Arrays;
public class Pao{
	public static void main(String[] args){
		int array1[] = {5,1,4,2,3,39,7};
		int p = 0;
		int t = 0;
		int a = 0;
		for(t=0; t<(array1.length)-1; t++){
			for(a=0; a<(array1.length)-1; a++){
				while(array1[a]>array1[a+1]){
					p = array1[a];
					array1[a] = array1[a+1];
					array1[a+1] = p;
				}
			}
		}
		String array1String = Arrays.toString(array1);
		System.out.println(array1String);
	}
}

//   = arrays.sort;