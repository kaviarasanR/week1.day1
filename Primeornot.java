package week1.day1;

public class Primeornot {
	public static void main(String[] args) {
		boolean value = false;
		int num = 11;
		int range = num / 2;
		for (int i = 2; i <= range; i++) {
			if (num % i == 0) {
				value = true;
			}
		}
		if (value == true) {
			System.out.println("it is not a prime number");
		}
		if (value == false) {
			System.out.println("it is a prime number");
		}
	}
}
