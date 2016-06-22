/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package player;

import environment.StringConstants;
import lifeform.Damage;
/**
 * This class consists functions related to PoisonCreature.
 */
public class PoisonCreature extends Ability
{
	/**
	 * Create an instance of PoisonCreature with given values.
	 */
	public PoisonCreature(Creature creature)
	{
		super(creature);
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
	 * To return char for PoisonCreature
	 */
	@Override
	public char getChar()
	{
		return 'E';
	}
	
	/**
	 * To calculate damage
	 */
	@Override
	public Damage calculateDamage()
	{
		Damage damage;
		if (currentLifePoints > 0)
			damage = new Damage(StringConstants.POISON, (creature.baseDamage + 2));
		else
			damage = new Damage(StringConstants.POISON, 0);
		return damage;
	}
}
