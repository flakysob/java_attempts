package ders31_1;

class Animal
{
	private String name;
	
	public Animal(String name) 
	{
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void speak()
	{
		System.out.println("Hayvan konu�uyor.");
	}
}

class Dog extends Animal
{

	public Dog(String name) 
	{
		super(name);
	}

	@Override
	public void speak() 
	{
		System.out.println(getName()+" havl�yor.");
	}
}

class Bird extends Animal
{

	public Bird(String name) 
	{
		super(name);
	}

	@Override
	public void speak() 
	{
		System.out.println(getName()+" �t�yor.");
	}
}

class Horse extends Animal
{

	public Horse(String name) 
	{
		super(name);
	}

	@Override
	public void speak() 
	{
		System.out.println(getName()+" ki�niyor.");
	}
}


public class ders31_1
{
	public static void speaktry(Animal animal)
	{
		animal.speak();
	} 
	public static void main(String[] args) 
	{
		
		Animal animal = new Animal("Hayvan");
		Bird bird = new Bird("Alex");
		Dog dog = new Dog("�ansl�");
		Horse horse = new Horse("G�lbatur");
		
		/*
		animal.speak();
		bird.speak();
		dog.speak();
		horse.speak();
		*/
		
		/*
		Animal animal2 = new Bird("Alex");
		animal2.speak();
		
		Animal animal3 = new Dog("�ansl�");
		animal3.speak();
		
		Animal animal4 = new Horse("G�lbatur");
		animal4.speak();
		//G�r�ld��� �zere yukar�daki yorum sat�r�ndakiler ile ayn� i�i yapar.
		*/
		
		speaktry(new Bird("Alex"));
		speaktry(new Dog("�ansl�"));
		speaktry(new Horse("G�lbatur"));
	}

}
