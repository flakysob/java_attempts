/*
 * METOTLARA G�R��
 * Belirli bir i�i yapan ve defalarca kullan�labilen tan�mlamalard�r.
 * �rne�in System.out.println(); bir fonksiyondur.
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
		System.out.println("Hangi say�n�n faktoriyeli al�nacak.");
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
		System.out.println("Girilen say�n�n fakt�riyeli = " + faktoriyel());
		
		
	}

}
