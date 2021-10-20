package java_practises;

public class veritipidonusumu 
{

	public static void main(String[] args) 
	{
		
		float a = (int)4.3;
		System.out.println("a : "+a); //4 olarak çýktý verdi
		
		float b = (int) 4.9;
		System.out.println("b : "+b); //yuvarlanmaz. Sonuç yine 4
		
		int sayi = 30;
		double ortalama = sayi /4;
		System.out.println("ortalama : "+ortalama); //7.5 olmasý gerekirken 7.0 verir
		
		ortalama = (double) sayi /4;
		System.out.println("double ortalama : " + ortalama);
//		sayi double ile tanýmlý olduðundan dolayý kesirli deðer verilir.
//		(float) sayi = 10.4f; veya (float) sayi = (float) 10.4; ile ayný ifadedir. Sadece farklý yazýlýþýdýr.
	}

}
