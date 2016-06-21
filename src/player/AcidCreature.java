/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package player;

import environment.StringConstants;
import lifeform.Damage;
/**
 * This class consists functions related to AcidCreature.
 */
public class AcidCreature extends Ability
{
	/**
	 * Create an instance of AcidCreature with given values.
	 */
	public AcidCreature(Creature creature)
	{
		super(creature);
		this.currentLifePoints = creature.getCurrentLifePoints();
	}
	
	/**
	 * To calculate current life points after take hit.
	 */
	@Override
	public void takeHit(Damage damage)
	{
		creature.takeHit(damage);
	}
	
	/**
	 * To return char for AcidCreature
	 */
	@Override
	public char getChar()
	{
		return 'D';
	}
	
	/**
	 * To calculate damage
	 */
	@Override
	public Damage calculateDamage()
	{
		Damage damage;
		if (currentLifePoints > 0)
			damage = new Damage(StringConstants.ACID, (creature.baseDamage * 3));
		else
			damage = new Damage(StringConstants.ACID, 0);
		return damage;
	}
}
