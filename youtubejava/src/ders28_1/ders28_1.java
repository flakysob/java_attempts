package ders28_1;

public class ders28_1 
{

	public static void main(String[] args) 
	{
		Kiraci kiralayan = new Kiraci("Ay�e","Varyemez");
		Ogrenci ogr = new Ogrenci("Taha","Do�an");
		
		
		ogr.bilgiGoster();
		System.out.println("----------------------------------");
		kiralayan.bilgiGoster();
	}

}
