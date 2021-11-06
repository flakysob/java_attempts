package ders4;

import java.util.Locale;
import java.util.Scanner;//altta yavru deðiþken satýrýna gel. Ctrl+Shift+O yap. Otomatik ekliyor.
//Ya da altta scanner yazýsýnýn üzerine týkla. Orada import scanner var. Ona bas.


//double veri girerken 3.14 yerine 3,14 girmek istiyoruz diyelim. Bunun için Locale.US ifadesini girmek gerekli

public class ders4
{
	public static void main(String[] args) 
	{
		/*
		Scanner scan = new Scanner(System.in); //package çaðýrýlmalý
		scan.useLocale(Locale.US); //virgüllü giriþi aktif ettik
		System.out.println("Bir sayý girin");
		double a = scan.nextDouble();
		System.out.println("a deðiþkeninin deðeri : " + a);
		
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir metin girin");
		String b = scan.nextLine();
		System.out.println("Girilen metin :" + b);
		
		
	}

}
