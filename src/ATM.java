
import java.util.Scanner;

public class ATM {
	public void calis(Hesap hesap) {
		
		Login login = new Login();
		
		Scanner scanner1=new Scanner(System.in);
		System.out.println("Bankamıza hoşgeldiniz..");
		System.out.println("Kullanıcı girişi:");
		int giris_hakkı=3;
		
		while(true) {
			if(login.login(hesap)) {
				System.out.println("Başarılı giriş.");
				break;
			}
			else {
				giris_hakkı--;
				System.out.println("Kalan giriş hakkı:"+giris_hakkı);
			}
			if(giris_hakkı==0) {
			System.out.println("Giriş hakkınız bitti");
			return;
			}
		
		}
		
		
		System.out.println("*******************************************");
		String islemler="1.Bakiye sorgula"
				+"2.Para yatırma"
				+"3.Para çekme"
				+"Çıkış için q'ya basın";
		System.out.println(islemler);
		System.out.println("*******************************************");
		
		while(true) {
			
			System.out.println("İşlem seçiniz:");
			String islem=scanner1.nextLine();
			
			if(islem.equals("q")) {
				break;
			}
			
			else if(islem.equals("1")) {
				System.out.println("Bakiyeniz:"+hesap.getbakiye());
			}
			
			else if(islem.equals("2")) {
				System.out.println("Yatırmak istediğiniz tutar:");
				int tutar=scanner1.nextInt();
				scanner1.nextLine();
				hesap.paraYatir(tutar);
				
			}
			else if(islem.equals("3")) {
				System.out.println("Çekmek istediğiniz tutar:");
				int tutar=scanner1.nextInt();
				scanner1.nextLine();
				hesap.paraCek(tutar);
			}
			else {
				System.out.println("Geçersiz işlem.");
			}
			
			
		}
		
	}
	

}
		
