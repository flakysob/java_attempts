package ders11;

import java.util.Scanner;

public class ders11
{
	public static void main(String[] args) 
	{
		System.out.println("Bir sayý girin : ");
		Scanner scan = new Scanner(System.in);
		int toplam = 0;
		int sayi = scan.nextInt();
		
		do 
		{
			toplam = toplam +(sayi % 10);
			sayi = sayi/10;
		} while (sayi>0);
		
		System.out.println("Girilen sayýnýn rakamlarý toplamý : " + toplam);
		
	}
}
