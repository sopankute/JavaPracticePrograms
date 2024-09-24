import java.io.*;
import java.util.*;

public class Factorial{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No : ");
		int i, fact = 1, num = sc.nextInt();
		for(i=num; i>0; i--){
			fact *= i;
		}
		System.out.println("Factorial is : "+fact);
	}
}