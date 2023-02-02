package harmonikSeri;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir değer giriniz : ");
		int value = scan.nextInt();
		
		double total =1;
		
		for(int i = 2; i<= value; i++) {
			total+=(1.0/i);
		}
		System.out.println("Toplam = " + total);

	}

}
