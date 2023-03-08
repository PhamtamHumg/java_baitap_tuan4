package main;
import java.util.Scanner;
public class bai_4java {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("nhap vao ten cua ban:");
		String name = in.nextLine();
		System.out.println("nhap vao nam sinh cua ban");
		int year = in.nextInt();
		int age;
		age = 2023 - year;
		if(age > 16) {
			System.out.println("Ban" + name + " o do tuoi vi thanh nien");
		}
		else if(age >= 16 || age < 18) {
			System.out.println("Ban" + name + " o do tuoi truong thanh");
		}
		else{
			System.out.println("Ban" + name + " da gia");
		}
		
		

	}

}
