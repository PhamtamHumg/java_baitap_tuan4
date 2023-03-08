package main;
import java.util.Scanner;
public class bai_3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n ;
		int sum = 0;
		do {
			System.out.println("nhap vao so nguyen n:");
			n = in.nextInt();
			sum = sum + n;
			if(sum > 100) {
				break;
			}
		}
		while(n > 0);
		System.out.println("tong la:" + sum);
	}

}
