package tersUcgen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Satır sayısını giriniz : ");
		int line = scan.nextInt();
		
		for(int i = line ; i >=1 ; i--) {
			for(int j = line-i ; j >0 ; j--) {
				System.out.print(" ");
			}
			for(int k= (2*i-1); k>0 ; k--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
