package ders28_1;

public class Kiraci 
{
	protected String ad,soyad;
	protected String telefonno = "0532 919 34 19";
	public int daireno=127;
	
	public Kiraci(String ad,String soyad)
	{
		this.ad=ad;
		this.soyad=soyad;
	}
	
	
	public void bilgiGoster()
	{	
		System.out.println(ad +" "+soyad+"\n Telefon numarasý : "+telefonno+"\n Daire numarasý : " + daireno);
		
	}
}
