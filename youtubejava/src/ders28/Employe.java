package ders28;

public class Employe{
	String ad,soyad, bolum="�al��an", calisanBilgileri;
	int izingunu = 14;
	double maas = 2500;
	
	
	//Yap�c� metod tan�ml�yoruz.
	Employe(String ad,String soyad){
		this.ad = ad;
		this.soyad = soyad;
	}
	
	void bilgiGoster()
	{
		calisanBilgileri = "-> �sim ve Soyisim: "+ ad + " " + soyad + "\n-> B�l�m: " + bolum + "\n-> �zin G�n�: "+ izingunu +" G�n" + "\n-> Maa�: " + maas +" TL";
		System.out.println(calisanBilgileri);
	}
	
	
}
