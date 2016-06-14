package weapon;
import lifeform.Damage;
/**
 * The class contains Sword methods.
 * @author Dalal Alzeer
 */
public class Swords extends GenericWeapon
{
	int basedamage;
	/**
	 * Creates Swords with default base damage value.
	 */
	public Swords()
	{
		basedamage=10;
	}
	@Override
	public int getBaseDamage()
	{
		return basedamage;
	}
	/**
	 * Calculates the damage done by Sword.
	 * @return the damage caused by the weapon.
	 */
	@Override
	public Damage calculateDamage()
	{
		Damage damage=new Damage("PLAYER",baseDamage);
		return damage;
	}
	/**
	 * @return the weapon type
	 */
	public char getChar() 
	{
		return 'S';
	}
	@Override
	public String getWeaponType() 
	{
		
		return "Swords";
	}
	

}
