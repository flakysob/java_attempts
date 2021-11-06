package ders18;

public class Car 
{ //tüm deðiþkenleri private yaparsak ana sýnýftan eriþemeyiz.
  //ancak dolaylý yoldan eriþmek istersek public bir metod tanýmlamak gereklidir.
	private String color;
	private String model;
	private String brand;
	private int door;
	
	public void setColor(String color) //private deðiþkenlere eriþmek için
	{
		this.color = color;
	}
	public String getColor()
	{
		return this.color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	
	//SETTER-GETTER FONK. KOLAY TANIMLAMAK ÝÇÝN BURAYA 
	//SaðTýk/Source/Generate Getters and Setters
	//Akabinde hangi özelliklere oluþturulacak ise onlarý seç
	//sonrasýnda ayný bizim yazdýðýmýz gibi eklenecek
	//(color getter-setter harici bu yöntem ile eklendi)
	
}
