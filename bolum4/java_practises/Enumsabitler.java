package java_practises;

public class Enumsabitler {
	
	
	enum gunler{Pazartesi,Sal�,�ar�amba,Per�embe,Cuma,Cumartesi,Pazar};
	
	

	public static void main(String[] args) {
		
		//enumaration constant
		//normalde mevcut olmayan, bize �zel verileri s�ralamak amac� ile kullan�l�r.
		//indis 0 dan ba�lar
		
		
		
		System.out.println("Haftan�n g�nleri : ");
		System.out.println("1 " + gunler.Pazartesi);
		System.out.println("2 " + gunler.Sal�);
		System.out.println("3 " + gunler.�ar�amba);
		System.out.println("4 " + gunler.Per�embe);
		System.out.println("5 " + gunler.Cuma);
		System.out.println("6 " + gunler.Cumartesi);
		System.out.println("7 " + gunler.Pazar);
		
		
	}

}
