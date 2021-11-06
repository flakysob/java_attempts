
package ders20;
//Bu package içindekiler ders18'den kopyalandý.
public class ders20
{
	public static void main(String[] args) 
	{
		Car a1 = new Car();
		a1.setColor("Gri");
		System.out.println("Arabanýn rengi : " + a1.getColor());
		
		a1.setBrand("Fiat");
		System.out.println("Arabanýn markasý : "+ a1.getBrand());
		
		a1.setModel("Egea");
		System.out.println("Arabanýn modeli : "+ a1.getModel());
		
		a1.setDoor(4);
		System.out.println("Arabanýn kapý sayýsý : "+ a1.getDoor());
		
	}

}
