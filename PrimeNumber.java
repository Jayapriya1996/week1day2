package wee1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int number=13;
		boolean prime=true;
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				prime=false;
				System.out.println("13 is not a prime number");
				break;
			}
		}
System.out.println(prime);
System.out.println("13 is a prime number");
	}

}
