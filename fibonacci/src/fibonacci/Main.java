package fibonacci;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("Eleman sayısını giriniz : ");
		int count = scan.nextInt();
		int sum,num1=0,num2=1;
		System.out.print(num1 + " " + num2);
		for(int i=2; i<count; i++) {
			sum =num1+ num2;
			System.out.print(" "+ sum);
			num1=num2;
			num2=sum;
		}
	
			
			
	}

}

