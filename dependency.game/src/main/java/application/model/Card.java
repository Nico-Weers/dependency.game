package application.model;

import application.enums.CardValue;
import application.enums.CardVisibility;
import application.enums.Suit;
import application.interfaces.ICard;

public class Card implements ICard {
    private Suit suit;
    private CardValue value;
    private CardVisibility visibility;

    public Card(Suit suit, CardValue value) {
        this(suit, value, CardVisibility.VISIBLE_FOR_NOBODY);
    }

    public Card(Suit suit, CardValue value, CardVisibility visibility) {
        this.suit = suit;
        this.value = value;
        this.visibility = visibility;
    }

    @Override
    public Suit getSymbol() {
        return suit;
    }

    @Override
    public CardValue getValue() {
        return value;
    }

    @Override public CardVisibility getVisibility() {
        return visibility;
    }

    @Override public void setVisibility(CardVisibility visibility) {

    }

}
