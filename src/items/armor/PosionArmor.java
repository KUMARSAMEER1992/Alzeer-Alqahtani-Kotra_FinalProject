/**
 * @author Sameer Kumar Kotra
 */
package items.armor;

import exception.ArmorException;
import lifeform.Damage;

/**
 * @author Sameer Kumar Kotra
 */
public class PosionArmor extends ArmorAddon
{

	/**
	 * @param armor
	 * @throws ArmorException
	 */
	public PosionArmor(Armor armor) throws ArmorException
	{
		super(armor, 10);
	}

	@Override
	public Damage reduceDamage(Damage damage)
	{
		if (damage.getDamageType().equals("POISON"))
		{
			damage.setDamagePoints(0);
			return damage;
		}
		else
		{
			return armor.reduceDamage(damage);
		}
	}

	@Override
	public char getChar()
	{
		return 'C';
	}

}
