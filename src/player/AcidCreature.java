/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package player;

import environment.StringConstants;
import lifeform.Damage;

public class AcidCreature extends Ability
{

	public AcidCreature(Creature creature)
	{
		super(creature);
		this.currentLifePoints = creature.getCurrentLifePoints();
	}

	@Override
	public char getChar()
	{
		return 'A';
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
			damage = new Damage(StringConstants.ACID, (creature.baseDamage * 3));
		else
			damage = new Damage(StringConstants.ACID, 0);
		return damage;

	}

}
