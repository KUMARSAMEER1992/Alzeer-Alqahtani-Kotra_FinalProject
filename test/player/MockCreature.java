/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package player;
import lifeform.Damage;

/**
 * MockCreature to test Creature
 */
public class MockCreature extends Creature 
{
	/**
	 * create MockCammand
	 */
	public MockCreature(String name, int points) 
	{
		super(name, points);
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
