
import java.util.Scanner;
public class Login {
	
	public boolean login(Hesap hesap) {
		
		Scanner scanner1 =new Scanner(System.in);
		String kullanici_adi;
		String parola;
		
		System.out.println("Kullanıcı adı:");
		kullanici_adi=scanner1.nextLine();
		System.out.println("Parola:");
		parola=scanner1.nextLine();
		
		if(hesap.getkullanici_adi().equals(kullanici_adi) && hesap.getparola().equals(parola)) {
			return true;
		}
		
		else {
		return false;
		}
		
	}
	

}
