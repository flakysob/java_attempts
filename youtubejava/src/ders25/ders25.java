package ders25;
import java.util.ArrayList;

public class ders25 
{
	public static void main(String[] args)
	{
		//Arraylist
		//Arraylist'ler array'lere olduk�a benzerler. Tek bir fark�, alacak de�er say�s�n�n belirlenme zorunlulu�u yoktur(dinamik) ve istenilen de�erler anl�k olarak eklenip ��kar�labilir.
		ArrayList<String> liste = new ArrayList<String>();
		liste.add("BMW");
		liste.add("Bentley");
		liste.add("Rolls Royce");
		liste.add("Porsche");
		
		liste.remove("Bentley"); //method overloading ile ister index ver, ister i�eri�i ikisi de ge�erlidir.
		System.out.println(liste.indexOf("BMW")); //hangi index oldu�unu verir
		for(int i = 0; i < liste.size();i++)
		{
			System.out.println(i+". indeks : "+liste.get(i));
		}
		
	}

}
