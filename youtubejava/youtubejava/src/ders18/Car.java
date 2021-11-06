package ders18;

public class Car 
{ //t�m de�i�kenleri private yaparsak ana s�n�ftan eri�emeyiz.
  //ancak dolayl� yoldan eri�mek istersek public bir metod tan�mlamak gereklidir.
	private String color;
	private String model;
	private String brand;
	private int door;
	
	public void setColor(String color) //private de�i�kenlere eri�mek i�in
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
	
	//SETTER-GETTER FONK. KOLAY TANIMLAMAK ���N BURAYA 
	//Sa�T�k/Source/Generate Getters and Setters
	//Akabinde hangi �zelliklere olu�turulacak ise onlar� se�
	//sonras�nda ayn� bizim yazd���m�z gibi eklenecek
	//(color getter-setter harici bu y�ntem ile eklendi)
	
}
