import java.io.*;
import java.util.*;

public class IsPerfect{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No : ");
		int i, sum = 0, num = sc.nextInt();
		int n = num/2;
		for(i=1; i<=n; i++){
			if(num%i==0)
				sum += i;
		}
		if(num==sum)
			System.out.println(num+" Perfect No !!!!!!");
		else
			System.out.println(num+" Not Perfect !!!");
	}
}