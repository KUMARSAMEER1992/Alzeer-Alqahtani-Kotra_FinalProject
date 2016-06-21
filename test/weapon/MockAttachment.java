package weapon;
import lifeform.Damage;
/**
 * Mock class to create attachment.
 * @author Dalal Alzeer
 *
 */
public class MockAttachment extends  Attachments
{
	/**
	 * Create MockAttachment instance
	 */
	public MockAttachment()
	{
	}
	/**
	 * returns 5 as default damage.
	 */
	@Override
	public int getBaseDamage() 
	{
		return 5;
	}
	/**
	 * Mock attachment returns 7 damage default.
	 */
	@Override
	public Damage calculateDamage() 
	{	
		Damage damage=new Damage("WEAPON",7);
		return damage;
	}
	/**
	 * return 'V' as a default value
	 */
	@Override
	public char getChar() 
	{
		return 'V';
	}

}
