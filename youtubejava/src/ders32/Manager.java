package ders32;

public class Manager extends Employee
{
	//Java'da t�m class'lar object s�n�f�ndan t�rer.
	private int num_of_employees;
	
	public Manager(String name, String department, int salary,int num_of_employees) 
	{
		super(name,department,salary);
		this.num_of_employees= num_of_employees;
		
	}
	@Override
	public void showInfos()
	{
		super.showInfos();
		System.out.println("Sorumlu ki�i say�s�: "+ this.num_of_employees);
	}
	public void raiseSalary(int amount)
	{
		System.out.println("�al��anlara "+amount+" tl zam yap�ld�.");
	}
	
	//object s�n�f�nda olan bir metodu override ettik
	@Override
	public String toString() 
	{
		return "Manager objesi";
	}
	
	
	
	
	
}
