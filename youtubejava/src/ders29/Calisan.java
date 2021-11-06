package ders29;

public class Calisan
{
	private String isim;
	private String departman;
	protected int maas;
	
	public Calisan(String isim, String departman, int maas) 
	{
		this.isim = isim;
		this.departman = departman;
		this.maas=maas;
	}
	
	public void goster()
	{
		System.out.println("--------Bilgiler--------");
		System.out.println("Ýsim : " + this.isim);
		System.out.println("Departman : " + this.departman);
		System.out.println("ID : " + this.maas);
	}
	
	
}
