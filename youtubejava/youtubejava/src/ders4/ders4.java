package ders4;

import java.util.Locale;
import java.util.Scanner;//altta yavru de�i�ken sat�r�na gel. Ctrl+Shift+O yap. Otomatik ekliyor.
//Ya da altta scanner yaz�s�n�n �zerine t�kla. Orada import scanner var. Ona bas.


//double veri girerken 3.14 yerine 3,14 girmek istiyoruz diyelim. Bunun i�in Locale.US ifadesini girmek gerekli

public class ders4
{
	public static void main(String[] args) 
	{
		/*
		Scanner scan = new Scanner(System.in); //package �a��r�lmal�
		scan.useLocale(Locale.US); //virg�ll� giri�i aktif ettik
		System.out.println("Bir say� girin");
		double a = scan.nextDouble();
		System.out.println("a de�i�keninin de�eri : " + a);
		
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir metin girin");
		String b = scan.nextLine();
		System.out.println("Girilen metin :" + b);
		
		
	}

}
