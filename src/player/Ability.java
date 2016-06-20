/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package player;
/**
 * Ability is a Creature.
 */
public abstract class Ability extends Creature

{
	/**
	 * Creature to store the Creature.
	 */
	protected Creature creature;
	/**
	 * Creates an Ability for the Creature.
	 */
	public Ability(Creature creature)
	{
		super(creature.getName(),creature.getCurrentLifePoints());
		this.creature=creature;
	}
	/**
	 * To return Current Life Points
	 */
	public int  getCurrentLifePoints()
	{
		return creature.getCurrentLifePoints();
	}
}
