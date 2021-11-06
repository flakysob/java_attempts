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
	
	//default deðerler olmadan constructor
	public Car()
	{
		this.color="Bilgi yok";
		this.brand="Bilgi yok";
		this.model="Bilgi yok";
		this.door=0;
		//yukarýdaki satýrlar ile aþaðýdaki kod ayný iþlevi yapar
		//bu kodda this() metoduna constructor iþlemi uygulanýr.
		//yani this() için herhangi bir parametre gelmez ise bunu çalýþtýr demektir.
		//this("Bilgi yok","Bilgi yok",0,0);
	}
	
	//Sadece marka ve model bilgisi geldiðinde constructor
	public Car(String brand, String model)
	{
		this(brand,model,"0",0);
	}
	
	
	//Çýktý vermenin kolay yolu
	public void showInfos()
	{
		System.out.println("Arabanýn rengi : " + this.color);
		System.out.println("Arabanýn markasý : "+ this.brand);
		System.out.println("Arabanýn modeli : "+ this.model);
		System.out.println("Arabanýn kapý sayýsý : "+ this.door);
		System.out.println("----------------------------");
	}
}
