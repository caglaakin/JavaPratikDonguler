package dortvebesKatlari;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Sınır sayısı giriniz : ");
		int sayi = scan.nextInt();
		
		System.out.println("4'ün kuvvetleri olan sayilar");
		for(int i = 1; i <= sayi; i*=4) {
			System.out.println(i); 
		}
		
		System.out.println("5'ün kuvvetleri olan sayilar");
		for(int j = 1; j <= sayi; j*=5) {
			System.out.println(j); 
		}

	}

}
