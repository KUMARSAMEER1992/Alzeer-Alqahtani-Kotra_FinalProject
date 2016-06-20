/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package player;

import environment.StringConstants;
import lifeform.LifeForm;
/**
 * This class consists members and functions related to Creature.
 */
public abstract class Creature extends LifeForm
{
	/**
	 * integer to store base damage
	 */
	public int baseDamage;
	/**
	 * Creates a Creature.
	 */
	public Creature(String name, int points)
	{
		super(name, points);
	}
	/**
	 * return char for each type of creature
	 */
	public abstract char getChar();
	/**
	 * return item type 
	 */
	public String getItemType()
	{
		return StringConstants.CREATURE;
	}
}
