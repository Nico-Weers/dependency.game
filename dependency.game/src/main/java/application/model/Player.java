package application.model;

import application.interfaces.ICardCollection;
import application.interfaces.player.IPlayerInCardGame;

public class Player implements IPlayerInCardGame {

	private final int playerId;
	private final String username;

	private ICardCollection cards = new HandCards();

	public Player(int playerId, String username) {
		this.playerId = playerId;
		this.username = username;
	}

	@Override public String getUsername() {
		return username;
	}

	@Override public int getPlayerId() {
		return playerId;
	}

	@Override public ICardCollection getCards() {
		return cards;
	}
}
