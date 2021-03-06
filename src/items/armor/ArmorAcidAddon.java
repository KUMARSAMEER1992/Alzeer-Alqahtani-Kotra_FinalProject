package items.armor;

import environment.StringConstants;
import exception.ArmorException;
import lifeform.Damage;

/**
 * AcidAddon for Armor.
 * ArmorAcidAddon is an ArmorAddon.
 * @author Sameer Kumar Kotra
 */
public class ArmorAcidAddon extends ArmorAddon
{

	/**
	 * Creates an ArmorAcidAddon with give armor.
	 * Has max Rounds 10.
	 * @param armor : Armor to which add on to be added.
	 * @throws ArmorException if we try to add ArmorAddon to a ArmorAddon.
	 */
	public ArmorAcidAddon(Armor armor) throws ArmorException
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
		if (damage.getDamageType().equals(StringConstants.ACID))
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
		return 'C';
	}

}
