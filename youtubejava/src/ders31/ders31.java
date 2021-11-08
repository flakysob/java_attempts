

package ders31;

public class ders31 
{
	public static void main(String[] args) 
	{
		Employee employee = new Employee("Taha Doðan", "Bliþim", 3000);
		employee.showInfos();
		System.out.println("-----------------------------");
		Manager manager = new Manager("Aslý Doðan", "Müdür", 4000,10);
		System.out.println(manager.toString());
		
	}
}
