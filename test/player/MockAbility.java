/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package player;

import lifeform.Damage;
/**
 * MockCommand to test Ability
 */
public class MockAbility extends Ability
{
	/**
	 * create MockAbility 
	 */
	public MockAbility(Creature creature) 
	{
		super(creature);
		
	}

	@Override
	public char getChar() 
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void takeHit(Damage damage) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public Damage calculateDamage() 
	{
		// TODO Auto-generated method stub
		return null;
	}

}
