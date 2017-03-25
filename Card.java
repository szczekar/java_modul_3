package pl.modultrzeci_java;

// ta klasa ma reprezentowac dowolna karte sposrod 52 kart z talii

public class Card {
	private String color;
	private String rank;

	public Card(String color, int rank) {

		this.color = color;

		if (rank == 1) {
			this.rank = "Ace";
		} else if (rank == 11) {
			this.rank = "Jack";
		} else if (rank == 12) {
			this.rank = "Queen";
		} else if (rank == 13) {
			this.rank = "King";
		} else {
			this.rank = "" + rank;
		}
	}

	public String toString() {
		return rank + " " + color;
	}

}
