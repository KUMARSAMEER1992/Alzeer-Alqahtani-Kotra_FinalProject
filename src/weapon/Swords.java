package weapon;
import lifeform.Damage;
/**
 * This class contains Sword methods.
 * @author Dalal Alzeer
 */
public class Swords extends GenericWeapon
{
	/**
	 * Creates Sword with default base damage value.
	 */
	public Swords()
	{
		super(10);
	}
	/**
	 * @return Sword base damage
	 */
	@Override
	public int getBaseDamage()
	{
		return this.baseDamage;
	}
	/**
	 * Calculates the damage done by Sword.
	 * @return the damage caused by Sword.
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
		return 'S';
	}
	
	

}
