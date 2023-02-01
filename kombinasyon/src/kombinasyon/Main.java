package kombinasyon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("n değerini giriniz : ");
		int n = scan.nextInt();
		System.out.print("r değerini giriniz : ");
		int r = scan.nextInt();
		
		//C(n,r) = n! / (r! * (n-r)!)
		int sum = (factorial(n)/(factorial(r)*factorial((n-r))));
		System.out.println("Kombinasyon : " + sum);
		
	}
	public static int factorial(int number) {
		int result=1;
		for(int i = 1; i <= number ; i++) {
			result*=i;
		}
		return result;
	}

}
