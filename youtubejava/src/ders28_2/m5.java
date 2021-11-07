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
	
	public m5(String lakap,String renk) //dýþarýdan giriþi olacak þeyler constructor ile giriliyor.
	{
		this.lakap=lakap;
		this.renk=renk;
	}
	
	public void modelGoster()
	{
		System.out.println("Lakap : "+lakap+"\nRenk : "+renk+"\nÜretici firma : "+uretici+"\n Efsanevi Kasa Kodlarý : "+legend+"\n Kasa kodu : "+kasakodu+"\n Ortalama motor hacmi : "+motorhacmi+"\n Sapladýðý firma : "+sapladigi);
	}
	
}
