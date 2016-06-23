package ui.command;

import player.Player;

/**
 * This class creates a invoker.
 * @author Sameer Kumar Kotra
 */
public class InvokerBuilder
{
	/**
	 * @return the invoker build.
	 */
	public static Invoker build()
	{
		Player player = Player.getPlayer();
		Invoker invoker = new Invoker();
		invoker.setTurnEast(new TurnEast(player));
		invoker.setTurnNorth(new TurnNorth(player));
		invoker.setTurnSouth(new TurnSouth(player));
		invoker.setTurnWest(new TurnWest(player));
		return invoker;
	}
}
