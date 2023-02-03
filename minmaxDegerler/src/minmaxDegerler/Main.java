package minmaxDegerler;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Kaç adet sayı gireceksiniz : ");
		int count = scan.nextInt();
		int maxnum,minnum,number;
		//int temp;
		int[] numbers = new int[count];
		
		for(int i = 0 ; i <count ; i++) {
			System.out.print((i+1) + ".sayıyı giriniz : ");
			numbers[i]=scan.nextInt();
		}
		maxnum =numbers[0];
		minnum =numbers[0];
		for(int j = 0 ; j<numbers.length; j++) {
			if(numbers[j]>maxnum) {
				maxnum = numbers[j];
			}
			if(numbers[j] < minnum) {
				minnum = numbers[j];
			}
		}
		
		/*maxnum = 0;
		minnum =0;
		temp =0;
		for(int i = 1 ; i <=count ; i++) {
			System.out.print(i + ".sayıyı giriniz : ");
			temp = scan.nextInt();
			if(minnum ==0) {
				minnum = temp;
			}
			if(temp > maxnum) {
				maxnum = temp;
			}
			else if(temp < maxnum) {
				if(temp<minnum) {
					minnum = temp;
				}
			}
		}*/
		
		
		
		
		System.out.println("En büyük sayı : " + maxnum + "\nEn küçük sayı : " + minnum);
		
		

	}

}
