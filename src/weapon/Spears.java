package weapon;
import lifeform.Damage;
/**
 * The class contains Spear methods.
 * @author Dalal Alzeer
 */
public class Spears extends GenericWeapon
{
	int basedamage;
	/**
	 * Creates Spears with default base damage value.
	 */
	public Spears()
	{
		basedamage=7;
	}
	@Override
	public int getBaseDamage()
	{
		return basedamage;
	}
	/**
	 * Calculates the damage done by Spears.
	 * @return the damage caused by the weapon.
	 */
	@Override
	public Damage calculateDamage()
	{
		Damage damage=new Damage("Weapon",baseDamage);
		return damage;
	}

	/**
	 * @return the weapon type
	 */
	public char getChar() 
	{
		return 'R';
	}
	@Override
	public String getWeaponType() 
	{
		
		return "Spears";
	}

}
