package ebobekok;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1,num2,i,ebob = 1, ekok = 1;
		System.out.print("Birinci sayıyı giriniz : ");
		num1 = scan.nextInt();
		System.out.print("İkinci sayıyı giriniz : ");
		num2 = scan.nextInt();
		i=num1;
		while(i>=1) {
			if(num1 % i == 0 && num2 % i == 0) {
				ebob = i;
				break;
			}
			i--;
		}
		ekok = (num1*num2)/ebob;
		System.out.println("Sayıların EBOB'u : " + ebob + "\nSayıların EKOK'u : " + ekok);
	}

}
