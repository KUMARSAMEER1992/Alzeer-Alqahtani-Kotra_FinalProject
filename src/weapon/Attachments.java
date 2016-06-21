package weapon;
import environment.StringConstants;
import lifeform.Damage;

/**
 * Attachment has common method to all Attachments.
 * @author Dalal Alzeer.
 */
public abstract class Attachments implements Weapon
{
	/**
	 * Weapon to store the Weapon.
	 */
	protected Weapon weapon;
	/**
	 * int to store attachment damage
	 */
	int attachmentDamage;

	/**
	 * @return the attachment damage.
	 */
	@Override
	public abstract int getBaseDamage();
	
	/**
	 * Calculates the damage.
	 * @return the damage caused by the weapon.
	 */
	@Override
	public abstract  Damage calculateDamage();
	
	/**
	 * @return the character that displayed in the map
	 */
	@Override
	public abstract char getChar();
	
	/**
	 * return item type
	 */
	@Override
	public String getItemType()
	{
		return StringConstants.WEAPON;
	}
	

}
