package ders22;

public class ders22 {

	public static void main(String[] args) 
	{
		String s1 = new String("Taha"); //string class'ýndan bir obje oluþturuldu
		String s2 = new String("Taha");
		/*
		if(s1==s2) //Burada aslýnda referanslar kýyaslanýr çünkü s1 ve s2 yavru deðiþkenlerdir.
		{
			System.out.println("Eþit");
		}
		else
			System.out.println("Eþit Deðil");//bellekte ayný yeri göstermekdikleri için else sonucunu çalýþýtýracaktýr.
		*/
		if(s1.equals(s2))//Burada referanslarý deðil deðerleri kýyasladýk ve sonuç eþittir çýktý.
		{
			System.out.println("Eþit");
		}
		else
			System.out.println("Eþit Deðil");
		
		/*
		Car araba = new Car("Beyaz","BMW","3.18i",4);
		araba.showInfos();
		
		Car araba2 = araba;
		araba2.showInfos();
		*/
		
		
		/*
		Car araba3;
		araba3.showInfos(); //herhangi bir yeri göstermediði için hata veriyor
		*/
		
		/*
		Car araba3 = null;
		araba3.showInfos(); //yazým anýnda hata olmaz ama çalýþtýrýldýðý zaman çalýþma zamaný hatasý alýr.
		//null referansýnýn kullaným amacý, baþlangýçta bir deðer almayan ancak çalýþma esnasýnda deðer alacak olan deðiþkenler için veri giriþi yapýlabilmesini saðlar.
		*/
	}

}
