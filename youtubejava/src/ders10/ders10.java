package ders10;
import java.util.Scanner;
public class ders10 
{

	public static void main(String[] args) 
	{	
		Scanner scan = new Scanner(System.in);
		System.out.println("Faktöriyelini bulmak istediðiniz sayý : ");
		int sayi = scan.nextInt();
		int sonuc = 1;
		int i = 1;
		while (i<=sayi) //koþul saðlandýðý sürece çalýþýr
		{
			sonuc = sonuc * i;
			i++;
		}
		System.out.println("Sonuç : " + sonuc);
			
			
			
		

	}

}
