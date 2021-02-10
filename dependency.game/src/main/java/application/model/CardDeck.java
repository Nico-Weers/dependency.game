package application.model;

import application.enums.CardValue;
import application.enums.Suit;
import application.interfaces.ICard;

import java.util.ArrayList;
import java.util.List;

public class CardDeck extends CardCollection {

	public CardDeck() {
		for (int suitIndex = 0; suitIndex < Suit.values().length; suitIndex++) {
			this.getCards().addAll(getAllValuesWithSuit(Suit.values()[suitIndex]));
		}
	}

	public CardDeck(int deckMultiplier) {
		this();
		multiply(deckMultiplier);
	}

	private List<ICard> getAllValuesWithSuit(Suit suit) {
		List<ICard> cards = new ArrayList<>();
		for (int valueIndex = 0; valueIndex < CardValue.values().length; valueIndex++) {
			ICard newCard = new Card(suit, CardValue.values()[valueIndex]);
			cards.add(newCard);
		}
		return cards;
	}

	public void multiply(int multiplier) {
		for (int i = 1; i < multiplier; i++) {
			this.addAll(this.getCards());
		}
	}

	public ICard draw() {
		if (this.getCards().size() > 0) {
			return this.getCards().remove(0);
		}
		return null;
	}

}
