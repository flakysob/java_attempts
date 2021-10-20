package java_practises;

public class Varveritipi {

	public static void main(String[] args) {
		//a�a��daki �rnekler sadece g�stermek i�indir. �al��t�rmak i�in de�il
		/* yerelde kullan�l�r, globalde kullan�lmaz.for d�ng�s� de�i�ken tan�mlamas�nda kullan�labilir.
		 Metot geri d�n���nde, s�n�f veya aray�z tip tan�mlamalar�nda da kullan�lamaz.
		 Var tipindeki de�i�kene ba�lang�� de�eri atamak zorunludur. Ve sonradan farkl� tipte bir de�er atanamaz.
		 java 11.0 sonras� i�in lambda i�areti ile de kullan�labilir.*/
		
		var ad = "Taha Do�an";
		System.out.println("Merhaba "+ad); // ��kt�: Merhaba Taha Do�an
		//okunurluk a��s�ndan List <Map> data = new ArrayList<Map>(); yerine a�a��daki yaz�l�r.
		var data = new ArrayList<Map>(); //��kt�: {read = oku, book = kitap}
		data.add(Map.of("book","kitap","read","oku"));
		//veya for d�ng� de�i�keni tipi olarak da kullan�labilir.
		for(var y : data)
		{
			System.out.println(y);
		}
		
		
	}

}
