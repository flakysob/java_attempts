package ders26;

import java.util.ArrayList;

public class ders26 {

	//FOR EACH D�NG�LER�
	//Bu d�ng�ler array, arraylist, linklist'leri ekrana yazd�rmak i�in kullan�l�r.
	public static void main(String[] args) 
	{
		ArrayList<String> liste = new ArrayList<String>();
		int arr[] = {10,20,30,40,50};
		liste.add("BMW");
		liste.add("Bentley");
		liste.add("Rolls Royce");
		liste.add("Porsche");
		
		System.out.println("Array : ");
		for (int i : arr)
		{
			System.out.println(i);
		
		}
		System.out.println("------------------------");
		System.out.println("liste : ");
		for (String i : liste)
		{
			System.out.println(i);
		}
		System.out.println("------------------------");
	}

}
