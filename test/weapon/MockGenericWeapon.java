package weapon;
import lifeform.Damage;
/**
 * Mock class to create a Generic Weapon.
 * @author Dalal Alzeer
 */
public class MockGenericWeapon extends GenericWeapon
{	
	/**
	 * Create the MockGenericWeapon with Base damage value.
	 * @param baseDamage : Base damage of weapon.
	 */
	public MockGenericWeapon(int baseDamage)
	{
		super(baseDamage);

	}
	/**
	 * Mock weapon returns 7 damage default.
	 */
	@Override
	public Damage calculateDamage()
	{
		Damage damage=new Damage("WEAPON",7);
		return damage;
	}
	/**
	 * @return the character that displayed in the map
	 */
	@Override
	public char getChar() 
	{
		return 'W';
	}
	/**
	 * return Sword as default value
	 */
	@Override
	public String getWeaponType() 
	{
		return "Sword";
	}
	
}
