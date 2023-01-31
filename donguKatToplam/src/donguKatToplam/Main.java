package donguKatToplam;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sayi = 0,toplam = 0;
		
		 do{
			System.out.print("Sayi giriniz : ");
			sayi = scan.nextInt();
			if(sayi % 4 == 0) {
				toplam += sayi;
			}
		}while(sayi % 2 == 0);
		
		 System.out.println("Toplam : " + toplam);

	}

}
