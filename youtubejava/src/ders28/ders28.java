//kaynak: https://emrecelen.com.tr/javada-kalitim-nedir/

package ders28;

public class ders28 
{
	public static void main(String[] args) 
	{
		Employe isci = new Employe("Taha","Do�an");
		GeneralManager mudur = new GeneralManager("Asl�","Do�an");
		
		System.out.println("---------------------------");
		isci.bilgiGoster();
		System.out.println("---------------------------");
		mudur.bilgiGoster();
	}

}
