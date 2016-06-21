package weapon;
import lifeform.Damage;
/**
 *  Weak Attachment to all weapons.
 * @author Dalal Alzeer
 *
 */
public class WeakAttachment extends Attachments
{
	/**
	 * create WeakAttachment instance. It increases weapon damage by 5.
	 * @param w
	 */
	public WeakAttachment(Weapon w)
	{
		attachmentDamage = w.getBaseDamage() + 5;
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
		return 'W';
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
