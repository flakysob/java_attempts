package ders32;

public class Manager extends Employee
{
	//Java'da tüm class'lar object sýnýfýndan türer.
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
		System.out.println("Sorumlu kiþi sayýsý: "+ this.num_of_employees);
	}
	public void raiseSalary(int amount)
	{
		System.out.println("Çalýþanlara "+amount+" tl zam yapýldý.");
	}
	
	//object sýnýfýnda olan bir metodu override ettik
	@Override
	public String toString() 
	{
		return "Manager objesi";
	}
	
	
	
	
	
}
