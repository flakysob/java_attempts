
package ders20;
//Bu package i�indekiler ders18'den kopyaland�.
public class ders20
{
	public static void main(String[] args) 
	{
		Car a1 = new Car();
		a1.setColor("Gri");
		System.out.println("Araban�n rengi : " + a1.getColor());
		
		a1.setBrand("Fiat");
		System.out.println("Araban�n markas� : "+ a1.getBrand());
		
		a1.setModel("Egea");
		System.out.println("Araban�n modeli : "+ a1.getModel());
		
		a1.setDoor(4);
		System.out.println("Araban�n kap� say�s� : "+ a1.getDoor());
		
	}

}
