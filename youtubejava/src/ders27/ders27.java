package ders27;

public class ders27 
{
	public static void main(String[] args) 
	{
		String s1 = "Taha";
		String s2 = new String("Taha");//class olduklar� i�in bu �ekilde de olu�turulabilirler
		String s3 = "Taha";
		
		System.out.println(s2.length()); //karakter uzunlu�u
		System.out.println(s2.charAt(0)); //0. indeksteki karakteri verir
		System.out.println(s2.charAt(s2.length()-1));//son eleman� almak i�in
		System.out.println(s2.startsWith("Ta")); //Ta ile ba�l�yorsa true, ba�lam�yorsa false de�er d�ner
		System.out.println(s2.endsWith("ha")); //ha ile bitiyorsa true verir, bitmiyorsa false
		
		
		//yukar�da s1 ve s2 tan�mlamalar�n farkl� oldu�u a�ikar. Peki bu farkl� tan�mlama bize ne ifade ediyor?
		//s1 bellekte Taha �eklinde kaydedilir. E�er ayn� de�erli ancak farkl� de�i�kenli bir de�i�ken tan�mlansayd� bellekte yeni bir yer a��lmayacak, ayn� noktay� g�steren farkl� de�i�kenler olacakt�.
		if(s1==s3)
		{
			System.out.println("E�ittir");
		}
		else
		{
			System.out.println("E�it de�ildir.");
		}
		//G�r�ld��� gibi iki de�er de e�ittir.
		//new ile tan�mlansayd�(s2 gibi) belle�in tek bir adresinde tutulan Taha de�erli bir de�i�keni i�aret ediyor olacakt�.
		//e�er s2 ve s3 de�erleri sorgulanmak istenirse s2.equals(s3) kullan�lmal�d�r. equals ile sorgulanmazsa hata vermez ancak program yanl�� �al���r.
		
		
	}

}
