/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package ui.command;

import environment.Environment;
import player.Player;
/**
 * This class to turn the Player to East.
 */
public class TurnEast implements Command 
{
	/**
	 * Player that want to turn East.
	 */
	Player player;
	/**
	 * Create an instance of TurnEast with given Player.
	 * @param lifeForm
	 */
	public TurnEast(Player player)
	{
		this.player = player;
	}
	/**
	 * To change direction of Player to East.
	 */
	@Override
	public void execute()
	{
		Environment env = Environment.getWorldInstance();
		env.movePlayer(1);
		env.informDisplay();
	}

}
