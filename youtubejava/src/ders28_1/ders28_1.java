package ders28_1;

public class ders28_1 
{

	public static void main(String[] args) 
	{
		Kiraci kiralayan = new Kiraci("Ayþe","Varyemez");
		Ogrenci ogr = new Ogrenci("Taha","Doðan");
		
		
		ogr.bilgiGoster();
		System.out.println("----------------------------------");
		kiralayan.bilgiGoster();
	}

}
