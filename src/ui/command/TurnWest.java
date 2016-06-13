/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package ui.command;

import environment.Environment;
import lifeform.LifeForm;
/**
 * This class to turn the LifForm to West.
 */
public class TurnWest implements Command 
{
	/**
	 * LifeForm that want to turn West.
	 */
	Player player;
	/**
	 * Create an instance of TurnWest with given LifeForm.
	 * @param lifeForm
	 */
	public TurnWest(Player player)
	{
		this.player=player;
	}
	/**
	 * To change direction of LifeForm to West.
	 */
	@Override
	public void execute() 
	{
		Environment env=Environment.getWorldInstance();

		player.setDirection(3);
		env.informDisplay();
	}
}


