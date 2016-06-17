package weapon;
/**
 * Generic weapon contains methods to all weapons.
 * @author Dalal Alzeer
 */
public abstract class GenericWeapon implements Weapon
{
	/**
	 * int to store base damage of the weapon.
	 */
	public int baseDamage;

	/**
	 * @return the base damage of the weapon.
	 */
	@Override
	public int getBaseDamage()
	{
		return baseDamage;
	}

	/**
	 * @return the Item Type
	 */
	public String getItemType()
	{
		return WEAPON;
	}
	/**
	 * @return weapon type
	 */
	public abstract String getWeaponType();

}
