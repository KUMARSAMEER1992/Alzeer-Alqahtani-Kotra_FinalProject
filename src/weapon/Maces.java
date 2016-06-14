package weapon;
import lifeform.Damage;
/**
 * The class contains Maces methods.
 * @author Dalal Alzeer
 */
public class Maces extends GenericWeapon
{
	int basedamage;
	/**
	 * Creates Maces with default base damage value.
	 */
	public Maces()
	{
		basedamage=5;
	}
	
	@Override
	public int getBaseDamage()
	{
		return basedamage;
	}
	/**
	 * Calculates the damage done by Maces.
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
		return 'M';
	}
	@Override
	public String getWeaponType() 
	{
		
		return "Maces";
	}


}
