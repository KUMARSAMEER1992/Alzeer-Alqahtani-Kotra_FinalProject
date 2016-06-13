/**
 * @author Sameer Kumar Kotra
 */
package items.armor;

import exception.ArmorException;
import lifeform.Damage;

/**
 * @author Sameer Kumar Kotra
 */
public class AcidArmor extends ArmorAddon
{

	/**
	 * @param armor
	 * @throws ArmorException
	 */
	public AcidArmor(Armor armor) throws ArmorException
	{
		super(armor, 10);
	}

	@Override
	public Damage reduceDamage(Damage damage)
	{
		if (damage.getDamageType().equals("ACID"))
		{
			damage.setDamagePoints(0);
			return damage;
		}
		else
		{
			return armor.reduceDamage(damage);
		}
	}

	public char getChar()
	{
		return 'B';
	}

}
