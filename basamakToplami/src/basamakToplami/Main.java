package basamakToplami;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir değer giriniz : ");
		int number = scan.nextInt();
		int tempnumber = number,basValue,basNumber=0,total = 0,result = 0,basPow;
		
		while(tempnumber != 0) {
			basValue = tempnumber%10;
			tempnumber/=10;
			System.out.println("Basamak : " + basValue);
			total+=basValue;
		}System.out.println("Toplam : "+ total);

		 
		
		/*while(tempnumber != 0) {
			tempnumber/=10;
			basNumber++;
		}
		
		tempnumber = number;
		while(tempnumber != 0) {
			basValue = tempnumber%10;
			basPow = 1;
			for(int i = 1; i<=basNumber; i++) {
				basPow *= basValue;
			}
			result+= basPow;
			
			tempnumber/=10;
			
		}
		
		System.out.println(result == number ? "Armstrong sayıdır." : "Armstrong sayı değildir.");*/
		
	}

}
