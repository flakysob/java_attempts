package ders23;

import java.util.Scanner;

public class ders23 
{
	public static void main(String[] args)
	{
		//Diziler C ve C++ ile birebir ayn�. Listeler ise(Python) farkl� de�i�kenler olmamas� �art� ile ayn�.
	//array tan�ml�yoruz.(farkl� tan�mlama y�ntemleri alt alta verildi)
		int[] arr = {10,20,30,40,50}; //bellekte 5 de�erlik yer ayr�ld�. ��nk� 5 tane de�er giri�i yap�ld�.
		int[] arr2 = new int[5]; //bellekte 5 de�erlik yer ayr�ld�. Ancak de�erler verilmedi. A�a��da de�erlerini ekleyelim.
		arr2[0] = 10;
		arr2[1] = 20; 
		arr2[2] = 30;
		arr2[3] = 40;
		arr2[4] = 50;
		//�imdi arr ile arr2 ayn� de�erleri belle�in farkl� yerlerinde tutuyor.
		
		for(int i = 0; i< arr2.length;i++)
		{
			System.out.println("arr2'nin "+ (i+1) + ". eleman� : "+ arr2[i]);
		}
		System.out.println("------------------------------");
		for(int i = 0; i< arr.length;i++)
		{
			System.out.println("arr'nin "+ (i+1) + ". eleman� : "+ arr[i]);
		}
		
		System.out.println("------------------------------");
		//array elemanlar�n� kullan�c�dan almak
		Scanner scan = new Scanner(System.in);
		int[] arr3 = new int[5];
		
		for(int i = 0; i<arr3.length;i++)
		{
			System.out.println(i+". endeksi girin : ");
			arr3[i] = scan.nextInt();
		}
		for(int i = 0; i<arr3.length;i++)
		{
			System.out.println("arr3["+i+"] = "+ arr3[i]);
		}
		
		
		
	}
}
