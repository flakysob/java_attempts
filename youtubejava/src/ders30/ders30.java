//kaynak: https://emrecelen.com.tr/javada-kalitim-nedir/

package ders30;

public class ders30 
{
	public static void main(String[] args) 
	{
		Employee employee = new Employee("Taha Do�an", "Bli�im", 3000);
		employee.showInfos();
		System.out.println("-----------------------------");
		Manager manager = new Manager("Asl� Do�an", "M�d�r", 4000,10);
		manager.showInfos();
		manager.raiseSalary(100);
	}
}
