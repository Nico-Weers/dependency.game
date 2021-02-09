package application.model;

import application.enums.CardValue;
import application.enums.Suit;
import application.interfaces.ICard;

import java.util.ArrayList;
import java.util.List;

public class CardDeck extends CardCollection {

	private CardDeck(int deckMultiplier) {
		List<ICard> cards = new ArrayList<>();
			for (int suitIndex = 0; suitIndex < Suit.values().length; suitIndex++) {
				addAllValuesWithSuitTo(cards, Suit.values()[suitIndex]);
			}
		this.addAll(cards);
	}

	private void addAllValuesWithSuitTo(List<ICard> cards, Suit suit) {
		for (int v = 0; v < CardValue.values().length; v++) {
			ICard newCard = new Card(suit, CardValue.values()[v]);
			cards.add(newCard);
		}
	}

	public void multiply(int multiplier){
		for(int i = 1; i < multiplier; i++)
			this.addAll(this.getCards());
	}

	public ICard draw() {
		if (this.getCards().size() > 0) {
			return this.getCards().remove(0);
		}
		return null;
	}

}
