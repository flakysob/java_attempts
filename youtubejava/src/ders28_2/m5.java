package ders28_2;

public class m5 
{
	public String lakap;
	public String renk;
	public double motorhacmi = 3.5;
	protected String kasakodu = "1764167361523";
	public String legend = "e39,e60";
	public String uretici="BMW";
	public String sapladigi = "Mercedes";
	
	public m5(String lakap,String renk) //d��ar�dan giri�i olacak �eyler constructor ile giriliyor.
	{
		this.lakap=lakap;
		this.renk=renk;
	}
	
	public void modelGoster()
	{
		System.out.println("Lakap : "+lakap+"\nRenk : "+renk+"\n�retici firma : "+uretici+"\n Efsanevi Kasa Kodlar� : "+legend+"\n Kasa kodu : "+kasakodu+"\n Ortalama motor hacmi : "+motorhacmi+"\n Saplad��� firma : "+sapladigi);
	}
	
}
