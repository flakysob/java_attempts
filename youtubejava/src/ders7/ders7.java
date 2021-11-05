package ders7;

import java.util.Scanner;

public class ders7 
{

	public static void main(String[] args) 
	{
		//karþýlaþtýrma operatörleri diðer diller ile ayný
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir not girin");
		int a = scan.nextInt();
		
		
		if (a > 70)
		{
			System.out.println("Dersten geçtiniz.");
		}
		else
			System.out.println("Dersten kaldýnýz.");
	}

}
