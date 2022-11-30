
import java.util.Scanner;



public class Giris {
	Scanner scanner = new Scanner(System.in);
	private String ad;
	private String soyad;
	private String KullanıcıAd;
	private String Parola;
	private String kullanıcı;
	private String parola;
	String a="x";
	String b="j";
	String c=".";
	

	public void setAd() {
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Ad : ");
			ad = scanner.next();
			if (ad.contains(a)){
			System.out.println("Adınız X harfi içeremez!");
			}
			else if(ad.contains(b)) {
				System.out.println("Adınız J harfi içeremez!");
			}else{
				break;
			}
		}
	}
	
	public void setSoyad() {
		
	for (int i = 0; i < 5; i++) {
		System.out.print("Soyad : ");
		soyad = scanner.next();
		if (soyad.contains(a)){
		System.out.println("Soyadınız X harfi içeremez!");
		}
		else if(soyad.contains(b)) {
			System.out.println("Soyadınız J harfi içeremez!");
		}else{
			break;
		}
	}
	}
	
	public void setKullanıcıAd() {
	
	System.out.print("Kullancı Adını Olustur : ");
	KullanıcıAd = scanner.next();
	}
	

	public void setParola() {
		
	for (int i = 0; i < 5; i++) {

	System.out.print("Parolanı Olustur : ");
	Parola = scanner.next();
	if (!Parola.contains(c)) {	
		System.out.println("Parola '.' karakteri içermelidir!");
		}
	else {
		break;
		}
	}
}

public void Yazdır() {
	System.out.println("Üyeliğiniz başarılı şekilde oluşturuldu");
	System.out.println("Kullanıcı Adı : "+KullanıcıAd+" / Parola : "+Parola);
	System.out.println(" ");
	System.out.println("-----------------------------------------------------------");
	System.out.println(" Oturum Açmak içi Kullanıcı adı ve Parolanızı giriniz.");
}

public void setKontrol() {
	for (int i = 4; i >= 0 ; i--) {
		System.out.print("Kullanıcı Adı : ");
		kullanıcı = scanner.next();
		
		if (!kullanıcı.equals(KullanıcıAd)) {
			System.out.println("Girdiğiniz kullanıcı adı doğru değildir!");
			System.out.println("Geçerli bir kullanıcı adı giriniz!");
			System.out.println(i + " hakkınız kaldı!");
		}else {
			break;
		}
		
	}
}
public void setKontrolparola() {
	for (int i = 4; i >= 0 ; i--) {
		System.out.print("Şifre : ");
		parola = scanner.next();
		
		if (!parola.equals(Parola)) {
			System.out.println("Girdiğiniz Şifre doğru değildir!");
			System.out.println("Geçerli bir Şifre giriniz!");
			System.out.println(i + " hakkınız kaldı!");
		}else {
			System.out.println(kullanıcı+", Hoşgeldiniz :)");
			break;
		}
		
	}
}




	
}

