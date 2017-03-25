package pl.modultrzeci_java;
// ta klasa ma reprezentowac talie 52 kart i zawierac 52 obiekty klasy Card

public class Deck {
	private Card[] deck = new Card[52];
	private int numberOfCards;
	private int cardCounter = 52;
	private String cardsOut = "";

	public Deck() {
		numberOfCards = 0;
		String[] colors = { "Spades", "Diamonds", "Clubs", "Hearts" };

		for (int color = 0; color <= 3; color++) {
			for (int rank = 1; rank <= 13; rank++) {
				deck[numberOfCards] = new Card(colors[color], rank);
				numberOfCards++;
			}

		}

	}

	public void shuffle() {
		Card temp;

		if (cardCounter == 52) {
			for (int i = 0; i < 52; i++) {
				int random = (int) (Math.random() * 52);
				temp = deck[random];
				deck[random] = deck[i];
				deck[i] = temp;
			}
		}

		else {
			System.out.println("Nie ma wszystkich kart w talii i nie moge tasowac ! Ma byc 52 !");
		}
	}

	public void handOutCards() {

		Card temp;
		int randomize = (int) (Math.random() * cardCounter);
		temp = deck[randomize];
		if (temp != null) {
			deck[randomize] = null;
			cardsOut = cardsOut + temp.toString() + " , ";
			System.out.println("Your card is: " + temp);
			cardCounter--;
		} else {
			System.out.println("Failed to hand out card, try again.");
		}
	}

	public void howManyCardsLeft() {
		System.out.println("There are " + cardCounter + " cards left.");
	}

	public void checkWhichCardsOut() {
		System.out.println("Cards out of deck: " + cardsOut);
	}

	public String toString() {
		String printDeck = "Printing all cards in the deck: \n";
		for (int i = 0; i < 52; i++) {
			printDeck = printDeck + deck[i] + "\n";
		}
		return printDeck;
	}
}
