
package ders18;
//A�A�IDA YAPILAN ��LEMLER SETTER-GETTER FONK. OLARAK ADLANDIRILIR
public class ders18 
{
	public static void main(String[] args) 
	{
		/*
		 * D�REKT OLARAK ER��EMED���M�ZDEN YORUMA ALINDI
		 * A�A�IDA D�REKT OLARAK ER���M VAR
		Car araba1 = new Car();
		araba1.brand = "Fiat";
		araba1.model="Aegea";
		araba1.color="Beyaz";
		araba1.door=5;
		
		System.out.println(araba1.color);
		System.out.println(araba1.brand);
		System.out.println(araba1.model);
		System.out.println(araba1.door+" kap�");
		*/
		
		Car a1 = new Car();
		a1.setColor("Gri");
		System.out.println("Araban�n rengi : " + a1.getColor());
		
		a1.setBrand("Fiat");
		System.out.println("Araban�n markas� : "+a1.getBrand());
		
		a1.setModel("Egea");
		System.out.println("Araban�n modeli : "+a1.getModel());
		
		a1.setDoor(5);
		System.out.println("Araban�n kap� say�s� : "+a1.getDoor());
		
	}

}
