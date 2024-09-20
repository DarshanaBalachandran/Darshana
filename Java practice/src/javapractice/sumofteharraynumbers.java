package javapractice;

public class sumofteharraynumbers {

	public static void main(String[] args) {
		int[] a = { 5, 10, 15, 20,};
		int sum = 0;
		
		for(int i:a)
		{
			sum += i;
		}
		System.out.println("sum of the array numbers is:" + sum);
	}

}
