package ders5;

public class ders5 
{
	public static void main(String[] args) 
	{
		int x = 10;
		int y = 4;
		
		System.out.println("Sonu� : " + (x+y));//parantez koymazsan yan yana yazar
		System.out.println("Sonu� : " + (x-y));
		System.out.println("Sonu� : " + (x*y));
		System.out.println("Sonu� : " + (x/y));
		System.out.println("Sonu� : " + ((double)x/y));//ondal�kl� say� olarak ald�k. E�er parantezin ba��na yazsayd�k sonucu double olarak �evirecekti. Yani yine 2.0 sonucu ortaya ��kacakt�.
		System.out.println("Sonu� : " + (x%y)); //kalan� verir
		
	}
}
