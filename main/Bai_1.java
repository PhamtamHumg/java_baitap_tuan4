package main;
import java.util.Scanner;  
public class Bai_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("nhap vao so a:");
		int a = in.nextInt();
		System.out.println("nhap vao so b:");
		int b = in.nextInt();
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " +(a - b));
		System.out.println("a / b = " + (a / b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a % b = " + (a % b));
	if(a > b) {
		System.out.println("a la so lon" + a);
	}
	else {
		System.out.println("b la so lon" + b);
	}
	}

}
