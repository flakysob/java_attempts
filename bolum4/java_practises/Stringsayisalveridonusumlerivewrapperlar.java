package java_practises;

public class Stringsayisalveridonusumlerivewrapperlar {

	public static void main(String[] args) {
		/*deðiþkenlerin nesne olarak algýlanabilmesi için, her deðiþkenin karþýlýðý olan wrapperlar kullanýlýr
		  örneðin int veri tipini string veri tipine dönüþtürürken "int" deðil de "Integer" sýnýf karþýlýðý kullanýlýr.
		  (Integer.toString(parametre)) */
		/*Temel veri tiplerini string veri tipine dönüþtürmek için "toString()" veya "String.valueOf()" kullanýlýr.*/
		String sa = Integer.toString(18);
		String ka = String.valueOf(18);
		//yukarýdakilerin ikisi de string'e dönüþtürüldü ve string bir deðiþkene atandý
		System.out.println("sa+ka : "+sa + ka );
		
		
		String Ad = "18";
		double s1 = Double.parseDouble(Ad);
		double s2 = Double.valueOf(Ad);
		System.out.println("s1+s2 : "+ (s1+s2)); //paranteze almazsan yan yana ekler
		
	}

}
