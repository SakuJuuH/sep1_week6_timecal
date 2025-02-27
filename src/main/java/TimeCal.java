public class TimeCal {
	public static void main(String[] args) {
		System.out.println(timeCalculator(10, 2));
	}
	
	public static double timeCalculator(double x, double y) {
		if (y == 0) {
			throw new IllegalArgumentException("Division by zero is not allowed.");
		}
		return x / y;
	}
}
