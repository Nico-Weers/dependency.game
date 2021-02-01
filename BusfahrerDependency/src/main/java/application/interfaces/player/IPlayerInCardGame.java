package application.interfaces.player;

import application.interfaces.ICard;

public interface IPlayerInCardGame extends IPlayer {
    public ICard[] getCards();
}
