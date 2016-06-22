package weapon;
import lifeform.Damage;
/**
 *  strong Attachment to all weapons.
 * @author Dalal Alzeer
 *
 */
public class StrongAttachment extends Attachments
{

	/**
	 * create StrongAttachment instance. It increases weapon damage by 15.
	 * @param w
	 */
	public StrongAttachment(Weapon w)
	{
		attachmentDamage = w.getBaseDamage() + 15;
	}
	/**
	 * Calculates the damage.
	 * @return the damage caused by the weapon.
	 */
	@Override
	public Damage calculateDamage()
	{
		Damage damage = new Damage("WEAPON", attachmentDamage);
		return damage;
	}
	/**
	 * @return the character that displayed in the map
	 */
	@Override
	public char getChar()
	{
		return 'G';
	}
	/**
	 * @return the attachment damage.
	 */
	@Override
	public int getBaseDamage() 
	{
		return attachmentDamage;
	}

}
