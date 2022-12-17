import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int max = n;
		int min = n;
		while (true) {
			n = sc.nextInt();
			if (n < 0)
				break;
			if (n > max)
				max = n;
			if (n < min)
				min = n;
		}
		System.out.println("max: " + max + ", min: " + min);
	}

}
