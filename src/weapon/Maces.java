package weapon;
import lifeform.Damage;
/**
 * The class contains Maces methods.
 * @author Dalal Alzeer
 */
public class Maces extends GenericWeapon
{
	/**
	 * Creates Mace with default base damage value.
	 */
	public Maces()
	{
		super(5);
	}
	/**
	 * @return Mace base damage
	 */
	@Override
	public int getBaseDamage()
	{
		return this.baseDamage;
	}
	/**
	 * Calculates the damage done by Mace.
	 * @return the damage caused by Mace.
	 */
	@Override
	public Damage calculateDamage()
	{
		Damage damage=new Damage("WEAPON",this.baseDamage);
		return damage;
	}

	/**
	 * @return the character that displayed in the map
	 */
	public char getChar() 
	{
		return 'M';
	}
	/**
	 * @return weapon type
	 */
	@Override
	public String getWeaponType() 
	{
		return "Maces";
	}


}
