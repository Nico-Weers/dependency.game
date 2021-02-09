package application.interfaces;

import java.util.Collection;
import java.util.List;

public interface ICardCollection {
	public List<ICard> getCards();

	public ICard getCard(int index);

	public boolean addCard(ICard card);

	public boolean addAll(Collection<ICard> cards);

	public boolean isEmpty();

	public void removeAllCards();

	public ICard remove(int index);

	public void replaceCards(ICardCollection cards);

	public int getNumberOfCards();
}
