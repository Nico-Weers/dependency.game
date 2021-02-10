package application.interfaces.player;

import application.interfaces.ICardCollection;

public interface IPlayerInCardGame extends IPlayer {
    public ICardCollection getCards();
}
