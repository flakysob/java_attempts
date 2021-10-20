package java_practises;

public class Varveritipi {

	public static void main(String[] args) {
		//aþaðýdaki örnekler sadece göstermek içindir. Çalýþtýrmak için deðil
		/* yerelde kullanýlýr, globalde kullanýlmaz.for döngüsü deðiþken tanýmlamasýnda kullanýlabilir.
		 Metot geri dönüþünde, sýnýf veya arayüz tip tanýmlamalarýnda da kullanýlamaz.
		 Var tipindeki deðiþkene baþlangýç deðeri atamak zorunludur. Ve sonradan farklý tipte bir deðer atanamaz.
		 java 11.0 sonrasý için lambda iþareti ile de kullanýlabilir.*/
		
		var ad = "Taha Doðan";
		System.out.println("Merhaba "+ad); // Çýktý: Merhaba Taha Doðan
		//okunurluk açýsýndan List <Map> data = new ArrayList<Map>(); yerine aþaðýdaki yazýlýr.
		var data = new ArrayList<Map>(); //Çýktý: {read = oku, book = kitap}
		data.add(Map.of("book","kitap","read","oku"));
		//veya for döngü deðiþkeni tipi olarak da kullanýlabilir.
		for(var y : data)
		{
			System.out.println(y);
		}
		
		
	}

}
