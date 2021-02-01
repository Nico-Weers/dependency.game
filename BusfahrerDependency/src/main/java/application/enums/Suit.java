package application.enums;

import application.interfaces.ISuit;

public enum Suit implements ISuit {
    HEART(1), DIAMOND(2), SPADE(3), CLUB(4);

    private int suitValue;

    Suit(int suitValue) {
        this.suitValue = suitValue;
    }

    @Override
    public int getSuitValue() {
        return suitValue;
    }
}
