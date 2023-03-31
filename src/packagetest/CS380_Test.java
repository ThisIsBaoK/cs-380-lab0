package packagetest;

public class CS380_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The first lab CS 380.");
		System.out.println(reverseInt(12345));
	}

	public static int reverseInt(int num) {
		int result = 0;
		int remainder;
		while (num > 0) {
			remainder = num % 10;
			result = (result * 10) + remainder;
			num = num / 10;
		}
		return result;
	}
}
