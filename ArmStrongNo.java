import java.io.*;
import java.util.*;

public class ArmStrongNo{
	static int countDigit(int n){
		int count = 0;
		while(n>0){
			count++;
			n /= 10;
		}
		return count;

	}
	static int power(int r, int d){
		int result = 1;
		while(d>0){
			result *= r;
			d--;
		}
		return result;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No : ");
		int num = sc.nextInt();
		int temp = num;
		int sum=0;
		int digit = countDigit(num);
		while(num>0){
			int rem = num % 10;
			sum += power(rem, digit);
			num = num / 10;
		}
		if(sum == temp)
			System.out.println("ArmStrong no");
		else 
			System.out.println("not ArmStrong no");
	}
}