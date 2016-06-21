package weapon;
import lifeform.Damage;
/**
 * This class contains Spear methods.
 * @author Dalal Alzeer
 */
public class Spears extends GenericWeapon
{
	/**
	 * Creates Spear with default base damage value.
	 */
	public Spears()
	{
		super(7);
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
		Damage damage=new Damage("WEAPON",this.baseDamage);
		return damage;
	}

	/**
	 * @return the character that displayed in the map
	 */
	public char getChar() 
	{
		return 'R';
	}
	

}
