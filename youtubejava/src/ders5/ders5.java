package ders5;

public class ders5 
{
	public static void main(String[] args) 
	{
		int x = 10;
		int y = 4;
		
		System.out.println("Sonuç : " + (x+y));//parantez koymazsan yan yana yazar
		System.out.println("Sonuç : " + (x-y));
		System.out.println("Sonuç : " + (x*y));
		System.out.println("Sonuç : " + (x/y));
		System.out.println("Sonuç : " + ((double)x/y));//ondalýklý sayý olarak aldýk. Eðer parantezin baþýna yazsaydýk sonucu double olarak çevirecekti. Yani yine 2.0 sonucu ortaya çýkacaktý.
		System.out.println("Sonuç : " + (x%y)); //kalaný verir
		
	}
}
