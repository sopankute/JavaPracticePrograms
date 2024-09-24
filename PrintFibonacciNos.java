import java.io.*;
import java.util.*;

public class PrintFibonacciNos{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range : ");
		int range = sc.nextInt();
		int a=0, b=1, c=0;
		System.out.print(a+"  "+b);
		for(int i=2; i<=range; i++){
			c = a + b;
			if(c<=range){
				System.out.print("  "+c);
				a = b;
				b = c;
			}
		}
	}
}