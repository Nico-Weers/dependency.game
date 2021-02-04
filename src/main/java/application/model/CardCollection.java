package application.model;

import application.interfaces.ICard;
import application.interfaces.ICardCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class CardCollection implements ICardCollection {
	private List<ICard> cards = new ArrayList<>();

	@Override public List<ICard> getCards() {
		return cards;
	}

	@Override public ICard getCard(int index) {
		return cards.get(index);
	}

	@Override public boolean addCard(ICard card) {
		return cards.add(card);
	}

	@Override public boolean addAll(Collection<ICard> cards) {
		return cards.addAll(cards);
	}

	@Override public boolean isEmpty() {
		return cards.isEmpty();
	}

	@Override public void removeAllCards() {
		cards.forEach(card -> {
			cards.remove(card);
		});
	}

	@Override public ICard remove(int index) {
		return cards.remove(index);
	}

	@Override public void replaceCards(ICardCollection cards) {
		List<ICard> tempCards = this.getCards();
		this.removeAllCards();
		this.addAll(cards.getCards());
		cards.removeAllCards();
		cards.addAll(tempCards);
	}

	@Override public int getNumberOfCards() {
		return cards.size();
	}


}
