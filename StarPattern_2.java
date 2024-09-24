import java.io.*;
import java.util.*;

public class StarPattern_2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no : ");
		int n = sc.nextInt();
		int i,j,k,l;

		for(i=1; i<=n; i++){
			for(j=i; j<=n; j++)
				System.out.print("  ");
			for(k=1; k<=i; k++)
				System.out.print(" *");
			for(l=1; l<i; l++)
				System.out.print(" *");
			System.out.println();
		}
	    //             *
	    //           * * *
	    //         * * * * *
	    //       * * * * * * *
	    //     * * * * * * * * *
	    //   * * * * * * * * * * *
	    // * * * * * * * * * * * * *		
	}
}