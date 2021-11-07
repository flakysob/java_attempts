package ders28;

public class Employe{
	String ad,soyad, bolum="Çalýþan", calisanBilgileri;
	int izingunu = 14;
	double maas = 2500;
	
	
	//Yapýcý metod tanýmlýyoruz.
	Employe(String ad,String soyad){
		this.ad = ad;
		this.soyad = soyad;
	}
	
	void bilgiGoster()
	{
		calisanBilgileri = "-> Ýsim ve Soyisim: "+ ad + " " + soyad + "\n-> Bölüm: " + bolum + "\n-> Ýzin Günü: "+ izingunu +" Gün" + "\n-> Maaþ: " + maas +" TL";
		System.out.println(calisanBilgileri);
	}
	
	
}
