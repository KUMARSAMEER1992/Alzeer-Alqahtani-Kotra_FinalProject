/**
 * @author Sameer Kumar Kotra
 */
package items.armor;

import exception.ArmorException;
import lifeform.Damage;

/**
 * AcidAddon for Armor.
 * AcidArmor is an ArmorAddon.
 * @author Sameer Kumar Kotra
 */
public class AcidAddon extends ArmorAddon
{

	/**
	 * Creates an AcidAddon with give armor.
	 * Has max Rounds 10.
	 * @param armor : Armor to which add on to be added.
	 * @throws ArmorException if we try to add ArmorAddon to a ArmorAddon.
	 */
	public AcidAddon(Armor armor) throws ArmorException
	{
		super(armor, 10);
	}

	/**
	 * calculates the remaining damage after Armor absorbs the damage.
	 * @param damage : original damage.
	 * @return the reduced damage.
	 */
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

	/**
	 * @return the character to be displayed on the map.
	 */
	public char getChar()
	{
		return 'B';
	}

}
