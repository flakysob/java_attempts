package ders29;
public class Yonetici extends Calisan
{
	private int calisansayisi;
	
	public Yonetici(String isim, String departman, int maas, int calisansayisi) 
	{
		super(isim, departman, maas);
		this.calisansayisi=calisansayisi;
	}
	
	public int zamyapici(int maas,int miktar)
	{
		this.maas = maas;
		this.maas += miktar;
		System.out.println(miktar + " TL  zam uygulandý.");
		return this.maas;
	}
	
	

}
