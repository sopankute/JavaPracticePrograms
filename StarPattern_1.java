import java.io.*;
import java.util.*;

public class StarPattern_1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no : ");
		int n = sc.nextInt();
		int i,j,k;
		// for(i=1; i<=n; i++){
		// 	for(j=1; j<=i; j++){
		// 		System.out.print(" *");
		// 	}
		// 	System.out.println();
		// }

		// *
		// * *
		// * * *
		// * * * *
		// * * * * *
		// * * * * * *
		// * * * * * * *

		// for(i=1; i<=n; i++){
		// 	for(j=i; j<=n; j++){
		// 		System.out.print("  ");
		// 	}
		// 	for(k=1; k<=i; k++){
		// 		System.out.print(" *");
		// 	}
		// 	System.out.println();
		// }

	    //             *
	    //           * *
	    //         * * *
	    //       * * * *
	    //     * * * * *
	    //   * * * * * *
	    // * * * * * * *

		// for(i=1; i<=n; i++){
		// 	for(j=i; j<=n; j++){
		// 		System.out.print(" *");
		// 	}
		// 	System.out.println();
		// }

		// * * * * * * *
		// * * * * * *
		// * * * * *
		// * * * *
		// * * *
		// * *
		// *

		// for(i=1; i<=n; i++){
		// 	for(j=1; j<=i; j++){
		// 		System.out.print("  ");
		// 	}
		// 	for(k=i; k<=n; k++){
		// 		System.out.print(" *");
		// 	}
		// 	System.out.println();
		// }

		// * * * * * * *
		//   * * * * * *
		//     * * * * *
		//       * * * *
		//         * * *
		//           * *
		//             *
	}
}