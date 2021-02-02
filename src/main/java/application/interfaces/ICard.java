package application.interfaces;

import application.enums.CardValue;
import application.enums.CardVisibility;
import application.enums.Suit;

public interface ICard {
    public Suit getSymbol();
    public CardValue getValue();
    public CardVisibility getVisibility();
    public void setVisibility(CardVisibility visibility);
}
