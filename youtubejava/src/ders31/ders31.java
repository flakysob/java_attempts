

package ders31;

public class ders31 
{
	public static void main(String[] args) 
	{
		Employee employee = new Employee("Taha Do�an", "Bli�im", 3000);
		employee.showInfos();
		System.out.println("-----------------------------");
		Manager manager = new Manager("Asl� Do�an", "M�d�r", 4000,10);
		System.out.println(manager.toString());
		
	}
}
