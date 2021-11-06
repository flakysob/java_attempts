package ders21;

public class Car 
{
	private String color;
	private String model;
	private String brand;
	private int door;
	
	//constructor metod:
	public  Car(String color, String brand, String model, int door)
	{
		this.color=color;
		this.brand=brand;
		this.model=model;
		this.door=door;
	}
	
	//default de�erler olmadan constructor
	public Car()
	{
		this.color="Bilgi yok";
		this.brand="Bilgi yok";
		this.model="Bilgi yok";
		this.door=0;
		//yukar�daki sat�rlar ile a�a��daki kod ayn� i�levi yapar
		//bu kodda this() metoduna constructor i�lemi uygulan�r.
		//yani this() i�in herhangi bir parametre gelmez ise bunu �al��t�r demektir.
		//this("Bilgi yok","Bilgi yok",0,0);
	}
	
	//Sadece marka ve model bilgisi geldi�inde constructor
	public Car(String brand, String model)
	{
		this(brand,model,"0",0);
	}
	
	
	//��kt� vermenin kolay yolu
	public void showInfos()
	{
		System.out.println("Araban�n rengi : " + this.color);
		System.out.println("Araban�n markas� : "+ this.brand);
		System.out.println("Araban�n modeli : "+ this.model);
		System.out.println("Araban�n kap� say�s� : "+ this.door);
		System.out.println("----------------------------");
	}
}
