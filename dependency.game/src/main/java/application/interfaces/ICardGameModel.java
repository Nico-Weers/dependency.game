package application.interfaces;

import application.interfaces.player.IPlayerInCardGame;

import java.io.Serializable;
import java.util.List;

public interface ICardGameModel extends Serializable {
	public List<IPlayerInCardGame> getPlayersOfCardGame();
	public ICardCollection getDeck();
}
