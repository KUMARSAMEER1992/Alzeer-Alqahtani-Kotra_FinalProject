/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package player;

import environment.StringConstants;
import lifeform.Damage;

public class PoisonCreature extends Ability
{

	public PoisonCreature(Creature creature)
	{
		super(creature);

	}

	@Override
	public char getChar()
	{
		return 'P';
	}

	@Override
	public void takeHit(Damage damage)
	{
		creature.takeHit(damage);
	}

	@Override
	public Damage calculateDamage()
	{
		Damage damage;
		if (currentLifePoints > 0)
			damage = new Damage(StringConstants.POISON, (creature.baseDamage * 2));
		else
			damage = new Damage(StringConstants.POISON, 0);
		return damage;
	}

}
