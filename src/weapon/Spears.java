package weapon;
import lifeform.Damage;
/**
 * The class contains Spear methods.
 * @author Dalal Alzeer
 */
public class Spears extends GenericWeapon
{
	/**
	 * Creates Spear with default base damage value.
	 */
	public Spears()
	{
		this.baseDamage=7;
	}
	/**
	 * @return spear base damage
	 */
	@Override
	public int getBaseDamage()
	{
		return this.baseDamage;
	}
	/**
	 * Calculates the damage done by Spear.
	 * @return the damage caused by spear.
	 */
	@Override
	public Damage calculateDamage()
	{
		Damage damage=new Damage("WEAPON",baseDamage);
		return damage;
	}

	/**
	 * @return the character that displayed in the map
	 */
	public char getChar() 
	{
		return 'R';
	}
	/**
	 * @return weapon type
	 */
	@Override
	public String getWeaponType() 
	{
		return "Spears";
	}

}
