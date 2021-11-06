package ders27;

public class ders27 
{
	public static void main(String[] args) 
	{
		String s1 = "Taha";
		String s2 = new String("Taha");//class olduklarý için bu þekilde de oluþturulabilirler
		String s3 = "Taha";
		
		System.out.println(s2.length()); //karakter uzunluðu
		System.out.println(s2.charAt(0)); //0. indeksteki karakteri verir
		System.out.println(s2.charAt(s2.length()-1));//son elemaný almak için
		System.out.println(s2.startsWith("Ta")); //Ta ile baþlýyorsa true, baþlamýyorsa false deðer döner
		System.out.println(s2.endsWith("ha")); //ha ile bitiyorsa true verir, bitmiyorsa false
		
		
		//yukarýda s1 ve s2 tanýmlamalarýn farklý olduðu aþikar. Peki bu farklý tanýmlama bize ne ifade ediyor?
		//s1 bellekte Taha þeklinde kaydedilir. Eðer ayný deðerli ancak farklý deðiþkenli bir deðiþken tanýmlansaydý bellekte yeni bir yer açýlmayacak, ayný noktayý gösteren farklý deðiþkenler olacaktý.
		if(s1==s3)
		{
			System.out.println("Eþittir");
		}
		else
		{
			System.out.println("Eþit deðildir.");
		}
		//Görüldüðü gibi iki deðer de eþittir.
		//new ile tanýmlansaydý(s2 gibi) belleðin tek bir adresinde tutulan Taha deðerli bir deðiþkeni iþaret ediyor olacaktý.
		//eðer s2 ve s3 deðerleri sorgulanmak istenirse s2.equals(s3) kullanýlmalýdýr. equals ile sorgulanmazsa hata vermez ancak program yanlýþ çalýþýr.
		
		
	}

}
