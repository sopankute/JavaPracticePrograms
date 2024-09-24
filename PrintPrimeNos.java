import java.io.*;
import java.util.*;

public class PrintPrimeNos{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No : ");
		int i, j, num = sc.nextInt();
		int sum=0;
		for(i=2; i<=num; i++){
			for(j=2; j<num; j++){
				if(i%j==0){
					break;
				}
			}
			if(i==j)
				System.out.print("  "+i);

			if(i==j){
				sum += i;
			}
		}
		System.out.println("\nSum of all Prime No : "+sum);
	}
}