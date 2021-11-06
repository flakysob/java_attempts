
package ders21;
//Bu package i�indekiler ders20'den kopyaland�.
//Ba�lang��ta araba-nesne �zellikleri belli ise constructor kullan�l�rsa i�ler kolayla��r.
//Ancak default de�erler ile ba�lamas�n da denilebilir. Bunun i�in constructor'a overloading uygulan�r.
public class ders20
{
	public static void main(String[] args) 
	{
		Car a1 = new Car("Gri","Citroen","Berlingo",4);//Constructor i�inde parametre oldu�u i�in buraya o parametreleri vermek gereklidir.
		a1.showInfos();
		
		Car a2 = new Car();
		a2.showInfos();
		
		Car a3 = new Car("Renault","Symbol");
		a3.showInfos();
		
	}

}
