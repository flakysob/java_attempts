package ders32;

public class ders32 
{
	public static void main(String[] args) 
	{
		//Employee employee = new Employee("Taha Do�an", "Bli�im", 3000);
		//employee.showInfos();
		System.out.println("-----------------------------");
		Manager manager = new Manager("Asl� Do�an", "M�d�r", 4000,10);
		//Polymorphism:
		Employee employee = new Manager("Taha Do�an","Bili�im",3000,3); 
		//�st s�n�f�n referans�n� alt s�n�flara e�itlemi� olduk
		//Employee employee = new Employee(...); yapsayd�k, 3 parametre alacakt� ve normal bir i��i olacakt�. Ancak bu normal bir i��i de�il. Alt�nda da �al��anlar var. O y�zden b�yle bir �ey yapt�k.
		employee.showInfos();//num_of_employees ��kt�s� da verdi�i i�in Manager s�n�f� i�erisindeki showInfos �al��t�.
		//Bu ili�kinin ad� is-a ili�kisidir. Manager is a Employee, (�yle bir class olsayd�) Worker is a Employee.
	}
}
