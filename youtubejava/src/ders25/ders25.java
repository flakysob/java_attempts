package ders25;
import java.util.ArrayList;

public class ders25 
{
	public static void main(String[] args)
	{
		//Arraylist
		//Arraylist'ler array'lere oldukça benzerler. Tek bir farkı, alacak değer sayısının belirlenme zorunluluğu yoktur(dinamik) ve istenilen değerler anlık olarak eklenip çıkarılabilir.
		ArrayList<String> liste = new ArrayList<String>();
		liste.add("BMW");
		liste.add("Bentley");
		liste.add("Rolls Royce");
		liste.add("Porsche");
		
		liste.remove("Bentley"); //method overloading ile ister index ver, ister içeriği ikisi de geçerlidir.
		System.out.println(liste.indexOf("BMW")); //hangi index olduğunu verir
		for(int i = 0; i < liste.size();i++)
		{
			System.out.println(i+". indeks : "+liste.get(i));
		}
		
	}

}
