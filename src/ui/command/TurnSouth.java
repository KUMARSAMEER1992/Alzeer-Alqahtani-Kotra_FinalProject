/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package ui.command;

import environment.Environment;
import lifeform.LifeForm;
/**
 * This class to turn the LifForm to South.
 */
public class TurnSouth implements Command 
{
	/**
	 * Player that want to turn South.
	 */
	Player player;
	/**
	 * Create an instance of TurnSouth with given LifeForm.
	 * @param lifeForm
	 */
	public TurnSouth(Player player)
	{
		this.player=player;
	}
	/**
	 * To change direction of LifeForm to South.
	 */
	@Override
	public void execute() 
	{
		Environment env=Environment.getWorldInstance();

		player.setDirection(2);
	}
}
