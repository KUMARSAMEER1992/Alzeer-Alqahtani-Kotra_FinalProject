package weapon;
import lifeform.Damage;

/**
 * Attachment has common method to all Attachments.
 * @author Dalal Alzeer.
 */
public class Attachments implements Weapon
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
	 * create Attachment instance
	 * @param w
	 */
	public Attachments(Weapon w)
	{
		weapon = w;
		if (weapon.getWeaponType().compareToIgnoreCase("Maces") == 0)
		{
			attachmentDamage = weapon.getBaseDamage() + 5;
		}
		else if (weapon.getWeaponType().compareToIgnoreCase("Swords") == 0)
		{
			attachmentDamage = weapon.getBaseDamage() + 15;
		}
		else if (weapon.getWeaponType().compareToIgnoreCase("Spears") == 0)
		{
			attachmentDamage=weapon.getBaseDamage()+10; 
		}
	}

	/**
	 * @return the attachment damage.
	 */
	@Override
	public int getBaseDamage()
	{
		return attachmentDamage;
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
		return 'A';
	}
	/**
	 * return item type
	 */
	@Override
	public String getItemType()
	{
		return WEAPON;
	}
	/**
	 * return weapon type
	 */
	@Override
	public String getWeaponType()
	{
		return weapon.getWeaponType();
	}

}
