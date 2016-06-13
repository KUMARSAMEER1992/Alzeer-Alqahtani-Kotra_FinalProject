/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package ui.command;

import environment.Environment;
import lifeform.LifeForm;
/**
 * This class to turn the LifForm to North.
 */
public class TurnNorth implements Command 
{
	/**
	 * LifeForm that want to turn North.
	 */
	Player player;
	/**
	 * Create an instance of TurnNorth with given LifeForm.
	 * @param lifeForm
	 */
	public TurnNorth(Player player)
	{
		this.player=player;
	}
	/**
	 * To change direction of LifeForm to North.
	 */
	@Override
	public void execute() 
	{
		Environment env=Environment.getWorldInstance();

		player.setDirection(0);
		env.informDisplay();
	}
}
