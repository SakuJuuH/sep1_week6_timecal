import java.util.Scanner;

public class TimeCal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Distance (x): ");
		double x = scanner.nextDouble();
		System.out.println("Enter the Speed (y): ");
		double y = scanner.nextDouble();
		double time = timeCalculator(x, y);
		System.out.printf("Time taken to travel %.1f km at %.1f km/h: %.1f hours", x, y, time);

	}

	public static double timeCalculator(double x, double y) {
		if (y == 0) {
			throw new IllegalArgumentException("Division by zero is not allowed.");
		}
		return x / y;
	}
}
