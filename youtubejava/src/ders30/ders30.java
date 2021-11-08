//kaynak: https://emrecelen.com.tr/javada-kalitim-nedir/

package ders30;

public class ders30 
{
	public static void main(String[] args) 
	{
		Employee employee = new Employee("Taha Doðan", "Bliþim", 3000);
		employee.showInfos();
		System.out.println("-----------------------------");
		Manager manager = new Manager("Aslý Doðan", "Müdür", 4000,10);
		manager.showInfos();
		manager.raiseSalary(100);
	}
}
