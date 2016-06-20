/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package player;

import environment.StringConstants;
import lifeform.Damage;
/**
 * This class consists functions related to NormalCreature.
 */
public class NormalCreature extends Creature
{
	/** 
	 * Damage to store damage
	 */
	Damage damage;
	
	/**
	 * Create an instance of NormalCreature with given values.
	 */
	public NormalCreature(String name, int points)
	{
		super(name, points);
		baseDamage = 5;
	}
	
	/**
	 * To calculate current life points after take hit.
	 */
	@Override
	public void takeHit(Damage damage)
	{
		this.damage = damage;
		if (this.currentLifePoints > 0)
		  {
			this.currentLifePoints = (this.currentLifePoints - damage.getDamagePoints());
		  }
		if (this.currentLifePoints < 0)
		  {
			this.currentLifePoints = 0;
		  }
	 }
	
	/**
	 * To return char for NormalCreature
	 */
	public char getChar()
	{
		return 'N';
	}
	
	/**
	 * To calculate damage
	 */
	@Override
	public Damage calculateDamage()
	{
		Damage damage;
		if (currentLifePoints > 0)
			damage = new Damage(StringConstants.NORMALCREATURE, this.baseDamage);
		else
			damage = new Damage(StringConstants.NORMALCREATURE, 0);
		return damage;
	}
}
