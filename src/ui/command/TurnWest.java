package ui.command;

import environment.Environment;
import player.Player;

public class TurnWest implements Command 
{   /**
	 * Player that want to turn West.
	 */
	Player player;
	/**
	 * Create an instance of TurnWest with given Player.
	 * @param lifeForm
	 */
	public TurnWest(Player player)
	{
	this.player=player;
	}
	/**
	 * To change direction of Player to West.
	 */
	@Override
	public void execute() 
	{
		Environment env=Environment.getWorldInstance();
		env.movePlayer(3);
		env.informDisplay();
	}

}
