package ders17;
/*
 *	OVERLOADING
 *Bir metodu farkl� parametrelerle ve ayn� isimle tan�mlayarak 
 *birden farkl� �ekilde kullanmak.
 */
public class ders17 
{
	/*
	public static void toplama(int a, int b)
	{
		System.out.println("Girilen say�lar�n toplamlar� : "+(a+b));
	}
	public static void toplama(int a, int b, int c)
	{
		System.out.println("Girilen say�lar�n toplamlar� : "+(a+b+c));
	}
	public static void toplama(int a, int b, int c, int d)
	{
		System.out.println("Girilen say�lar�n toplamlar� : "+(a+b+c+d));
	}
	
	
	public static void main(String[] args)
	{
		toplama(3,4,5,6); //parametreleri silerek dene
	}
	*/
	
	public static void skorHesapla(String name, int score)
	{
		System.out.println(name +" isimli oyuncunun skoru = " + score);
	}
	public static void skorHesapla(int score)
	{
		System.out.println("oyuncunun skoru = " + score);
	}
	public static void skorHesapla(String name)
	{
		System.out.println(name + " isimli oyuncunun skoru = 0");
	}
	public static void main(String[] args) 
	{
		skorHesapla(1000);
		skorHesapla("Taha",2000);
		skorHesapla("Asl�");
	}

}
