package ders7;

import java.util.Scanner;

public class ders7 
{

	public static void main(String[] args) 
	{
		//kar��la�t�rma operat�rleri di�er diller ile ayn�
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir not girin");
		int a = scan.nextInt();
		
		
		if (a > 70)
		{
			System.out.println("Dersten ge�tiniz.");
		}
		else
			System.out.println("Dersten kald�n�z.");
	}

}
