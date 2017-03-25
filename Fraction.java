package pl.modultrzeci_java;

public class Fraction {
	private int L;
	private int M;

	public Fraction(int l, int m) {
		super();
		L = l;
		M = m;
		if (M == 0) {
			System.out.println("Nieprawidlowy ulamek.M cannot be zero !");
			L = 0;
			M = 0;
			System.out.println("Sproboj raz jeszcze !");
		}
	}

	public int getNumerator() {
		return L;
	}

	public int getDenominator() {
		return M;
	}

	public boolean isNegative() {
		if (L < 0 || M < 0) {
			return true;
		}
		return false;
	}

	public void add(Fraction o) {
		if (M == o.M) {
			int newL = L + o.L;
			System.out.println("Dodajesz ulamki.Nowy ulamek to: " + newL + " / " + M);
		} else {
			int tempM = M;
			int firstTempL = L * o.L;
			int firstTempM2 = M * o.L;
			int secondTempL = o.L * tempM;
			int totalNumerator = firstTempL + secondTempL;
			System.out.println("Dodajesz ulamki.Nowy ulamek to: " + totalNumerator + " / " + firstTempM2);
		}
	}

	public void substract(Fraction o) {
		if (M == o.M) {
			int newL = L - o.L;
			System.out.println("Odejmujesz ulamki. Nowy ulamek to: " + newL + " / " + M);
		} else {
			int tempM = M;
			int firstTempL = L * o.L;
			int firstTempM2 = M * o.L;
			int secondTempL = o.L * tempM;
			int totalNumerator = firstTempL - secondTempL;
			System.out.println("Odejmujesz ulamki. Nowy ulamek to: " + totalNumerator + " / " + firstTempM2);
		}
	}

	public void multiply(Fraction o) {
		int newL = L * o.L;
		int newM = M * o.M;
		System.out.println("Mnozysz ulamki. Nowy ulamek to: " + newL + " / " + newM);
	}

	public void divide(Fraction o) {
		int newL = L * o.M;
		int newM = M * o.L;
		System.out.println("Dzielisz ulamki. Nowy ulamek to: " + newL + " / " + newM);
	}

	public boolean isEqualTo(Fraction o) {
		if (M == o.M && L == o.L) {
			return true;
		}
		return false;
	}

	public String toString() {
		StringBuffer text = new StringBuffer();
		text.append(L + " / " + M);
		return text.toString();
	}
}
