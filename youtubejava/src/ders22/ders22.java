package ders22;

public class ders22 {

	public static void main(String[] args) 
	{
		String s1 = new String("Taha"); //string class'�ndan bir obje olu�turuldu
		String s2 = new String("Taha");
		/*
		if(s1==s2) //Burada asl�nda referanslar k�yaslan�r ��nk� s1 ve s2 yavru de�i�kenlerdir.
		{
			System.out.println("E�it");
		}
		else
			System.out.println("E�it De�il");//bellekte ayn� yeri g�stermekdikleri i�in else sonucunu �al���t�racakt�r.
		*/
		if(s1.equals(s2))//Burada referanslar� de�il de�erleri k�yaslad�k ve sonu� e�ittir ��kt�.
		{
			System.out.println("E�it");
		}
		else
			System.out.println("E�it De�il");
		
		/*
		Car araba = new Car("Beyaz","BMW","3.18i",4);
		araba.showInfos();
		
		Car araba2 = araba;
		araba2.showInfos();
		*/
		
		
		/*
		Car araba3;
		araba3.showInfos(); //herhangi bir yeri g�stermedi�i i�in hata veriyor
		*/
		
		/*
		Car araba3 = null;
		araba3.showInfos(); //yaz�m an�nda hata olmaz ama �al��t�r�ld��� zaman �al��ma zaman� hatas� al�r.
		//null referans�n�n kullan�m amac�, ba�lang��ta bir de�er almayan ancak �al��ma esnas�nda de�er alacak olan de�i�kenler i�in veri giri�i yap�labilmesini sa�lar.
		*/
	}

}
