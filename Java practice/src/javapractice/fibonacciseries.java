package javapractice;

public class fibonacciseries {

	public static void main(String[] args) {
		int n = 10;
		int a= 0, b = 1;
		System.out.println("Fibonacci series: " + a);
		for(int i = 1; i<n; i++)
		{
			System.out.println(" " + b);
			int next = a+b;
			a = b;
			b = next;
		}
		System.out.println();
	}

}
