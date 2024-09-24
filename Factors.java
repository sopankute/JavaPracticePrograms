import java.io.*;
import java.util.*;

public class Factors{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No : ");
		int i, gcd = 0; 
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		for(i=1; i<=n1 && i<=n2; i++){
			if(n1%i==0 && n2%i==0)
				gcd = i;
		}
		System.out.printf("gcd of %d and %d is %d",n1,n2,gcd);
	}
}