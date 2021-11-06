
package ders18;
//AÞAÐIDA YAPILAN ÝÞLEMLER SETTER-GETTER FONK. OLARAK ADLANDIRILIR
public class ders18 
{
	public static void main(String[] args) 
	{
		/*
		 * DÝREKT OLARAK ERÝÞEMEDÝÐÝMÝZDEN YORUMA ALINDI
		 * AÞAÐIDA DÝREKT OLARAK ERÝÞÝM VAR
		Car araba1 = new Car();
		araba1.brand = "Fiat";
		araba1.model="Aegea";
		araba1.color="Beyaz";
		araba1.door=5;
		
		System.out.println(araba1.color);
		System.out.println(araba1.brand);
		System.out.println(araba1.model);
		System.out.println(araba1.door+" kapý");
		*/
		
		Car a1 = new Car();
		a1.setColor("Gri");
		System.out.println("Arabanýn rengi : " + a1.getColor());
		
		a1.setBrand("Fiat");
		System.out.println("Arabanýn markasý : "+a1.getBrand());
		
		a1.setModel("Egea");
		System.out.println("Arabanýn modeli : "+a1.getModel());
		
		a1.setDoor(5);
		System.out.println("Arabanýn kapý sayýsý : "+a1.getDoor());
		
	}

}
