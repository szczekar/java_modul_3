package pl.modultrzeci_java;

// PESEL - RRMMDD-XXXXX

public class Pesel {

	public static void main(String[] args) {
		String pesel = "965478-36542";

		String firstPart = getFirstPart(pesel);
		System.out.println("FirstPart of pesel: " + firstPart);

		String secondPart = getSecondPart(pesel);
		System.out.println("Secod part of pesel: " + secondPart);

		String peselM = "123456-14567";
		String peselF = "234556-83470";

		String pesel1 = "333333-44444";
		String pesel2 = "333333-44444";

		System.out.println("Pesel to: " + peselF);
		boolean czyPeselMeski = isMaleNumber(peselF);
		System.out.println("Czy pesel meski: ");
		System.out.println(czyPeselMeski);
		czyPeselMeski = isFemaleNumber(peselF);
		System.out.println("Czy pesel zenski: ");
		System.out.println(czyPeselMeski);
		System.out.println("Pesel to: " + peselM);

		boolean czyPeselZenki = isMaleNumber(peselF);
		System.out.println("Czy pesel zeski: ");
		System.out.println(czyPeselZenki);
		System.out.println("Czy pesel meski: ");
		czyPeselZenki = isFemaleNumber(peselF);
		System.out.println(czyPeselZenki);

		// equals - czy 2 stringi rowne
		System.out.println("Czy 2 pesele(stringi) rowne? ");
		System.out.println(areEqual(pesel1, pesel2));

	}

	private static String getFirstPart(String pesel) {
		StringBuilder build = new StringBuilder();
		String firstPart = "";

		for (int i = 0; i < 6; i++) {
			char znak = pesel.charAt(i);
			build.append(znak);
		}

		firstPart = build.toString();
		return firstPart;
	}

	private static String getSecondPart(String pesel) {
		String secondPart = pesel.substring(7, 12);
		return secondPart;
	}

	private static boolean isFemaleNumber(String pesel) {
		String secondPart = getSecondPart(pesel);
		char znak = secondPart.charAt(0);
		int cyfra = Character.getNumericValue(znak);

		if (cyfra % 2 == 0) {
			return true;
		}
		return false;
	}

	private static boolean isMaleNumber(String pesel) {
		char znak = pesel.charAt(7);
		int cyfra = (int) znak;

		if ((cyfra % 2) != 0) {
			return true;
		}
		return false;
	}

	private static boolean areEqual(String pesel1, String pesel2) {

		if (pesel1.equals(pesel2)) {
			return true;
		}

		return false;
	}
}
