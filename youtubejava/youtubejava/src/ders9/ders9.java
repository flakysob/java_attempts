package ders9;

import java.util.Scanner;

public class ders9 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Bir say� girin.");
		
		Scanner scan = new Scanner(System.in);
		int sayi = scan.nextInt();
		
		switch (sayi) 
		{
		case 1: 
		{
			System.out.println("Bir");
			break;
		}
		case 2: 
		{
			System.out.println("�ki");
			break;
		}
		case 3: 
		{
			System.out.println("��");
			break;
		}
		default:
			System.out.println("Hatal� giri�.");
			
		}
	}
}
