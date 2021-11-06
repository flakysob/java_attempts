package ders23;

import java.util.Scanner;

public class ders23 
{
	public static void main(String[] args)
	{
		//Diziler C ve C++ ile birebir ayný. Listeler ise(Python) farklý deðiþkenler olmamasý þartý ile ayný.
	//array tanýmlýyoruz.(farklý tanýmlama yöntemleri alt alta verildi)
		int[] arr = {10,20,30,40,50}; //bellekte 5 deðerlik yer ayrýldý. Çünkü 5 tane deðer giriþi yapýldý.
		int[] arr2 = new int[5]; //bellekte 5 deðerlik yer ayrýldý. Ancak deðerler verilmedi. Aþaðýda deðerlerini ekleyelim.
		arr2[0] = 10;
		arr2[1] = 20; 
		arr2[2] = 30;
		arr2[3] = 40;
		arr2[4] = 50;
		//Þimdi arr ile arr2 ayný deðerleri belleðin farklý yerlerinde tutuyor.
		
		for(int i = 0; i< arr2.length;i++)
		{
			System.out.println("arr2'nin "+ (i+1) + ". elemaný : "+ arr2[i]);
		}
		System.out.println("------------------------------");
		for(int i = 0; i< arr.length;i++)
		{
			System.out.println("arr'nin "+ (i+1) + ". elemaný : "+ arr[i]);
		}
		
		System.out.println("------------------------------");
		//array elemanlarýný kullanýcýdan almak
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
