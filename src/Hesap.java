
public class Hesap {
	private String kullanici_adi;
	private String parola;
	private int bakiye;
	
	public Hesap(String kullanici_adi,String parola,int bakiye) {
		this.kullanici_adi=kullanici_adi;
		this.parola=parola;
		this.bakiye=bakiye;
	}
	
	public String getkullanici_adi() {
		return kullanici_adi;
	}
	
	public void setkullanici_adi(String kullanici_adi) {
		this.kullanici_adi=kullanici_adi;
	}
	
	public String getparola() {
		return parola;
	}
	
	public void setparola(String parola) {
		this.parola=parola;
	}
	
	public int getbakiye() {
		return bakiye;
	}
	
	public void setbakiye(int bakiye) {
		this.bakiye=bakiye;
	}
	
	public void paraYatir(int tutar) {
		bakiye+=tutar;
		System.out.println("Yeni bakiyeniz:"+bakiye);
	}
	
	public void paraCek(int tutar) {
		if(bakiye-tutar<0) {
			System.out.println("Yeterli bakiyeniz yok");
		}
		else
			
			bakiye-= tutar;
			System.out.println("Yeni bakiyeniz:"+bakiye);
	}


}


