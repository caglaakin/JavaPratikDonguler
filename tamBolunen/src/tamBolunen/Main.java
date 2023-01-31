package tamBolunen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Sayı giriniz : ");
		int son = scan.nextInt();
		int toplam = 0,sayac = 0;
		double ortalama;
		
		for(int i = 0; i <= son; i++) {
			if(i % 3 == 0 && i % 4 == 0) {
				System.out.println("Sayi : " + i );
				toplam += i;
				sayac++;				
			}
		}
		ortalama = toplam/sayac;
		System.out.println("3'e ve 4'e bölünen sayıların ortalaması : " + ortalama);
		

	}

}
