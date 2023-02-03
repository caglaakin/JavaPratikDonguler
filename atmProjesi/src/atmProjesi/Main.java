package atmProjesi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String userName, password;
		int select = 0,balance=2000,price,right = 3;
		Scanner scan = new Scanner(System.in);
		while(right>0) {
			System.out.print("Kullanıcı adınızı giriniz : ");
			userName= scan.next();
			System.out.print("Şifrenizi giriniz : ");
			password = scan.next();
			if(userName.equals("patika") && password.equals("dev123")) {
				System.out.println("Başarıyla giriş yaptınız.\nHoşgeldiniz!");
				while(select != 4) {
					System.out.print("1 - Para Yatırma\n2 - Para Çekme\n3 - Bakiye Sorgulama\n4 - Çıkış Yap\nLütfen yapmak istediğiniz işlemi seçiniz : ");
					select = scan.nextInt();
					switch (select) {
					case 1: {
						System.out.print("Yatırılacak tutar : ");
						price = scan.nextInt();
						balance+=price;
						System.out.println("Girdiğiniz tutar başarıyla hesabınıza yatırıldı.");
						continue;
					}
					case 2: {
						System.out.print("Çekmek istediğiniz tutar : ");
						price = scan.nextInt();
						if(balance<price) {
							System.out.println("Bakiye yetersiz.");
							continue;
						}
						else {
							balance-=price;
							System.out.println("Paranızı alabilirsiniz.");
							continue;
						}
					}
					case 3: {
						System.out.print("Bakiyeniz : " + balance+"\n");
						continue;
					}
				}
			}
				System.out.println("Tekrar görüşmek üzere!");
				break;
		
		}else {
			right--;
			System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
			if(right == 0 ) {
				System.out.println("Hesabınız bloke olmuştur. Bankayla iletişime geçiniz.");
			}
			else {
				System.out.println("Kalan hakkınız : "+ right);
			}
			}
		}
			

	}

}
