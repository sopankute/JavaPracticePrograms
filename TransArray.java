import java.util.*;

public class TransArray{
	public static void main(String args[]){
		int[][] array1 = {{1,2,3},{4,5,6},{7,8,9}};
		int i, j, m = array1.length;
		int n = array1[0].length;

		 int[][] array2 = new int[m][n];
        for(i=0; i<m; i++){
			for(j=0; j<n; j++){
			    array2[i][j] = array1[j][i];
			}
		}

		for(i=0; i<m; i++){
			for(j=0; j<n; j++){
				System.out.print(array2[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("\n");

		for(i=0; i<m; i++){
			for(j=0; j<n; j++){
				System.out.print(array1[j][i]+"\t");
			}
			System.out.println();
		}
	}
}