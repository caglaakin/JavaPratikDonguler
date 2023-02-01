package usluHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int taban, us,total = 1;
		System.out.print("Taban değeri giriniz : ");
		taban = scan.nextInt();
		System.out.print("Üs değeri giriniz : ");
		us = scan.nextInt();
		
		for(int i = 1; i <= us; i++) {
			total *= taban;
		}
		
		/*int i = 1;
		while(i <= us) {
			total*= taban;
			i++;
		}*/
		
		System.out.println("Sonuç : " + total);

	}

}
