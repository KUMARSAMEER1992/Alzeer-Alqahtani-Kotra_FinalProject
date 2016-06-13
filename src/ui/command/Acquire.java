/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package ui.command;

import environment.Environment;
import lifeform.LifeForm;
/**
 * This class to allow LifeForm to pickup a weapon 
 * that in the cell
 */
public class Acquire implements Command
{
	/**
	 * LifeForm acquire the weapon.
	 */
	Player player;
	/**
	 * Create an instance of Acquire with given LifeForm.
	 * @param lifeForm
	 */
	public Acquire(Player player)
	{
		this.player=player;
	}
	/**
	 * LifeForm picks up a weapon, but only if one exists in the Cell.
	 * If the LifeForm is already holding a weapon, it will swap the old 
	 * weapon for the new weapon. This will keep the LifeForm from having 
	 * to move to a different cell, drop a weapon, then return to this cell 
	 * to get a new one when there are two weapons available. 
	 */
	@Override
	public void execute() 
	{
		Environment env=Environment.getWorldInstance();
		int row=player.getX();
		int col=player.getY();
		if(player.getWeapon()==null)
			
		
		
		env.informDisplay();
 }

}
