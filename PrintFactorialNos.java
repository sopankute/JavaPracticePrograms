import java.io.*;
import java.util.*;

public class PrintFactorialNos{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No : ");
		int i, j, fact, num = sc.nextInt();
		System.out.println("Factorial of No : ");
		for(i=1; i<=num; i++){
			fact = 1;
			for(j=i; j>0; j--){
				fact *= j;
			}
			System.out.println("  "+fact);
		}
	}
}