package ders29;

public class ders29 
{

	public static void main(String[] args) 
	{
		/*
		Calisan isci = new Calisan("�mer Sefa Baran","Bili�im",3000);
		isci.goster();
		*/
		
		Yonetici mudur = new Yonetici("Taha Do�an","M�hendis",6000,10);
		mudur.goster();
		mudur.zamyapici(6000,100);
		mudur.goster();
	}

}
