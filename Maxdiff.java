import java.io.*;
import java.util.*;

public class Maxdiff{
	static int findDiff(int[] arr, int n){
		int i, j, diff=0;
		if(n == 0)
			return diff;

		for(i=0; i<n; i++){
			for(j=i+1; j<n; j++){
				if(arr[j] - arr[i] > diff)
					diff = arr[j] - arr[i];
			}
		}
		return diff;
	}

	public static void main(String args[]){

		int[] array = {5, 2, 6, 3, 9};
		int size = array.length;
		int result = findDiff(array, size);
		System.out.println("Max differnece is = "+result);

	}
}