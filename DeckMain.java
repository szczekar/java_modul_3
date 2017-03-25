package pl.modultrzeci_java;

public class DeckMain {

	public static void main(String[] args) {
		Deck talia = new Deck();
		// System.out.println(talia.toString());
		talia.handOutCards();
		talia.howManyCardsLeft();
		talia.checkWhichCardsOut();
		talia.handOutCards();
		talia.checkWhichCardsOut();
		talia.shuffle();
	}

}
