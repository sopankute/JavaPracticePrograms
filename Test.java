import java.io.*;

public class Test{
	public static void main(String[] args){

		int [] arr1 = {1,1,2,3,4,4,5,5};
		int [] arr2 =  new int[arr1.length];
		// for(int i=0; i<6; i++){
		// 	arr[i] = sc.nextInt();
		// }

		for(int i=0; i<arr1.length;i++){
			for(int j=1; j<arr2.length; j++){
				if(arr1[i] == arr1[j]){
					arr2[j] = arr1[i];
					break;
				}
			}
		}
		System.out.println("After Removing Duplicates : ");
		for(int i=0; i<arr2.length;i++)
			System.out.println(arr2[i]);

	}
}