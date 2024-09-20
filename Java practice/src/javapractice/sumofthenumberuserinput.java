package javapractice;
import java.util.Scanner;
public class sumofthenumberuserinput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter the number of elements : ");
		int count = scanner.nextInt();
		
		int sum = 0;
		for ( int i = 0; i < count; i++)
		{
			System.out.println(" Enter number " + ( i +1) + " :");
			int number = scanner.nextInt();
			sum += number;
		}
		System.out.println(" sum of the entered number is " + sum);
		scanner.close();
	}

}
