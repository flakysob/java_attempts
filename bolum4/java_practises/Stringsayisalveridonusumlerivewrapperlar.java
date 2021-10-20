package java_practises;

public class Stringsayisalveridonusumlerivewrapperlar {

	public static void main(String[] args) {
		/*de�i�kenlerin nesne olarak alg�lanabilmesi i�in, her de�i�kenin kar��l��� olan wrapperlar kullan�l�r
		  �rne�in int veri tipini string veri tipine d�n��t�r�rken "int" de�il de "Integer" s�n�f kar��l��� kullan�l�r.
		  (Integer.toString(parametre)) */
		/*Temel veri tiplerini string veri tipine d�n��t�rmek i�in "toString()" veya "String.valueOf()" kullan�l�r.*/
		String sa = Integer.toString(18);
		String ka = String.valueOf(18);
		//yukar�dakilerin ikisi de string'e d�n��t�r�ld� ve string bir de�i�kene atand�
		System.out.println("sa+ka : "+sa + ka );
		
		
		String Ad = "18";
		double s1 = Double.parseDouble(Ad);
		double s2 = Double.valueOf(Ad);
		System.out.println("s1+s2 : "+ (s1+s2)); //paranteze almazsan yan yana ekler
		
	}

}
