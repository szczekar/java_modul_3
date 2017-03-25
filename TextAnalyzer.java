package pl.modultrzeci_java;

public class TextAnalyzer {

	private String text;
	private int upperCounter;
	private int charCounter;
	private int whiteCounter;
	private int digitCounter;

	public TextAnalyzer(String text) {
		super();
		this.text = text;
	}

	public int charCount() {
		charCounter = text.length();
		return charCounter;
	}

	public int upperCaseCount() {
		upperCounter = 0;
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);

			if (Character.isUpperCase(letter)) {
				upperCounter++;
			}
		}
		return upperCounter;
	}

	public int whitespaceCount() {
		whiteCounter = 0;
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);

			if (Character.isWhitespace(letter)) {
				whiteCounter++;
			}
		}
		return whiteCounter;

	}

	public int digitCount() {

		digitCounter = 0;
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);

			if (Character.isDigit(letter)) {
				digitCounter++;
			}
		}
		return digitCounter;
	}

	public boolean containsChar(char znak) {
		for (int i = 0; i < text.length(); i++) {
			if (znak == text.charAt(i))
				return true;
		}
		return false;
	}

	public boolean containsString(String subtext) {
		if (text.contains(subtext)) {
			return true;
		}
		return false;
	}
}
