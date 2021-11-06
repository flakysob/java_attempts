/*
 * METOTLARA GÝRÝÞ
 * Belirli bir iþi yapan ve defalarca kullanýlabilen tanýmlamalardýr.
 * Örneðin System.out.println(); bir fonksiyondur.
 * 
*/
package ders14;
import java.util.Scanner;

public class ders14 
{
	
	public static void selamla()
	{
		System.out.println("Herkese merhaba.");
	}
	public static int faktoriyel()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Hangi sayýnýn faktoriyeli alýnacak.");
		int a = scan.nextInt();
		int f = 1;
		while(a > 1)
		{
			f = f*a;
			a--;
		}
		return f;
	}
	
	
	public static void main(String[] args) 
	{
		selamla();
		selamla();
		System.out.println("Girilen sayýnýn faktöriyeli = " + faktoriyel());
		
		
	}

}
