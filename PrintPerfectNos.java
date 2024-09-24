import java.io.*;
import java.util.*;
	
	// 6 = 1 , 2, 3 = 1 + 2 + 3 = 6
public class PrintPerfectNos{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No : ");
		int i, j, num = sc.nextInt();
		int sum;
		System.out.print("Perfect Nos : ");
		for(i=1; i<num; i++){
			sum = 1;
			for(j=2; j<=i/2; j++){
				if(i%j==0)
					sum += j;
			}
			if(i==sum)
				System.out.print(i+"  ");
		}
	}
}