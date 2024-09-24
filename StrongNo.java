import java.io.*;
import java.util.*;

public class StrongNo{
	static int factorial(int r){
		int fact = 1;
		while(r>0){
			fact *= r;
			r--;
		}
		return fact;
	}
	public static void main(String args[]){
		int num = 145;
		int temp = num;
		int rem, sum = 0;
		while(num!=0){
			rem = num % 10;
			sum += factorial(rem);
			num = num / 10;
		}
		if(sum==temp)
			System.out.println(temp+" Strong No !!!!!");
		else
			System.out.println(temp+" Not Strong No!!!!!");
	}
}