package ders15;
import java.util.Scanner;
public class ders15 
{
	public static void selamla(String isim)
	{
		System.out.println("Merhaba " + isim);
	}
	
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Ýsminizi girin.");
		String x = scan.nextLine();
		selamla(x);
	}

}
