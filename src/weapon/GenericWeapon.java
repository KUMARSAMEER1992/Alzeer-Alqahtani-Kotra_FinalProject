package weapon;

import lifeform.Damage;
import environment.StringConstants;

/**
 * Generic weapon contains methods to all weapons.
 * @author Dalal Alzeer
 */
public abstract class GenericWeapon implements Weapon
{
	/**
	 * int to store base damage of the weapon.
	 */
	protected int baseDamage;
	
	/**
	 * create GenericWeapon with given base damage value
	 * @param baseDamage
	 */
	public GenericWeapon(int baseDamage )
	{
		this.baseDamage=baseDamage;
	}
	/**
	 * @return the base damage of the weapon.
	 */
	@Override
	public int getBaseDamage()
	{
		return this.baseDamage;
	}
	/**
	 * Calculates the damage done by a weapon.
	 * @return the damage.
	 */
	@Override
	public abstract Damage calculateDamage();

	/**
	 * @return the Item Type
	 */
	public String getItemType()
	{
		return StringConstants.WEAPON;
	}
	

}
