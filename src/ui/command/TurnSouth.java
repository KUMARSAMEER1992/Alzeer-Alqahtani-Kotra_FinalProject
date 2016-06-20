/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package ui.command;

import environment.Environment;
import player.Player;
/**
 * This class to turn the Player to South.
 */
public class TurnSouth implements Command 
{
	/**
	 * Player that want to turn South.
	 */
	Player player;
	/**
	 * Create an instance of TurnSouth with given Player.
	 * @param lifeForm
	 */
	public TurnSouth(Player player)
	{
	this.player=player;
	}
	/**
	 * To change direction of Player to South.
	 */
	@Override
	public void execute() 
	{
		Environment env=Environment.getWorldInstance();
		env.movePlayer(2);
		env.informDisplay();
	}

}
