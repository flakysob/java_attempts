//kaynak: https://emrecelen.com.tr/javada-kalitim-nedir/

package ders28;

public class ders28 
{
	public static void main(String[] args) 
	{
		Employe isci = new Employe("Taha","Doðan");
		GeneralManager mudur = new GeneralManager("Aslý","Doðan");
		
		System.out.println("---------------------------");
		isci.bilgiGoster();
		System.out.println("---------------------------");
		mudur.bilgiGoster();
	}

}
