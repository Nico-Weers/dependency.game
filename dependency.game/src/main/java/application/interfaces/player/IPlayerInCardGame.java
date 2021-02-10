package application.interfaces.player;

import application.interfaces.ICard;
import application.interfaces.ICardCollection;

import java.util.List;

public interface IPlayerInCardGame extends IPlayer {
    public ICardCollection getCards();
}
