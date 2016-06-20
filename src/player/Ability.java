/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package player;



public abstract class Ability extends Creature

{
	protected Creature creature;
	public Ability(Creature creature)
	{
		super(creature.getName(),creature.getCurrentLifePoints());
		this.creature=creature;
	}
	
	public int  getCurrentLifePoints()
	{
		return creature.getCurrentLifePoints();
	}
}
