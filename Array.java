import java.util.*;

public class Array{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr1[] = new int[3];
		int arr2[] = new int[3];
		int i=0;


		for(i=0;i<3;i++){
			System.out.println("Enter Value : ");
			arr1[i] = sc.nextInt();
		}		
		for(i=0;i<3;i++){
			arr2[i] = arr1[i];
		}
		
		System.out.println("Array 1 \n");
		for(i=0;i<3;i++){
			System.out.println(arr1[i]);
		}

		System.out.println("Array 2 \n");
		for(i=0;i<3;i++){
			System.out.println(arr2[i]);
		}
	}
}
