package ders30;

public class Manager extends Employee
{
	//Override: �ssteki class i�erisine tan�ml� metodu al�p �zelle�tirme
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
	
	
	
	
}
