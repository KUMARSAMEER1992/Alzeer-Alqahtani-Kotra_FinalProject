/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package player;
import lifeform.LifeForm;

public abstract class Creature extends LifeForm
{	
	public static String CREATURE="CREATURE";
	public int baseDamage;
	
	public Creature(String name, int points) 
	{
		super(name, points);
	}
public abstract char getChar();
public String getItemType()
{
	return CREATURE;
}
}
