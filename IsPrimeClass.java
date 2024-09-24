import java.io.*;
import java.util.*;

public class IsPrimeClass{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No : ");
		int i, num = sc.nextInt();
		for(i=2; i<num; i++){
			if(num%i==0){
				System.out.println("Not Prime!!!!");
				break;
			}
		}
		if(num==i)
			System.out.println("Prime Number!!!!!!!!");
	}
}