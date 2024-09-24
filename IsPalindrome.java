import java.io.*;
import java.util.*;

public class IsPalindrome{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No : ");
		int num = sc.nextInt();
		int temp = num;
		int rev=0;

		while(num!=0){
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if(temp == rev)
			System.out.println(rev+" Palindrome No!!!!!!!");
		else 
			System.out.println(rev+" Not Palindrome No!!!!");
	}
}