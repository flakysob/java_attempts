package ders10;
import java.util.Scanner;
public class ders10 
{

	public static void main(String[] args) 
	{	
		Scanner scan = new Scanner(System.in);
		System.out.println("Fakt�riyelini bulmak istedi�iniz say� : ");
		int sayi = scan.nextInt();
		int sonuc = 1;
		int i = 1;
		while (i<=sayi) //ko�ul sa�land��� s�rece �al���r
		{
			sonuc = sonuc * i;
			i++;
		}
		System.out.println("Sonu� : " + sonuc);
			
			
			
		

	}

}
