package ders32;

public class ders32 
{
	public static void main(String[] args) 
	{
		//Employee employee = new Employee("Taha Doðan", "Bliþim", 3000);
		//employee.showInfos();
		System.out.println("-----------------------------");
		Manager manager = new Manager("Aslý Doðan", "Müdür", 4000,10);
		//Polymorphism:
		Employee employee = new Manager("Taha Doðan","Biliþim",3000,3); 
		//Üst sýnýfýn referansýný alt sýnýflara eþitlemiþ olduk
		//Employee employee = new Employee(...); yapsaydýk, 3 parametre alacaktý ve normal bir iþçi olacaktý. Ancak bu normal bir iþçi deðil. Altýnda da çalýþanlar var. O yüzden böyle bir þey yaptýk.
		employee.showInfos();//num_of_employees çýktýsý da verdiði için Manager sýnýfý içerisindeki showInfos çalýþtý.
		//Bu iliþkinin adý is-a iliþkisidir. Manager is a Employee, (öyle bir class olsaydý) Worker is a Employee.
	}
}
