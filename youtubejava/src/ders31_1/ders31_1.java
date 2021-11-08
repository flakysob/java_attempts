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
		System.out.println("Hayvan konuþuyor.");
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
		System.out.println(getName()+" havlýyor.");
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
		System.out.println(getName()+" ötüyor.");
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
		System.out.println(getName()+" kiþniyor.");
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
		Dog dog = new Dog("Þanslý");
		Horse horse = new Horse("Gülbatur");
		
		/*
		animal.speak();
		bird.speak();
		dog.speak();
		horse.speak();
		*/
		
		/*
		Animal animal2 = new Bird("Alex");
		animal2.speak();
		
		Animal animal3 = new Dog("Þanslý");
		animal3.speak();
		
		Animal animal4 = new Horse("Gülbatur");
		animal4.speak();
		//Görüldüðü üzere yukarýdaki yorum satýrýndakiler ile ayný iþi yapar.
		*/
		
		speaktry(new Bird("Alex"));
		speaktry(new Dog("Þanslý"));
		speaktry(new Horse("Gülbatur"));
	}

}
