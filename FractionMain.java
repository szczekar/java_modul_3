package pl.modultrzeci_java;

public class FractionMain {

	public static void main(String[] args) {

		// Fraction f1 = new Fraction(2, 0);
		Fraction f2 = new Fraction(1, 4);
		Fraction f3 = new Fraction(3, 4);
		Fraction f4 = new Fraction(1, 4);

		f2.add(f3);
		f3.substract(f2);
		f2.multiply(f3);
		f2.divide(f3);
		System.out.println("Czy dwa ulamki sa rowne? :");
		System.out.println(f2.isEqualTo(f4));

		System.out.println(f2.toString());

	}
}
