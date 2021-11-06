
package ders21;
//Bu package içindekiler ders20'den kopyalandý.
//Baþlangýçta araba-nesne özellikleri belli ise constructor kullanýlýrsa iþler kolaylaþýr.
//Ancak default deðerler ile baþlamasýn da denilebilir. Bunun için constructor'a overloading uygulanýr.
public class ders20
{
	public static void main(String[] args) 
	{
		Car a1 = new Car("Gri","Citroen","Berlingo",4);//Constructor içinde parametre olduðu için buraya o parametreleri vermek gereklidir.
		a1.showInfos();
		
		Car a2 = new Car();
		a2.showInfos();
		
		Car a3 = new Car("Renault","Symbol");
		a3.showInfos();
		
	}

}
