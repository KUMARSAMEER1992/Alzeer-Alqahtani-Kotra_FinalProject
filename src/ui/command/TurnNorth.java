/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package ui.command;

import environment.Environment;
import player.Player;
/**
 * This class to turn the Player to North.
 */
public class TurnNorth implements Command 
{
	/**
	 * Player that want to turn North.
	 */
	Player player;
	/**
	 * Create an instance of TurnNorth with given Player.
	 * @param lifeForm
	 */
	public TurnNorth(Player player)
	{
		this.player = player;
	}
	/**
	 * To change direction of Player to North.
	 */
	@Override
	public void execute()
	{
		Environment env = Environment.getWorldInstance();
		env.movePlayer(0);
		env.informDisplay();
	}
	/**
	 * To return the receiver
	 */
	public Player getReceiver()
	{
		return player; 
	}
}
