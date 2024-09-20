package javapractice;

public class Convertingnumberintoword {
	public static String converttoWords(int number)
	{
		String[] units = {"", "one", "two", "three", "four", "five", "six","seven","eight", "nine", "ten",
				"Eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", 
				"nineteen",};
		String[] tens = {
				" ", " ", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		if (number==0) {
			return "Zero";
		}
		else if(number<20) {
			return units[number];
		}
		else if(number<100) {
			return tens[number / 10] + (number % 10 !=0 ?" " + units[number % 10] : "");
		}
		else
		{
			return units[number / 100] + " hundred " + (number % 100 != 0 ? " " + converttoWords(number %100) : "");
		}
	}

	public static void main(String[] args) {
		int number = 145;
		System.out.println(number + " in words is: " + converttoWords(number));
	}

}
