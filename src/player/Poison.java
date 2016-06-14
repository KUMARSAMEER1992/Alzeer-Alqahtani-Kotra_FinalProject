/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package player;

import lifeform.Damage;

public class Poison extends Ability
{

	public Poison(Creature creature)
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
			damage = new Damage("POISON", (creature.baseDamage * 2));
		else
			damage = new Damage("POISON", 0);
		return damage;
	}

}
