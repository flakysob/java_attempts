package java_practises;

public class Enumsabitler {
	
	
	enum gunler{Pazartesi,Salý,Çarþamba,Perþembe,Cuma,Cumartesi,Pazar};
	
	

	public static void main(String[] args) {
		
		//enumaration constant
		//normalde mevcut olmayan, bize özel verileri sýralamak amacý ile kullanýlýr.
		//indis 0 dan baþlar
		
		
		
		System.out.println("Haftanýn günleri : ");
		System.out.println("1 " + gunler.Pazartesi);
		System.out.println("2 " + gunler.Salý);
		System.out.println("3 " + gunler.Çarþamba);
		System.out.println("4 " + gunler.Perþembe);
		System.out.println("5 " + gunler.Cuma);
		System.out.println("6 " + gunler.Cumartesi);
		System.out.println("7 " + gunler.Pazar);
		
		
	}

}
