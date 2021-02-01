package application.model;

import application.enums.Suit;
import application.interfaces.ICard;
import application.interfaces.ISuit;

public class Card implements ICard {
    private Suit suit;
    private int value;

    public Card(Suit suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public ISuit getSymbol() {
        return suit;
    }

    @Override
    public int getValue() {
        return value;
    }


}
